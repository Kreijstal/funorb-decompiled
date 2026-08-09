/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf {
    static String field_a;
    static boolean field_b;
    static String field_c;

    final static fb a(String param0, boolean param1) {
        String var2 = null;
        fb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_10_0 = null;
        fb stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            if (lf.field_q != null) {
              if (param0 != null) {
                if (param0.length() != 0) {
                  var6 = (CharSequence) ((Object) param0);
                  var2 = ce.a(var6, 0);
                  if (var2 != null) {
                    L1: {
                      var3 = (fb) ((Object) lf.field_q.a((long)var2.hashCode(), 0));
                      if (param1) {
                        break L1;
                      } else {
                        field_b = false;
                        break L1;
                      }
                    }
                    L2: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) ((Object) var3.field_ob);
                        var4 = ce.a(var7, 0);
                        if (var4.equals(var2)) {
                          stackIn_18_0 = (fb) (var3);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var3 = (fb) ((Object) lf.field_q.b(0));
                          continue L2;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackIn_10_0 = null;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("hf.D(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L3;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fb) ((Object) stackIn_10_0);
        } else {
          return stackIn_18_0;
        }
    }

    final static int b(boolean param0) {
        try {
            int stackIn_14_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var1_int = 0;
            IOException var1 = null;
            wi var2 = null;
            if (4 <= tb.field_p.field_l) {
              if (-1 != tb.field_p.field_d) {
                if (1 != (tb.field_p.field_d ^ -1)) {
                  return 1;
                } else {
                  return 4;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (ih.field_X == 0) {
                      md.field_q = vc.field_G.a(bd.field_l, a.field_a, 0);
                      ih.field_X = ih.field_X + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (-2 != (ih.field_X ^ -1)) {
                      break L2;
                    } else {
                      if (md.field_q.field_f != 2) {
                        if ((md.field_q.field_f ^ -1) != -2) {
                          break L2;
                        } else {
                          ih.field_X = ih.field_X + 1;
                          break L2;
                        }
                      } else {
                        stackIn_14_0 = qg.a(-23888, -1);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  L3: {
                    if (param0) {
                      break L3;
                    } else {
                      hf.a(true);
                      break L3;
                    }
                  }
                  L4: {
                    if ((ih.field_X ^ -1) == -3) {
                      mf.field_a = new pc((java.net.Socket) (md.field_q.field_e), vc.field_G);
                      var2 = new wi(13);
                      fj.a(pe.field_c, 6, mf.field_e, var2, fi.field_c);
                      var2.a(15, (byte) 98);
                      var2.b(uj.field_s, (byte) 40);
                      mf.field_a.a(13, var2.field_i, 0, 0);
                      ih.field_X = ih.field_X + 1;
                      kk.field_B = 30000L + fa.a(76);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (-4 == (ih.field_X ^ -1)) {
                      if (-1 <= (mf.field_a.d(0) ^ -1)) {
                        if ((kk.field_B ^ -1L) <= (fa.a(125) ^ -1L)) {
                          break L5;
                        } else {
                          stackIn_31_0 = qg.a(-23888, -2);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        var1_int = mf.field_a.b(0);
                        if (var1_int == 0) {
                          ih.field_X = ih.field_X + 1;
                          break L5;
                        } else {
                          stackIn_27_0 = qg.a(-23888, var1_int);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  if ((ih.field_X ^ -1) != -5) {
                    stackIn_36_0 = -1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    tb.field_p.a((byte) -114, mf.field_a, ke.field_p);
                    ih.field_X = 0;
                    md.field_q = null;
                    mf.field_a = null;
                    stackIn_34_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return qg.a(-23888, -3);
              }
              if (decompiledRegionSelector0 == 0) {
                return stackIn_14_0;
              } else {
                if (decompiledRegionSelector0 == 1) {
                  return stackIn_27_0;
                } else {
                  if (decompiledRegionSelector0 == 2) {
                    return stackIn_31_0;
                  } else {
                    if (decompiledRegionSelector0 == 3) {
                      return stackIn_34_0;
                    } else {
                      return stackIn_36_0;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        pf stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        pf stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Bounce.field_N;
        try {
          L0: {
            L1: {
              stackIn_3_0 = q.field_N;

              stackIn_3_1 = dk.field_c;

              if (param0) {
                stackIn_4_0 = (pf) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 0;
                break L1;
              } else {
                stackIn_4_0 = (pf) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = 1;
                break L1;
              }
            }
            ((pf) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0, true, ee.field_b);
            q.field_N.d((byte) 111);
            L2: while (true) {
              if (!q.g((byte) -15)) {
                if (0 == (m.field_g ^ -1)) {
                  if (!param0) {
                    if (!ng.field_b) {
                      if (qg.field_g != vc.field_F) {
                        if (pb.field_k.a(1000)) {
                          if (qg.field_g == fh.field_B) {
                            stackIn_25_0 = 2;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          } else {
                            return -1;
                          }
                        } else {
                          stackIn_21_0 = 1;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      } else {
                        stackIn_18_0 = 1;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackIn_15_0 = 3;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_12_0 = 81;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var1_int = m.field_g;
                  oh.a(-101, -1);
                  stackIn_9_0 = var1_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                q.field_N.a((byte) -109, lh.field_f, gk.field_d);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "hf.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  return stackIn_25_0;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        int var1 = 111 % ((17 - param0) / 40);
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
        field_b = true;
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_c = "Press ESCAPE to quit";
    }
}
