/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ic extends mc {
    static String field_A;
    static String field_z;
    static pp field_y;

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (param1 == -31425) {
          if (0 < pb.field_G) {
            if (null != il.field_c) {
              L0: {
                cm.field_R = il.field_c.d(92);
                gk.a(2, (byte) 4);
                if (cm.field_R == null) {
                  var2 = 3;
                  break L0;
                } else {
                  uk.a((java.awt.Canvas) (Object) cm.field_R, (byte) -124);
                  var2 = 2;
                  break L0;
                }
              }
              L1: {
                if (il.field_c != null) {
                  break L1;
                } else {
                  if (!wo.field_c) {
                    break L1;
                  } else {
                    ae.a(param0, var2, -1);
                    return;
                  }
                }
              }
              return;
            } else {
              L2: {
                cm.field_R = gh.a(0, -115, 0, 480, i.field_A, 640);
                if (cm.field_R == null) {
                  var2 = 3;
                  break L2;
                } else {
                  uk.a((java.awt.Canvas) (Object) cm.field_R, (byte) -124);
                  var2 = 2;
                  break L2;
                }
              }
              L3: {
                if (il.field_c != null) {
                  break L3;
                } else {
                  if (!wo.field_c) {
                    break L3;
                  } else {
                    ae.a(param0, var2, -1);
                    return;
                  }
                }
              }
              return;
            }
          } else {
            if (ed.c(true)) {
              L4: {
                var2 = 0;
                if (il.field_c != null) {
                  break L4;
                } else {
                  if (!wo.field_c) {
                    break L4;
                  } else {
                    ae.a(param0, var2, -1);
                    return;
                  }
                }
              }
              return;
            } else {
              var2 = 1;
              if (il.field_c == null) {
                if (wo.field_c) {
                  ae.a(param0, var2, -1);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    ic(int param0) {
        this(lp.field_C, param0);
    }

    public static void d(int param0) {
        if (param0 != 4741) {
            return;
        }
        field_A = null;
        field_z = null;
        field_y = null;
    }

    final static void a(int param0, int param1, String param2) {
        if (param1 != 27029) {
            return;
        }
        ac var3 = gh.field_i[param0];
        if (!(var3 != null)) {
            return;
        }
        var3.field_d = tp.a(kf.field_p, "idle", param2, param1 ^ -28249);
    }

    final String b(lm param0, int param1) {
        if (param1 != -444136767) {
            field_A = null;
            return cc.a('*', param0.field_w.length(), 10854);
        }
        return cc.a('*', param0.field_w.length(), 10854);
    }

    private ic(se param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Empty Room";
        field_z = "The pillar in the centre of this room is covered in mouths that will shrill and screech if they sense any raiders.<br><br>When triggered, the <%detect> of all monsters in this dungeon is increased by 3.";
    }
}
