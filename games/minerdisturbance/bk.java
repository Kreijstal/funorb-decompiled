/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk {
    static String field_b;
    private ij[] field_a;
    private nm field_e;
    private sb field_d;
    private java.math.BigInteger field_f;
    private ee field_h;
    private java.math.BigInteger field_g;
    private ch field_c;

    final ij a(int param0, uh param1, boolean param2, int param3, uh param4) {
        int var6 = 0;
        int var7 = 0;
        ij var9 = null;
        byte[] var11 = null;
        if (((bk) this).field_d != null) {
          L0: {
            if (param0 < 0) {
              break L0;
            } else {
              if (param0 >= ((bk) this).field_a.length) {
                break L0;
              } else {
                if (((bk) this).field_a[param0] == null) {
                  ((bk) this).field_d.field_o = 6 + 72 * param0;
                  var6 = ((bk) this).field_d.b((byte) 76);
                  var7 = ((bk) this).field_d.b((byte) 33);
                  var11 = new byte[64];
                  ((bk) this).field_d.a(var11, (byte) -120, param3, 64);
                  var9 = new ij(param0, param1, param4, ((bk) this).field_c, ((bk) this).field_e, var6, var11, var7, param2);
                  ((bk) this).field_a[param0] = var9;
                  return var9;
                } else {
                  return ((bk) this).field_a[param0];
                }
              }
            }
          }
          throw new RuntimeException();
        } else {
          throw new RuntimeException();
        }
    }

    bk(ch param0, nm param1) {
        this(param0, param1, (java.math.BigInteger) null, (java.math.BigInteger) null);
    }

    final boolean a(byte param0) {
        int var3 = 0;
        byte[] var4 = null;
        byte[] var5 = null;
        java.math.BigInteger var7_ref_java_math_BigInteger = null;
        int var7 = 0;
        int var8 = 0;
        sb var10 = null;
        byte[] var11 = null;
        java.math.BigInteger var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        var8 = MinerDisturbance.field_ab;
        if (null == ((bk) this).field_d) {
          L0: {
            if (null == ((bk) this).field_h) {
              if (!((bk) this).field_c.d((byte) -111)) {
                ((bk) this).field_h = ((bk) this).field_c.a((byte) 0, -21, true, 255, 255);
                break L0;
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          if (!((bk) this).field_h.field_C) {
            L1: {
              L2: {
                var10 = new sb(((bk) this).field_h.c((byte) -115));
                var10.field_o = 5;
                var3 = var10.d((byte) -54);
                var10.field_o = var10.field_o + var3 * 72;
                var16 = new byte[var10.field_u.length + -var10.field_o];
                var14 = var16;
                var13 = var14;
                var11 = var13;
                var4 = var11;
                var10.a(var4, (byte) -120, 0, var16.length);
                if (((bk) this).field_g == null) {
                  break L2;
                } else {
                  if (((bk) this).field_f == null) {
                    break L2;
                  } else {
                    var12 = new java.math.BigInteger(var16);
                    var7_ref_java_math_BigInteger = var12.modPow(((bk) this).field_g, ((bk) this).field_f);
                    var5 = var7_ref_java_math_BigInteger.toByteArray();
                    break L1;
                  }
                }
              }
              var5 = var4;
              break L1;
            }
            if (65 != var5.length) {
              throw new RuntimeException();
            } else {
              L3: {
                var17 = wb.a(-5 + -var16.length + var10.field_o, 5, var10.field_u, 18738);
                if (param0 == 16) {
                  break L3;
                } else {
                  ((bk) this).field_c = null;
                  break L3;
                }
              }
              var7 = 0;
              L4: while (true) {
                if ((var7 ^ -1) <= -65) {
                  ((bk) this).field_d = var10;
                  ((bk) this).field_a = new ij[var3];
                  return true;
                } else {
                  if (var17[var7] != var5[var7 + 1]) {
                    throw new RuntimeException();
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    public static void b(byte param0) {
        int var1 = -111 / ((param0 - -51) / 58);
        field_b = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var3 = MinerDisturbance.field_ab;
        if (null != ((bk) this).field_a) {
          var2 = param0;
          L0: while (true) {
            if (var2 >= ((bk) this).field_a.length) {
              var4 = 0;
              var2 = var4;
              L1: while (true) {
                if (((bk) this).field_a.length <= var4) {
                  return;
                } else {
                  if (((bk) this).field_a[var4] != null) {
                    ((bk) this).field_a[var4].c(param0 ^ 0);
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                }
              }
            } else {
              if (((bk) this).field_a[var2] != null) {
                ((bk) this).field_a[var2].b((byte) 40);
                var2++;
                continue L0;
              } else {
                var2++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(byte param0, int param1) {
        try {
            IOException iOException = null;
            int var2 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null == ci.field_i) {
                break L0;
              } else {
                L1: {
                  if (0 > param1) {
                    break L1;
                  } else {
                    if (pb.field_c == qd.field_Q) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  var2 = -19 % ((-8 - param0) / 45);
                  if ((sn.field_c.field_o ^ -1) != -1) {
                    break L2;
                  } else {
                    if (10000L + ck.field_d < sf.a((byte) 116)) {
                      sn.field_c.d((byte) -69, param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-1 > (sn.field_c.field_o ^ -1)) {
                    try {
                      L4: {
                        ci.field_i.a((byte) 124, sn.field_c.field_u, sn.field_c.field_o, 0);
                        ck.field_d = sf.a((byte) 115);
                        break L4;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        iOException = (IOException) (Object) decompiledCaughtException;
                        si.a(-95);
                        break L5;
                      }
                    }
                    sn.field_c.field_o = 0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
            sn.field_c.field_o = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private bk(ch param0, nm param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        ((bk) this).field_g = param2;
        ((bk) this).field_c = param0;
        ((bk) this).field_e = param1;
        ((bk) this).field_f = param3;
        if (!((bk) this).field_c.d((byte) -111)) {
            ((bk) this).field_h = ((bk) this).field_c.a((byte) 0, -21, true, 255, 255);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Passwords can only contain letters and numbers";
    }
}
