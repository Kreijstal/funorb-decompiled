/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kd extends jf {
    private vd field_p;
    static ci field_t;
    static String field_q;
    static String field_s;
    static double field_r;

    private final void e(int param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((kd) this).field_p != null) {
              {
                L0: {
                  ((kd) this).field_i.field_n = 0;
                  ((kd) this).field_i.f(94, 6);
                  ((kd) this).field_i.a((byte) 120, 3);
                  ((kd) this).field_i.c(0, 8);
                  ((kd) this).field_p.a(((kd) this).field_i.field_m.length, false, ((kd) this).field_i.field_m, 0);
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

    final void d(int param0) {
        if (param0 >= -57) {
            kd.d((byte) -7);
        }
        if (!(null == ((kd) this).field_p)) {
            ((kd) this).field_p.a(1);
        }
    }

    public static void d(byte param0) {
        if (param0 <= 86) {
            kd.d((byte) 68);
        }
        field_s = null;
        field_t = null;
        field_q = null;
    }

    final void a(boolean param0, Object param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            tn var4_ref3 = null;
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
            var6 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (((kd) this).field_p != null) {
                    try {
                      L2: {
                        ((kd) this).field_p.a(param2 ^ -66);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((kd) this).field_p = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L4: {
                  ((kd) this).field_p = (vd) param1;
                  if (param2 == -65) {
                    break L4;
                  } else {
                    kd.d((byte) -56);
                    break L4;
                  }
                }
                this.e(22112);
                this.a(param2 + 67, param0);
                ((kd) this).field_m.field_n = 0;
                ((kd) this).field_f = null;
                L5: while (true) {
                  var4_ref3 = (tn) (Object) ((kd) this).field_j.c(false);
                  if (var4_ref3 == null) {
                    L6: while (true) {
                      var4_ref3 = (tn) (Object) ((kd) this).field_n.c(false);
                      if (var4_ref3 == null) {
                        L7: {
                          if (((kd) this).field_d == 0) {
                            break L7;
                          } else {
                            {
                              L8: {
                                ((kd) this).field_i.field_n = 0;
                                ((kd) this).field_i.f(param2 ^ -43, 4);
                                ((kd) this).field_i.f(param2 ^ -43, (int) ((kd) this).field_d);
                                ((kd) this).field_i.d(-104, 0);
                                ((kd) this).field_p.a(((kd) this).field_i.field_m.length, false, ((kd) this).field_i.field_m, 0);
                                break L8;
                              }
                            }
                            break L7;
                          }
                        }
                        ((kd) this).field_l = 0;
                        ((kd) this).field_h = ri.a(param2 ^ 66);
                        break L0;
                      } else {
                        ((kd) this).field_g.a((jl) (Object) var4_ref3, (byte) 127);
                        continue L6;
                      }
                    }
                  } else {
                    ((kd) this).field_o.a((jl) (Object) var4_ref3, (byte) -101);
                    continue L5;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) var4_ref2;
                stackOut_24_1 = new StringBuilder().append("kd.A(").append(param0).append(44);
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                if (param1 == null) {
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
              throw sd.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        try {
            ((kd) this).field_p.a(1);
        } catch (Exception exception) {
        }
        ((kd) this).field_a = ((kd) this).field_a + 1;
        if (!param0) {
            field_r = -1.6995276062907998;
        }
        ((kd) this).field_e = -1;
        ((kd) this).field_p = null;
        ((kd) this).field_d = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            kg stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            kg stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            kg stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            kg stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            kg stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            kg stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            if (((kd) this).field_p != null) {
              try {
                L0: {
                  ((kd) this).field_i.field_n = 0;
                  if (param0 == 2) {
                    L1: {
                      stackOut_4_0 = ((kd) this).field_i;
                      stackOut_4_1 = 90;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (!param1) {
                        stackOut_6_0 = (kg) (Object) stackIn_6_0;
                        stackOut_6_1 = stackIn_6_1;
                        stackOut_6_2 = 3;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        break L1;
                      } else {
                        stackOut_5_0 = (kg) (Object) stackIn_5_0;
                        stackOut_5_1 = stackIn_5_1;
                        stackOut_5_2 = 2;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        break L1;
                      }
                    }
                    ((kg) (Object) stackIn_7_0).f(stackIn_7_1, stackIn_7_2);
                    ((kd) this).field_i.a(0L, param0 + 8848);
                    ((kd) this).field_p.a(((kd) this).field_i.field_m.length, false, ((kd) this).field_i.field_m, 0);
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
                      ((kd) this).field_p.a(1);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((kd) this).field_a = ((kd) this).field_a + 1;
                  ((kd) this).field_p = null;
                  ((kd) this).field_e = -2;
                  break L2;
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

    public kd() {
    }

    final static void a(byte param0, int param1, ca param2) {
        hb var3 = null;
        try {
            var3 = vh.field_a;
            var3.b(true, param1);
            var3.f(111, 2);
            var3.f(100, 0);
            var3.f(119, param2.field_m);
            int var4 = 2 % ((-44 - param0) / 35);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "kd.E(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final boolean a(byte param0) {
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
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            tn var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_60_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_84_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_83_0 = 0;
            int stackOut_59_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_73_0 = 0;
            L0: {
              var16 = Confined.field_J ? 1 : 0;
              if (((kd) this).field_p == null) {
                break L0;
              } else {
                L1: {
                  var2_long = ri.a(-3);
                  var4 = (int)(-((kd) this).field_h + var2_long);
                  ((kd) this).field_h = var2_long;
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((kd) this).field_l = ((kd) this).field_l + var4;
                if (((kd) this).field_l <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      ((kd) this).field_p.a(1);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((kd) this).field_p = null;
                  break L0;
                }
              }
            }
            if (((kd) this).field_p == null) {
              L4: {
                if (0 != ((kd) this).a(-28475)) {
                  break L4;
                } else {
                  if (0 != ((kd) this).c((byte) -5)) {
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
                  L6: {
                    ((kd) this).field_p.b(110);
                    if (param0 >= 11) {
                      break L6;
                    } else {
                      field_q = null;
                      break L6;
                    }
                  }
                  var2_ref = (tn) (Object) ((kd) this).field_o.d(92);
                  L7: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (tn) (Object) ((kd) this).field_g.d(-94);
                      L8: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L9: while (true) {
                            if (var2_int >= 100) {
                              stackOut_83_0 = 1;
                              stackIn_84_0 = stackOut_83_0;
                              break L5;
                            } else {
                              var3_int = ((kd) this).field_p.c((byte) -99);
                              if (0 <= var3_int) {
                                if (var3_int != 0) {
                                  L10: {
                                    ((kd) this).field_l = 0;
                                    var4 = 0;
                                    if (((kd) this).field_f == null) {
                                      var4 = 10;
                                      break L10;
                                    } else {
                                      if (0 == ((kd) this).field_f.field_B) {
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
                                        var5 = -((kd) this).field_m.field_n + var4;
                                        if (var3_int >= var5) {
                                          break L12;
                                        } else {
                                          var5 = var3_int;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        ((kd) this).field_p.a(((kd) this).field_m.field_m, 49, var5, ((kd) this).field_m.field_n);
                                        if (((kd) this).field_d == 0) {
                                          break L13;
                                        } else {
                                          var6 = 0;
                                          L14: while (true) {
                                            if (~var5 >= ~var6) {
                                              break L13;
                                            } else {
                                              ((kd) this).field_m.field_m[((kd) this).field_m.field_n + var6] = (byte)km.a((int) ((kd) this).field_m.field_m[((kd) this).field_m.field_n + var6], (int) ((kd) this).field_d);
                                              var6++;
                                              continue L14;
                                            }
                                          }
                                        }
                                      }
                                      ((kd) this).field_m.field_n = ((kd) this).field_m.field_n + var5;
                                      if (((kd) this).field_m.field_n < var4) {
                                        break L11;
                                      } else {
                                        if (((kd) this).field_f == null) {
                                          L15: {
                                            ((kd) this).field_m.field_n = 0;
                                            var6 = ((kd) this).field_m.c(32);
                                            var7 = ((kd) this).field_m.f((byte) 70);
                                            var8 = ((kd) this).field_m.c(32);
                                            var9 = ((kd) this).field_m.f((byte) 59);
                                            var10 = var8 & 127;
                                            if (0 == (var8 & 128)) {
                                              stackOut_59_0 = 0;
                                              stackIn_60_0 = stackOut_59_0;
                                              break L15;
                                            } else {
                                              stackOut_58_0 = 1;
                                              stackIn_60_0 = stackOut_58_0;
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            var11 = stackIn_60_0;
                                            var12 = ((long)var6 << 32) + (long)var7;
                                            var14 = null;
                                            if (var11 == 0) {
                                              var14_ref = (tn) (Object) ((kd) this).field_j.d(-97);
                                              L17: while (true) {
                                                if (var14_ref == null) {
                                                  break L16;
                                                } else {
                                                  if (~var14_ref.field_r == ~var12) {
                                                    break L16;
                                                  } else {
                                                    var14_ref = (tn) (Object) ((kd) this).field_j.a((byte) -117);
                                                    continue L17;
                                                  }
                                                }
                                              }
                                            } else {
                                              var14_ref = (tn) (Object) ((kd) this).field_n.d(-103);
                                              L18: while (true) {
                                                if (var14_ref == null) {
                                                  break L16;
                                                } else {
                                                  if (var14_ref.field_r != var12) {
                                                    var14_ref = (tn) (Object) ((kd) this).field_n.a((byte) -7);
                                                    continue L18;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var14_ref != null) {
                                            L19: {
                                              if (var10 == 0) {
                                                stackOut_74_0 = 5;
                                                stackIn_75_0 = stackOut_74_0;
                                                break L19;
                                              } else {
                                                stackOut_73_0 = 9;
                                                stackIn_75_0 = stackOut_73_0;
                                                break L19;
                                              }
                                            }
                                            var15 = stackIn_75_0;
                                            ((kd) this).field_f = var14_ref;
                                            ((kd) this).field_f.field_A = new kg(var9 + (var15 + ((kd) this).field_f.field_z));
                                            ((kd) this).field_f.field_A.f(127, var10);
                                            ((kd) this).field_f.field_A.d(-86, var9);
                                            ((kd) this).field_f.field_B = 10;
                                            ((kd) this).field_m.field_n = 0;
                                            break L11;
                                          } else {
                                            throw new IOException();
                                          }
                                        } else {
                                          if (((kd) this).field_f.field_B == 0) {
                                            if (((kd) this).field_m.field_m[0] != -1) {
                                              ((kd) this).field_f = null;
                                              break L11;
                                            } else {
                                              ((kd) this).field_m.field_n = 0;
                                              ((kd) this).field_f.field_B = 1;
                                              break L11;
                                            }
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    } else {
                                      L20: {
                                        var5 = ((kd) this).field_f.field_A.field_m.length - ((kd) this).field_f.field_z;
                                        var6 = -((kd) this).field_f.field_B + 512;
                                        if (~var6 < ~(-((kd) this).field_f.field_A.field_n + var5)) {
                                          var6 = -((kd) this).field_f.field_A.field_n + var5;
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (~var3_int <= ~var6) {
                                          break L21;
                                        } else {
                                          var6 = var3_int;
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        ((kd) this).field_p.a(((kd) this).field_f.field_A.field_m, -99, var6, ((kd) this).field_f.field_A.field_n);
                                        if (((kd) this).field_d != 0) {
                                          var7 = 0;
                                          L23: while (true) {
                                            if (~var7 <= ~var6) {
                                              break L22;
                                            } else {
                                              ((kd) this).field_f.field_A.field_m[((kd) this).field_f.field_A.field_n + var7] = (byte)km.a((int) ((kd) this).field_f.field_A.field_m[((kd) this).field_f.field_A.field_n + var7], (int) ((kd) this).field_d);
                                              var7++;
                                              continue L23;
                                            }
                                          }
                                        } else {
                                          break L22;
                                        }
                                      }
                                      ((kd) this).field_f.field_B = ((kd) this).field_f.field_B + var6;
                                      ((kd) this).field_f.field_A.field_n = ((kd) this).field_f.field_A.field_n + var6;
                                      if (var5 != ((kd) this).field_f.field_A.field_n) {
                                        if (((kd) this).field_f.field_B != 512) {
                                          break L11;
                                        } else {
                                          ((kd) this).field_f.field_B = 0;
                                          break L11;
                                        }
                                      } else {
                                        ((kd) this).field_f.b(true);
                                        ((kd) this).field_f.field_v = false;
                                        ((kd) this).field_f = null;
                                        break L11;
                                      }
                                    }
                                  }
                                  var2_int++;
                                  continue L9;
                                } else {
                                  return true;
                                }
                              } else {
                                throw new IOException();
                              }
                            }
                          }
                        } else {
                          ((kd) this).field_i.field_n = 0;
                          ((kd) this).field_i.f(90, 0);
                          ((kd) this).field_i.a(var2_ref.field_r, 8850);
                          ((kd) this).field_p.a(((kd) this).field_i.field_m.length, false, ((kd) this).field_i.field_m, 0);
                          ((kd) this).field_n.a((jl) (Object) var2_ref, (byte) 117);
                          var2_ref = (tn) (Object) ((kd) this).field_g.a((byte) -119);
                          continue L8;
                        }
                      }
                    } else {
                      ((kd) this).field_i.field_n = 0;
                      ((kd) this).field_i.f(95, 1);
                      ((kd) this).field_i.a(var2_ref.field_r, 8850);
                      ((kd) this).field_p.a(((kd) this).field_i.field_m.length, false, ((kd) this).field_i.field_m, 0);
                      ((kd) this).field_j.a((jl) (Object) var2_ref, (byte) -114);
                      var2_ref = (tn) (Object) ((kd) this).field_o.a((byte) -113);
                      continue L7;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    ((kd) this).field_p.a(1);
                    break L24;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L25: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L25;
                  }
                }
                L26: {
                  ((kd) this).field_a = ((kd) this).field_a + 1;
                  ((kd) this).field_p = null;
                  ((kd) this).field_e = -2;
                  if (0 != ((kd) this).a(-28475)) {
                    break L26;
                  } else {
                    if (((kd) this).c((byte) -5) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_84_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "<col=FFFFFF>Power shots:</col> this upgrade makes your basic weapon a lot more powerful for 30 seconds. The tunnel has never looked so bright.";
        field_s = "Rapid fire";
        field_t = new ci();
    }
}
