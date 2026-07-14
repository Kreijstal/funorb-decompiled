/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ro extends ua implements ti {
    static gb field_u;
    static hd field_o;
    private la field_s;
    static String field_p;
    static lh field_r;
    static int field_q;
    static int[] field_t;

    final static byte[] b(int param0, int param1) {
        byte[] var13 = null;
        byte[] var12 = null;
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3 = null;
        Random var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        bi var2_ref = null;
        int var9 = AceOfSkies.field_G ? 1 : 0;
        if (param0 != -3992) {
            int discarded$0 = ro.c((byte) 102);
        }
        bi var2 = (bi) hh.field_b.a((byte) -27, (long)param1);
        if (var2 == null) {
            var13 = new byte[512];
            var12 = var13;
            var11 = var12;
            var10 = var11;
            var3 = var10;
            var4 = new Random((long)param1);
            for (var5 = 0; -256 < (var5 ^ -1); var5++) {
                var3[var5] = (byte)var5;
            }
            for (var5 = 0; (var5 ^ -1) > -256; var5++) {
                var6 = -var5 + 255;
                var7 = bs.a(-1, var4, var6);
                var8 = var13[var7];
                var3[var7] = var13[var6];
                var3[511 + -var5] = (byte) var8;
                var3[var6] = (byte) var8;
            }
            var2_ref = new bi(var13);
            hh.field_b.a((wt) (Object) var2_ref, 2, (long)param1);
        }
        return ((bi) var2_ref).field_n;
    }

    ro(jc param0, la param1, boolean param2) {
        super(param0, 34963, param2);
        ((ro) this).field_s = param1;
    }

    public final void a(int param0, int param1) {
        this.a(param0, param1 * ((ro) this).field_s.field_c);
    }

    public final boolean a(byte param0) {
        int var2 = 16 / ((param0 - -61) / 59);
        return this.a(((ro) this).field_a.field_Qc, (byte) -115);
    }

    public final void a(int param0) {
        this.a(param0);
    }

    public static void d(byte param0) {
        field_r = null;
        field_o = null;
        field_u = null;
        field_p = null;
        field_t = null;
        int var1 = 41 / ((15 - param0) / 62);
    }

    final static int a(int param0, boolean param1, int param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if ((param0 ^ -1) > -3) {
            break L0;
          } else {
            if ((param0 ^ -1) >= -37) {
              L1: {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                if (param2 <= -77) {
                  break L1;
                } else {
                  field_p = (String) null;
                  break L1;
                }
              }
              var7 = ((CharSequence) param3).length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  if (var5 == 0) {
                    throw new NumberFormatException();
                  } else {
                    return var6;
                  }
                } else {
                  L3: {
                    var9 = ((CharSequence) param3).charAt(var8);
                    if (0 == var8) {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param1) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (97 > var9) {
                        break L7;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L4;
                        } else {
                          break L7;
                        }
                      }
                    }
                    throw new NumberFormatException();
                  }
                  if (var9 >= param0) {
                    throw new NumberFormatException();
                  } else {
                    L8: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var10 = var6 * param0 - -var9;
                    if (var10 / param0 != var6) {
                      throw new NumberFormatException();
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (param1 != 32570) {
            boolean discarded$0 = ((ro) this).a((byte) -43);
        }
        return this.a(((ro) this).field_a.field_Qc, param0, -10386);
    }

    final static int c(byte param0) {
        if (param0 != -37) {
            return -16;
        }
        return oj.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new gb(4.0, 20, 3, 100, 25, 2.0, 20.0, 32, 2);
        field_p = "ACHIEVEMENTS";
        field_o = new hd(1);
        field_r = new lh();
        field_t = new int[8192];
    }
}
