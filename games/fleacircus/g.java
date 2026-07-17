/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class g extends w {
    static int field_s;
    private td field_v;
    static String field_t;
    static double field_u;

    public g() {
    }

    public static void a(boolean param0) {
        field_t = null;
    }

    final void a(Object param0, boolean param1, byte param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            fk var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            String stackIn_30_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            RuntimeException stackOut_29_0 = null;
            StringBuilder stackOut_29_1 = null;
            String stackOut_29_2 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            var6 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null != ((g) this).field_v) {
                    try {
                      L2: {
                        ((g) this).field_v.h(0);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((g) this).field_v = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (param2 == 105) {
                  ((g) this).field_v = (td) param0;
                  this.g(-79);
                  this.a(param2 + 5, param1);
                  ((g) this).field_p = null;
                  ((g) this).field_f.field_i = 0;
                  L4: while (true) {
                    var4_ref3 = (fk) (Object) ((g) this).field_q.a(param2 ^ -30);
                    if (var4_ref3 != null) {
                      ((g) this).field_o.a((pa) (Object) var4_ref3, -1089421886);
                      continue L4;
                    } else {
                      L5: while (true) {
                        var4_ref3 = (fk) (Object) ((g) this).field_h.a(-122);
                        if (var4_ref3 != null) {
                          ((g) this).field_n.a((pa) (Object) var4_ref3, param2 ^ -1089421909);
                          continue L5;
                        } else {
                          L6: {
                            if (((g) this).field_g != 0) {
                              {
                                L7: {
                                  ((g) this).field_d.field_i = 0;
                                  ((g) this).field_d.a(-11, 4);
                                  ((g) this).field_d.a(param2 + -116, (int) ((g) this).field_g);
                                  ((g) this).field_d.a(0, (byte) -58);
                                  ((g) this).field_v.a((byte) -117, ((g) this).field_d.field_k.length, 0, ((g) this).field_d.field_k);
                                  break L7;
                                }
                              }
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          ((g) this).field_k = 0;
                          ((g) this).field_m = lj.a((byte) -67);
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_27_0 = (RuntimeException) var4_ref2;
                stackOut_27_1 = new StringBuilder().append("g.L(");
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_28_0 = stackOut_27_0;
                stackIn_28_1 = stackOut_27_1;
                if (param0 == null) {
                  stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                  stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                  stackOut_29_2 = "null";
                  stackIn_30_0 = stackOut_29_0;
                  stackIn_30_1 = stackOut_29_1;
                  stackIn_30_2 = stackOut_29_2;
                  break L11;
                } else {
                  stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                  stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                  stackOut_28_2 = "{...}";
                  stackIn_30_0 = stackOut_28_0;
                  stackIn_30_1 = stackOut_28_1;
                  stackIn_30_2 = stackOut_28_2;
                  break L11;
                }
              }
              throw pf.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param1 + 44 + param2 + 41);
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
            ni stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            ni stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            ni stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            int stackIn_7_2 = 0;
            Throwable decompiledCaughtException = null;
            ni stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            ni stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            int stackOut_6_2 = 0;
            ni stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            if (((g) this).field_v != null) {
              try {
                L0: {
                  L1: {
                    ((g) this).field_d.field_i = 0;
                    if (param0 > 48) {
                      break L1;
                    } else {
                      boolean discarded$3 = ((g) this).b((byte) 48);
                      break L1;
                    }
                  }
                  L2: {
                    stackOut_4_0 = ((g) this).field_d;
                    stackOut_4_1 = -11;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    if (param1) {
                      stackOut_6_0 = (ni) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 2;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      stackIn_7_2 = stackOut_6_2;
                      break L2;
                    } else {
                      stackOut_5_0 = (ni) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 3;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      stackIn_7_2 = stackOut_5_2;
                      break L2;
                    }
                  }
                  ((ni) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2);
                  ((g) this).field_d.a(0L, (byte) -39);
                  ((g) this).field_v.a((byte) -118, ((g) this).field_d.field_k.length, 0, ((g) this).field_d.field_k);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      ((g) this).field_v.h(0);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  ((g) this).field_v = null;
                  ((g) this).field_b = -2;
                  ((g) this).field_c = ((g) this).field_c + 1;
                  break L3;
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

    final void a(byte param0) {
        try {
            ((g) this).field_v.h(0);
        } catch (Exception exception) {
        }
        ((g) this).field_c = ((g) this).field_c + 1;
        ((g) this).field_b = -1;
        ((g) this).field_v = null;
        ((g) this).field_g = (byte)(int)(1.0 + Math.random() * 255.0);
        int var2 = 116 / ((param0 - -29) / 47);
    }

    final void d(int param0) {
        if (null != ((g) this).field_v) {
            ((g) this).field_v.h(param0 + 14835);
        }
        if (param0 != -14835) {
            ((g) this).d(-128);
        }
    }

    final static int[] a(byte param0, int param1, int param2) {
        int var3 = jc.a(param2, 116);
        int var4 = we.a((byte) 75, param2);
        int var5 = jc.a(param1, 117);
        int var6 = 104 % ((53 - param0) / 58);
        int var7 = we.a((byte) 101, param1);
        int var8 = (int)((long)var5 * (long)var3 >> 16);
        int var9 = (int)((long)var7 * (long)var3 >> 16);
        int var10 = (int)((long)var4 * (long)var5 >> 16);
        int var11 = (int)((long)var7 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var7, 0, var5, var8, var4, -var9, -var10, var3, var11};
    }

    private final void g(int param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((g) this).field_v != null) {
              L0: {
                if (param0 <= -33) {
                  break L0;
                } else {
                  field_t = null;
                  break L0;
                }
              }
              {
                L1: {
                  ((g) this).field_d.field_i = 0;
                  ((g) this).field_d.a(-11, 6);
                  ((g) this).field_d.a(false, 3);
                  ((g) this).field_d.b((byte) 75, 0);
                  ((g) this).field_v.a((byte) -117, ((g) this).field_d.field_k.length, 0, ((g) this).field_d.field_k);
                  break L1;
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

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            fk var2_ref = null;
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
            fk var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_50_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_88_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_49_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_87_0 = 0;
            L0: {
              var16 = fleas.field_A ? 1 : 0;
              if (null != ((g) this).field_v) {
                L1: {
                  var2_long = lj.a((byte) -24);
                  var4 = (int)(-((g) this).field_m + var2_long);
                  if (var4 <= 200) {
                    break L1;
                  } else {
                    var4 = 200;
                    break L1;
                  }
                }
                ((g) this).field_m = var2_long;
                ((g) this).field_k = ((g) this).field_k + var4;
                if (((g) this).field_k > 30000) {
                  try {
                    L2: {
                      ((g) this).field_v.h(0);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((g) this).field_v = null;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null == ((g) this).field_v) {
              if (((g) this).f(1) != 0) {
                return false;
              } else {
                if (((g) this).e(-53) == 0) {
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              try {
                L4: {
                  ((g) this).field_v.c(0);
                  var2_ref = (fk) (Object) ((g) this).field_o.b((byte) 113);
                  L5: while (true) {
                    if (var2_ref == null) {
                      L6: {
                        if (param0 == 66) {
                          break L6;
                        } else {
                          this.g(-76);
                          break L6;
                        }
                      }
                      var2_ref = (fk) (Object) ((g) this).field_n.b((byte) 120);
                      L7: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if (var2_int >= 100) {
                                break L9;
                              } else {
                                var3_int = ((g) this).field_v.e(-120);
                                if (0 > var3_int) {
                                  throw new IOException();
                                } else {
                                  if (var3_int != 0) {
                                    L10: {
                                      ((g) this).field_k = 0;
                                      var4 = 0;
                                      if (((g) this).field_p != null) {
                                        if (((g) this).field_p.field_y != 0) {
                                          break L10;
                                        } else {
                                          var4 = 1;
                                          break L10;
                                        }
                                      } else {
                                        var4 = 10;
                                        break L10;
                                      }
                                    }
                                    L11: {
                                      if (var4 <= 0) {
                                        L12: {
                                          var5 = ((g) this).field_p.field_A.field_k.length + -((g) this).field_p.field_E;
                                          var6 = -((g) this).field_p.field_y + 512;
                                          if (var5 - ((g) this).field_p.field_A.field_i < var6) {
                                            var6 = -((g) this).field_p.field_A.field_i + var5;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if (var6 <= var3_int) {
                                            break L13;
                                          } else {
                                            var6 = var3_int;
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          ((g) this).field_v.a(var6, ((g) this).field_p.field_A.field_k, ((g) this).field_p.field_A.field_i, false);
                                          if (0 == ((g) this).field_g) {
                                            break L14;
                                          } else {
                                            var7 = 0;
                                            L15: while (true) {
                                              if (var7 >= var6) {
                                                break L14;
                                              } else {
                                                ((g) this).field_p.field_A.field_k[var7 + ((g) this).field_p.field_A.field_i] = (byte)df.a((int) ((g) this).field_p.field_A.field_k[var7 + ((g) this).field_p.field_A.field_i], (int) ((g) this).field_g);
                                                var7++;
                                                continue L15;
                                              }
                                            }
                                          }
                                        }
                                        ((g) this).field_p.field_y = ((g) this).field_p.field_y + var6;
                                        ((g) this).field_p.field_A.field_i = ((g) this).field_p.field_A.field_i + var6;
                                        if (((g) this).field_p.field_A.field_i == var5) {
                                          ((g) this).field_p.e(-100);
                                          ((g) this).field_p.field_q = false;
                                          ((g) this).field_p = null;
                                          break L11;
                                        } else {
                                          if (512 != ((g) this).field_p.field_y) {
                                            break L11;
                                          } else {
                                            ((g) this).field_p.field_y = 0;
                                            break L11;
                                          }
                                        }
                                      } else {
                                        L16: {
                                          var5 = var4 + -((g) this).field_f.field_i;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          ((g) this).field_v.a(var5, ((g) this).field_f.field_k, ((g) this).field_f.field_i, false);
                                          if (((g) this).field_g != 0) {
                                            var6 = 0;
                                            L18: while (true) {
                                              if (var6 >= var5) {
                                                break L17;
                                              } else {
                                                ((g) this).field_f.field_k[var6 + ((g) this).field_f.field_i] = (byte)df.a((int) ((g) this).field_f.field_k[var6 + ((g) this).field_f.field_i], (int) ((g) this).field_g);
                                                var6++;
                                                continue L18;
                                              }
                                            }
                                          } else {
                                            break L17;
                                          }
                                        }
                                        ((g) this).field_f.field_i = ((g) this).field_f.field_i + var5;
                                        if (((g) this).field_f.field_i < var4) {
                                          break L11;
                                        } else {
                                          if (((g) this).field_p != null) {
                                            if (((g) this).field_p.field_y == 0) {
                                              if (((g) this).field_f.field_k[0] == -1) {
                                                ((g) this).field_f.field_i = 0;
                                                ((g) this).field_p.field_y = 1;
                                                break L11;
                                              } else {
                                                ((g) this).field_p = null;
                                                break L11;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            L19: {
                                              ((g) this).field_f.field_i = 0;
                                              var6 = ((g) this).field_f.e(false);
                                              var7 = ((g) this).field_f.c((byte) 25);
                                              var8 = ((g) this).field_f.e(false);
                                              var9 = ((g) this).field_f.c((byte) 124);
                                              var10 = 127 & var8;
                                              if ((var8 & 128) == 0) {
                                                stackOut_49_0 = 0;
                                                stackIn_50_0 = stackOut_49_0;
                                                break L19;
                                              } else {
                                                stackOut_48_0 = 1;
                                                stackIn_50_0 = stackOut_48_0;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              var11 = stackIn_50_0;
                                              var12 = (long)var7 + ((long)var6 << 32);
                                              var14 = null;
                                              if (var11 != 0) {
                                                var14_ref = (fk) (Object) ((g) this).field_h.b((byte) 120);
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if (~var14_ref.field_j == ~var12) {
                                                      break L20;
                                                    } else {
                                                      var14_ref = (fk) (Object) ((g) this).field_h.c((byte) 97);
                                                      continue L21;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (fk) (Object) ((g) this).field_q.b((byte) 117);
                                                L22: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if (var12 != var14_ref.field_j) {
                                                      var14_ref = (fk) (Object) ((g) this).field_q.c((byte) 71);
                                                      continue L22;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L23: {
                                                if (var10 != 0) {
                                                  stackOut_65_0 = 9;
                                                  stackIn_66_0 = stackOut_65_0;
                                                  break L23;
                                                } else {
                                                  stackOut_64_0 = 5;
                                                  stackIn_66_0 = stackOut_64_0;
                                                  break L23;
                                                }
                                              }
                                              var15 = stackIn_66_0;
                                              ((g) this).field_p = var14_ref;
                                              ((g) this).field_p.field_A = new ni(((g) this).field_p.field_E + var9 + var15);
                                              ((g) this).field_p.field_A.a(-11, var10);
                                              ((g) this).field_p.field_A.a(var9, (byte) -106);
                                              ((g) this).field_f.field_i = 0;
                                              ((g) this).field_p.field_y = 10;
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                            }
                            stackOut_87_0 = 1;
                            stackIn_88_0 = stackOut_87_0;
                            break L4;
                          }
                        } else {
                          ((g) this).field_d.field_i = 0;
                          ((g) this).field_d.a(-11, 0);
                          ((g) this).field_d.a(var2_ref.field_j, (byte) -39);
                          ((g) this).field_v.a((byte) -103, ((g) this).field_d.field_k.length, 0, ((g) this).field_d.field_k);
                          ((g) this).field_h.a((pa) (Object) var2_ref, -1089421886);
                          var2_ref = (fk) (Object) ((g) this).field_n.c((byte) 117);
                          continue L7;
                        }
                      }
                    } else {
                      ((g) this).field_d.field_i = 0;
                      ((g) this).field_d.a(-11, 1);
                      ((g) this).field_d.a(var2_ref.field_j, (byte) -39);
                      ((g) this).field_v.a((byte) -122, ((g) this).field_d.field_k.length, 0, ((g) this).field_d.field_k);
                      ((g) this).field_q.a((pa) (Object) var2_ref, -1089421886);
                      var2_ref = (fk) (Object) ((g) this).field_o.c((byte) 67);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    ((g) this).field_v.h(0);
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
                  ((g) this).field_c = ((g) this).field_c + 1;
                  ((g) this).field_b = -2;
                  ((g) this).field_v = null;
                  if (0 != ((g) this).f(1)) {
                    break L26;
                  } else {
                    if (((g) this).e(-64) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_88_0 != 0;
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
        field_s = 0;
        field_t = "Fleas get in each others' way, and can even climb over each other. If you have too many fleas together, be careful, as they can sometimes overflow out of the confined space they are in. On some levels you need to do this to win!";
        field_u = 0.0;
    }
}
