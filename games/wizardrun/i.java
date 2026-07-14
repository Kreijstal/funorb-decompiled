/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class i {
    private int[][] field_b;
    static String field_c;
    static String field_g;
    private int field_a;
    static String field_f;
    static String field_d;
    private int field_e;

    final int a(boolean param0, int param1) {
        if (!(((i) this).field_b == null)) {
            param1 = (int)((long)((i) this).field_e * (long)param1 / (long)((i) this).field_a);
        }
        if (!param0) {
            return 51;
        }
        return param1;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, long param5, int param6, String param7, int param8, int param9, boolean param10, int param11, int param12, vh param13) {
        try {
            nk.field_N = new mg(param8);
            n.field_b = new mg(param9);
            bl.field_a = param0;
            df.field_a = param2;
            bl.field_d = param5;
            sb.field_e = param13;
            cb.field_g = param3 ? true : false;
            vk.field_l = param1;
            vl.field_d = param11;
            vk.field_G = param4;
            if (param12 != 64) {
                field_d = null;
            }
            pf.field_g = param10;
            tj.field_J = param6;
            aa.field_nb = param7;
            if (!(null == sb.field_e.field_c)) {
                try {
                    ub.field_t = new si(sb.field_e.field_c, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != 43) {
            Object var2 = null;
            i.a(-34, -29, -66, true, -96, -49L, 126, (String) null, -127, 99, false, 19, 4, (vh) null);
        }
        field_d = null;
        field_c = null;
        field_g = null;
    }

    final byte[] a(byte param0, byte[] param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var11 = wizardrun.field_H;
          if (param0 == 47) {
            break L0;
          } else {
            int discarded$1 = ((i) this).a((byte) 13, -83);
            break L0;
          }
        }
        L1: {
          if (null == ((i) this).field_b) {
            break L1;
          } else {
            var3 = (int)((long)param1.length * (long)((i) this).field_e / (long)((i) this).field_a) - -14;
            var20 = new int[var3];
            var18 = var20;
            var16 = var18;
            var14 = var16;
            var4 = var14;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L2: while (true) {
              if (param1.length <= var7) {
                param1 = new byte[var3];
                var12 = 0;
                var7 = var12;
                L3: while (true) {
                  if (var12 >= var3) {
                    break L1;
                  } else {
                    var8 = 32768 + var20[var12] >> 979700976;
                    if ((var8 ^ -1) > 127) {
                      param1[var12] = (byte)-128;
                      var12++;
                      continue L3;
                    } else {
                      if ((var8 ^ -1) < -128) {
                        param1[var12] = (byte)127;
                        var12++;
                        continue L3;
                      } else {
                        param1[var12] = (byte)var8;
                        var12++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var8 = param1[var7];
                var19 = ((i) this).field_b[var6];
                var10 = 0;
                L4: while (true) {
                  if (-15 >= (var10 ^ -1)) {
                    var6 = var6 + ((i) this).field_e;
                    var10 = var6 / ((i) this).field_a;
                    var5 = var5 + var10;
                    var6 = var6 - var10 * ((i) this).field_a;
                    var7++;
                    continue L2;
                  } else {
                    var4[var10 + var5] = var4[var10 + var5] + var8 * var19[var10];
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        return param1;
    }

    i(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param0 != param1) {
          var3 = se.a(param1, param0, 0);
          param1 = param1 / var3;
          param0 = param0 / var3;
          ((i) this).field_e = param1;
          ((i) this).field_b = new int[param0][14];
          ((i) this).field_a = param0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
            } else {
              L1: {
                var5 = ((i) this).field_b[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(var6 - 7.0 + 1.0);
                if ((var8 ^ -1) <= -1) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(7.0 + var6);
                if (var9 <= 14) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var8 >= var9) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = (-var6 + (double)var8) * 3.141592653589793;
                      var14 = var10;
                      if (var12 < -0.0001) {
                        break L5;
                      } else {
                        if (0.0001 >= var12) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (0.54 + 0.46 * Math.cos(((double)var8 - var6) * 0.2243994752564138));
                  var5[var8] = (int)Math.floor(0.5 + 65536.0 * var14);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
        }
    }

    final int a(byte param0, int param1) {
        if (!(((i) this).field_b == null)) {
            param1 = (int)((long)((i) this).field_e * (long)param1 / (long)((i) this).field_a) + 6;
        }
        if (param0 != 127) {
            i.a((byte) -110);
        }
        return param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Press SPACE or <%0> to attack.";
        field_f = "Invalid password.";
        field_g = "to over <%0> great games";
        field_d = "Free game completed";
    }
}
