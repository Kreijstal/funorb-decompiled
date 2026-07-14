/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fd extends ana {
    private taa field_F;
    private int field_w;
    private rr[] field_I;
    private int field_y;
    private cq field_G;
    static eaa field_z;
    tla field_B;
    private boolean field_v;
    private int field_x;
    static String field_E;
    static int[] field_D;

    final static pia a(byte param0, int param1, int param2, vr param3, vr param4) {
        if (param0 != -105) {
            return null;
        }
        if (!g.a(param2, param1, param0 ^ 30847, param4)) {
            return null;
        }
        return cea.a(param3.b(-56, param2, param1), 28450);
    }

    public static void d(int param0) {
        field_z = null;
        field_E = null;
        field_D = null;
        if (param0 != 0) {
            Object var2 = null;
            fd.a((int[]) null, (vr) null, -57, 54, (byte[]) null, (vr) null, true, (vr) null, (int[]) null, 67, (ee[]) null, (kv[][]) null, (kv[][]) null, (byte[]) null, (String[][]) null, (String[][]) null, (String[]) null);
        }
    }

    fd(gj param0, tla param1) {
        super(param0, (bca) (Object) param1);
        int var6 = 0;
        ((fd) this).field_w = 0;
        ((fd) this).field_y = 25;
        ((fd) this).field_v = false;
        ((fd) this).field_B = param1;
        int var3 = (m.field_a.nextInt() & 1) == 0 ? 1 : 0;
        int var4 = ((fd) this).field_B.field_u;
        aj[] var5 = ((fd) this).field_B.field_t;
        ((fd) this).field_I = new rr[var4];
        for (var6 = 0; var6 < var4; var6++) {
            ((fd) this).field_I[var6] = new rr(((fd) this).field_q, (fd) this, var5[var6].field_c, var5[var6].field_a, var3 != 0);
            ((fd) this).field_I[var6].field_w = ((fd) this).field_I[var6].field_w - var6 * ((fd) this).field_y;
        }
        if ((var4 ^ -1) < -1) {
            ((fd) this).field_F = ((fd) this).field_I[var4 >> -379861375].e((byte) -120);
            ((fd) this).a(27799, (at) (Object) ((fd) this).field_F);
        }
    }

    private final void e(int param0) {
        if (((fd) this).field_G != null) {
            id.a(-95, ((fd) this).field_G);
        }
        gka.a(-128, ((fd) this).field_x);
        int var2 = -114 % ((param0 - -7) / 34);
    }

    final static void a(int[] param0, vr param1, int param2, int param3, byte[] param4, vr param5, boolean param6, vr param7, int[] param8, int param9, ee[] param10, kv[][] param11, kv[][] param12, byte[] param13, String[][] param14, String[][] param15, String[] param16) {
        Object var19 = null;
        vh.a(param4, param8, param13, param10, 1, param0, param6, param5, param12, param14, param9, param16, param2, param1, (String[]) null, param11, param7, param15, 22914);
        if (param3 != 0) {
            Object var18 = null;
            pia discarded$0 = fd.a((byte) 115, 95, 37, (vr) null, (vr) null);
        }
    }

    final void c(int param0) {
        rr[] var2 = null;
        int var3 = 0;
        rr var4 = null;
        int var5 = 0;
        rr[] var6 = null;
        var5 = BachelorFridge.field_y;
        var6 = ((fd) this).field_I;
        var2 = var6;
        if (param0 <= -10) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= var6.length) {
              return;
            } else {
              var4 = var6[var3];
              if (var4 != null) {
                var4.c(-44);
                var3++;
                continue L0;
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        int var3 = 0;
        CharSequence var7 = null;
        String var5 = null;
        String var4 = null;
        if (wh.field_p == null) {
        } else {
            var3 = wh.field_p.b(param2, 93);
            if (0 == var3) {
            } else {
                if (var3 == 2) {
                    if (null != wh.field_p.field_Z) {
                        if (wh.field_p.field_Z.equals((Object) (Object) "")) {
                        } else {
                            if (wh.field_p.field_Z.charAt(0) == 91) {
                                var4 = wh.field_p.field_Z;
                            } else {
                                var7 = (CharSequence) (Object) wh.field_p.field_Z;
                                var4 = fq.a(0, var7);
                                var5 = var4;
                                var5 = var4;
                            }
                            var5 = null;
                            if (!(-1 != vaa.field_f)) {
                                var5 = lda.a(-26181, param1, var4);
                            }
                            if (-2 == vaa.field_f) {
                                var5 = via.a(param1, var4, -75);
                            }
                            if (vaa.field_f == 2) {
                                var5 = ip.a(var4, (byte) -80, param1);
                            }
                            if (-4 == (vaa.field_f ^ -1)) {
                                var5 = tha.a(2, var4, var4, param1);
                            }
                            if (!(var5 == null)) {
                                Object var6 = null;
                                vf.a(var4, 0, -101, (String) null, var5, 2);
                            }
                        }
                    }
                }
                wh.field_p = null;
                vaa.field_f = -1;
            }
        }
        if (!param0) {
            field_D = null;
        }
    }

    final boolean c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        rr[] var4 = null;
        rr var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        rr[] var8 = null;
        rr var9 = null;
        rr var10 = null;
        L0: {
          var7 = BachelorFridge.field_y;
          var2 = -3 % ((param0 - 71) / 47);
          if (((fd) this).field_v) {
            break L0;
          } else {
            ((fd) this).field_x = bs.field_k;
            ((fd) this).field_v = true;
            break L0;
          }
        }
        L1: {
          if ((bs.field_k ^ -1) < -1) {
            L2: {
              var3 = -2 + bs.field_k;
              if (0 > var3) {
                var3 = 0;
                break L2;
              } else {
                break L2;
              }
            }
            gka.a(-56, var3);
            break L1;
          } else {
            break L1;
          }
        }
        ((fd) this).field_w = ((fd) this).field_w + 1;
        if (((fd) this).field_m.a((byte) -106)) {
          return false;
        } else {
          L3: {
            if (null == ((fd) this).field_F) {
              break L3;
            } else {
              if (!((fd) this).field_F.a((byte) -106)) {
                break L3;
              } else {
                return false;
              }
            }
          }
          L4: {
            if (((fd) this).field_w <= 128) {
              break L4;
            } else {
              if (((fd) this).field_G == null) {
                gka.a(107, 0);
                ((fd) this).field_G = tw.a(je.a(rt.field_a[68], 384, 256), (byte) -36);
                break L4;
              } else {
                break L4;
              }
            }
          }
          var3 = 1;
          var8 = ((fd) this).field_I;
          var4 = var8;
          var5 = 0;
          L5: while (true) {
            if (var5 >= var8.length) {
              L6: {
                if (-1 > (((fd) this).field_B.field_u ^ -1)) {
                  var10 = ((fd) this).field_I[((fd) this).field_B.field_u >> 902122369];
                  var4_ref = var10;
                  if (var4_ref != null) {
                    var10.d(320);
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              if (var3 == 0) {
                return false;
              } else {
                this.e(-86);
                return true;
              }
            } else {
              var9 = var8[var5];
              if (var9 != null) {
                if (!var9.b(21807)) {
                  var3 = 0;
                  var5++;
                  continue L5;
                } else {
                  var6 = null;
                  var5++;
                  continue L5;
                }
              } else {
                var5++;
                continue L5;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new eaa();
        field_E = "Passwords must be between 5 and 20 characters long";
    }
}
