/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ufa {
    boolean field_a;
    static int[] field_e;
    int field_h;
    static int[] field_d;
    int field_g;
    private static int[] field_p;
    private static int[] field_f;
    static String field_u;
    boolean field_l;
    private vna field_i;
    private BitSet field_s;
    int field_k;
    static int[] field_t;
    private static int[] field_b;
    int[] field_n;
    private static int[] field_j;
    BitSet field_o;
    private BitSet field_m;
    static int field_c;
    static String[] field_q;
    static nh[] field_r;

    final static void a(boolean param0) {
        if (!param0) {
            ufa.b(-1);
        }
        vc.field_n.setLength(0);
        bta.field_q = 0;
    }

    public final String toString() {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        String var1 = "Profile - ";
        var1 = var1 + "RoomsComplete[" + ((ufa) this).field_o + "]";
        var1 = var1 + "CharUnlocked[" + ((ufa) this).field_s.toString() + "]";
        var1 = var1 + "CourUnlocked[" + ((ufa) this).field_m.toString() + "]";
        var1 = var1 + "WorldMedals[";
        for (var2 = 0; ((ufa) this).field_n.length > var2; var2++) {
            var1 = var1 + ((ufa) this).field_n[var2] + " ,";
        }
        var1 = var1 + "]";
        return var1;
    }

    public static void b(int param0) {
        field_f = null;
        field_e = null;
        field_p = null;
        int var1 = 76 / ((-14 - param0) / 48);
        field_u = null;
        field_t = null;
        field_d = null;
        field_b = null;
        field_r = null;
        field_j = null;
        field_q = null;
    }

    final boolean a(byte param0, int param1) {
        if (param0 >= -22) {
            return true;
        }
        return ((ufa) this).field_m.get(param1);
    }

    final void a(kh param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TombRacer.field_G ? 1 : 0;
        var3 = param0.h(255);
        if (-17 >= (var3 ^ -1)) {
          param0.h((byte) -11);
          ((ufa) this).field_l = uha.a(5907, param0);
          var4 = param0.b((byte) 44, 8);
          var5 = 0;
          L0: while (true) {
            if (var4 <= var5) {
              var6 = -25 % ((69 - param1) / 53);
              var5 = 0;
              L1: while (true) {
                if (var5 >= 13) {
                  var5 = 0;
                  L2: while (true) {
                    if ((var5 ^ -1) <= -10) {
                      var5 = 0;
                      L3: while (true) {
                        if (((ufa) this).field_n.length <= var5) {
                          ((ufa) this).field_g = param0.b((byte) 44, 4);
                          ((ufa) this).field_h = param0.b((byte) 44, 8);
                          ((ufa) this).field_k = param0.b((byte) 44, 8);
                          param0.i((byte) 98);
                          return;
                        } else {
                          ((ufa) this).field_n[var5] = param0.b((byte) 44, 2);
                          var5++;
                          continue L3;
                        }
                      }
                    } else {
                      if (uha.a(5907, param0)) {
                        ((ufa) this).field_m.set(var5);
                        var5++;
                        continue L2;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  if (uha.a(5907, param0)) {
                    ((ufa) this).field_s.set(var5);
                    var5++;
                    continue L1;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              if (uha.a(5907, param0)) {
                ((ufa) this).field_o.set(var5);
                var5++;
                continue L0;
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean b(byte param0, int param1) {
        if (param0 != 4) {
            ((ufa) this).field_l = false;
        }
        return ((ufa) this).field_s.get(param1);
    }

    final taa c(int param0) {
        if (param0 < 29) {
            ufa.b(90);
        }
        return (taa) (Object) ((ufa) this).field_i.c(59);
    }

    final int a(int param0) {
        int var2 = -45 / ((-54 - param0) / 34);
        return ((ufa) this).field_i.a((byte) -16);
    }

    final static void a(int param0, int param1) {
        if (null != pqa.field_m) {
            // if_icmple L27
        }
        pqa.field_m = new int[param1];
        if (param0 >= -29) {
            field_b = null;
        }
    }

    final void a(int param0, kh param1) {
        int var4 = 0;
        int var5 = TombRacer.field_G ? 1 : 0;
        param1.i(16, 0);
        param1.i(8);
        boolean discarded$0 = wfa.a(((ufa) this).field_l, 126, param1);
        int var3 = -1 + ((ufa) this).field_o.size();
        param1.a((byte) -4, var3, 8);
        for (var4 = 0; var4 < var3; var4++) {
            boolean discarded$1 = wfa.a(((ufa) this).field_o.get(var4), -52, param1);
        }
        for (var4 = 0; var4 < 13; var4++) {
            boolean discarded$2 = wfa.a(((ufa) this).field_s.get(var4), param0 + 2016803960, param1);
        }
        for (var4 = 0; (var4 ^ -1) > -10; var4++) {
            boolean discarded$3 = wfa.a(((ufa) this).field_m.get(var4), param0 ^ -2016803978, param1);
        }
        if (param0 != -2016804080) {
            field_e = null;
        }
        for (var4 = 0; ((ufa) this).field_n.length > var4; var4++) {
            param1.a((byte) -125, ((ufa) this).field_n[var4], 2);
        }
        param1.a((byte) 93, ((ufa) this).field_g, 4);
        param1.a((byte) -128, ((ufa) this).field_h, 8);
        param1.a((byte) -26, ((ufa) this).field_k, 8);
        param1.k(-1826190686);
    }

    public ufa() {
        ((ufa) this).field_l = false;
        ((ufa) this).field_a = false;
        ((ufa) this).field_o = new BitSet(255);
        ((ufa) this).field_i = new vna();
        ((ufa) this).field_n = new int[9];
        ((ufa) this).field_s = new BitSet(13);
        ((ufa) this).field_m = new BitSet(9);
        ((ufa) this).field_s.set(0);
        ((ufa) this).field_s.set(6);
        ((ufa) this).field_m.set(0);
        ((ufa) this).field_g = 0;
        ((ufa) this).field_h = 255;
        ((ufa) this).field_k = 255;
    }

    final void a(int param0, taa param1) {
        if (param0 != 8) {
            ufa.a(true);
        }
        ((ufa) this).field_i.b((byte) -48, (vg) (Object) param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_u = "Won";
        field_p = new int[256];
        var0 = 0;
        L0: while (true) {
          if (256 <= var0) {
            field_b = new int[256];
            var0 = 0;
            L1: while (true) {
              if (-257 >= (var0 ^ -1)) {
                field_j = new int[256];
                var0 = 0;
                L2: while (true) {
                  if (-257 >= (var0 ^ -1)) {
                    field_f = new int[256];
                    var0 = 0;
                    L3: while (true) {
                      if (var0 >= 256) {
                        field_d = new int[256];
                        var0 = 0;
                        L4: while (true) {
                          if (256 <= var0) {
                            field_e = new int[8];
                            var0 = 0;
                            L5: while (true) {
                              if (-9 >= (var0 ^ -1)) {
                                field_t = new int[8];
                                var0 = 0;
                                L6: while (true) {
                                  if (8 <= var0) {
                                    field_q = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
                                    field_c = -1;
                                  } else {
                                    field_t[var0] = fh.a(var0, fh.a(var0 << -482298736, sea.c(-127926241, var0) << -1344922165));
                                    var0++;
                                    continue L6;
                                  }
                                }
                              } else {
                                field_e[var0] = fh.a(var0, fh.a(var0 << -1308765163, sea.c(var0, -480247777) << -1332941813));
                                var0++;
                                continue L5;
                              }
                            }
                          } else {
                            field_d[var0] = fh.a(var0, fh.a(var0 << -2016804080, sea.c(var0, 1795162367) << 140109576));
                            var0++;
                            continue L4;
                          }
                        }
                      } else {
                        field_f[var0] = fh.a(var0 >> -1694236635, fh.a(var0 << -1958801712, sea.c(-1207958532, var0) << -1355441594));
                        var0++;
                        continue L3;
                      }
                    }
                  } else {
                    field_j[var0] = fh.a(fh.a(sea.c(65306, var0 << -43075481), sea.c(-861666308, var0) << 42100206), var0);
                    var0++;
                    continue L2;
                  }
                }
              } else {
                field_b[var0] = fh.a(fh.a(sea.c(65308, var0 << -1807910522), sea.c(var0, 762841080) << -676866195), var0);
                var0++;
                continue L1;
              }
            }
          } else {
            field_p[var0] = fh.a(var0 >> 175413507, fh.a(var0 << -1283928720, sea.c(1342178300, var0) << 1331522726));
            var0++;
            continue L0;
          }
        }
    }
}
