/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fl extends vb {
    private wb field_u;
    static int[][] field_t;
    static int field_v;
    static ka[] field_s;

    public static void e() {
        field_s = null;
        field_t = null;
    }

    private final void a(boolean param0, byte param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            uf stackIn_4_0 = null;
            uf stackIn_5_0 = null;
            uf stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            uf stackOut_3_0 = null;
            uf stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            uf stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            if (null == ((fl) this).field_u) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((fl) this).field_d.field_q = 0;
                    stackOut_3_0 = ((fl) this).field_d;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (!param0) {
                      stackOut_5_0 = (uf) (Object) stackIn_5_0;
                      stackOut_5_1 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (uf) (Object) stackIn_4_0;
                      stackOut_4_1 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                  ((uf) (Object) stackIn_6_0).d(stackIn_6_1, (byte) 122);
                  ((fl) this).field_d.a(0L, -1709073240);
                  ((fl) this).field_u.a(((fl) this).field_d.field_m.length, 0, (byte) 98, ((fl) this).field_d.field_m);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((fl) this).field_u.a((byte) -35);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((fl) this).field_u = null;
                  ((fl) this).field_b = -2;
                  ((fl) this).field_h = ((fl) this).field_h + 1;
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

    final void a(int param0) {
        if (!(null == ((fl) this).field_u)) {
            ((fl) this).field_u.a((byte) 111);
        }
        if (param0 != -19315) {
            ((fl) this).field_u = null;
        }
    }

    final void a(boolean param0, Object param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            db var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            Object var7 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            String stackIn_28_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            String stackOut_27_2 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            var6 = TorChallenge.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != ((fl) this).field_u) {
                    try {
                      L2: {
                        ((fl) this).field_u.a((byte) 107);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((fl) this).field_u = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L4: {
                  ((fl) this).field_u = (wb) param1;
                  int discarded$2 = 2;
                  this.d();
                  this.a(param0, (byte) -71);
                  ((fl) this).field_o.field_q = 0;
                  ((fl) this).field_p = null;
                  if (param2 == 115) {
                    break L4;
                  } else {
                    var7 = null;
                    boolean discarded$3 = fl.a((pa) null, (byte) 59);
                    break L4;
                  }
                }
                L5: while (true) {
                  var4_ref3 = (db) (Object) ((fl) this).field_l.c(-1);
                  if (var4_ref3 != null) {
                    ((fl) this).field_c.a((w) (Object) var4_ref3, 3329);
                    continue L5;
                  } else {
                    L6: while (true) {
                      var4_ref3 = (db) (Object) ((fl) this).field_i.c(-1);
                      if (var4_ref3 != null) {
                        ((fl) this).field_k.a((w) (Object) var4_ref3, param2 + 3214);
                        continue L6;
                      } else {
                        L7: {
                          if (0 == ((fl) this).field_f) {
                            break L7;
                          } else {
                            {
                              L8: {
                                ((fl) this).field_d.field_q = 0;
                                ((fl) this).field_d.d(4, (byte) 122);
                                ((fl) this).field_d.d((int) ((fl) this).field_f, (byte) 122);
                                ((fl) this).field_d.a(0, false);
                                ((fl) this).field_u.a(((fl) this).field_d.field_m.length, 0, (byte) 112, ((fl) this).field_d.field_m);
                                break L8;
                              }
                            }
                            break L7;
                          }
                        }
                        ((fl) this).field_g = 0;
                        ((fl) this).field_j = ol.a(256);
                        break L0;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_25_0 = (RuntimeException) var4_ref2;
                stackOut_25_1 = new StringBuilder().append("fl.A(").append(param0).append(44);
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                if (param1 == null) {
                  stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                  stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                  stackOut_27_2 = "null";
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  break L12;
                } else {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "{...}";
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  break L12;
                }
              }
              throw oj.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public fl() {
    }

    final static void a(int param0, boolean param1, String param2, String param3) {
        try {
            lg.field_b = param2;
            ja.field_b = param3;
            if (param0 >= -57) {
                field_s = null;
            }
            gh.a((byte) -116, nk.field_c, param1);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "fl.H(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void c(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((fl) this).field_u.a((byte) 115);
              if (param0 == -30317) {
                break L1;
              } else {
                ((fl) this).c(86);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            exception = (Exception) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((fl) this).field_b = -1;
        ((fl) this).field_u = null;
        ((fl) this).field_h = ((fl) this).field_h + 1;
        ((fl) this).field_f = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    private final void d() {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != ((fl) this).field_u) {
              {
                L0: {
                  ((fl) this).field_d.field_q = 0;
                  ((fl) this).field_d.d(6, (byte) 122);
                  ((fl) this).field_d.a((byte) -124, 3);
                  ((fl) this).field_d.a(0, (byte) 106);
                  ((fl) this).field_u.a(((fl) this).field_d.field_m.length, 0, (byte) 121, ((fl) this).field_d.field_m);
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

    final static boolean a(pa param0, byte param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
              if (param1 >= 103) {
                break L1;
              } else {
                int discarded$2 = fl.f(97);
                break L1;
              }
            }
            L2: {
              if (param0.e(1, -53) != 1) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("fl.E(");
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
          throw oj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
        return stackIn_5_0 != 0;
    }

    final boolean b(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            db var2_ref = null;
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
            db var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_63_0 = 0;
            int stackIn_80_0 = 0;
            int stackIn_89_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_88_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_78_0 = 0;
            L0: {
              var16 = TorChallenge.field_F ? 1 : 0;
              if (((fl) this).field_u == null) {
                break L0;
              } else {
                L1: {
                  var2_long = ol.a(256);
                  var4 = (int)(var2_long + -((fl) this).field_j);
                  ((fl) this).field_j = var2_long;
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((fl) this).field_g = ((fl) this).field_g + var4;
                if (((fl) this).field_g > 30000) {
                  try {
                    L2: {
                      ((fl) this).field_u.a((byte) -55);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((fl) this).field_u = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null == ((fl) this).field_u) {
              L4: {
                if (0 != ((fl) this).a((byte) 120)) {
                  break L4;
                } else {
                  if (((fl) this).c((byte) 99) != 0) {
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
                  ((fl) this).field_u.b(127);
                  var2_ref = (db) (Object) ((fl) this).field_c.a(25777);
                  L6: while (true) {
                    if (var2_ref == null) {
                      L7: {
                        if (param0 <= -44) {
                          break L7;
                        } else {
                          field_v = -12;
                          break L7;
                        }
                      }
                      var2_ref = (db) (Object) ((fl) this).field_k.a(25777);
                      L8: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L9: while (true) {
                            if (var2_int >= 100) {
                              stackOut_88_0 = 1;
                              stackIn_89_0 = stackOut_88_0;
                              break L5;
                            } else {
                              var3_int = ((fl) this).field_u.a(0);
                              if (var3_int < 0) {
                                throw new IOException();
                              } else {
                                if (var3_int != 0) {
                                  L10: {
                                    ((fl) this).field_g = 0;
                                    var4 = 0;
                                    if (((fl) this).field_p == null) {
                                      var4 = 10;
                                      break L10;
                                    } else {
                                      if (((fl) this).field_p.field_C != 0) {
                                        break L10;
                                      } else {
                                        var4 = 1;
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var4 > 0) {
                                      L12: {
                                        var5 = var4 - ((fl) this).field_o.field_q;
                                        if (var5 <= var3_int) {
                                          break L12;
                                        } else {
                                          var5 = var3_int;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        ((fl) this).field_u.a(-1, ((fl) this).field_o.field_q, var5, ((fl) this).field_o.field_m);
                                        if (0 == ((fl) this).field_f) {
                                          break L13;
                                        } else {
                                          var6 = 0;
                                          L14: while (true) {
                                            if (var6 >= var5) {
                                              break L13;
                                            } else {
                                              ((fl) this).field_o.field_m[var6 + ((fl) this).field_o.field_q] = (byte)TorChallenge.a((int) ((fl) this).field_o.field_m[var6 + ((fl) this).field_o.field_q], (int) ((fl) this).field_f);
                                              var6++;
                                              continue L14;
                                            }
                                          }
                                        }
                                      }
                                      ((fl) this).field_o.field_q = ((fl) this).field_o.field_q + var5;
                                      if (((fl) this).field_o.field_q < var4) {
                                        break L11;
                                      } else {
                                        if (null == ((fl) this).field_p) {
                                          L15: {
                                            ((fl) this).field_o.field_q = 0;
                                            var6 = ((fl) this).field_o.j(-101);
                                            var7 = ((fl) this).field_o.i(39);
                                            var8 = ((fl) this).field_o.j(-111);
                                            var9 = ((fl) this).field_o.i(64);
                                            var10 = var8 & 127;
                                            if ((var8 & 128) == 0) {
                                              stackOut_62_0 = 0;
                                              stackIn_63_0 = stackOut_62_0;
                                              break L15;
                                            } else {
                                              stackOut_61_0 = 1;
                                              stackIn_63_0 = stackOut_61_0;
                                              break L15;
                                            }
                                          }
                                          L16: {
                                            var11 = stackIn_63_0;
                                            var12 = ((long)var6 << 32) - -(long)var7;
                                            var14 = null;
                                            if (var11 != 0) {
                                              var14_ref = (db) (Object) ((fl) this).field_i.a(25777);
                                              L17: while (true) {
                                                if (var14_ref == null) {
                                                  break L16;
                                                } else {
                                                  if (var14_ref.field_l != var12) {
                                                    var14_ref = (db) (Object) ((fl) this).field_i.d(116);
                                                    continue L17;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                            } else {
                                              var14_ref = (db) (Object) ((fl) this).field_l.a(25777);
                                              L18: while (true) {
                                                if (var14_ref == null) {
                                                  break L16;
                                                } else {
                                                  if (var14_ref.field_l != var12) {
                                                    var14_ref = (db) (Object) ((fl) this).field_l.d(121);
                                                    continue L18;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var14_ref == null) {
                                            throw new IOException();
                                          } else {
                                            L19: {
                                              if (0 == var10) {
                                                stackOut_79_0 = 5;
                                                stackIn_80_0 = stackOut_79_0;
                                                break L19;
                                              } else {
                                                stackOut_78_0 = 9;
                                                stackIn_80_0 = stackOut_78_0;
                                                break L19;
                                              }
                                            }
                                            var15 = stackIn_80_0;
                                            ((fl) this).field_p = var14_ref;
                                            ((fl) this).field_p.field_A = new uf(var15 + var9 - -((fl) this).field_p.field_F);
                                            ((fl) this).field_p.field_A.d(var10, (byte) 122);
                                            ((fl) this).field_p.field_A.a(var9, false);
                                            ((fl) this).field_p.field_C = 10;
                                            ((fl) this).field_o.field_q = 0;
                                            break L11;
                                          }
                                        } else {
                                          if (((fl) this).field_p.field_C == 0) {
                                            if (((fl) this).field_o.field_m[0] == -1) {
                                              ((fl) this).field_p.field_C = 1;
                                              ((fl) this).field_o.field_q = 0;
                                              break L11;
                                            } else {
                                              ((fl) this).field_p = null;
                                              break L11;
                                            }
                                          } else {
                                            throw new IOException();
                                          }
                                        }
                                      }
                                    } else {
                                      L20: {
                                        var5 = -((fl) this).field_p.field_F + ((fl) this).field_p.field_A.field_m.length;
                                        var6 = -((fl) this).field_p.field_C + 512;
                                        if (~(var5 - ((fl) this).field_p.field_A.field_q) > ~var6) {
                                          var6 = -((fl) this).field_p.field_A.field_q + var5;
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (~var6 >= ~var3_int) {
                                          break L21;
                                        } else {
                                          var6 = var3_int;
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        ((fl) this).field_u.a(-1, ((fl) this).field_p.field_A.field_q, var6, ((fl) this).field_p.field_A.field_m);
                                        if (((fl) this).field_f != 0) {
                                          var7 = 0;
                                          L23: while (true) {
                                            if (~var6 >= ~var7) {
                                              break L22;
                                            } else {
                                              ((fl) this).field_p.field_A.field_m[var7 + ((fl) this).field_p.field_A.field_q] = (byte)TorChallenge.a((int) ((fl) this).field_p.field_A.field_m[var7 + ((fl) this).field_p.field_A.field_q], (int) ((fl) this).field_f);
                                              var7++;
                                              continue L23;
                                            }
                                          }
                                        } else {
                                          break L22;
                                        }
                                      }
                                      ((fl) this).field_p.field_C = ((fl) this).field_p.field_C + var6;
                                      ((fl) this).field_p.field_A.field_q = ((fl) this).field_p.field_A.field_q + var6;
                                      if (~((fl) this).field_p.field_A.field_q == ~var5) {
                                        ((fl) this).field_p.a(12695);
                                        ((fl) this).field_p.field_v = false;
                                        ((fl) this).field_p = null;
                                        break L11;
                                      } else {
                                        if (((fl) this).field_p.field_C == 512) {
                                          ((fl) this).field_p.field_C = 0;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  var2_int++;
                                  continue L9;
                                } else {
                                  return true;
                                }
                              }
                            }
                          }
                        } else {
                          ((fl) this).field_d.field_q = 0;
                          ((fl) this).field_d.d(0, (byte) 122);
                          ((fl) this).field_d.a(var2_ref.field_l, -1709073240);
                          ((fl) this).field_u.a(((fl) this).field_d.field_m.length, 0, (byte) 76, ((fl) this).field_d.field_m);
                          ((fl) this).field_i.a((w) (Object) var2_ref, 3329);
                          var2_ref = (db) (Object) ((fl) this).field_k.d(118);
                          continue L8;
                        }
                      }
                    } else {
                      ((fl) this).field_d.field_q = 0;
                      ((fl) this).field_d.d(1, (byte) 122);
                      ((fl) this).field_d.a(var2_ref.field_l, -1709073240);
                      ((fl) this).field_u.a(((fl) this).field_d.field_m.length, 0, (byte) 101, ((fl) this).field_d.field_m);
                      ((fl) this).field_l.a((w) (Object) var2_ref, 3329);
                      var2_ref = (db) (Object) ((fl) this).field_c.d(49);
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    ((fl) this).field_u.a((byte) 118);
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
                  ((fl) this).field_h = ((fl) this).field_h + 1;
                  ((fl) this).field_u = null;
                  ((fl) this).field_b = -2;
                  if (0 != ((fl) this).a((byte) 117)) {
                    break L26;
                  } else {
                    if (0 == ((fl) this).c((byte) 99)) {
                      return true;
                    } else {
                      break L26;
                    }
                  }
                }
                return false;
              }
              return stackIn_89_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int f(int param0) {
        if (param0 != 0) {
            return -81;
        }
        return sd.field_a - qe.field_R;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[][]{null, null, null, null, null, null, null, null, null, null, null, null, new int[21], null, null, null};
    }
}
