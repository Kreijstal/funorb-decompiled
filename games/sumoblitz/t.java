/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class t extends gd {
    static boolean[] field_p;
    private dt field_r;
    static String field_s;
    static int field_q;

    final void a(boolean param0, byte param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            fv var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
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
            var6 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (((t) this).field_r == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ((t) this).field_r.a((byte) -67);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((t) this).field_r = null;
                    break L1;
                  }
                }
                ((t) this).field_r = (dt) param2;
                this.e(0);
                this.a(71, param0);
                ((t) this).field_i = null;
                ((t) this).field_b.field_p = 0;
                L4: while (true) {
                  var4_ref3 = (fv) (Object) ((t) this).field_h.b((byte) 72);
                  if (var4_ref3 == null) {
                    L5: while (true) {
                      var4_ref3 = (fv) (Object) ((t) this).field_g.b((byte) 72);
                      if (var4_ref3 != null) {
                        ((t) this).field_f.a((pj) (Object) var4_ref3, (byte) -101);
                        continue L5;
                      } else {
                        if (param1 > 90) {
                          L6: {
                            if (((t) this).field_m != 0) {
                              {
                                L7: {
                                  ((t) this).field_n.field_p = 0;
                                  ((t) this).field_n.b((byte) 89, 4);
                                  ((t) this).field_n.b((byte) 36, (int) ((t) this).field_m);
                                  ((t) this).field_n.e(48, 0);
                                  ((t) this).field_r.a(0, -2, ((t) this).field_n.field_n, ((t) this).field_n.field_n.length);
                                  break L7;
                                }
                              }
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          ((t) this).field_c = 0;
                          ((t) this).field_e = wq.a(-78);
                          break L0;
                        } else {
                          return;
                        }
                      }
                    }
                  } else {
                    ((t) this).field_l.a((pj) (Object) var4_ref3, (byte) -128);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_25_0 = (RuntimeException) var4_ref2;
                stackOut_25_1 = new StringBuilder().append("t.F(").append(param0).append(44).append(param1).append(44);
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                if (param2 == null) {
                  stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                  stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                  stackOut_27_2 = "null";
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  break L11;
                } else {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "{...}";
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  break L11;
                }
              }
              throw qo.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        field_p = null;
        field_s = null;
        if (param0 != 1) {
            t.f(-122);
        }
    }

    final void b(int param0) {
        try {
            ((t) this).field_r.a((byte) -65);
        } catch (Exception exception) {
        }
        ((t) this).field_j = -1;
        ((t) this).field_d = ((t) this).field_d + 1;
        ((t) this).field_r = null;
        ((t) this).field_m = (byte)(int)(1.0 + Math.random() * 255.0);
        if (param0 != 14702) {
            field_q = -47;
        }
    }

    final boolean c(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            fv var2_ref = null;
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
            fv var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_65_0 = 0;
            int stackIn_81_0 = 0;
            int stackIn_89_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_64_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_80_0 = 0;
            int stackOut_79_0 = 0;
            int stackOut_88_0 = 0;
            var16 = Sumoblitz.field_L ? 1 : 0;
            if (param0 > 78) {
              L0: {
                if (((t) this).field_r != null) {
                  L1: {
                    var2_long = wq.a(-113);
                    var4 = (int)(var2_long + -((t) this).field_e);
                    if (var4 <= 200) {
                      break L1;
                    } else {
                      var4 = 200;
                      break L1;
                    }
                  }
                  ((t) this).field_e = var2_long;
                  ((t) this).field_c = ((t) this).field_c + var4;
                  if (30000 < ((t) this).field_c) {
                    try {
                      L2: {
                        ((t) this).field_r.a((byte) -72);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((t) this).field_r = null;
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              if (((t) this).field_r == null) {
                if (((t) this).d(-2115911413) != 0) {
                  return false;
                } else {
                  if (0 == ((t) this).a((byte) -86)) {
                    return true;
                  } else {
                    return false;
                  }
                }
              } else {
                try {
                  L4: {
                    ((t) this).field_r.b(-120);
                    var2_ref = (fv) (Object) ((t) this).field_l.a(32);
                    L5: while (true) {
                      if (var2_ref == null) {
                        var2_ref = (fv) (Object) ((t) this).field_f.a(37);
                        L6: while (true) {
                          if (var2_ref == null) {
                            var2_int = 0;
                            L7: while (true) {
                              L8: {
                                if (var2_int >= 100) {
                                  break L8;
                                } else {
                                  var3_int = ((t) this).field_r.c(-128);
                                  if (var3_int < 0) {
                                    throw new IOException();
                                  } else {
                                    if (var3_int == 0) {
                                      break L8;
                                    } else {
                                      L9: {
                                        ((t) this).field_c = 0;
                                        var4 = 0;
                                        if (((t) this).field_i == null) {
                                          var4 = 10;
                                          break L9;
                                        } else {
                                          if (0 == ((t) this).field_i.field_x) {
                                            var4 = 1;
                                            break L9;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (var4 > 0) {
                                          L11: {
                                            var5 = -((t) this).field_b.field_p + var4;
                                            if (var3_int >= var5) {
                                              break L11;
                                            } else {
                                              var5 = var3_int;
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            ((t) this).field_r.a(-114, ((t) this).field_b.field_p, var5, ((t) this).field_b.field_n);
                                            if (0 != ((t) this).field_m) {
                                              var6 = 0;
                                              L13: while (true) {
                                                if (var6 >= var5) {
                                                  break L12;
                                                } else {
                                                  ((t) this).field_b.field_n[var6 + ((t) this).field_b.field_p] = (byte)jg.a((int) ((t) this).field_b.field_n[var6 + ((t) this).field_b.field_p], (int) ((t) this).field_m);
                                                  var6++;
                                                  continue L13;
                                                }
                                              }
                                            } else {
                                              break L12;
                                            }
                                          }
                                          ((t) this).field_b.field_p = ((t) this).field_b.field_p + var5;
                                          if (((t) this).field_b.field_p >= var4) {
                                            if (null == ((t) this).field_i) {
                                              L14: {
                                                ((t) this).field_b.field_p = 0;
                                                var6 = ((t) this).field_b.e(-31302);
                                                var7 = ((t) this).field_b.c(true);
                                                var8 = ((t) this).field_b.e(-31302);
                                                var9 = ((t) this).field_b.c(true);
                                                var10 = 127 & var8;
                                                if (0 == (128 & var8)) {
                                                  stackOut_64_0 = 0;
                                                  stackIn_65_0 = stackOut_64_0;
                                                  break L14;
                                                } else {
                                                  stackOut_63_0 = 1;
                                                  stackIn_65_0 = stackOut_63_0;
                                                  break L14;
                                                }
                                              }
                                              L15: {
                                                var11 = stackIn_65_0;
                                                var12 = ((long)var6 << 32) - -(long)var7;
                                                var14 = null;
                                                if (var11 != 0) {
                                                  var14_ref = (fv) (Object) ((t) this).field_g.a(64);
                                                  L16: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if (var14_ref.field_l == var12) {
                                                        break L15;
                                                      } else {
                                                        var14_ref = (fv) (Object) ((t) this).field_g.d(-2);
                                                        continue L16;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var14_ref = (fv) (Object) ((t) this).field_h.a(66);
                                                  L17: while (true) {
                                                    if (var14_ref == null) {
                                                      break L15;
                                                    } else {
                                                      if (~var12 != ~var14_ref.field_l) {
                                                        var14_ref = (fv) (Object) ((t) this).field_h.d(-2);
                                                        continue L17;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              if (var14_ref == null) {
                                                throw new IOException();
                                              } else {
                                                L18: {
                                                  if (0 == var10) {
                                                    stackOut_80_0 = 5;
                                                    stackIn_81_0 = stackOut_80_0;
                                                    break L18;
                                                  } else {
                                                    stackOut_79_0 = 9;
                                                    stackIn_81_0 = stackOut_79_0;
                                                    break L18;
                                                  }
                                                }
                                                var15 = stackIn_81_0;
                                                ((t) this).field_i = var14_ref;
                                                ((t) this).field_i.field_w = new fs(((t) this).field_i.field_z + var15 + var9);
                                                ((t) this).field_i.field_w.b((byte) 37, var10);
                                                ((t) this).field_i.field_w.e(48, var9);
                                                ((t) this).field_i.field_x = 10;
                                                ((t) this).field_b.field_p = 0;
                                                break L10;
                                              }
                                            } else {
                                              if (0 != ((t) this).field_i.field_x) {
                                                throw new IOException();
                                              } else {
                                                if (((t) this).field_b.field_n[0] == -1) {
                                                  ((t) this).field_i.field_x = 1;
                                                  ((t) this).field_b.field_p = 0;
                                                  break L10;
                                                } else {
                                                  ((t) this).field_i = null;
                                                  break L10;
                                                }
                                              }
                                            }
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          L19: {
                                            var5 = ((t) this).field_i.field_w.field_n.length + -((t) this).field_i.field_z;
                                            var6 = -((t) this).field_i.field_x + 512;
                                            if (var6 <= var5 - ((t) this).field_i.field_w.field_p) {
                                              break L19;
                                            } else {
                                              var6 = var5 - ((t) this).field_i.field_w.field_p;
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            if (var3_int >= var6) {
                                              break L20;
                                            } else {
                                              var6 = var3_int;
                                              break L20;
                                            }
                                          }
                                          L21: {
                                            ((t) this).field_r.a(-115, ((t) this).field_i.field_w.field_p, var6, ((t) this).field_i.field_w.field_n);
                                            if (((t) this).field_m != 0) {
                                              var7 = 0;
                                              L22: while (true) {
                                                if (var7 >= var6) {
                                                  break L21;
                                                } else {
                                                  ((t) this).field_i.field_w.field_n[((t) this).field_i.field_w.field_p + var7] = (byte)jg.a((int) ((t) this).field_i.field_w.field_n[((t) this).field_i.field_w.field_p + var7], (int) ((t) this).field_m);
                                                  var7++;
                                                  continue L22;
                                                }
                                              }
                                            } else {
                                              break L21;
                                            }
                                          }
                                          ((t) this).field_i.field_x = ((t) this).field_i.field_x + var6;
                                          ((t) this).field_i.field_w.field_p = ((t) this).field_i.field_w.field_p + var6;
                                          if (var5 != ((t) this).field_i.field_w.field_p) {
                                            if (((t) this).field_i.field_x == 512) {
                                              ((t) this).field_i.field_x = 0;
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          } else {
                                            ((t) this).field_i.c(-5106);
                                            ((t) this).field_i.field_u = false;
                                            ((t) this).field_i = null;
                                            break L10;
                                          }
                                        }
                                      }
                                      var2_int++;
                                      continue L7;
                                    }
                                  }
                                }
                              }
                              stackOut_88_0 = 1;
                              stackIn_89_0 = stackOut_88_0;
                              break L4;
                            }
                          } else {
                            ((t) this).field_n.field_p = 0;
                            ((t) this).field_n.b((byte) 86, 0);
                            ((t) this).field_n.b(var2_ref.field_l, 1105594440);
                            ((t) this).field_r.a(0, -2, ((t) this).field_n.field_n, ((t) this).field_n.field_n.length);
                            ((t) this).field_g.a((pj) (Object) var2_ref, (byte) -103);
                            var2_ref = (fv) (Object) ((t) this).field_f.d(-2);
                            continue L6;
                          }
                        }
                      } else {
                        ((t) this).field_n.field_p = 0;
                        ((t) this).field_n.b((byte) 55, 1);
                        ((t) this).field_n.b(var2_ref.field_l, 1105594440);
                        ((t) this).field_r.a(0, -2, ((t) this).field_n.field_n, ((t) this).field_n.field_n.length);
                        ((t) this).field_h.a((pj) (Object) var2_ref, (byte) -107);
                        var2_ref = (fv) (Object) ((t) this).field_l.d(-2);
                        continue L5;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  try {
                    L23: {
                      ((t) this).field_r.a((byte) -60);
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
                    ((t) this).field_r = null;
                    ((t) this).field_d = ((t) this).field_d + 1;
                    ((t) this).field_j = -2;
                    if (0 != ((t) this).d(-2115911413)) {
                      break L25;
                    } else {
                      if (((t) this).a((byte) -122) != 0) {
                        break L25;
                      } else {
                        return true;
                      }
                    }
                  }
                  return false;
                }
                return stackIn_89_0 != 0;
              }
            } else {
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            fs stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            fs stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            fs stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            fs stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            fs stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            fs stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            if (((t) this).field_r == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((t) this).field_n.field_p = 0;
                    stackOut_3_0 = ((t) this).field_n;
                    stackOut_3_1 = 46;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (!param1) {
                      stackOut_5_0 = (fs) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L1;
                    } else {
                      stackOut_4_0 = (fs) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L1;
                    }
                  }
                  ((fs) (Object) stackIn_6_0).b((byte) stackIn_6_1, stackIn_6_2);
                  ((t) this).field_n.b(0L, 1105594440);
                  if (param0 >= 63) {
                    ((t) this).field_r.a(0, -2, ((t) this).field_n.field_n, ((t) this).field_n.field_n.length);
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
                      ((t) this).field_r.a((byte) -93);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((t) this).field_j = -2;
                  ((t) this).field_d = ((t) this).field_d + 1;
                  ((t) this).field_r = null;
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

    private final void e(int param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((t) this).field_r == null) {
              return;
            } else {
              {
                L0: {
                  ((t) this).field_n.field_p = 0;
                  ((t) this).field_n.b((byte) 19, 6);
                  ((t) this).field_n.d(3, 102);
                  ((t) this).field_n.b(127, 0);
                  ((t) this).field_r.a(0, -2, ((t) this).field_n.field_n, ((t) this).field_n.field_n.length);
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

    public t() {
    }

    final void c(int param0) {
        if (param0 > -61) {
            field_q = 32;
        }
        if (null != ((t) this).field_r) {
            ((t) this).field_r.a((byte) -46);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new boolean[25];
        field_s = null;
    }
}
