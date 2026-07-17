/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ap extends qb {
    static String field_u;
    static boolean field_s;
    static String field_r;
    static ja field_t;
    private ej field_q;

    private final void a(boolean param0, boolean param1) {
        try {
            IOException var3 = null;
            Exception var4 = null;
            k stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            k stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            k stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            k stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            k stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            k stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            if (((ap) this).field_q == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((ap) this).field_b.field_j = 0;
                    stackOut_3_0 = ((ap) this).field_b;
                    stackOut_3_1 = 122;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (param0) {
                      stackOut_5_0 = (k) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 2;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L1;
                    } else {
                      stackOut_4_0 = (k) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 3;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L1;
                    }
                  }
                  L2: {
                    ((k) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2);
                    ((ap) this).field_b.b(0L, param1);
                    ((ap) this).field_q.a(0, -100, ((ap) this).field_b.field_m.length, ((ap) this).field_b.field_m);
                    if (param1) {
                      break L2;
                    } else {
                      this.a(false, false);
                      break L2;
                    }
                  }
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  var3 = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      ((ap) this).field_q.c(93);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  ((ap) this).field_n = ((ap) this).field_n + 1;
                  ((ap) this).field_q = null;
                  ((ap) this).field_p = -2;
                  break L3;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(ul param0, byte param1, fm param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        ob var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int[] var15 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var3_int = p.field_e;
            rp.field_l = new cj(0L, (cj) null);
            var4 = -97;
            if (param0 != null) {
              param0.field_j = false;
              param0.field_b = 0;
              ok.field_p = new ig(var3_int, param0, param0);
              bd.field_c = new an(var3_int, param0, param0, (dr) (Object) new dd());
              int discarded$4 = 0;
              var5 = ha.b();
              if (var5 == null) {
                int discarded$5 = 0;
                bd.a("QC2", (Throwable) null);
                return;
              } else {
                int discarded$6 = -19;
                fb.a(var5);
                var11 = null;
                tg.field_d = qd.a(1127256, (fm) null, 65793, 1513239, 8947848, 4020342, 65793, (byte) 123, 0, 2245737, 65793, 1513239, 5138823);
                bb.field_k = qd.a(0, param2, 0, 0, 0, 0, 0, (byte) 127, 16764006, 0, 0, 0, 0);
                kb.field_x = qd.a(0, param2, 0, 0, 0, 0, 0, (byte) 122, 16777215, 0, 0, 0, 0);
                var6 = oo.field_b;
                var7 = oo.field_l;
                var15 = oo.field_i;
                tb.field_v = new ja(10, 14);
                tb.field_v.a();
                var9 = 2;
                L1: while (true) {
                  if (7 <= var9) {
                    oo.a(var15, var6, var7);
                    tl.field_t = eh.a(false, tg.field_d, bb.field_k, kb.field_x, var5);
                    rp.field_l.field_Cb = new th();
                    break L0;
                  } else {
                    oo.g(var9, var9 + 1, 14 + -(var9 << 1), 16777215);
                    var9++;
                    continue L1;
                  }
                }
              }
            } else {
              int discarded$7 = 0;
              bd.a("QC1", (Throwable) null);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ap.M(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          L3: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44).append(-37).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            tn var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var16 = 0;
            int stackIn_62_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_61_0 = 0;
            L0: {
              var16 = ZombieDawnMulti.field_E ? 1 : 0;
              if (((ap) this).field_q == null) {
                break L0;
              } else {
                L1: {
                  var2_long = bl.a((byte) 115);
                  var4 = (int)(var2_long - ((ap) this).field_f);
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ap) this).field_f = var2_long;
                ((ap) this).field_d = ((ap) this).field_d + var4;
                if (((ap) this).field_d > 30000) {
                  try {
                    L2: {
                      ((ap) this).field_q.c(99);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((ap) this).field_q = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null == ((ap) this).field_q) {
              if (((ap) this).a(0) == 0) {
                if (0 == ((ap) this).d(20)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              try {
                L4: {
                  ((ap) this).field_q.b(-26844);
                  var2_ref = (tn) (Object) ((ap) this).field_g.c((byte) 111);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (tn) (Object) ((ap) this).field_c.c((byte) 124);
                      L6: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = ((ap) this).field_q.a(-79);
                                if (var3_int >= 0) {
                                  if (0 == var3_int) {
                                    break L8;
                                  } else {
                                    L9: {
                                      ((ap) this).field_d = 0;
                                      var4 = 0;
                                      if (null == ((ap) this).field_m) {
                                        var4 = 10;
                                        break L9;
                                      } else {
                                        if (((ap) this).field_m.field_D == 0) {
                                          var4 = 1;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if (var4 <= 0) {
                                      L10: {
                                        var5 = ((ap) this).field_m.field_y.field_m.length - ((ap) this).field_m.field_B;
                                        var6 = -((ap) this).field_m.field_D + 512;
                                        if (var6 <= -((ap) this).field_m.field_y.field_j + var5) {
                                          break L10;
                                        } else {
                                          var6 = -((ap) this).field_m.field_y.field_j + var5;
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (var3_int >= var6) {
                                          break L11;
                                        } else {
                                          var6 = var3_int;
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        ((ap) this).field_q.a(var6, ((ap) this).field_m.field_y.field_j, ((ap) this).field_m.field_y.field_m, 117);
                                        if (0 != ((ap) this).field_i) {
                                          var7 = 0;
                                          L13: while (true) {
                                            if (var6 <= var7) {
                                              break L12;
                                            } else {
                                              ((ap) this).field_m.field_y.field_m[var7 + ((ap) this).field_m.field_y.field_j] = (byte)vg.a((int) ((ap) this).field_m.field_y.field_m[var7 + ((ap) this).field_m.field_y.field_j], (int) ((ap) this).field_i);
                                              var7++;
                                              continue L13;
                                            }
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                      L14: {
                                        ((ap) this).field_m.field_y.field_j = ((ap) this).field_m.field_y.field_j + var6;
                                        ((ap) this).field_m.field_D = ((ap) this).field_m.field_D + var6;
                                        if (((ap) this).field_m.field_y.field_j != var5) {
                                          if (((ap) this).field_m.field_D == 512) {
                                            ((ap) this).field_m.field_D = 0;
                                            break L14;
                                          } else {
                                            break L14;
                                          }
                                        } else {
                                          ((ap) this).field_m.a(-4564);
                                          ((ap) this).field_m.field_t = false;
                                          ((ap) this).field_m = null;
                                          break L14;
                                        }
                                      }
                                      var2_int++;
                                      continue L7;
                                    } else {
                                      L15: {
                                        var5 = -((ap) this).field_k.field_j + var4;
                                        if (var3_int < var5) {
                                          var5 = var3_int;
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        ((ap) this).field_q.a(var5, ((ap) this).field_k.field_j, ((ap) this).field_k.field_m, 108);
                                        if (((ap) this).field_i != 0) {
                                          var6 = 0;
                                          L17: while (true) {
                                            if (var5 <= var6) {
                                              break L16;
                                            } else {
                                              ((ap) this).field_k.field_m[var6 + ((ap) this).field_k.field_j] = (byte)vg.a((int) ((ap) this).field_k.field_m[var6 + ((ap) this).field_k.field_j], (int) ((ap) this).field_i);
                                              var6++;
                                              continue L17;
                                            }
                                          }
                                        } else {
                                          break L16;
                                        }
                                      }
                                      L18: {
                                        ((ap) this).field_k.field_j = ((ap) this).field_k.field_j + var5;
                                        if (var4 > ((ap) this).field_k.field_j) {
                                          break L18;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      var2_int++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                            var2_int = -121 % ((44 - param0) / 45);
                            stackOut_61_0 = 1;
                            stackIn_62_0 = stackOut_61_0;
                            break L4;
                          }
                        } else {
                          ((ap) this).field_b.field_j = 0;
                          ((ap) this).field_b.a(-20, 0);
                          ((ap) this).field_b.b(var2_ref.field_l, true);
                          ((ap) this).field_q.a(0, -100, ((ap) this).field_b.field_m.length, ((ap) this).field_b.field_m);
                          ((ap) this).field_l.a(29664, (qa) (Object) var2_ref);
                          var2_ref = (tn) (Object) ((ap) this).field_c.b((byte) 102);
                          continue L6;
                        }
                      }
                    } else {
                      ((ap) this).field_b.field_j = 0;
                      ((ap) this).field_b.a(-112, 1);
                      ((ap) this).field_b.b(var2_ref.field_l, true);
                      ((ap) this).field_q.a(0, -100, ((ap) this).field_b.field_m.length, ((ap) this).field_b.field_m);
                      ((ap) this).field_j.a(29664, (qa) (Object) var2_ref);
                      var2_ref = (tn) (Object) ((ap) this).field_g.b((byte) 97);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L19: {
                    ((ap) this).field_q.c(82);
                    break L19;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L20: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L20;
                  }
                }
                ((ap) this).field_q = null;
                ((ap) this).field_n = ((ap) this).field_n + 1;
                ((ap) this).field_p = -2;
                if (0 == ((ap) this).a(0)) {
                  if (0 == ((ap) this).d(20)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
              return stackIn_62_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static sl a(ul param0, ul param1, String param2, int param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        sl stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        sl stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5_int = param0.a(param2, (byte) 123);
            var6 = param0.a(param4, var5_int, -1);
            stackOut_2_0 = pm.a(param1, var6, var5_int, param0, -29435);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("ap.Q(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(4).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
        return stackIn_3_0;
    }

    private final void g() {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((ap) this).field_q == null) {
              return;
            } else {
              {
                L0: {
                  ((ap) this).field_b.field_j = 0;
                  ((ap) this).field_b.a(124, 6);
                  ((ap) this).field_b.d(3, -8593);
                  ((ap) this).field_b.a(0, (byte) -55);
                  ((ap) this).field_q.a(0, -100, ((ap) this).field_b.field_m.length, ((ap) this).field_b.field_m);
                  break L0;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ap() {
    }

    final void a(byte param0) {
        try {
            int var2_int = 0 / ((param0 - 53) / 41);
            ((ap) this).field_q.c(-101);
        } catch (Exception exception) {
        }
        ((ap) this).field_n = ((ap) this).field_n + 1;
        ((ap) this).field_p = -1;
        ((ap) this).field_q = null;
        ((ap) this).field_i = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final void f(int param0) {
        if (param0 != 31) {
            this.a(false, true);
        }
        if (!(((ap) this).field_q == null)) {
            ((ap) this).field_q.c(88);
        }
    }

    final void a(boolean param0, Object param1, int param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            int var4_int = 0;
            tn var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var6 = ZombieDawnMulti.field_E ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (((ap) this).field_q != null) {
                    try {
                      L2: {
                        ((ap) this).field_q.c(-90);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((ap) this).field_q = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ap) this).field_q = (ej) param1;
                int discarded$1 = 0;
                this.g();
                this.a(param0, true);
                ((ap) this).field_m = null;
                ((ap) this).field_k.field_j = 0;
                L4: while (true) {
                  var4_ref3 = (tn) (Object) ((ap) this).field_j.a(11356);
                  if (var4_ref3 == null) {
                    L5: while (true) {
                      var4_ref3 = (tn) (Object) ((ap) this).field_l.a(11356);
                      if (var4_ref3 == null) {
                        L6: {
                          if (0 == ((ap) this).field_i) {
                            break L6;
                          } else {
                            {
                              L7: {
                                ((ap) this).field_b.field_j = 0;
                                ((ap) this).field_b.a(126, 4);
                                ((ap) this).field_b.a(125, (int) ((ap) this).field_i);
                                ((ap) this).field_b.b(-103, 0);
                                ((ap) this).field_q.a(0, -100, ((ap) this).field_b.field_m.length, ((ap) this).field_b.field_m);
                                break L7;
                              }
                            }
                            break L6;
                          }
                        }
                        var4_int = 12 % ((param2 - 63) / 33);
                        ((ap) this).field_d = 0;
                        ((ap) this).field_f = bl.a((byte) 110);
                        break L0;
                      } else {
                        ((ap) this).field_c.a(29664, (qa) (Object) var4_ref3);
                        continue L5;
                      }
                    }
                  } else {
                    ((ap) this).field_g.a(29664, (qa) (Object) var4_ref3);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) var4_ref2;
                stackOut_22_1 = new StringBuilder().append("ap.F(").append(param0).append(44);
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param1 == null) {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L11;
                } else {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "{...}";
                  stackIn_25_0 = stackOut_23_0;
                  stackIn_25_1 = stackOut_23_1;
                  stackIn_25_2 = stackOut_23_2;
                  break L11;
                }
              }
              throw fa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h() {
        field_r = null;
        field_u = null;
        field_t = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = false;
        field_u = "Spectate";
        field_r = "<%0> has not yet unlocked this option for use.";
    }
}
