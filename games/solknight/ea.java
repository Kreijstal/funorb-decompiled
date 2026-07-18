/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ea extends va {
    private ad field_r;
    static String field_q;
    static int[] field_p;
    static int field_o;

    final void a(boolean param0, byte param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            ic var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_29_0 = null;
            StringBuilder stackIn_29_1 = null;
            String stackIn_29_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            String stackOut_27_2 = null;
            var6 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (((ea) this).field_r != null) {
                    try {
                      L2: {
                        ((ea) this).field_r.d(param1 + -104);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((ea) this).field_r = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L4: {
                  ((ea) this).field_r = (ad) param2;
                  if (param1 == 106) {
                    break L4;
                  } else {
                    this.c(false);
                    break L4;
                  }
                }
                this.c(true);
                this.a(param0, false);
                ((ea) this).field_a = null;
                ((ea) this).field_h.field_m = 0;
                L5: while (true) {
                  var4_ref3 = (ic) (Object) ((ea) this).field_i.c(param1 ^ 106);
                  if (var4_ref3 != null) {
                    ((ea) this).field_m.a((ec) (Object) var4_ref3, 0);
                    continue L5;
                  } else {
                    L6: while (true) {
                      var4_ref3 = (ic) (Object) ((ea) this).field_k.c(0);
                      if (var4_ref3 == null) {
                        L7: {
                          if (((ea) this).field_n != 0) {
                            {
                              L8: {
                                ((ea) this).field_e.field_m = 0;
                                ((ea) this).field_e.c(95, 4);
                                ((ea) this).field_e.c(7, (int) ((ea) this).field_n);
                                ((ea) this).field_e.b(0, false);
                                ((ea) this).field_r.a(-28748, 0, ((ea) this).field_e.field_l.length, ((ea) this).field_e.field_l);
                                break L8;
                              }
                            }
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        ((ea) this).field_j = 0;
                        ((ea) this).field_b = je.a(1);
                        break L0;
                      } else {
                        ((ea) this).field_d.a((ec) (Object) var4_ref3, 0);
                        continue L6;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_26_0 = (RuntimeException) var4_ref2;
                stackOut_26_1 = new StringBuilder().append("ea.K(").append(param0).append(',').append(param1).append(',');
                stackIn_28_0 = stackOut_26_0;
                stackIn_28_1 = stackOut_26_1;
                stackIn_27_0 = stackOut_26_0;
                stackIn_27_1 = stackOut_26_1;
                if (param2 == null) {
                  stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                  stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                  stackOut_28_2 = "null";
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  stackIn_29_2 = stackOut_28_2;
                  break L12;
                } else {
                  stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                  stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                  stackOut_27_2 = "{...}";
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  stackIn_29_2 = stackOut_27_2;
                  break L12;
                }
              }
              throw fc.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static od e() {
        int var1 = -72;
        od var2 = new od(kl.field_a, we.field_e, ph.field_h[0], qf.field_d[0], sa.field_l[0], uj.field_b[0], jc.field_c[0], ig.field_H);
        int discarded$0 = -97;
        og.a();
        return var2;
    }

    public static void d() {
        field_p = null;
        field_q = null;
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            gb stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            gb stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            gb stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            gb stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            gb stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            gb stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            if (((ea) this).field_r == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((ea) this).field_e.field_m = 0;
                    stackOut_3_0 = ((ea) this).field_e;
                    stackOut_3_1 = 31;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (param0) {
                      stackOut_5_0 = (gb) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 2;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L1;
                    } else {
                      stackOut_4_0 = (gb) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 3;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L1;
                    }
                  }
                  ((gb) (Object) stackIn_6_0).c(stackIn_6_1, stackIn_6_2);
                  ((ea) this).field_e.a(0L, 25576);
                  ((ea) this).field_r.a(-28748, 0, ((ea) this).field_e.field_l.length, ((ea) this).field_e.field_l);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((ea) this).field_r.d(2);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((ea) this).field_l = ((ea) this).field_l + 1;
                  ((ea) this).field_c = -2;
                  ((ea) this).field_r = null;
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

    final boolean d(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            ic var2_ref = null;
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
            ic var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_48_0 = 0;
            int stackIn_63_0 = 0;
            int stackIn_85_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_84_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_62_0 = 0;
            int stackOut_61_0 = 0;
            L0: {
              var16 = SolKnight.field_L ? 1 : 0;
              if (null == ((ea) this).field_r) {
                break L0;
              } else {
                L1: {
                  var2_long = je.a(1);
                  var4 = (int)(-((ea) this).field_b + var2_long);
                  ((ea) this).field_b = var2_long;
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ea) this).field_j = ((ea) this).field_j + var4;
                if (((ea) this).field_j > 30000) {
                  try {
                    L2: {
                      ((ea) this).field_r.d(2);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((ea) this).field_r = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (null == ((ea) this).field_r) {
              L4: {
                if (0 != ((ea) this).b(false)) {
                  break L4;
                } else {
                  if (((ea) this).c(param0 ^ -25) != 0) {
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
                  ((ea) this).field_r.a(true);
                  var2_ref = (ic) (Object) ((ea) this).field_m.d(122);
                  L6: while (true) {
                    if (var2_ref == null) {
                      L7: {
                        if (param0 == 0) {
                          break L7;
                        } else {
                          int discarded$1 = 0;
                          ea.d();
                          break L7;
                        }
                      }
                      var2_ref = (ic) (Object) ((ea) this).field_d.d(123);
                      L8: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L9: while (true) {
                            if (var2_int >= 100) {
                              stackOut_84_0 = 1;
                              stackIn_85_0 = stackOut_84_0;
                              break L5;
                            } else {
                              var3_int = ((ea) this).field_r.b(-30119);
                              if (0 <= var3_int) {
                                if (var3_int != 0) {
                                  L10: {
                                    ((ea) this).field_j = 0;
                                    var4 = 0;
                                    if (null == ((ea) this).field_a) {
                                      var4 = 10;
                                      break L10;
                                    } else {
                                      if (0 != ((ea) this).field_a.field_s) {
                                        break L10;
                                      } else {
                                        var4 = 1;
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (var4 <= 0) {
                                      L12: {
                                        var5 = -((ea) this).field_a.field_y + ((ea) this).field_a.field_v.field_l.length;
                                        var6 = -((ea) this).field_a.field_s + 512;
                                        if (~(-((ea) this).field_a.field_v.field_m + var5) <= ~var6) {
                                          break L12;
                                        } else {
                                          var6 = -((ea) this).field_a.field_v.field_m + var5;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        if (var6 > var3_int) {
                                          var6 = var3_int;
                                          break L13;
                                        } else {
                                          break L13;
                                        }
                                      }
                                      L14: {
                                        ((ea) this).field_r.a((byte) 44, ((ea) this).field_a.field_v.field_m, var6, ((ea) this).field_a.field_v.field_l);
                                        if (((ea) this).field_n != 0) {
                                          var17 = 0;
                                          var7 = var17;
                                          L15: while (true) {
                                            if (~var6 >= ~var17) {
                                              break L14;
                                            } else {
                                              ((ea) this).field_a.field_v.field_l[((ea) this).field_a.field_v.field_m + var17] = (byte)wa.a((int) ((ea) this).field_a.field_v.field_l[((ea) this).field_a.field_v.field_m + var17], (int) ((ea) this).field_n);
                                              var17++;
                                              continue L15;
                                            }
                                          }
                                        } else {
                                          break L14;
                                        }
                                      }
                                      ((ea) this).field_a.field_v.field_m = ((ea) this).field_a.field_v.field_m + var6;
                                      ((ea) this).field_a.field_s = ((ea) this).field_a.field_s + var6;
                                      if (~var5 != ~((ea) this).field_a.field_v.field_m) {
                                        if (((ea) this).field_a.field_s != 512) {
                                          break L11;
                                        } else {
                                          ((ea) this).field_a.field_s = 0;
                                          break L11;
                                        }
                                      } else {
                                        ((ea) this).field_a.a(97);
                                        ((ea) this).field_a.field_m = false;
                                        ((ea) this).field_a = null;
                                        break L11;
                                      }
                                    } else {
                                      L16: {
                                        var5 = -((ea) this).field_h.field_m + var4;
                                        if (~var5 < ~var3_int) {
                                          var5 = var3_int;
                                          break L16;
                                        } else {
                                          break L16;
                                        }
                                      }
                                      L17: {
                                        ((ea) this).field_r.a((byte) 39, ((ea) this).field_h.field_m, var5, ((ea) this).field_h.field_l);
                                        if (((ea) this).field_n == 0) {
                                          break L17;
                                        } else {
                                          var6 = 0;
                                          L18: while (true) {
                                            if (var6 >= var5) {
                                              break L17;
                                            } else {
                                              ((ea) this).field_h.field_l[var6 + ((ea) this).field_h.field_m] = (byte)wa.a((int) ((ea) this).field_h.field_l[var6 + ((ea) this).field_h.field_m], (int) ((ea) this).field_n);
                                              var6++;
                                              continue L18;
                                            }
                                          }
                                        }
                                      }
                                      ((ea) this).field_h.field_m = ((ea) this).field_h.field_m + var5;
                                      if (~((ea) this).field_h.field_m <= ~var4) {
                                        if (((ea) this).field_a != null) {
                                          if (((ea) this).field_a.field_s != 0) {
                                            throw new IOException();
                                          } else {
                                            if (((ea) this).field_h.field_l[0] != -1) {
                                              ((ea) this).field_a = null;
                                              break L11;
                                            } else {
                                              ((ea) this).field_h.field_m = 0;
                                              ((ea) this).field_a.field_s = 1;
                                              break L11;
                                            }
                                          }
                                        } else {
                                          L19: {
                                            ((ea) this).field_h.field_m = 0;
                                            var6 = ((ea) this).field_h.j(255);
                                            var7 = ((ea) this).field_h.e(true);
                                            var8 = ((ea) this).field_h.j(255);
                                            var9 = ((ea) this).field_h.e(true);
                                            var10 = var8 & 127;
                                            if ((128 & var8) == 0) {
                                              stackOut_47_0 = 0;
                                              stackIn_48_0 = stackOut_47_0;
                                              break L19;
                                            } else {
                                              stackOut_46_0 = 1;
                                              stackIn_48_0 = stackOut_46_0;
                                              break L19;
                                            }
                                          }
                                          L20: {
                                            var11 = stackIn_48_0;
                                            var12 = (long)var7 + ((long)var6 << 32);
                                            var14 = null;
                                            if (var11 == 0) {
                                              var14_ref = (ic) (Object) ((ea) this).field_i.d(124);
                                              L21: while (true) {
                                                if (var14_ref == null) {
                                                  break L20;
                                                } else {
                                                  if (~var14_ref.field_l == ~var12) {
                                                    break L20;
                                                  } else {
                                                    var14_ref = (ic) (Object) ((ea) this).field_i.b(-1);
                                                    continue L21;
                                                  }
                                                }
                                              }
                                            } else {
                                              var14_ref = (ic) (Object) ((ea) this).field_k.d(122);
                                              L22: while (true) {
                                                if (var14_ref == null) {
                                                  break L20;
                                                } else {
                                                  if (~var12 == ~var14_ref.field_l) {
                                                    break L20;
                                                  } else {
                                                    var14_ref = (ic) (Object) ((ea) this).field_k.b(-1);
                                                    continue L22;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          if (var14_ref == null) {
                                            throw new IOException();
                                          } else {
                                            L23: {
                                              if (0 != var10) {
                                                stackOut_62_0 = 9;
                                                stackIn_63_0 = stackOut_62_0;
                                                break L23;
                                              } else {
                                                stackOut_61_0 = 5;
                                                stackIn_63_0 = stackOut_61_0;
                                                break L23;
                                              }
                                            }
                                            var15 = stackIn_63_0;
                                            ((ea) this).field_a = var14_ref;
                                            ((ea) this).field_a.field_v = new gb(var9 + (var15 - -((ea) this).field_a.field_y));
                                            ((ea) this).field_a.field_v.c(param0 + 53, var10);
                                            ((ea) this).field_a.field_v.b(var9, false);
                                            ((ea) this).field_h.field_m = 0;
                                            ((ea) this).field_a.field_s = 10;
                                            break L11;
                                          }
                                        }
                                      } else {
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
                          ((ea) this).field_e.field_m = 0;
                          ((ea) this).field_e.c(117, 0);
                          ((ea) this).field_e.a(var2_ref.field_l, 25576);
                          ((ea) this).field_r.a(param0 ^ -28748, 0, ((ea) this).field_e.field_l.length, ((ea) this).field_e.field_l);
                          ((ea) this).field_k.a((ec) (Object) var2_ref, 0);
                          var2_ref = (ic) (Object) ((ea) this).field_d.b(-1);
                          continue L8;
                        }
                      }
                    } else {
                      ((ea) this).field_e.field_m = 0;
                      ((ea) this).field_e.c(param0 ^ 71, 1);
                      ((ea) this).field_e.a(var2_ref.field_l, param0 ^ 25576);
                      ((ea) this).field_r.a(-28748, 0, ((ea) this).field_e.field_l.length, ((ea) this).field_e.field_l);
                      ((ea) this).field_i.a((ec) (Object) var2_ref, 0);
                      var2_ref = (ic) (Object) ((ea) this).field_m.b(~param0);
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    ((ea) this).field_r.d(param0 + 2);
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
                  ((ea) this).field_r = null;
                  ((ea) this).field_c = -2;
                  ((ea) this).field_l = ((ea) this).field_l + 1;
                  if (0 != ((ea) this).b(false)) {
                    break L26;
                  } else {
                    if (((ea) this).c(param0 ^ -128) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_85_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(boolean param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((ea) this).field_r == null) {
              return;
            } else {
              {
                L0: {
                  ((ea) this).field_e.field_m = 0;
                  ((ea) this).field_e.c(-128, 6);
                  ((ea) this).field_e.d(3, 2132504424);
                  ((ea) this).field_e.a(param0, 0);
                  ((ea) this).field_r.a(-28748, 0, ((ea) this).field_e.field_l.length, ((ea) this).field_e.field_l);
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

    final void c(byte param0) {
        try {
            ((ea) this).field_r.d(2);
        } catch (Exception exception) {
        }
        ((ea) this).field_l = ((ea) this).field_l + 1;
        ((ea) this).field_r = null;
        if (param0 != 59) {
            return;
        }
        ((ea) this).field_c = -1;
        ((ea) this).field_n = (byte)(int)(255.0 * Math.random() + 1.0);
    }

    public ea() {
    }

    final void a(byte param0) {
        if (param0 != 92) {
            field_q = null;
        }
        if (!(null == ((ea) this).field_r)) {
            ((ea) this).field_r.d(2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Instructions";
        field_p = new int[]{96, 96, 96, 112, 124, 192, 96, 96};
    }
}
