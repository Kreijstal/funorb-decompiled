/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qc extends ar {
    static String field_s;
    static qf field_w;
    static String field_t;
    private ke field_v;
    static String field_u;

    final static void a(int param0, int param1, int[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            c.c();
            c.a(param2, 0, param2.length);
            c.d();
            L1: while (true) {
              if (!c.a()) {
                break L0;
              } else {
                gf.f(c.field_e, c.field_h, -c.field_e + c.field_a, param0, param3);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("qc.L(").append(param0).append(',').append(18117).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
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
          throw r.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final boolean d(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            tk var2_ref = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            tk var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_44_0 = 0;
            int stackIn_60_0 = 0;
            int stackIn_84_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_43_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_83_0 = 0;
            L0: {
              var16 = ShatteredPlansClient.field_F ? 1 : 0;
              if (((qc) this).field_v == null) {
                break L0;
              } else {
                L1: {
                  var2_long = pr.a(14274);
                  var4 = (int)(-((qc) this).field_k + var2_long);
                  ((qc) this).field_k = var2_long;
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((qc) this).field_n = ((qc) this).field_n + var4;
                if (((qc) this).field_n > 30000) {
                  try {
                    L2: {
                      ((qc) this).field_v.b(100);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((qc) this).field_v = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null != ((qc) this).field_v) {
              try {
                L4: {
                  ((qc) this).field_v.a(false);
                  var2_ref = (tk) (Object) ((qc) this).field_h.c(-128);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (tk) (Object) ((qc) this).field_m.c(-128);
                      L6: while (true) {
                        if (var2_ref == null) {
                          var2_int = param0;
                          L7: while (true) {
                            L8: {
                              if (var2_int >= 100) {
                                break L8;
                              } else {
                                var3_int = ((qc) this).field_v.a(-1);
                                if (var3_int >= 0) {
                                  if (var3_int == 0) {
                                    break L8;
                                  } else {
                                    L9: {
                                      ((qc) this).field_n = 0;
                                      var4 = 0;
                                      if (null != ((qc) this).field_l) {
                                        if (((qc) this).field_l.field_A == 0) {
                                          var4 = 1;
                                          break L9;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        var4 = 10;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (var4 <= 0) {
                                        L11: {
                                          var5 = -((qc) this).field_l.field_w + ((qc) this).field_l.field_D.field_h.length;
                                          var6 = -((qc) this).field_l.field_A + 512;
                                          if (~var6 < ~(var5 - ((qc) this).field_l.field_D.field_j)) {
                                            var6 = var5 - ((qc) this).field_l.field_D.field_j;
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                        L12: {
                                          if (var6 > var3_int) {
                                            var6 = var3_int;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          ((qc) this).field_v.a(((qc) this).field_l.field_D.field_h, var6, ((qc) this).field_l.field_D.field_j, (byte) 112);
                                          if (((qc) this).field_d != 0) {
                                            var17 = 0;
                                            var7 = var17;
                                            L14: while (true) {
                                              if (var6 <= var17) {
                                                break L13;
                                              } else {
                                                ((qc) this).field_l.field_D.field_h[((qc) this).field_l.field_D.field_j - -var17] = (byte)nc.a((int) ((qc) this).field_l.field_D.field_h[((qc) this).field_l.field_D.field_j + var17], (int) ((qc) this).field_d);
                                                var17++;
                                                continue L14;
                                              }
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                        ((qc) this).field_l.field_A = ((qc) this).field_l.field_A + var6;
                                        ((qc) this).field_l.field_D.field_j = ((qc) this).field_l.field_D.field_j + var6;
                                        if (~var5 != ~((qc) this).field_l.field_D.field_j) {
                                          if (((qc) this).field_l.field_A == 512) {
                                            ((qc) this).field_l.field_A = 0;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          ((qc) this).field_l.a(16);
                                          ((qc) this).field_l.field_u = false;
                                          ((qc) this).field_l = null;
                                          break L10;
                                        }
                                      } else {
                                        L15: {
                                          var5 = var4 - ((qc) this).field_q.field_j;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L15;
                                          } else {
                                            break L15;
                                          }
                                        }
                                        L16: {
                                          ((qc) this).field_v.a(((qc) this).field_q.field_h, var5, ((qc) this).field_q.field_j, (byte) -52);
                                          if (0 == ((qc) this).field_d) {
                                            break L16;
                                          } else {
                                            var6 = 0;
                                            L17: while (true) {
                                              if (var5 <= var6) {
                                                break L16;
                                              } else {
                                                ((qc) this).field_q.field_h[((qc) this).field_q.field_j + var6] = (byte)nc.a((int) ((qc) this).field_q.field_h[((qc) this).field_q.field_j + var6], (int) ((qc) this).field_d);
                                                var6++;
                                                continue L17;
                                              }
                                            }
                                          }
                                        }
                                        ((qc) this).field_q.field_j = ((qc) this).field_q.field_j + var5;
                                        if (((qc) this).field_q.field_j >= var4) {
                                          if (null != ((qc) this).field_l) {
                                            if (((qc) this).field_l.field_A != 0) {
                                              throw new IOException();
                                            } else {
                                              if (-1 != ((qc) this).field_q.field_h[0]) {
                                                ((qc) this).field_l = null;
                                                break L10;
                                              } else {
                                                ((qc) this).field_q.field_j = 0;
                                                ((qc) this).field_l.field_A = 1;
                                                break L10;
                                              }
                                            }
                                          } else {
                                            L18: {
                                              ((qc) this).field_q.field_j = 0;
                                              var6 = ((qc) this).field_q.j(-128);
                                              var7 = ((qc) this).field_q.a(16711680);
                                              var8 = ((qc) this).field_q.j(-65);
                                              var9 = ((qc) this).field_q.a(16711680);
                                              var10 = var8 & 127;
                                              if (0 == (var8 & 128)) {
                                                stackOut_43_0 = 0;
                                                stackIn_44_0 = stackOut_43_0;
                                                break L18;
                                              } else {
                                                stackOut_42_0 = 1;
                                                stackIn_44_0 = stackOut_42_0;
                                                break L18;
                                              }
                                            }
                                            L19: {
                                              var11 = stackIn_44_0;
                                              var12 = ((long)var6 << 32) + (long)var7;
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (tk) (Object) ((qc) this).field_j.c(-127);
                                                L20: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (~var12 == ~var14_ref.field_l) {
                                                      break L19;
                                                    } else {
                                                      var14_ref = (tk) (Object) ((qc) this).field_j.b(32);
                                                      continue L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (tk) (Object) ((qc) this).field_f.c(param0 ^ -127);
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L19;
                                                  } else {
                                                    if (var12 != var14_ref.field_l) {
                                                      var14_ref = (tk) (Object) ((qc) this).field_f.b(32);
                                                      continue L21;
                                                    } else {
                                                      break L19;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L22: {
                                                if (var10 == 0) {
                                                  stackOut_59_0 = 5;
                                                  stackIn_60_0 = stackOut_59_0;
                                                  break L22;
                                                } else {
                                                  stackOut_58_0 = 9;
                                                  stackIn_60_0 = stackOut_58_0;
                                                  break L22;
                                                }
                                              }
                                              var15 = stackIn_60_0;
                                              ((qc) this).field_l = var14_ref;
                                              ((qc) this).field_l.field_D = new ob(((qc) this).field_l.field_w + var9 - -var15);
                                              ((qc) this).field_l.field_D.c(var10, (byte) -106);
                                              ((qc) this).field_l.field_D.e(11135, var9);
                                              ((qc) this).field_q.field_j = 0;
                                              ((qc) this).field_l.field_A = 10;
                                              break L10;
                                            }
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L7;
                                  }
                                } else {
                                  throw new IOException();
                                }
                              }
                            }
                            stackOut_83_0 = 1;
                            stackIn_84_0 = stackOut_83_0;
                            break L4;
                          }
                        } else {
                          ((qc) this).field_c.field_j = 0;
                          ((qc) this).field_c.c(0, (byte) -109);
                          ((qc) this).field_c.a(param0 ^ 1729379144, var2_ref.field_l);
                          ((qc) this).field_v.a(((qc) this).field_c.field_h.length, 0, ((qc) this).field_c.field_h, param0 + -13976);
                          ((qc) this).field_f.a((df) (Object) var2_ref, 32);
                          var2_ref = (tk) (Object) ((qc) this).field_m.b(32);
                          continue L6;
                        }
                      }
                    } else {
                      ((qc) this).field_c.field_j = 0;
                      ((qc) this).field_c.c(1, (byte) -85);
                      ((qc) this).field_c.a(param0 + 1729379144, var2_ref.field_l);
                      ((qc) this).field_v.a(((qc) this).field_c.field_h.length, 0, ((qc) this).field_c.field_h, -13976);
                      ((qc) this).field_j.a((df) (Object) var2_ref, 32);
                      var2_ref = (tk) (Object) ((qc) this).field_h.b(32);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((qc) this).field_v.b(117);
                    break L23;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L24: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L24;
                  }
                }
                L25: {
                  ((qc) this).field_v = null;
                  ((qc) this).field_a = ((qc) this).field_a + 1;
                  ((qc) this).field_p = -2;
                  if (((qc) this).a((byte) 0) != 0) {
                    break L25;
                  } else {
                    if (0 != ((qc) this).b(-5205)) {
                      break L25;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_84_0 != 0;
            } else {
              L26: {
                if (((qc) this).a((byte) 0) != 0) {
                  break L26;
                } else {
                  if (0 != ((qc) this).b(-5205)) {
                    break L26;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ua.field_f.a(640, param0, (byte) 46, 0, 5);
        if (!(mr.field_h == null)) {
            mr.field_h.a(-1, param2, param0, -jj.field_m + param2, param6, param0);
        }
    }

    final void a(byte param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            int var4_int = 0;
            tk var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            var6 = ShatteredPlansClient.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (((qc) this).field_v == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ((qc) this).field_v.b(116);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((qc) this).field_v = null;
                    break L1;
                  }
                }
                ((qc) this).field_v = (ke) param2;
                int discarded$2 = -20189;
                this.g();
                int discarded$3 = 3;
                this.a(param1);
                ((qc) this).field_l = null;
                ((qc) this).field_q.field_j = 0;
                L4: while (true) {
                  var4_ref3 = (tk) (Object) ((qc) this).field_j.a(-44);
                  if (var4_ref3 != null) {
                    ((qc) this).field_h.a((df) (Object) var4_ref3, 32);
                    continue L4;
                  } else {
                    L5: while (true) {
                      var4_ref3 = (tk) (Object) ((qc) this).field_f.a(110);
                      if (var4_ref3 != null) {
                        ((qc) this).field_m.a((df) (Object) var4_ref3, 32);
                        continue L5;
                      } else {
                        L6: {
                          if (0 != ((qc) this).field_d) {
                            {
                              L7: {
                                ((qc) this).field_c.field_j = 0;
                                ((qc) this).field_c.c(4, (byte) -86);
                                ((qc) this).field_c.c((int) ((qc) this).field_d, (byte) -88);
                                ((qc) this).field_c.e(11135, 0);
                                ((qc) this).field_v.a(((qc) this).field_c.field_h.length, 0, ((qc) this).field_c.field_h, -13976);
                                break L7;
                              }
                            }
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        ((qc) this).field_n = 0;
                        ((qc) this).field_k = pr.a(14274);
                        var4_int = 50 % ((-11 - param0) / 48);
                        break L0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) var4_ref2;
                stackOut_24_1 = new StringBuilder().append("qc.F(").append(param0).append(',').append(param1).append(',');
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (param2 == null) {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L11;
                } else {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "{...}";
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L11;
                }
              }
              throw r.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(byte param0) {
        try {
            ((qc) this).field_v.b(param0 + 209);
        } catch (Exception exception) {
        }
        if (param0 != -91) {
            return;
        }
        ((qc) this).field_v = null;
        ((qc) this).field_p = -1;
        ((qc) this).field_a = ((qc) this).field_a + 1;
        ((qc) this).field_d = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final void e(int param0) {
        if (param0 != -16363) {
            field_s = null;
        }
        if (null != ((qc) this).field_v) {
            ((qc) this).field_v.b(126);
        }
    }

    public static void f() {
        int var1 = 1;
        field_t = null;
        field_u = null;
        field_s = null;
        field_w = null;
    }

    private final void a(boolean param0) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ob stackIn_4_0 = null;
            ob stackIn_5_0 = null;
            ob stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            ob stackOut_3_0 = null;
            ob stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            ob stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            if (null == ((qc) this).field_v) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((qc) this).field_c.field_j = 0;
                    stackOut_3_0 = ((qc) this).field_c;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (param0) {
                      stackOut_5_0 = (ob) (Object) stackIn_5_0;
                      stackOut_5_1 = 2;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (ob) (Object) stackIn_4_0;
                      stackOut_4_1 = 3;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                  ((ob) (Object) stackIn_6_0).c(stackIn_6_1, (byte) -97);
                  ((qc) this).field_c.a(1729379144, 0L);
                  ((qc) this).field_v.a(((qc) this).field_c.field_h.length, 0, ((qc) this).field_c.field_h, -13976);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((qc) this).field_v.b(89);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((qc) this).field_a = ((qc) this).field_a + 1;
                  ((qc) this).field_p = -2;
                  ((qc) this).field_v = null;
                  break L2;
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

    final static boolean a(String param0, int param1) {
        de var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 <= -108) {
              var2 = (de) (Object) qi.field_h.d(0);
              L1: while (true) {
                if (var2 == null) {
                  qi.field_h.a((byte) -113, (oh) (Object) new de(param0));
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  if (param0.equalsIgnoreCase(var2.field_l)) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    var2 = (de) (Object) qi.field_h.a((byte) -71);
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2_ref;
            stackOut_13_1 = new StringBuilder().append("qc.O(");
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
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    private final void g() {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != ((qc) this).field_v) {
              {
                L0: {
                  ((qc) this).field_c.field_j = 0;
                  ((qc) this).field_c.c(6, (byte) -59);
                  ((qc) this).field_c.a(true, 3);
                  ((qc) this).field_c.d(0, 255);
                  ((qc) this).field_v.a(((qc) this).field_c.field_h.length, 0, ((qc) this).field_c.field_h, -13976);
                  break L0;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void h() {
        qj.a((byte) -127, 4);
    }

    public qc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Cancel rematch";
        field_u = "Remove friend";
        field_t = "N/A";
    }
}
