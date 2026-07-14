/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    private ra field_a;
    private rb field_d;
    private java.math.BigInteger field_c;
    private ef field_f;
    private java.math.BigInteger field_b;
    private eh field_g;
    private t[] field_e;

    final boolean a(int param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref = null;
        int var7 = 0;
        rb var9 = null;
        byte[] var10 = null;
        java.math.BigInteger var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        if (((jc) this).field_d != null) {
          return true;
        } else {
          L0: {
            if (null != ((jc) this).field_a) {
              break L0;
            } else {
              if (!((jc) this).field_g.b((byte) -50)) {
                ((jc) this).field_a = ((jc) this).field_g.a(255, 255, -28612, true, (byte) 0);
                break L0;
              } else {
                return false;
              }
            }
          }
          if (((jc) this).field_a.field_r) {
            return false;
          } else {
            var9 = new rb(((jc) this).field_a.f(0));
            var9.field_g = 5;
            var3 = var9.j(7909);
            var9.field_g = var9.field_g + 72 * var3;
            if (param0 == -6) {
              L1: {
                L2: {
                  var15 = new byte[var9.field_f.length + -var9.field_g];
                  var13 = var15;
                  var12 = var13;
                  var10 = var12;
                  var4 = var10;
                  var9.a(var15.length, (byte) 88, var15, 0);
                  if (null == ((jc) this).field_b) {
                    break L2;
                  } else {
                    if (((jc) this).field_c == null) {
                      break L2;
                    } else {
                      var11 = new java.math.BigInteger(var15);
                      var7_ref = var11.modPow(((jc) this).field_b, ((jc) this).field_c);
                      var5 = var7_ref.toByteArray();
                      break L1;
                    }
                  }
                }
                var5 = var4;
                break L1;
              }
              if (-66 != (var5.length ^ -1)) {
                throw new RuntimeException();
              } else {
                var16 = bd.a(-5 + -var15.length + var9.field_g, var9.field_f, (byte) 93, 5);
                var7 = 0;
                L3: while (true) {
                  if ((var7 ^ -1) <= -65) {
                    ((jc) this).field_e = new t[var3];
                    ((jc) this).field_d = var9;
                    return true;
                  } else {
                    if (var5[1 + var7] == var16[var7]) {
                      var7++;
                      continue L3;
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
              }
            } else {
              return true;
            }
          }
        }
    }

    jc(eh param0, ef param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final t a(boolean param0, int param1, uf param2, int param3, uf param4) {
        if (!(null != ((jc) this).field_d)) {
            throw new RuntimeException();
        }
        if (0 <= param3) {
            // if_icmpge L38
        } else {
            throw new RuntimeException();
        }
        if (param1 >= -61) {
            return null;
        }
        if (null != ((jc) this).field_e[param3]) {
            return ((jc) this).field_e[param3];
        }
        ((jc) this).field_d.field_g = 72 * param3 - -6;
        int var6 = ((jc) this).field_d.f((byte) -83);
        int var7 = ((jc) this).field_d.f((byte) -118);
        byte[] var11 = new byte[64];
        ((jc) this).field_d.a(64, (byte) 88, var11, 0);
        t var9 = new t(param3, param2, param4, ((jc) this).field_g, ((jc) this).field_f, var6, var11, var7, param0);
        ((jc) this).field_e[param3] = var9;
        return var9;
    }

    final static void b(int param0) {
        if (param0 != 0) {
            jc.b(77);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var3 = StarCannon.field_A;
          if (param0 == -71) {
            break L0;
          } else {
            boolean discarded$2 = ((jc) this).a(85);
            break L0;
          }
        }
        if (((jc) this).field_e == null) {
          return;
        } else {
          var2 = 0;
          L1: while (true) {
            if (((jc) this).field_e.length <= var2) {
              var4 = 0;
              var2 = var4;
              L2: while (true) {
                if (var4 >= ((jc) this).field_e.length) {
                  return;
                } else {
                  if (null != ((jc) this).field_e[var4]) {
                    ((jc) this).field_e[var4].d((byte) -12);
                    var4++;
                    continue L2;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            } else {
              if (((jc) this).field_e[var2] != null) {
                ((jc) this).field_e[var2].b(0);
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            }
          }
        }
    }

    private jc(eh param0, ef param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((jc) this).field_c = param3;
        ((jc) this).field_g = param0;
        ((jc) this).field_b = param2;
        ((jc) this).field_f = param1;
        if (!((jc) this).field_g.b((byte) -114)) {
            ((jc) this).field_a = ((jc) this).field_g.a(255, 255, -28612, true, (byte) 0);
        }
    }

    static {
    }
}
