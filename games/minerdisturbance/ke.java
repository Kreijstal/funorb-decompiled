/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ke extends ui implements sg {
    static ag field_W;
    static boolean field_V;
    static boolean[] field_X;
    static bk field_U;
    private int field_T;
    private jm field_S;

    final static int a(int param0, int param1, Random param2) {
        int var3 = 0;
        int var4 = 0;
        if (param1 == -21937) {
          if (0 < param0) {
            if (tn.a(param0, -3236)) {
              return (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> 849271456);
            } else {
              var3 = -2147483648 + -(int)(4294967296L % (long)param0);
              L0: while (true) {
                var4 = param2.nextInt();
                if (var4 < var3) {
                  return vj.a((byte) -101, var4, param0);
                } else {
                  continue L0;
                }
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        } else {
          field_X = null;
          if (0 < param0) {
            if (tn.a(param0, -3236)) {
              return (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> 849271456);
            } else {
              var3 = -2147483648 + -(int)(4294967296L % (long)param0);
              L1: while (true) {
                var4 = param2.nextInt();
                if (var4 < var3) {
                  return vj.a((byte) -101, var4, param0);
                } else {
                  continue L1;
                }
              }
            }
          } else {
            throw new IllegalArgumentException();
          }
        }
    }

    final void r(int param0) {
        if (param0 <= 123) {
            return;
        }
        super.r(124);
        if (!(null == ((ke) this).field_S)) {
            ((ke) this).field_S.c(-11);
        }
    }

    public final jm a(int param0) {
        if (param0 != 35) {
            String discarded$0 = ((ke) this).h(-84);
            return ((ke) this).field_S;
        }
        return ((ke) this).field_S;
    }

    final void a(jm param0, int param1) {
        if (param1 != 1048576) {
            return;
        }
        ((ke) this).field_S = param0;
    }

    final static void a(wh param0, boolean param1, int param2, boolean param3) {
        Object var4 = null;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (!param3) {
            break L0;
          } else {
            ke.s(-5);
            break L0;
          }
        }
        L1: {
          if (nj.field_e == null) {
            break L1;
          } else {
            dl.a(param1, param0, -32532, 1048576, param2);
            break L1;
          }
        }
        if (km.field_a == null) {
          return;
        } else {
          var4 = (Object) (Object) mj.field_o;
          synchronized (var4) {
            L2: {
              km.field_a.a(param2, true, -1);
              if (param0 == de.field_b) {
                return;
              } else {
                L3: {
                  km.field_a.c((byte) 108);
                  mj.field_o.f();
                  de.field_b = param0;
                  if (de.field_b != null) {
                    km.field_a.a(param1, de.field_b, (byte) 2);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L2;
              }
            }
          }
          return;
        }
    }

    final static String a(char param0, byte param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = MinerDisturbance.field_ab;
        var4 = param2.length();
        if (param1 == 75) {
          var5 = param3.length();
          var6 = var4;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            L0: while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if (var8_int >= 0) {
                var8_int++;
                var6 = var6 + var7;
                continue L0;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L1: while (true) {
                  var10 = param2.indexOf((int) param0, var9);
                  if (0 > var10) {
                    StringBuilder discarded$12 = var13.append(param2.substring(var9));
                    return var13.toString();
                  } else {
                    StringBuilder discarded$13 = var13.append(param2.substring(var9, var10));
                    StringBuilder discarded$14 = var13.append(param3);
                    var9 = 1 + var10;
                    continue L1;
                  }
                }
              }
            }
          } else {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L2: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if (0 > var10) {
                StringBuilder discarded$15 = var12.append(param2.substring(var9));
                return var12.toString();
              } else {
                StringBuilder discarded$16 = var12.append(param2.substring(var9, var10));
                StringBuilder discarded$17 = var12.append(param3);
                var9 = 1 + var10;
                continue L2;
              }
            }
          }
        } else {
          field_U = null;
          var5 = param3.length();
          var6 = var4;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            L3: while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if (var8_int >= 0) {
                var8_int++;
                var6 = var6 + var7;
                continue L3;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L4: while (true) {
                  var10 = param2.indexOf((int) param0, var9);
                  if (0 > var10) {
                    StringBuilder discarded$18 = var8.append(param2.substring(var9));
                    return var8.toString();
                  } else {
                    StringBuilder discarded$19 = var8.append(param2.substring(var9, var10));
                    StringBuilder discarded$20 = var8.append(param3);
                    var9 = 1 + var10;
                    continue L4;
                  }
                }
              }
            }
          } else {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L5: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if (0 > var10) {
                StringBuilder discarded$21 = var8.append(param2.substring(var9));
                return var8.toString();
              } else {
                StringBuilder discarded$22 = var8.append(param2.substring(var9, var10));
                StringBuilder discarded$23 = var8.append(param3);
                var9 = 1 + var10;
                continue L5;
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        super.a(param0, param1, (byte) 62, param3);
        ((ke) this).field_T = -param1 + (nk.field_w + -((ke) this).field_u);
        if (param2 <= 49) {
            Object var6 = null;
            int discarded$0 = ke.a(-45, -96, (Random) null);
        }
    }

    final String h(int param0) {
        if (((ke) this).field_x) {
          if (null != ((ke) this).field_n) {
            qh.a(gb.field_e, nk.field_w + (-((ke) this).field_T + ((ke) this).field_v), 1);
            if (param0 != -27867) {
              field_W = null;
              return ((ke) this).field_n;
            } else {
              return ((ke) this).field_n;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void s(int param0) {
        field_X = null;
        field_U = null;
        if (param0 > -65) {
            field_V = false;
            field_W = null;
            return;
        }
        field_W = null;
    }

    ke(String param0, rm param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_W = new ag();
        field_X = new boolean[35];
    }
}
