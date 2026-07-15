/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class cm implements Iterator {
    private int field_e;
    private bh field_c;
    private bh field_j;
    private si field_k;
    static int[] field_a;
    static int[] field_h;
    static int[] field_g;
    static int[] field_b;
    static String field_i;
    static String field_d;
    static ie field_f;

    public final Object next() {
        bh var1 = null;
        int var2 = client.field_A ? 1 : 0;
        if (!(((cm) this).field_c == ((cm) this).field_k.field_h[((cm) this).field_e + -1])) {
            var1 = ((cm) this).field_c;
            ((cm) this).field_c = var1.field_b;
            ((cm) this).field_j = var1;
            return (Object) (Object) var1;
        }
        do {
            if (((cm) this).field_k.field_a <= ((cm) this).field_e) {
                return null;
            }
            int fieldTemp$0 = ((cm) this).field_e;
            ((cm) this).field_e = ((cm) this).field_e + 1;
            var1 = ((cm) this).field_k.field_h[fieldTemp$0].field_b;
        } while (var1 == ((cm) this).field_k.field_h[-1 + ((cm) this).field_e]);
        ((cm) this).field_c = var1.field_b;
        ((cm) this).field_j = var1;
        return (Object) (Object) var1;
    }

    final static void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        sb var4_ref_sb = null;
        int var4 = 0;
        ff var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ff var9 = null;
        uf var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        L0: {
          var8 = client.field_A ? 1 : 0;
          var10 = de.field_V;
          if (param0 == 53) {
            break L0;
          } else {
            cm.a(20);
            break L0;
          }
        }
        L1: {
          var2 = var10.d((byte) -44);
          var3 = var10.d((byte) -117);
          if (var2 != 0) {
            if (var2 != 1) {
              qb.a((Throwable) null, 16408, "LR1: " + qk.d((byte) 74));
              si.a(100);
              break L1;
            } else {
              var4 = var10.e((byte) -2);
              ff dupTemp$1 = (ff) (Object) cd.field_c.c((byte) -124);
              var9 = dupTemp$1;
              var5 = dupTemp$1;
              L2: while (true) {
                L3: {
                  if (var9 == null) {
                    break L3;
                  } else {
                    L4: {
                      if (var3 != var9.field_q) {
                        break L4;
                      } else {
                        if (var4 != var9.field_r) {
                          break L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5 = (ff) (Object) cd.field_c.d(true);
                    continue L2;
                  }
                }
                if (var5 == null) {
                  si.a(71);
                  return;
                } else {
                  var5.b((byte) 124);
                  break L1;
                }
              }
            }
          } else {
            var4_ref_sb = (sb) (Object) ef.field_S.c((byte) -68);
            if (var4_ref_sb == null) {
              si.a(78);
              return;
            } else {
              L5: {
                var5_int = sm.field_e - var10.field_n;
                var14 = var4_ref_sb.field_q;
                var13 = var14;
                var12 = var13;
                var11 = var12;
                var6 = var11;
                if (var14.length << 1327655874 < var5_int) {
                  var5_int = var14.length << -816484830;
                  break L5;
                } else {
                  break L5;
                }
              }
              var7 = 0;
              L6: while (true) {
                if (var7 >= var5_int) {
                  var4_ref_sb.field_s = true;
                  var4_ref_sb.b((byte) 118);
                  break L1;
                } else {
                  var6[var7 >> -1175205182] = var6[var7 >> -1175205182] + (var10.d((byte) -108) << (lb.a(3, var7) << 1714134600));
                  var7++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    private final void b(byte param0) {
        int var2 = 4 / ((-61 - param0) / 36);
        ((cm) this).field_e = 1;
        ((cm) this).field_j = null;
        ((cm) this).field_c = ((cm) this).field_k.field_h[0].field_b;
    }

    public final boolean hasNext() {
        int var2 = client.field_A ? 1 : 0;
        if (!(((cm) this).field_c == ((cm) this).field_k.field_h[-1 + ((cm) this).field_e])) {
            return true;
        }
        while (((cm) this).field_e < ((cm) this).field_k.field_a) {
            int fieldTemp$0 = ((cm) this).field_e;
            ((cm) this).field_e = ((cm) this).field_e + 1;
            if (((cm) this).field_k.field_h[fieldTemp$0].field_b != ((cm) this).field_k.field_h[((cm) this).field_e - 1]) {
                ((cm) this).field_c = ((cm) this).field_k.field_h[-1 + ((cm) this).field_e].field_b;
                return true;
            }
            ((cm) this).field_c = ((cm) this).field_k.field_h[((cm) this).field_e + -1];
        }
        return false;
    }

    public static void a(int param0) {
        field_h = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_a = null;
        field_i = null;
        field_d = null;
        if (param0 != 1714134600) {
            field_a = null;
        }
    }

    public final void remove() {
        if (((cm) this).field_j == null) {
            throw new IllegalStateException();
        }
        ((cm) this).field_j.b((byte) 112);
        ((cm) this).field_j = null;
    }

    final static String a(byte param0, String param1, String[] param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = client.field_A ? 1 : 0;
        var3 = param1.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param1.indexOf("<%", var5);
          if ((var6_int ^ -1) <= -1) {
            var5 = 2 + var6_int;
            L1: while (true) {
              L2: {
                if (var5 >= var3) {
                  break L2;
                } else {
                  if (!fl.a(param1.charAt(var5), (byte) 23)) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              var7_ref_String = param1.substring(2 + var6_int, var5);
              if (be.a((byte) 98, (CharSequence) (Object) var7_ref_String)) {
                if (var3 <= var5) {
                  continue L0;
                } else {
                  if (param1.charAt(var5) != 62) {
                    continue L0;
                  } else {
                    var5++;
                    var8 = cb.a((byte) -72, (CharSequence) (Object) var7_ref_String);
                    var4 = var4 + (var6_int - (var5 - param2[var8].length()));
                    continue L0;
                  }
                }
              } else {
                continue L0;
              }
            }
          } else {
            L3: {
              var6 = new StringBuilder(var4);
              var5 = 0;
              if (param0 > 80) {
                break L3;
              } else {
                cm.a((byte) -121);
                break L3;
              }
            }
            var7 = 0;
            L4: while (true) {
              var8 = param1.indexOf("<%", var5);
              if ((var8 ^ -1) <= -1) {
                var5 = var8 - -2;
                L5: while (true) {
                  L6: {
                    if (var3 <= var5) {
                      break L6;
                    } else {
                      if (!fl.a(param1.charAt(var5), (byte) 23)) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var9 = param1.substring(2 + var8, var5);
                  if (be.a((byte) 98, (CharSequence) (Object) var9)) {
                    if (var5 >= var3) {
                      continue L4;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L4;
                      } else {
                        var5++;
                        var10 = cb.a((byte) 100, (CharSequence) (Object) var9);
                        StringBuilder discarded$3 = var6.append(param1.substring(var7, var8));
                        var7 = var5;
                        StringBuilder discarded$4 = var6.append(param2[var10]);
                        continue L4;
                      }
                    }
                  } else {
                    continue L4;
                  }
                }
              } else {
                StringBuilder discarded$5 = var6.append(param1.substring(var7));
                return var6.toString();
              }
            }
          }
        }
    }

    cm(si param0) {
        ((cm) this).field_j = null;
        ((cm) this).field_k = param0;
        this.b((byte) -117);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int[] var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        field_a = b.h(-126);
        field_h = b.h(80);
        field_g = b.h(-125);
        field_b = b.h(86);
        var0 = 0;
        L0: while (true) {
          if ((var0 ^ -1) <= -16) {
            var0 = 15;
            L1: while (true) {
              if (31 <= var0) {
                var13 = field_g;
                var8 = var13;
                var3 = var8;
                var3[0] = de.b(var13[0], 8);
                var14 = field_g;
                var9 = var14;
                var4 = var9;
                var4[0] = de.b(var14[0], 128);
                var15 = field_g;
                var10 = var15;
                var5 = var10;
                var5[0] = de.b(var15[0], 4194304);
                var16 = field_b;
                var11 = var16;
                var6 = var11;
                var6[0] = de.b(var16[0], 1);
                var17 = field_b;
                var12 = var17;
                var7 = var12;
                var7[0] = de.b(var17[0], 2048);
                field_i = "Creating your account";
                field_d = "Connection lost. <%0>";
                return;
              } else {
                var1 = field_h;
                var2 = var0;
                var1[var2 >> 342484197] = de.b(var1[var2 >> 342484197], 1 << lb.a(31, var2));
                var0++;
                continue L1;
              }
            }
          } else {
            var1 = field_a;
            var2 = var0;
            var1[var2 >> -1741755611] = de.b(var1[var2 >> -1741755611], 1 << lb.a(var2, 31));
            var0++;
            continue L0;
          }
        }
    }
}
