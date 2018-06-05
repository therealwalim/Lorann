package model.mobile;

import contract.*;

import java.awt.*;

/**
 * Created by Quentin Strinati on 14/06/2016.
 */

/** Class used to create the monster 4 */
public class Monster4 extends Mobile implements IMonster {

    /** Method that instantiates the Monster4 object
     * @param pos contains the monster's position
     */
    public Monster4(Point pos)
    {
        super("monster_4.png", true, pos);
    }

    @Override
    /** Method used to get the direction of the monster
     * @param heroPos contains the position of the hero so the monster knows what's up
     * @param tileMap contains the map in the memory
     * @return the monster's direction
     */
    public MobileOrder getDirection(Point heroPos, IElement[][] tileMap) {


        Point pos = this.getPos().getLocation();

        MobileOrder direction = MobileOrder.random();

        int distance = 10;

        for (MobileOrder dir : MobileOrder.values()) {
            Point aroundPos = MobileOrder.getPos(pos, dir);
            if (tileMap[aroundPos.x][aroundPos.y].getPermeability()) {
                int aroundDist = (heroPos.x-aroundPos.x)*(heroPos.x-aroundPos.x) +
                        (heroPos.y-aroundPos.y)*(heroPos.y-aroundPos.y);

                if(aroundDist < distance) {
                    distance = aroundDist;
                    direction = dir;
                }
            }
        }

        return direction;
    }
}
