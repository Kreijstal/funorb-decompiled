/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ada implements dja {
    static int[] field_a;
    static pia field_b;

    public static void a(int param0) {
        if (param0 != -1) {
            field_a = null;
        }
        field_b = null;
        field_a = null;
    }

    final static int a(String param0, boolean param1) {
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        Throwable var8 = null;
        int var8_int = 0;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        Throwable decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        if (nwa.field_c.field_k) {
          if (jma.field_q.containsKey((Object) (Object) param0)) {
            return 100;
          } else {
            var10 = mib.a((byte) -33, param0);
            if (var10 != null) {
              var3 = oea.field_p + var10;
              if (!tba.field_q.a((byte) -107, "", var3)) {
                return -1;
              } else {
                if (tba.field_q.a(32171, var3)) {
                  L0: {
                    var18 = tba.field_q.a("", param1, var3);
                    var16 = var18;
                    var14 = var16;
                    var12 = var14;
                    var4 = var12;
                    var5 = null;
                    var11 = lfb.a(var10, (byte) 34);
                    if (var4 == null) {
                      break L0;
                    } else {
                      if (var11 != null) {
                        L1: {
                          L2: {
                            var6 = 1;
                            var19 = ana.a(var11, (byte) 48);
                            var17 = var19;
                            var15 = var17;
                            var13 = var15;
                            var7 = var13;
                            if (var7 == null) {
                              break L2;
                            } else {
                              if (var18.length != var19.length) {
                                break L2;
                              } else {
                                var8_int = 0;
                                L3: while (true) {
                                  if (var8_int >= var19.length) {
                                    break L1;
                                  } else {
                                    if (var18[var8_int] == var19[var8_int]) {
                                      var8_int++;
                                      continue L3;
                                    } else {
                                      var6 = 0;
                                      break L1;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var6 = 0;
                          break L1;
                        }
                        try {
                          L4: {
                            if (var6 == 0) {
                              boolean discarded$1 = nwa.field_c.a(var18, (byte) 110, var11);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter) {
                          decompiledCaughtException = decompiledCaughtParameter;
                        }
                        var8 = decompiledCaughtException;
                        return -1;
                      } else {
                        break L0;
                      }
                    }
                  }
                  td.a((byte) 123, param0, var11);
                  return 100;
                } else {
                  return tba.field_q.a(var3, -2118);
                }
              }
            } else {
              return -1;
            }
          }
        } else {
          return -1;
        }
    }

    public final tv a(byte param0) {
        int var2 = 61 % ((param0 - -64) / 50);
        return (tv) (Object) new cda();
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new cda[param1];
    }

    final static int a(rsb param0, lbb param1, boolean param2, rna[] param3) {
        int var5 = 0;
        rna var6 = null;
        ika var12 = null;
        uoa var13 = null;
        int var8 = 0;
        et var9 = null;
        int var10 = 0;
        lrb var14 = null;
        int var11 = VoidHunters.field_G;
        int var4 = -1;
        if (param2) {
            ada.a(-17);
        }
        for (var5 = 0; var5 < param3.length; var5++) {
            var6 = param3[var5];
            if (!(var6 instanceof lrb)) {
                if (var6 instanceof ika) {
                    var12 = (ika) (Object) var6;
                    var4 = var12.a(0, -117);
                    break;
                }
                // ifeq L199
                var13 = (uoa) (Object) var6;
                var8 = var13.a(0, -103);
                var9 = param1.a(-31634, var8);
                // ifnull L205
                var10 = var9.field_b;
                var4 = fq.field_o[var10];
                if (-1 >= (var13.a(1, -126) ^ -1)) {
                    break;
                }
                var4 = mjb.b(21957, var4);
                break;
            }
            var14 = (lrb) (Object) var6;
            var8 = var14.a(1, -116);
            if (!param0.a(var8, 0, -1)) {
                break;
            }
            var4 = var8;
            break;
        }
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[100];
    }
}
