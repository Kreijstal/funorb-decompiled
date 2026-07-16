/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ue {
    private long field_e;
    private long field_d;
    static t[] field_c;
    static int field_h;
    static t field_f;
    static t field_b;
    private RandomAccessFile field_a;
    static si field_g;

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if ((((ue) this).field_e ^ -1L) > ((long)param0 + ((ue) this).field_d ^ -1L)) {
          ((ue) this).field_a.seek(((ue) this).field_e);
          ((ue) this).field_a.write(1);
          throw new EOFException();
        } else {
          L0: {
            ((ue) this).field_a.write(param3, param2, param0);
            ((ue) this).field_d = ((ue) this).field_d + (long)param0;
            if (param1 == 2) {
              break L0;
            } else {
              ue.a(-61, 120);
              break L0;
            }
          }
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var23 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int stackIn_41_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        var23 = Torquing.field_u;
        pl.b(param4, param0 ^ -15867);
        var7 = 0;
        var8 = -param5 + param4;
        if (param0 == -15788) {
          L0: {
            if (-1 < (var8 ^ -1)) {
              var8 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var9 = param4;
            var10 = -param4;
            var11 = var8;
            var12 = -var8;
            var13 = -1;
            if (j.field_q > param2) {
              break L1;
            } else {
              if (param2 > qk.field_p) {
                break L1;
              } else {
                var39 = qd.field_a[param2];
                var16 = ln.a(qg.field_z, kn.field_e, -param4 + param1, 97);
                var17 = ln.a(qg.field_z, kn.field_e, param1 - -param4, 114);
                var18 = ln.a(qg.field_z, kn.field_e, -var8 + param1, 88);
                var19 = ln.a(qg.field_z, kn.field_e, var8 + param1, param0 + 15882);
                di.a(var16, (byte) -125, param3, var39, var18);
                di.a(var18, (byte) -114, param6, var39, var19);
                di.a(var19, (byte) 108, param3, var39, var17);
                break L1;
              }
            }
          }
          var14 = -1;
          L2: while (true) {
            if (var7 >= var9) {
              return;
            } else {
              L3: {
                var13 += 2;
                var14 += 2;
                var12 = var12 + var14;
                var10 = var10 + var13;
                if ((var12 ^ -1) > -1) {
                  break L3;
                } else {
                  if (-2 < (var11 ^ -1)) {
                    break L3;
                  } else {
                    var11--;
                    vc.field_a[var11] = var7;
                    var12 = var12 - (var11 << -1311424191);
                    break L3;
                  }
                }
              }
              L4: {
                var7++;
                if ((var10 ^ -1) > -1) {
                  break L4;
                } else {
                  var9--;
                  var10 = var10 - (var9 << 1742672865);
                  var15 = param2 + -var9;
                  var16 = param2 + var9;
                  if (var16 < j.field_q) {
                    break L4;
                  } else {
                    if (qk.field_p >= var15) {
                      if ((var8 ^ -1) >= (var9 ^ -1)) {
                        L5: {
                          var17 = ln.a(qg.field_z, kn.field_e, param1 + var7, param0 ^ -15853);
                          var18 = ln.a(qg.field_z, kn.field_e, -var7 + param1, 118);
                          if (qk.field_p < var16) {
                            break L5;
                          } else {
                            di.a(var18, (byte) 76, param3, qd.field_a[var16], var17);
                            break L5;
                          }
                        }
                        if (j.field_q > var15) {
                          break L4;
                        } else {
                          di.a(var18, (byte) 15, param3, qd.field_a[var15], var17);
                          break L4;
                        }
                      } else {
                        L6: {
                          var17 = vc.field_a[var9];
                          var18 = ln.a(qg.field_z, kn.field_e, var7 + param1, 119);
                          var19 = ln.a(qg.field_z, kn.field_e, param1 + -var7, param0 ^ -15855);
                          var20 = ln.a(qg.field_z, kn.field_e, var17 + param1, 95);
                          var21 = ln.a(qg.field_z, kn.field_e, -var17 + param1, 96);
                          if (var16 <= qk.field_p) {
                            var40 = qd.field_a[var16];
                            di.a(var19, (byte) -111, param3, var40, var21);
                            di.a(var21, (byte) -94, param6, var40, var20);
                            di.a(var20, (byte) 33, param3, var40, var18);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if ((var15 ^ -1) <= (j.field_q ^ -1)) {
                          var41 = qd.field_a[var15];
                          di.a(var19, (byte) -93, param3, var41, var21);
                          di.a(var21, (byte) 107, param6, var41, var20);
                          di.a(var20, (byte) -95, param3, var41, var18);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L7: {
                var15 = param2 - var7;
                var16 = var7 + param2;
                if ((var16 ^ -1) > (j.field_q ^ -1)) {
                  break L7;
                } else {
                  if ((qk.field_p ^ -1) <= (var15 ^ -1)) {
                    var17 = var9 + param1;
                    var18 = param1 - var9;
                    if (kn.field_e > var17) {
                      break L7;
                    } else {
                      if (qg.field_z < var18) {
                        break L7;
                      } else {
                        var17 = ln.a(qg.field_z, kn.field_e, var17, 94);
                        var18 = ln.a(qg.field_z, kn.field_e, var18, 118);
                        if (var7 < var8) {
                          L8: {
                            if ((var7 ^ -1) >= (var11 ^ -1)) {
                              stackOut_40_0 = var11;
                              stackIn_41_0 = stackOut_40_0;
                              break L8;
                            } else {
                              stackOut_39_0 = vc.field_a[var7];
                              stackIn_41_0 = stackOut_39_0;
                              break L8;
                            }
                          }
                          L9: {
                            var19 = stackIn_41_0;
                            var20 = ln.a(qg.field_z, kn.field_e, param1 + var19, 100);
                            var21 = ln.a(qg.field_z, kn.field_e, param1 - var19, 81);
                            if ((var16 ^ -1) >= (qk.field_p ^ -1)) {
                              var42 = qd.field_a[var16];
                              di.a(var18, (byte) -103, param3, var42, var21);
                              di.a(var21, (byte) -115, param6, var42, var20);
                              di.a(var20, (byte) -116, param3, var42, var17);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          if (j.field_q > var15) {
                            break L7;
                          } else {
                            var43 = qd.field_a[var15];
                            di.a(var18, (byte) 4, param3, var43, var21);
                            di.a(var21, (byte) -5, param6, var43, var20);
                            di.a(var20, (byte) -95, param3, var43, var17);
                            break L7;
                          }
                        } else {
                          L10: {
                            if ((qk.field_p ^ -1) > (var16 ^ -1)) {
                              break L10;
                            } else {
                              di.a(var18, (byte) 51, param3, qd.field_a[var16], var17);
                              break L10;
                            }
                          }
                          if (j.field_q > var15) {
                            break L7;
                          } else {
                            di.a(var18, (byte) 71, param3, qd.field_a[var15], var17);
                            continue L2;
                          }
                        }
                      }
                    }
                  } else {
                    continue L2;
                  }
                }
              }
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0) throws IOException {
        int var2 = 26 % ((param0 - 16) / 52);
        if (!(null == ((ue) this).field_a)) {
            ((ue) this).field_a.close();
            ((ue) this).field_a = null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_g = null;
        int var1 = -70 % ((-19 - param0) / 59);
        field_b = null;
        field_f = null;
    }

    protected final void finalize() throws Throwable {
        if (!(null == ((ue) this).field_a)) {
            System.out.println("");
            ((ue) this).a((byte) -89);
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        L0: {
          var5 = ((ue) this).field_a.read(param2, param1, param0);
          if (0 >= var5) {
            break L0;
          } else {
            ((ue) this).field_d = ((ue) this).field_d + (long)var5;
            break L0;
          }
        }
        if (param3 != 15389) {
          return 40;
        } else {
          return var5;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != -16513) {
            ue.a(28, -38, 8, -108, 43, -40, 73);
        }
        int discarded$0 = sh.b(0);
    }

    final void a(int param0, long param1) throws IOException {
        ((ue) this).field_a.seek(param1);
        if (param0 != -2) {
            return;
        }
        ((ue) this).field_d = param1;
    }

    final long b(byte param0) throws IOException {
        int var2 = 108 % ((param0 - -8) / 56);
        return ((ue) this).field_a.length();
    }

    ue(File param0, String param1, long param2) throws IOException {
        if ((param2 ^ -1L) == 0L) {
            param2 = 9223372036854775807L;
        }
        if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((ue) this).field_a = new RandomAccessFile(param0, param1);
        ((ue) this).field_e = param2;
        ((ue) this).field_d = 0L;
        int var5 = ((ue) this).field_a.read();
        if (var5 != -1) {
            if (!param1.equals((Object) (Object) "r")) {
                ((ue) this).field_a.seek(0L);
                ((ue) this).field_a.write(var5);
            }
        }
        ((ue) this).field_a.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = -1;
    }
}
