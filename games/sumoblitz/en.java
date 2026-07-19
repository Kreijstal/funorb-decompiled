/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class en {
    private int field_b;
    int field_g;
    static String field_h;
    private short[] field_c;
    private int field_e;
    private int field_i;
    private short[] field_f;
    static String field_d;
    static dk field_j;
    private int field_a;

    abstract void a(boolean param0);

    final void a(int param0, int param1, int param2, int param3) {
        int var36 = 0;
        int var37 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int var42 = 0;
        int var43 = 0;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var43 = Sumoblitz.field_L ? 1 : 0;
          if (param1 == 206) {
            break L0;
          } else {
            this.field_f = (short[]) null;
            break L0;
          }
        }
        var48 = new int[param3];
        var45 = var48;
        var39 = var45;
        var47 = new int[param2];
        var44 = var47;
        var40 = var44;
        var49 = new int[param0];
        var46 = var49;
        var41 = var46;
        var42 = 0;
        L1: while (true) {
          L2: {
            if (param3 <= var42) {
              var42 = 0;
              break L2;
            } else {
              var39[var42] = (var42 << 1046741740) / param3;
              var42++;
              if (var43 != 0) {
                break L2;
              } else {
                continue L1;
              }
            }
          }
          L3: while (true) {
            L4: {
              if (param2 <= var42) {
                var42 = 0;
                break L4;
              } else {
                var40[var42] = (var42 << 788419340) / param2;
                var42++;
                if (var43 != 0) {
                  break L4;
                } else {
                  continue L3;
                }
              }
            }
            L5: while (true) {
              L6: {
                if (param0 <= var42) {
                  this.b(-21);
                  break L6;
                } else {
                  var41[var42] = (var42 << -1138565684) / param0;
                  var42++;
                  if (var43 != 0) {
                    break L6;
                  } else {
                    continue L5;
                  }
                }
              }
              var37 = 0;
              L7: while (true) {
                stackOut_19_0 = var37;
                stackIn_20_0 = stackOut_19_0;
                L8: while (true) {
                  L9: {
                    if (stackIn_20_0 >= param0) {
                      break L9;
                    } else {
                      if (var43 != 0) {
                        break L9;
                      } else {
                        var36 = 0;
                        if (param2 <= var36) {
                          var37++;
                          if (var43 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        } else {
                          stackOut_23_0 = 0;
                          stackIn_20_0 = stackOut_23_0;
                          continue L8;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        }
    }

    private final void c(int param0) {
        Random var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Random var8 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var8 = new Random((long)this.field_e);
        var2 = var8;
        var3 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (-256 >= (var3 ^ -1)) {
                break L2;
              } else {
                this.field_f[var3] = (short)var3;
                var3++;
                if (var7 != 0) {
                  break L1;
                } else {
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            var3 = param0;
            break L1;
          }
          L3: while (true) {
            L4: {
              if (var3 >= 255) {
                break L4;
              } else {
                var4 = 255 + -var3;
                var5 = fi.a(var4, var8, (byte) -96);
                var6 = this.field_f[var5];
                this.field_f[var5] = this.field_f[var4];
                this.field_f[var4 - -256] = (short) var6;
                this.field_f[var4] = (short) var6;
                var3++;
                if (var7 != 0) {
                  break L4;
                } else {
                  continue L3;
                }
              }
            }
            return;
          }
        }
    }

    final static void a(byte param0, int param1) {
        c.field_s = 3 & param1 >> -1189596572;
        if (!(c.field_s <= 2)) {
            c.field_s = 2;
        }
        if (param0 < 24) {
            en.b((byte) 45);
        }
        ew.field_f = (param1 & 15) >> -826959710;
        if (!(-3 <= (ew.field_f ^ -1))) {
            ew.field_f = 2;
        }
        rs.field_g = param1 & 3;
        if ((rs.field_g ^ -1) < -3) {
            rs.field_g = 2;
        }
    }

    abstract void b(int param0);

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -23517) {
            break L0;
          } else {
            field_h = (String) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (10 > jv.field_a) {
              break L2;
            } else {
              if (ms.field_a) {
                break L2;
              } else {
                if (nt.a((byte) 116)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public static void b(byte param0) {
        field_d = null;
        field_j = null;
        if (param0 < 30) {
            return;
        }
        field_h = null;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        this.field_c = new short[this.field_g];
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_g <= var2) {
                break L2;
              } else {
                this.field_c[var2] = (short)(int)Math.pow(2.0, (double)var2);
                var2++;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param0 > 43) {
              break L1;
            } else {
              this.c(-19);
              break L1;
            }
          }
          return;
        }
    }

    abstract void a(int param0, int param1, int param2);

    en(int param0, int param1, int param2, int param3, int param4) {
        this.field_b = 4;
        this.field_e = 0;
        this.field_i = 4;
        this.field_f = new short[512];
        this.field_g = 4;
        this.field_a = 4;
        this.field_a = param2;
        this.field_b = param3;
        this.field_g = param1;
        this.field_i = param4;
        this.field_e = param0;
        this.a((byte) 99);
        this.c(0);
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$0 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$1 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_h = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_d = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$2 = var0.toLowerCase();
        var0 = "~/";
        try {
            var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$3 = new File(var0);
        field_j = new dk();
    }
}
