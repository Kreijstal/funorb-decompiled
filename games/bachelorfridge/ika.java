/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ika {
    static gba field_a;
    eaa field_b;
    int field_c;

    final static tk a(byte param0, lu param1) {
        int var2 = param1.e((byte) 118);
        int var3 = param1.e((byte) 45);
        int var4 = param1.e((byte) 80);
        if (param0 != 85) {
            return null;
        }
        int var5 = param1.e((byte) 61);
        int var6 = param1.b(16711935);
        int var7 = param1.b(16711935);
        int var8 = param1.e((byte) 97);
        int var9 = param1.b(16711935);
        int var10 = param1.e((byte) 118);
        int var11 = param1.e((byte) 83);
        int var12 = param1.e((byte) 54);
        int var13 = param1.e((byte) 102);
        int var14 = param1.e((byte) 47);
        int var15 = param1.e((byte) 124);
        int var16 = param1.e((byte) 77);
        int var17 = param1.e((byte) 45);
        int var18 = param1.e((byte) 59);
        int var19 = param1.b(16711935);
        return new tk(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (-1 >= (param6 ^ -1)) {
          L0: {
            var8 = param6 / 60;
            param6 = param6 % 60;
            if (0 == (4 & param1)) {
              break L0;
            } else {
              var8 = var8 % 60;
              break L0;
            }
          }
          var9 = param6 / 10;
          var10 = param6 % 10;
          if (param4 < -52) {
            var11 = var8 / 10;
            var12 = var8 % 10;
            if (-1 == (2 & param1 ^ -1)) {
              L1: {
                if (-1 == (1 & param1 ^ -1)) {
                  break L1;
                } else {
                  ce.a(true, param3, param5, "" + var9, param2, true);
                  param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                  ce.a(true, param3, param5, "" + var10, param2, true);
                  param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                  break L1;
                }
              }
              return;
            } else {
              ce.a(true, param3, param5, "" + var11, param2, true);
              param2 = param2 + (jha.field_g.a("" + var11) + (param0 + 2));
              ce.a(true, param3, param5, "" + var12, param2, true);
              param2 = param2 + (2 + (jha.field_g.a("" + var11) - -param0));
              if ((param1 & 32) == 0) {
                L2: {
                  ce.a(true, param3, param5, ":", param2, true);
                  param2 = param2 + (jha.field_g.a(":") + param0);
                  if (-1 == (1 & param1 ^ -1)) {
                    break L2;
                  } else {
                    ce.a(true, param3, param5, "" + var9, param2, true);
                    param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                    ce.a(true, param3, param5, "" + var10, param2, true);
                    param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                    break L2;
                  }
                }
                return;
              } else {
                if (0 == (param6 & 1)) {
                  L3: {
                    ce.a(true, param3, param5, ":", param2, true);
                    param2 = param2 + (jha.field_g.a(":") + param0);
                    if (-1 == (1 & param1 ^ -1)) {
                      break L3;
                    } else {
                      ce.a(true, param3, param5, "" + var9, param2, true);
                      param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                      ce.a(true, param3, param5, "" + var10, param2, true);
                      param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                      break L3;
                    }
                  }
                  return;
                } else {
                  L4: {
                    param2 = param2 + (jha.field_g.a(":") + param0);
                    if (-1 == (1 & param1 ^ -1)) {
                      break L4;
                    } else {
                      ce.a(true, param3, param5, "" + var9, param2, true);
                      param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                      ce.a(true, param3, param5, "" + var10, param2, true);
                      param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                      break L4;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            field_a = null;
            var11 = var8 / 10;
            var12 = var8 % 10;
            if (-1 == (2 & param1 ^ -1)) {
              L5: {
                if (-1 == (1 & param1 ^ -1)) {
                  break L5;
                } else {
                  ce.a(true, param3, param5, "" + var9, param2, true);
                  param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                  ce.a(true, param3, param5, "" + var10, param2, true);
                  param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                  break L5;
                }
              }
              return;
            } else {
              ce.a(true, param3, param5, "" + var11, param2, true);
              param2 = param2 + (jha.field_g.a("" + var11) + (param0 + 2));
              ce.a(true, param3, param5, "" + var12, param2, true);
              param2 = param2 + (2 + (jha.field_g.a("" + var11) - -param0));
              if ((param1 & 32) == 0) {
                ce.a(true, param3, param5, ":", param2, true);
                L6: {
                  param2 = param2 + (jha.field_g.a(":") + param0);
                  if (-1 == (1 & param1 ^ -1)) {
                    break L6;
                  } else {
                    ce.a(true, param3, param5, "" + var9, param2, true);
                    param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                    ce.a(true, param3, param5, "" + var10, param2, true);
                    param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                    break L6;
                  }
                }
                return;
              } else {
                if (0 == (param6 & 1)) {
                  ce.a(true, param3, param5, ":", param2, true);
                  L7: {
                    param2 = param2 + (jha.field_g.a(":") + param0);
                    if (-1 == (1 & param1 ^ -1)) {
                      break L7;
                    } else {
                      ce.a(true, param3, param5, "" + var9, param2, true);
                      param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                      ce.a(true, param3, param5, "" + var10, param2, true);
                      param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                      break L7;
                    }
                  }
                  return;
                } else {
                  L8: {
                    param2 = param2 + (jha.field_g.a(":") + param0);
                    if (-1 == (1 & param1 ^ -1)) {
                      break L8;
                    } else {
                      ce.a(true, param3, param5, "" + var9, param2, true);
                      param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                      ce.a(true, param3, param5, "" + var10, param2, true);
                      param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                      break L8;
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    ika(byte[] param0) {
        this(new lu(param0));
    }

    final static void a(byte param0, il param1) {
        if (param0 != 18) {
            ika.a(70, -118, -128, -79, -74, -69, 108, -112);
            jka.field_l = param1;
            return;
        }
        jka.field_l = param1;
    }

    public static void a(boolean param0) {
        if (!param0) {
            ika.a(124, 64, -125, -20, 67, -93, -14, 87);
            field_a = null;
            return;
        }
        field_a = null;
    }

    private ika(lu param0) {
        ((ika) this).field_b = new eaa();
        this.a(param0, 0);
    }

    private final void a(lu param0, int param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        ((ika) this).field_c = param0.e((byte) 114);
        for (var3 = param1; var3 < ((ika) this).field_c; var3++) {
            ((ika) this).field_b.a((bw) (Object) new ft(param0), true);
        }
    }

    static {
    }
}
