/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class b {
    private RandomAccessFile field_d;
    static oa field_f;
    static String field_c;
    static String[] field_g;
    private long field_a;
    private long field_e;
    static int field_b;

    final void a(int param0) throws IOException {
        if (null != ((b) this).field_d) {
            ((b) this).field_d.close();
            ((b) this).field_d = null;
        }
        if (param0 <= 113) {
            Object var3 = null;
            boolean discarded$0 = b.a(false, (String) null);
        }
    }

    protected final void finalize() throws Throwable {
        if (((b) this).field_d != null) {
            System.out.println("");
            ((b) this).a(122);
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((b) this).field_d.read(param0, param2, param1);
              if (var5_int > 0) {
                ((b) this).field_a = ((b) this).field_a + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3 == 12955) {
                break L2;
              } else {
                var6 = null;
                b.a((byte) 62, (String) null);
                break L2;
              }
            }
            stackOut_5_0 = var5_int;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("b.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0) {
              L1: {
                if (dd.a((byte) 104, param1) == null) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2;
            stackOut_7_1 = new StringBuilder().append("b.E(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0 != 0;
    }

    final long b(byte param0) throws IOException {
        int var2 = -104 % ((-19 - param0) / 37);
        return ((b) this).field_d.length();
    }

    public static void b() {
        field_f = null;
        field_c = null;
        field_g = null;
    }

    final void a(long param0, byte param1) throws IOException {
        ((b) this).field_d.seek(param0);
        ((b) this).field_a = param0;
        if (param1 < 64) {
            Object var5 = null;
            boolean discarded$0 = b.a(true, (String) null);
        }
    }

    final static boolean a(byte param0) {
        wf var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        wf var4 = null;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var4 = (wf) (Object) rd.field_k.d(9272);
              var1 = var4;
              if (param0 <= -86) {
                break L1;
              } else {
                boolean discarded$2 = b.a((byte) -125);
                break L1;
              }
            }
            if (var1 == null) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              var2 = 0;
              L2: while (true) {
                if (var1.field_p <= var2) {
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  L3: {
                    if (var4.field_s[var2] == null) {
                      break L3;
                    } else {
                      if (var4.field_s[var2].field_d != 0) {
                        break L3;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      }
                    }
                  }
                  L4: {
                    if (null == var4.field_j[var2]) {
                      break L4;
                    } else {
                      if (var4.field_j[var2].field_d != 0) {
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      }
                    }
                  }
                  var2++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var1_ref, "b.D(" + param0 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var3 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              ga.field_j = ga.field_j + 1;
              if (tf.field_k != -1) {
                break L1;
              } else {
                if (-1 == ll.field_a) {
                  tf.field_k = ef.field_j;
                  ll.field_a = jb.field_b;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 != null) {
                  if (!param1.equals((Object) (Object) cc.field_j)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (null != cc.field_j) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!uj.field_c) {
                  if (qd.field_l <= ga.field_j) {
                    if (qd.field_l - -fh.field_h > ga.field_j) {
                      stackOut_16_0 = 1;
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    } else {
                      stackOut_15_0 = 0;
                      stackIn_18_0 = stackOut_15_0;
                      break L4;
                    }
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_18_0 = stackOut_13_0;
                    break L4;
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_18_0 = stackOut_11_0;
                  break L4;
                }
              }
              L5: {
                L6: {
                  var2_int = stackIn_18_0;
                  if (param1 == null) {
                    break L6;
                  } else {
                    L7: {
                      if (uj.field_c) {
                        break L7;
                      } else {
                        if (var2_int != 0) {
                          break L7;
                        } else {
                          break L6;
                        }
                      }
                    }
                    ga.field_j = qd.field_l;
                    break L5;
                  }
                }
                ga.field_j = 0;
                break L5;
              }
              L8: {
                if (param1 == null) {
                  if (var2_int != 0) {
                    uj.field_c = true;
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  uj.field_c = false;
                  break L8;
                }
              }
              ea.field_m = tf.field_k;
              lb.field_b = ll.field_a;
              break L2;
            }
            L9: {
              if (uj.field_c) {
                break L9;
              } else {
                if (qd.field_l <= ga.field_j) {
                  break L9;
                } else {
                  if (ja.field_l) {
                    ga.field_j = 0;
                    lb.field_b = ll.field_a;
                    ea.field_m = tf.field_k;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
            L10: {
              cc.field_j = param1;
              ll.field_a = -1;
              var2_int = 92 / ((param0 - -28) / 44);
              if (!uj.field_c) {
                break L10;
              } else {
                if (ga.field_j == dh.field_l) {
                  ga.field_j = 0;
                  uj.field_c = false;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            tf.field_k = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var2;
            stackOut_41_1 = new StringBuilder().append("b.B(").append(param0).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L11;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L11;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 41);
        }
    }

    final void a(int param0, byte[] param1, int param2, byte param3) throws IOException {
        if (param3 >= -62) {
            return;
        }
        try {
            if (!(~((b) this).field_e <= ~((long)param0 + ((b) this).field_a))) {
                ((b) this).field_d.seek(((b) this).field_e);
                ((b) this).field_d.write(1);
                throw new EOFException();
            }
            ((b) this).field_d.write(param1, param2, param0);
            ((b) this).field_a = ((b) this).field_a + (long)param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "b.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(byte[] param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        dh var16 = null;
        dh var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        var15 = Terraphoenix.field_V;
        try {
          L0: {
            var16 = new dh(param0);
            var17 = var16;
            var17.field_k = -2 + param0.length;
            kf.field_b = var17.i(-25578);
            ug.field_c = new byte[kf.field_b][];
            sb.field_m = new int[kf.field_b];
            hj.field_K = new int[kf.field_b];
            ha.field_s = new int[kf.field_b];
            aa.field_k = new boolean[kf.field_b];
            qc.field_b = new byte[kf.field_b][];
            rf.field_p = new int[kf.field_b];
            var17.field_k = param0.length + (-7 - kf.field_b * 8);
            ah.field_A = var17.i(-25578);
            sb.field_j = var17.i(-25578);
            var3 = (255 & var17.a(-16384)) - -1;
            var4 = 0;
            L1: while (true) {
              if (var4 >= kf.field_b) {
                var4 = 0;
                L2: while (true) {
                  if (kf.field_b <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (kf.field_b <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= kf.field_b) {
                            var17.field_k = -((-1 + var3) * 3) + (-7 + param0.length) + -(kf.field_b * 8);
                            wb.field_a = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var4 >= var3) {
                                var17.field_k = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (kf.field_b <= var4) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = sb.field_m[var4];
                                      var6 = rf.field_p[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      qc.field_b[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      ug.field_c[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.a(-16384);
                                      if (0 == (var11 & 1)) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var12 >= var7) {
                                            if (0 == (2 & var11)) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var12 >= var7) {
                                                  break L7;
                                                } else {
                                                  L10: {
                                                    byte dupTemp$2 = var17.f(2);
                                                    var9[var12] = dupTemp$2;
                                                    var13 = dupTemp$2;
                                                    stackOut_43_0 = var10;
                                                    stackIn_45_0 = stackOut_43_0;
                                                    stackIn_44_0 = stackOut_43_0;
                                                    if (var13 == -1) {
                                                      stackOut_45_0 = stackIn_45_0;
                                                      stackOut_45_1 = 0;
                                                      stackIn_46_0 = stackOut_45_0;
                                                      stackIn_46_1 = stackOut_45_1;
                                                      break L10;
                                                    } else {
                                                      stackOut_44_0 = stackIn_44_0;
                                                      stackOut_44_1 = 1;
                                                      stackIn_46_0 = stackOut_44_0;
                                                      stackIn_46_1 = stackOut_44_1;
                                                      break L10;
                                                    }
                                                  }
                                                  var10 = stackIn_46_0 | stackIn_46_1;
                                                  var12++;
                                                  continue L9;
                                                }
                                              }
                                            }
                                          } else {
                                            var8[var12] = var17.f(2);
                                            var12++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L11: while (true) {
                                          if (var5 <= var12) {
                                            if (0 == (var11 & 2)) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L12: while (true) {
                                                if (var12 >= var5) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L13: while (true) {
                                                    if (var13 >= var6) {
                                                      var12++;
                                                      continue L12;
                                                    } else {
                                                      L14: {
                                                        byte dupTemp$3 = var17.f(2);
                                                        var9[var12 + var13 * var5] = dupTemp$3;
                                                        var14 = dupTemp$3;
                                                        stackOut_32_0 = var10;
                                                        stackIn_34_0 = stackOut_32_0;
                                                        stackIn_33_0 = stackOut_32_0;
                                                        if (var14 == -1) {
                                                          stackOut_34_0 = stackIn_34_0;
                                                          stackOut_34_1 = 0;
                                                          stackIn_35_0 = stackOut_34_0;
                                                          stackIn_35_1 = stackOut_34_1;
                                                          break L14;
                                                        } else {
                                                          stackOut_33_0 = stackIn_33_0;
                                                          stackOut_33_1 = 1;
                                                          stackIn_35_0 = stackOut_33_0;
                                                          stackIn_35_1 = stackOut_33_1;
                                                          break L14;
                                                        }
                                                      }
                                                      var10 = stackIn_35_0 | stackIn_35_1;
                                                      var13++;
                                                      continue L13;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L15: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L11;
                                              } else {
                                                var8[var12 + var13 * var5] = var17.f(2);
                                                var13++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    aa.field_k[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  wb.field_a[var4] = var17.d((byte) -113);
                                  if (wb.field_a[var4] != 0) {
                                    break L16;
                                  } else {
                                    wb.field_a[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            rf.field_p[var4] = var17.i(-25578);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        sb.field_m[var4] = var17.i(-25578);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    hj.field_K[var4] = var17.i(-25578);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                ha.field_s[var4] = var16.i(-25578);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) var2;
            stackOut_49_1 = new StringBuilder().append("b.I(");
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param0 == null) {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L17;
            } else {
              stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
              stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L17;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + -110 + 41);
        }
    }

    b(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param2 > ~param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((b) this).field_d = new RandomAccessFile(param0, param1);
            ((b) this).field_e = param2;
            ((b) this).field_a = 0L;
            var5_int = ((b) this).field_d.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((b) this).field_d.seek(0L);
                    ((b) this).field_d.write(var5_int);
                }
            }
            ((b) this).field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "b.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Terra Phoenix";
        field_g = new String[]{"Sniper", "Squaddie", "Veteran", "Commando", "Officer", "Soldier's Soldier", "Grenadier", "Demolitions", "Secret Agent", "Reconstruction", "Hunter", "Dominator", "Defender of Civilisation", "Technophobe", "Who Dares, Wins", "Squiddie Basher", "Zombie Basher"};
        field_f = new oa();
    }
}
