/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ra implements Iterable {
    static String ticketingUnreadCountText;
    DualLinkNode field_c;
    static int field_d;
    static IntrusiveDeque availableEntities;

    final void a(int param0, DualLinkNode param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.previousSecondaryNode != null) {
            param1.unlinkSecondaryNode((byte) 124);
          }
          param1.previousSecondaryNode = this.field_c.previousSecondaryNode;
          param1.nextSecondaryNode = this.field_c;
          param1.previousSecondaryNode.nextSecondaryNode = param1;
          param1.nextSecondaryNode.previousSecondaryNode = param1;
          if (param0 == -1) {
            return;
          }
          this.iterator();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var3);

          stackIn_7_1 = new StringBuilder().append("ra.C(").append(param0).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static void selectBackgroundMusic(int methodGuard, rf track) {
        if (track == null || fe.field_e == track) {
            return;
        }
        try {
            if (methodGuard != 0) {
                field_d = -114;
            }
            uh.field_y.d(-9268);
            fj.field_p.a();
            fe.field_e = track;
            uh.field_y.a(false, fe.field_e, -1706);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ra.A(" + methodGuard + ',' + (track != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        int stackIn_8_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_45_0 = 0;
        int var3;
        int var4;
        int var5;
        if (el.gameplaySession.tutorialMode) {
          return;
        }
        {
          var3 = 1 << param2;
          if ((vl.field_p & var3) != 0) {
            return;
          }
          {
            ug.field_c = ug.field_c | var3;
            el.gameplaySession.newActionCount = el.gameplaySession.newActionCount + 1;
            var4 = param2;
            stackIn_8_0 = ((1 << var4 & dc.field_a) == 0) ? 0 : 1;
            var5 = stackIn_8_0;
            if (param1 < -47) {
              if (var5 != 0) {
                vl.field_p = vl.field_p | var3;
                stackIn_35_0 = (!pb.pendingActionMarkers.isEmpty(13519)) ? 0 : 1;
                var4 = stackIn_35_0;
                pb.pendingActionMarkers.addLast(-35, new PendingActionMarker(param2));
                if (var4 != 0) {
                  gf.a((byte) -122);
                }
                if (!el.gameplaySession.submissionBlocked) {
                  GameplayEntity.field_A.addLast(-44, new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
                }
                return;
              }
              dc.field_a = dc.field_a | 1 << var4;
              el.field_g = el.field_g - (1 << var4);
              vl.field_p = vl.field_p | var3;
              stackIn_45_0 = (!pb.pendingActionMarkers.isEmpty(13519)) ? 0 : 1;
              var4 = stackIn_45_0;
              pb.pendingActionMarkers.addLast(-35, new PendingActionMarker(param2));
              if (var4 != 0) {
                gf.a((byte) -122);
              }
              if (!el.gameplaySession.submissionBlocked) {
                GameplayEntity.field_A.addLast(-44, new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
              }
              return;
            }
            ticketingUnreadCountText = (String) null;
            if (var5 != 0) {
              vl.field_p = vl.field_p | var3;
              stackIn_23_0 = (!pb.pendingActionMarkers.isEmpty(13519)) ? 0 : 1;
              var4 = stackIn_23_0;
              pb.pendingActionMarkers.addLast(-35, new PendingActionMarker(param2));
              if (var4 != 0) {
                gf.a((byte) -122);
              }
              if (!el.gameplaySession.submissionBlocked) {
                GameplayEntity.field_A.addLast(-44, new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
              }
              return;
            }
            dc.field_a = dc.field_a | 1 << var4;
            el.field_g = el.field_g - (1 << var4);
            vl.field_p = vl.field_p | var3;
            stackIn_13_0 = (!pb.pendingActionMarkers.isEmpty(13519)) ? 0 : 1;
            var4 = stackIn_13_0;
            pb.pendingActionMarkers.addLast(-35, new PendingActionMarker(param2));
            if (var4 != 0) {
              gf.a((byte) -122);
            }
            if (!el.gameplaySession.submissionBlocked) {
              GameplayEntity.field_A.addLast(-44, new p(param2, param0, dc.field_a, el.field_g, sc.field_f, lb.field_b));
            }
            return;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          var2_int = param1.charAt(0);
          if (param0 != 18725) {
            var5 = (String) null;
            ra.a(20, (String) null);
          }
          var3 = 1;
          L1: while (true) {
            if (param1.length() <= var3) {
              return true;
            }
            if (var2_int == param1.charAt(var3)) {
              var3++;
              continue L1;
            }
            return false;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var2);

          stackIn_13_1 = new StringBuilder().append("ra.E(").append(param0).append(',');

          if (param1 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ef((ra) (this)));
    }

    public static void a(int param0) {
        availableEntities = null;
        ticketingUnreadCountText = null;
        if (param0 != -1) {
            field_d = -36;
        }
    }

    final DualLinkNode a(byte param0) {
        DualLinkNode var2 = this.field_c.nextSecondaryNode;
        int var3 = -14 % ((72 - param0) / 46);
        if (this.field_c != var2) {
            var2.unlinkSecondaryNode((byte) 126);
            return var2;
        }
        return null;
    }

    private ra() throws Throwable {
        throw new Error();
    }

    static {
        ticketingUnreadCountText = "You have <%0> unread messages!";
        availableEntities = new IntrusiveDeque();
    }
}
