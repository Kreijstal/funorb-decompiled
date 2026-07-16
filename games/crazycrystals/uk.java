/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class uk extends nf {
    private int field_h;
    private int field_k;
    static ko field_i;
    static boolean field_j;

    public static void c(int param0) {
        field_i = null;
        int var1 = -52 / ((param0 - -61) / 60);
    }

    final pb b(byte param0) {
        if (param0 >= -127) {
            ((uk) this).field_h = 65;
        }
        return (pb) (Object) new mn();
    }

    final f a(boolean param0, int param1, int param2, int param3, ta param4) {
        ((uk) this).field_k = ((uk) this).field_k + param3;
        if (param0) {
            return null;
        }
        ((uk) this).field_h = ((uk) this).field_h + 1;
        ph.a(q.field_a[ma.field_n[param1]].a((byte) 107, param2) ? 50 : 25, (byte) 107, param1, param4);
        return bm.field_g;
    }

    final static void d(int param0) {
        try {
            IOException var1_ref_IOException = null;
            int[] var1_ref_int__ = null;
            int var1 = 0;
            int var2 = 0;
            int var3 = 0;
            int var4 = 0;
            int[] var5 = null;
            int[] var6 = null;
            int[] var7 = null;
            int[] var8 = null;
            int[] var9 = null;
            Throwable decompiledCaughtException = null;
            var4 = CrazyCrystals.field_B;
            try {
              L0: {
                L1: {
                  if (param0 == -9762) {
                    break L1;
                  } else {
                    uk.c(-48);
                    break L1;
                  }
                }
                L2: {
                  if (null != ol.field_z[0]) {
                    break L2;
                  } else {
                    ol.field_z[0] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(ba.field_k.a(7693, "tutorial.ccl", "")), qp.field_g);
                    vp.a(125);
                    break L2;
                  }
                }
                L3: {
                  if ((mo.field_l ^ -1) < -1) {
                    if (null != ol.field_z[2]) {
                      break L3;
                    } else {
                      L4: {
                        if (pd.field_f == null) {
                          pd.field_f = w.a(param0 + 9762, 0, 2, 5);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var9 = pd.field_f.field_j;
                      var8 = var9;
                      var7 = var8;
                      var6 = var7;
                      var5 = var6;
                      var1_ref_int__ = var5;
                      if (var1_ref_int__ != null) {
                        ol.field_z[1] = b.a(oe.a(param0, -9762), (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "puzzle1p.ccl", "")), ro.field_r);
                        ol.field_z[2] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "puzzle2p.ccl", "")), pg.field_e);
                        ol.field_z[3] = b.a(param0 + 9762, (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "puzzle3p.ccl", "")), qg.field_c);
                        ol.field_z[4] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(mg.field_g.a(false, var9, "arcade1p.ccl", "")), kk.field_k);
                        pd.field_f = null;
                        mg.field_g = null;
                        vp.a(105);
                        break L3;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (ol.field_z[1] == null) {
                      ol.field_z[1] = b.a(0, (InputStream) (Object) new ByteArrayInputStream(ba.field_k.a(7693, "puzzle1p.ccl", "")), ro.field_r);
                      vp.a(param0 ^ -9800);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                ba.field_k = null;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1_ref_IOException = (IOException) (Object) decompiledCaughtException;
              throw new RuntimeException(var1_ref_IOException.getMessage());
            }
            L5: {
              if (jc.field_b) {
                break L5;
              } else {
                if (!rc.a(-39)) {
                  L6: {
                    if (null == pc.field_u) {
                      pc.field_u = new pp[5];
                      var1 = 0;
                      L7: while (true) {
                        if (var1 >= 5) {
                          break L6;
                        } else {
                          pc.field_u[var1] = ea.a(var1, 1, (byte) 65, 5);
                          var1++;
                          continue L7;
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  var1 = 1;
                  var2 = 0;
                  L8: while (true) {
                    if ((var2 ^ -1) <= -6) {
                      if (var1 == 0) {
                        break L5;
                      } else {
                        jc.field_b = true;
                        pc.field_u = null;
                        break L5;
                      }
                    } else {
                      L9: {
                        if (pc.field_u[var2] == null) {
                          break L9;
                        } else {
                          if (!pc.field_u[var2].field_h) {
                            break L9;
                          } else {
                            L10: {
                              if (pc.field_u[var2].field_g[0] > ke.field_b[var2]) {
                                var3 = pc.field_u[var2].field_g[0] + -ke.field_b[var2];
                                ka.field_n = ka.field_n - var3;
                                ei.field_F = ei.field_F - 2 * var3;
                                sm.field_f = sm.field_f - var3 * 2;
                                ke.field_b[var2] = pc.field_u[var2].field_g[0];
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            pc.field_u[var2] = null;
                            break L9;
                          }
                        }
                      }
                      if (pc.field_u[var2] != null) {
                        var1 = 0;
                        var2++;
                        continue L8;
                      } else {
                        var2++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L11: {
              if (gh.field_y) {
                break L11;
              } else {
                if (!rc.a(-63)) {
                  L12: {
                    if (null != eb.field_p) {
                      break L12;
                    } else {
                      eb.field_p = qa.a((byte) 121, 4);
                      break L12;
                    }
                  }
                  if (!eb.field_p.field_k) {
                    break L11;
                  } else {
                    fk.field_s = eb.field_p.field_f;
                    pc.field_y = pc.field_y & (fk.field_s ^ -1);
                    gh.field_y = true;
                    fk.field_s = fk.field_s + pc.field_y;
                    eb.field_p = null;
                    break L11;
                  }
                } else {
                  break L11;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    uk() {
        ((uk) this).field_h = 0;
        ((uk) this).field_k = 0;
    }

    final void a(byte param0) {
        int var2 = -37 % ((param0 - 29) / 42);
        tb.field_d.a(cf.field_d, 100, 48 * (gi.field_m * ((uk) this).field_h), ((uk) this).field_k / ((uk) this).field_h);
        ((uk) this).field_h = 0;
        ((uk) this).field_k = 0;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var6 = CrazyCrystals.field_B;
        param2 = param2 + param3;
        if (!param0) {
            field_j = false;
        }
        while (param2 > param3) {
            pd.field_g[param1] = pd.field_g[param1] + (q.field_a[ma.field_n[param1]].a((byte) 92, param3) ? 50 : 25);
            param3++;
        }
    }

    final static jp a(byte param0, String param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = CrazyCrystals.field_B;
        int var2 = param1.length();
        if (param0 < 43) {
            uk.d(38);
        }
        for (var3 = 0; var3 < var2; var3++) {
            var4 = param1.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return sl.field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = false;
    }
}
