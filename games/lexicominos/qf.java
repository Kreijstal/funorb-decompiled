/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.Class;

final class qf extends wb {
    static String field_s;
    private ge field_r;
    static int[] field_q;

    final void b(int param0) {
        if (!(null == ((qf) this).field_r)) {
            ((qf) this).field_r.b(param0 ^ 80);
        }
        if (param0 != 0) {
            boolean discarded$0 = ((qf) this).a((byte) 59);
        }
    }

    final static Class a(int param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_2_0 = null;
        Class stackIn_5_0 = null;
        Class stackIn_8_0 = null;
        Class stackIn_12_0 = null;
        Class stackIn_15_0 = null;
        Class stackIn_19_0 = null;
        Class stackIn_22_0 = null;
        Class stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_11_0 = null;
        Class stackOut_18_0 = null;
        Class stackOut_25_0 = null;
        Class stackOut_21_0 = null;
        Class stackOut_14_0 = null;
        Class stackOut_7_0 = null;
        Class stackOut_4_0 = null;
        Class stackOut_1_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (!param1.equals((Object) (Object) "B")) {
              if (!param1.equals((Object) (Object) "I")) {
                if (!param1.equals((Object) (Object) "S")) {
                  if (param1.equals((Object) (Object) "J")) {
                    stackOut_11_0 = Long.TYPE;
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    if (!param1.equals((Object) (Object) "Z")) {
                      if (param1.equals((Object) (Object) "F")) {
                        stackOut_18_0 = Float.TYPE;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        if (!param1.equals((Object) (Object) "D")) {
                          if (param1.equals((Object) (Object) "C")) {
                            stackOut_25_0 = Character.TYPE;
                            stackIn_26_0 = stackOut_25_0;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        } else {
                          stackOut_21_0 = Double.TYPE;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        }
                      }
                    } else {
                      stackOut_14_0 = Boolean.TYPE;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    }
                  }
                } else {
                  stackOut_7_0 = Short.TYPE;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = Integer.TYPE;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = Byte.TYPE;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var2;
            stackOut_27_1 = new StringBuilder().append("qf.M(").append(-4174).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L1;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
        }
        return stackIn_26_0;
    }

    final static void f() {
        if (!(ug.field_A == null)) {
            ug.field_A.g(false);
        }
        if (qj.field_fb != null) {
            qj.field_fb.h(4210752);
        }
        int discarded$0 = -52;
        cb.a();
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            wf stackIn_4_0 = null;
            wf stackIn_5_0 = null;
            wf stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            wf stackOut_3_0 = null;
            wf stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            wf stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            if (null == ((qf) this).field_r) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((qf) this).field_b.field_h = 0;
                    stackOut_3_0 = ((qf) this).field_b;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (param1) {
                      stackOut_5_0 = (wf) (Object) stackIn_5_0;
                      stackOut_5_1 = 2;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (wf) (Object) stackIn_4_0;
                      stackOut_4_1 = 3;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                  ((wf) (Object) stackIn_6_0).c(stackIn_6_1, -1);
                  if (param0 < -53) {
                    ((qf) this).field_b.a(0L, 687419600);
                    ((qf) this).field_r.a(((qf) this).field_b.field_j, ((qf) this).field_b.field_j.length, 54, 0);
                    break L0;
                  } else {
                    return;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((qf) this).field_r.b(33);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((qf) this).field_p = ((qf) this).field_p + 1;
                  ((qf) this).field_r = null;
                  ((qf) this).field_j = -2;
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

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            dc var2_ref = null;
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
            dc var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_58_0 = 0;
            int stackIn_74_0 = 0;
            int stackIn_83_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_57_0 = 0;
            int stackOut_56_0 = 0;
            int stackOut_73_0 = 0;
            int stackOut_72_0 = 0;
            int stackOut_82_0 = 0;
            L0: {
              var16 = Lexicominos.field_L ? 1 : 0;
              if (((qf) this).field_r == null) {
                break L0;
              } else {
                L1: {
                  var2_long = rf.c(0);
                  var4 = (int)(-((qf) this).field_n + var2_long);
                  ((qf) this).field_n = var2_long;
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((qf) this).field_e = ((qf) this).field_e + var4;
                if (((qf) this).field_e > 30000) {
                  try {
                    L2: {
                      ((qf) this).field_r.b(75);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((qf) this).field_r = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null == ((qf) this).field_r) {
              L4: {
                if (((qf) this).c((byte) 67) != 0) {
                  break L4;
                } else {
                  if (((qf) this).a(true) != 0) {
                    break L4;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              try {
                L5: {
                  ((qf) this).field_r.a(0);
                  var2_ref = (dc) (Object) ((qf) this).field_l.a(true);
                  L6: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (dc) (Object) ((qf) this).field_d.a(true);
                      var3_int = 98 % ((-74 - param0) / 48);
                      L7: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if (var2_int >= 100) {
                                break L9;
                              } else {
                                var3_int = ((qf) this).field_r.d(-6448);
                                if (var3_int < 0) {
                                  throw new IOException();
                                } else {
                                  if (var3_int == 0) {
                                    break L9;
                                  } else {
                                    L10: {
                                      ((qf) this).field_e = 0;
                                      var4 = 0;
                                      if (null == ((qf) this).field_o) {
                                        var4 = 10;
                                        break L10;
                                      } else {
                                        if (((qf) this).field_o.field_w == 0) {
                                          var4 = 1;
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (0 < var4) {
                                        L12: {
                                          var5 = var4 - ((qf) this).field_h.field_h;
                                          if (var5 <= var3_int) {
                                            break L12;
                                          } else {
                                            var5 = var3_int;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          ((qf) this).field_r.a(((qf) this).field_h.field_j, (byte) -109, var5, ((qf) this).field_h.field_h);
                                          if (((qf) this).field_a != 0) {
                                            var6 = 0;
                                            L14: while (true) {
                                              if (var5 <= var6) {
                                                break L13;
                                              } else {
                                                ((qf) this).field_h.field_j[var6 + ((qf) this).field_h.field_h] = (byte)dg.a((int) ((qf) this).field_h.field_j[var6 + ((qf) this).field_h.field_h], (int) ((qf) this).field_a);
                                                var6++;
                                                continue L14;
                                              }
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                        ((qf) this).field_h.field_h = ((qf) this).field_h.field_h + var5;
                                        if (((qf) this).field_h.field_h < var4) {
                                          break L11;
                                        } else {
                                          if (null != ((qf) this).field_o) {
                                            if (((qf) this).field_o.field_w == 0) {
                                              if (((qf) this).field_h.field_j[0] == -1) {
                                                ((qf) this).field_o.field_w = 1;
                                                ((qf) this).field_h.field_h = 0;
                                                break L11;
                                              } else {
                                                ((qf) this).field_o = null;
                                                break L11;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            L15: {
                                              ((qf) this).field_h.field_h = 0;
                                              var6 = ((qf) this).field_h.d(true);
                                              var7 = ((qf) this).field_h.d((byte) 19);
                                              var8 = ((qf) this).field_h.d(true);
                                              var9 = ((qf) this).field_h.d((byte) 19);
                                              var10 = 127 & var8;
                                              if ((var8 & 128) == 0) {
                                                stackOut_57_0 = 0;
                                                stackIn_58_0 = stackOut_57_0;
                                                break L15;
                                              } else {
                                                stackOut_56_0 = 1;
                                                stackIn_58_0 = stackOut_56_0;
                                                break L15;
                                              }
                                            }
                                            L16: {
                                              var11 = stackIn_58_0;
                                              var12 = ((long)var6 << 32) + (long)var7;
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (dc) (Object) ((qf) this).field_k.a(true);
                                                L17: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if (~var12 != ~var14_ref.field_j) {
                                                      var14_ref = (dc) (Object) ((qf) this).field_k.a(-256);
                                                      continue L17;
                                                    } else {
                                                      break L16;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (dc) (Object) ((qf) this).field_f.a(true);
                                                L18: while (true) {
                                                  if (var14_ref == null) {
                                                    break L16;
                                                  } else {
                                                    if (var14_ref.field_j == var12) {
                                                      break L16;
                                                    } else {
                                                      var14_ref = (dc) (Object) ((qf) this).field_f.a(-256);
                                                      continue L18;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L19: {
                                                ((qf) this).field_o = var14_ref;
                                                if (0 != var10) {
                                                  stackOut_73_0 = 9;
                                                  stackIn_74_0 = stackOut_73_0;
                                                  break L19;
                                                } else {
                                                  stackOut_72_0 = 5;
                                                  stackIn_74_0 = stackOut_72_0;
                                                  break L19;
                                                }
                                              }
                                              var15 = stackIn_74_0;
                                              ((qf) this).field_o.field_x = new wf(((qf) this).field_o.field_A + var15 + var9);
                                              ((qf) this).field_o.field_x.c(var10, -1);
                                              ((qf) this).field_o.field_x.f(var9, -32287);
                                              ((qf) this).field_o.field_w = 10;
                                              ((qf) this).field_h.field_h = 0;
                                              break L11;
                                            }
                                          }
                                        }
                                      } else {
                                        L20: {
                                          var5 = -((qf) this).field_o.field_A + ((qf) this).field_o.field_x.field_j.length;
                                          var6 = -((qf) this).field_o.field_w + 512;
                                          if (var6 > -((qf) this).field_o.field_x.field_h + var5) {
                                            var6 = var5 + -((qf) this).field_o.field_x.field_h;
                                            break L20;
                                          } else {
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          if (var3_int >= var6) {
                                            break L21;
                                          } else {
                                            var6 = var3_int;
                                            break L21;
                                          }
                                        }
                                        L22: {
                                          ((qf) this).field_r.a(((qf) this).field_o.field_x.field_j, (byte) -109, var6, ((qf) this).field_o.field_x.field_h);
                                          if (0 == ((qf) this).field_a) {
                                            break L22;
                                          } else {
                                            var7 = 0;
                                            L23: while (true) {
                                              if (var6 <= var7) {
                                                break L22;
                                              } else {
                                                ((qf) this).field_o.field_x.field_j[((qf) this).field_o.field_x.field_h - -var7] = (byte)dg.a((int) ((qf) this).field_o.field_x.field_j[((qf) this).field_o.field_x.field_h + var7], (int) ((qf) this).field_a);
                                                var7++;
                                                continue L23;
                                              }
                                            }
                                          }
                                        }
                                        ((qf) this).field_o.field_w = ((qf) this).field_o.field_w + var6;
                                        ((qf) this).field_o.field_x.field_h = ((qf) this).field_o.field_x.field_h + var6;
                                        if (((qf) this).field_o.field_x.field_h == var5) {
                                          ((qf) this).field_o.b(12);
                                          ((qf) this).field_o.field_v = false;
                                          ((qf) this).field_o = null;
                                          break L11;
                                        } else {
                                          if (((qf) this).field_o.field_w != 512) {
                                            break L11;
                                          } else {
                                            ((qf) this).field_o.field_w = 0;
                                            break L11;
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                            stackOut_82_0 = 1;
                            stackIn_83_0 = stackOut_82_0;
                            break L5;
                          }
                        } else {
                          ((qf) this).field_b.field_h = 0;
                          ((qf) this).field_b.c(0, -1);
                          ((qf) this).field_b.a(var2_ref.field_j, 687419600);
                          ((qf) this).field_r.a(((qf) this).field_b.field_j, ((qf) this).field_b.field_j.length, -124, 0);
                          ((qf) this).field_f.a(82, (ca) (Object) var2_ref);
                          var2_ref = (dc) (Object) ((qf) this).field_d.a(-256);
                          continue L7;
                        }
                      }
                    } else {
                      ((qf) this).field_b.field_h = 0;
                      ((qf) this).field_b.c(1, -1);
                      ((qf) this).field_b.a(var2_ref.field_j, 687419600);
                      ((qf) this).field_r.a(((qf) this).field_b.field_j, ((qf) this).field_b.field_j.length, 58, 0);
                      ((qf) this).field_k.a(85, (ca) (Object) var2_ref);
                      var2_ref = (dc) (Object) ((qf) this).field_l.a(-256);
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    ((qf) this).field_r.b(41);
                    break L24;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L25: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L25;
                  }
                }
                ((qf) this).field_j = -2;
                ((qf) this).field_p = ((qf) this).field_p + 1;
                ((qf) this).field_r = null;
                if (((qf) this).c((byte) 67) != -1) {
                  return false;
                } else {
                  if (-1 == ((qf) this).a(true)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
              return stackIn_83_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e(byte param0) {
        if (param0 != -15) {
            qf.g(49);
        }
        field_q = null;
        field_s = null;
    }

    private final void d() {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null == ((qf) this).field_r) {
              return;
            } else {
              {
                L0: {
                  ((qf) this).field_b.field_h = 0;
                  ((qf) this).field_b.c(6, -1);
                  ((qf) this).field_b.d(3, 48);
                  ((qf) this).field_b.e(97, 0);
                  ((qf) this).field_r.a(((qf) this).field_b.field_j, ((qf) this).field_b.field_j.length, 16, 0);
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

    final static void g(int param0) {
        if (null != jj.field_a) {
            jj.field_a.g(true);
        }
        hd.field_a = new r();
        di.field_x.b(122, (w) (Object) hd.field_a);
        if (param0 >= -15) {
            field_q = null;
        }
    }

    final static void a(Lexicominos param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              qc.field_c[5] = qc.field_c[5] + 43;
              qc.field_a[5] = new int[1];
              vg.field_d[5] = new sg(param0, 5);
              qc.field_a[1] = new int[2];
              vg.field_d[1] = new sg(param0, 1);
              if (param1 >= 108) {
                break L1;
              } else {
                qf.e((byte) 68);
                break L1;
              }
            }
            L2: {
              if (0 >= jd.field_c) {
                break L2;
              } else {
                if (!pk.a(jh.field_a, -104)) {
                  break L2;
                } else {
                  qc.field_a[2] = new int[6];
                  qc.field_c[2] = -(43 * qc.field_a[2].length / 2) + 225;
                  vg.field_d[2] = new sg(param0, 2);
                  qc.field_a[14] = new int[6];
                  qc.field_c[14] = -(qc.field_a[14].length * 43 / 2) + 225;
                  vg.field_d[14] = new sg(param0, 14);
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("qf.N(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, int param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            dc var4_ref3 = null;
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
            var6 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != ((qf) this).field_r) {
                    try {
                      L2: {
                        ((qf) this).field_r.b(17);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((qf) this).field_r = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((qf) this).field_r = (ge) param2;
                int discarded$1 = -108;
                this.d();
                this.a(-82, param0);
                ((qf) this).field_o = null;
                ((qf) this).field_h.field_h = 0;
                L4: while (true) {
                  var4_ref3 = (dc) (Object) ((qf) this).field_k.a((byte) 100);
                  if (var4_ref3 == null) {
                    L5: while (true) {
                      var4_ref3 = (dc) (Object) ((qf) this).field_f.a((byte) 100);
                      if (var4_ref3 != null) {
                        ((qf) this).field_d.a(-74, (ca) (Object) var4_ref3);
                        continue L5;
                      } else {
                        L6: {
                          if (((qf) this).field_a == 0) {
                            break L6;
                          } else {
                            {
                              L7: {
                                ((qf) this).field_b.field_h = 0;
                                ((qf) this).field_b.c(4, -1);
                                ((qf) this).field_b.c((int) ((qf) this).field_a, -1);
                                ((qf) this).field_b.f(0, -32287);
                                ((qf) this).field_r.a(((qf) this).field_b.field_j, ((qf) this).field_b.field_j.length, 67, 0);
                                break L7;
                              }
                            }
                            break L6;
                          }
                        }
                        L11: {
                          ((qf) this).field_e = 0;
                          ((qf) this).field_n = rf.c(0);
                          if (param1 <= -87) {
                            break L11;
                          } else {
                            this.a(1, false);
                            break L11;
                          }
                        }
                        break L0;
                      }
                    }
                  } else {
                    ((qf) this).field_l.a(-72, (ca) (Object) var4_ref3);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) var4_ref2;
                stackOut_24_1 = new StringBuilder().append("qf.D(").append(param0).append(44).append(param1).append(44);
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
                  break L12;
                } else {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "{...}";
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  stackIn_27_2 = stackOut_25_2;
                  break L12;
                }
              }
              throw ld.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void c(int param0) {
        try {
            ((qf) this).field_r.b(16);
        } catch (Exception exception) {
        }
        if (param0 != -28488) {
            boolean discarded$0 = ((qf) this).a((byte) 46);
        }
        ((qf) this).field_j = -1;
        ((qf) this).field_r = null;
        ((qf) this).field_p = ((qf) this).field_p + 1;
        ((qf) this).field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    public qf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Waiting for graphics";
        field_q = new int[8192];
    }
}
