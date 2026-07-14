/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class bja {
    static String field_d;
    static cn field_a;
    kha[] field_c;
    static float field_b;

    final static void a(int param0, byte param1, int param2) {
        String var3_ref = null;
        qv.field_o = null;
        String var3 = fna.field_k;
        if (!(var3 != null)) {
            var3_ref = kma.field_c[0];
        }
        String[] var4 = new String[1];
        var4[0] = var3_ref;
        int var5 = jqa.a(2147483647, new Random(), -76);
        wka.field_d = false;
        id var6 = new id(param0, var5);
        rba.field_a = new qh(false, var5, var4, 0, false, rga.b(26499, param0), 0, 1, param2, param0, (BitSet[]) null, new boolean[1], (ou) (Object) var6);
        rba.field_a.j((byte) -64);
        rba.field_a.h((byte) -52);
        int var7 = -125 / ((param1 - 57) / 38);
        iqa.field_c.g(0);
        ira.a(false, -1, (byte) 92);
    }

    public static void c(int param0) {
        if (param0 < 126) {
            field_d = null;
        }
        field_d = null;
        field_a = null;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        kha var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        for (var3 = param1; ((bja) this).field_c.length > var3; var3++) {
            var4 = ((bja) this).field_c[var3];
            if (!(var4.field_c.length <= param0)) {
                return var3;
            }
            param0 = param0 - (var4.field_c.length + -1);
        }
        return ((bja) this).field_c.length;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        var6 = 0;
        var7 = param1.length();
        var8 = param0;
        L0: while (true) {
          if (var7 <= var8) {
            if ((var5 ^ -1) < -1) {
              return (param2 - param3 << -576281880) / var5;
            } else {
              return 0;
            }
          } else {
            var9 = param1.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
              var8++;
              continue L0;
            } else {
              if (var9 == 62) {
                var6 = 0;
                var8++;
                continue L0;
              } else {
                if (var6 == 0) {
                  if (var9 == 32) {
                    var5++;
                    var8++;
                    continue L0;
                  } else {
                    var8++;
                    continue L0;
                  }
                } else {
                  var8++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    final int a(int param0) {
        int var2 = 0;
        kha[] var3 = null;
        int var4 = 0;
        kha var5 = null;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          var2 = -1;
          if (null == ((bja) this).field_c) {
            break L0;
          } else {
            var3 = ((bja) this).field_c;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.a(true);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            int discarded$1 = ((bja) this).a(62, 38, 65);
            break L2;
          }
        }
        return var2;
    }

    final static void a(byte param0, cn param1, int param2, String param3) {
        sra var4 = (sra) (Object) dma.field_l;
        var4.a(param2, (byte) 47, param3);
        haa.field_A = new jpa();
        haa.field_A.field_f = param1.a("", (byte) 127, "map.png");
        var4.a(param2 - -5, (byte) 47, param3);
        du.field_c = new jpa();
        du.field_c.field_f = param1.a("", (byte) 117, "wall_bg.jpg");
        if (param0 > -100) {
            Object var5 = null;
            bja.a((byte) -1, (cn) null, 32, (String) null);
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        kha var6 = null;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TombRacer.field_G ? 1 : 0;
          if (((bja) this).field_c == null) {
            break L0;
          } else {
            if (((bja) this).field_c.length == 0) {
              break L0;
            } else {
              if (((bja) this).field_c[0].field_d <= param2) {
                if (param2 > ((bja) this).field_c[((bja) this).field_c.length + param0].field_b) {
                  return -1;
                } else {
                  if (-2 == (((bja) this).field_c.length ^ -1)) {
                    return ((bja) this).field_c[0].a(param1, -1);
                  } else {
                    var4 = 0;
                    var5 = 0;
                    L1: while (true) {
                      if (var5 >= ((bja) this).field_c.length) {
                        return -1;
                      } else {
                        L2: {
                          var6 = ((bja) this).field_c[var5];
                          if (param2 < var6.field_d) {
                            break L2;
                          } else {
                            if (var6.field_b < param2) {
                              break L2;
                            } else {
                              var7 = var6.a(param1, -1);
                              if (0 != (var7 ^ -1)) {
                                return var4 - -var7;
                              } else {
                                return -1;
                              }
                            }
                          }
                        }
                        var4 = var4 + (var6.field_c.length - 1);
                        var5++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            }
          }
        }
        return -1;
    }

    final int b(int param0) {
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = -43 / ((79 - param0) / 44);
            if (null == ((bja) this).field_c) {
              break L1;
            } else {
              if (-1 > (((bja) this).field_c.length ^ -1)) {
                stackOut_4_0 = ((bja) this).field_c[((bja) this).field_c.length - 1].field_b + -((bja) this).field_c[0].field_d;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                break L1;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_5_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_5_0;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        kha var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        if (param0 != -59) {
            return 84;
        }
        kha[] var7 = ((bja) this).field_c;
        kha[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (param1 < var5.field_c.length) {
                return var5.field_c[param1];
            }
            param1 = param1 - (-1 + var5.field_c.length);
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Waiting for <%0> to start the game...";
    }
}
