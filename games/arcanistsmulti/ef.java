/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ef extends lk {
    static String field_s;
    static int field_t;
    static String field_v;
    static String field_q;
    private k field_w;
    static boolean field_r;
    static vn field_u;

    final void a(byte param0) {
        try {
            ((ef) this).field_w.d(param0 ^ -23482);
        } catch (Exception exception) {
        }
        ((ef) this).field_o = -1;
        if (param0 != 0) {
            field_q = null;
        }
        ((ef) this).field_w = null;
        ((ef) this).field_i = ((ef) this).field_i + 1;
        ((ef) this).field_a = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    private final void a(int param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            wk stackIn_4_0 = null;
            wk stackIn_5_0 = null;
            wk stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            Throwable decompiledCaughtException = null;
            wk stackOut_3_0 = null;
            wk stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            wk stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            if (((ef) this).field_w == null) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((ef) this).field_c.field_g = 0;
                    stackOut_3_0 = ((ef) this).field_c;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (!param1) {
                      stackOut_5_0 = (wk) (Object) stackIn_5_0;
                      stackOut_5_1 = 3;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      break L1;
                    } else {
                      stackOut_4_0 = (wk) (Object) stackIn_4_0;
                      stackOut_4_1 = 2;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      break L1;
                    }
                  }
                  ((wk) (Object) stackIn_6_0).f(stackIn_6_1, (byte) -62);
                  ((ef) this).field_c.a((byte) -118, 0L);
                  ((ef) this).field_w.a(((ef) this).field_c.field_j.length, 0, (byte) 122, ((ef) this).field_c.field_j);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L3: {
                      ((ef) this).field_w.d(-23482);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  ((ef) this).field_o = -2;
                  ((ef) this).field_i = ((ef) this).field_i + 1;
                  ((ef) this).field_w = null;
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

    final void c(int param0) {
        if (param0 != 16711422) {
            return;
        }
        if (!(null == ((ef) this).field_w)) {
            ((ef) this).field_w.d(param0 ^ -16688456);
        }
    }

    final void a(boolean param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            vk var4_ref3 = null;
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
            var6 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (((ef) this).field_w != null) {
                    try {
                      L2: {
                        ((ef) this).field_w.d(-23482);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((ef) this).field_w = null;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ef) this).field_w = (k) param2;
                this.d((byte) 113);
                this.a(-101, param0);
                ((ef) this).field_n = null;
                ((ef) this).field_e.field_g = 0;
                L4: while (true) {
                  var4_ref3 = (vk) (Object) ((ef) this).field_g.a((byte) 118);
                  if (var4_ref3 == null) {
                    L5: while (true) {
                      var4_ref3 = (vk) (Object) ((ef) this).field_m.a((byte) 124);
                      if (var4_ref3 == null) {
                        L6: {
                          if (((ef) this).field_a == 0) {
                            break L6;
                          } else {
                            {
                              L7: {
                                ((ef) this).field_c.field_g = 0;
                                ((ef) this).field_c.f(4, (byte) -116);
                                ((ef) this).field_c.f((int) ((ef) this).field_a, (byte) -67);
                                ((ef) this).field_c.a(0, (byte) -101);
                                ((ef) this).field_w.a(((ef) this).field_c.field_j.length, 0, (byte) 122, ((ef) this).field_c.field_j);
                                break L7;
                              }
                            }
                            break L6;
                          }
                        }
                        L11: {
                          ((ef) this).field_k = 0;
                          if (param1) {
                            break L11;
                          } else {
                            field_q = null;
                            break L11;
                          }
                        }
                        ((ef) this).field_p = qj.b(-26572);
                        break L0;
                      } else {
                        ((ef) this).field_f.a((tf) (Object) var4_ref3, 15893);
                        continue L5;
                      }
                    }
                  } else {
                    ((ef) this).field_b.a((tf) (Object) var4_ref3, 15893);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_24_0 = (RuntimeException) var4_ref2;
                stackOut_24_1 = new StringBuilder().append("ef.G(").append(param0).append(',').append(param1).append(',');
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
              throw aa.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ll a(int[] param0, byte param1, ll param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ll var4 = null;
        ll stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ll stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = -15;
            var4 = new ll(0, 0, 0);
            var4.field_m = param2.field_m;
            var4.field_j = param2.field_j;
            var4.field_f = param2.field_f;
            var4.field_k = param2.field_k;
            var4.field_l = param0;
            var4.field_c = param2.field_c;
            var4.field_h = param2.field_h;
            var4.field_g = param2.field_g;
            stackOut_0_0 = (ll) var4;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ef.A(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(-59).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_1_0;
    }

    final boolean e(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            vk var2_ref = null;
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
            vk var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_51_0 = 0;
            int stackIn_68_0 = 0;
            int stackIn_92_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_50_0 = 0;
            int stackOut_49_0 = 0;
            int stackOut_67_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_91_0 = 0;
            L0: {
              var16 = ArcanistsMulti.field_G ? 1 : 0;
              if (((ef) this).field_w != null) {
                L1: {
                  var2_long = qj.b(-26572);
                  var4 = (int)(-((ef) this).field_p + var2_long);
                  ((ef) this).field_p = var2_long;
                  if (200 < var4) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ef) this).field_k = ((ef) this).field_k + var4;
                if (((ef) this).field_k <= 30000) {
                  break L0;
                } else {
                  try {
                    L2: {
                      ((ef) this).field_w.d(-23482);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((ef) this).field_w = null;
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (null == ((ef) this).field_w) {
              L4: {
                if (((ef) this).b((byte) 88) != 0) {
                  break L4;
                } else {
                  if (((ef) this).a(-89) != 0) {
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
                  ((ef) this).field_w.a(false);
                  var2_ref = (vk) (Object) ((ef) this).field_b.b(96);
                  L6: while (true) {
                    if (var2_ref == null) {
                      L7: {
                        if (param0 == -3145) {
                          break L7;
                        } else {
                          ((ef) this).c(80);
                          break L7;
                        }
                      }
                      var2_ref = (vk) (Object) ((ef) this).field_f.b(63);
                      L8: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L9: while (true) {
                            L10: {
                              if (var2_int >= 100) {
                                break L10;
                              } else {
                                var3_int = ((ef) this).field_w.b(param0 ^ -3145);
                                if (0 > var3_int) {
                                  throw new IOException();
                                } else {
                                  if (var3_int == 0) {
                                    break L10;
                                  } else {
                                    L11: {
                                      ((ef) this).field_k = 0;
                                      var4 = 0;
                                      if (null == ((ef) this).field_n) {
                                        var4 = 10;
                                        break L11;
                                      } else {
                                        if (((ef) this).field_n.field_x == 0) {
                                          var4 = 1;
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (var4 <= 0) {
                                        L13: {
                                          var5 = ((ef) this).field_n.field_A.field_j.length + -((ef) this).field_n.field_y;
                                          var6 = -((ef) this).field_n.field_x + 512;
                                          if (var6 <= -((ef) this).field_n.field_A.field_g + var5) {
                                            break L13;
                                          } else {
                                            var6 = -((ef) this).field_n.field_A.field_g + var5;
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          if (var6 > var3_int) {
                                            var6 = var3_int;
                                            break L14;
                                          } else {
                                            break L14;
                                          }
                                        }
                                        L15: {
                                          ((ef) this).field_w.a(((ef) this).field_n.field_A.field_j, (byte) -123, ((ef) this).field_n.field_A.field_g, var6);
                                          if (((ef) this).field_a != 0) {
                                            var17 = 0;
                                            var7 = var17;
                                            L16: while (true) {
                                              if (var6 <= var17) {
                                                break L15;
                                              } else {
                                                ((ef) this).field_n.field_A.field_j[((ef) this).field_n.field_A.field_g - -var17] = (byte)hh.a((int) ((ef) this).field_n.field_A.field_j[((ef) this).field_n.field_A.field_g + var17], (int) ((ef) this).field_a);
                                                var17++;
                                                continue L16;
                                              }
                                            }
                                          } else {
                                            break L15;
                                          }
                                        }
                                        ((ef) this).field_n.field_x = ((ef) this).field_n.field_x + var6;
                                        ((ef) this).field_n.field_A.field_g = ((ef) this).field_n.field_A.field_g + var6;
                                        if (~var5 == ~((ef) this).field_n.field_A.field_g) {
                                          ((ef) this).field_n.a((byte) 88);
                                          ((ef) this).field_n.field_p = false;
                                          ((ef) this).field_n = null;
                                          break L12;
                                        } else {
                                          if (((ef) this).field_n.field_x == 512) {
                                            ((ef) this).field_n.field_x = 0;
                                            break L12;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      } else {
                                        L17: {
                                          var5 = var4 - ((ef) this).field_e.field_g;
                                          if (var3_int < var5) {
                                            var5 = var3_int;
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        L18: {
                                          ((ef) this).field_w.a(((ef) this).field_e.field_j, (byte) -125, ((ef) this).field_e.field_g, var5);
                                          if (0 != ((ef) this).field_a) {
                                            var6 = 0;
                                            L19: while (true) {
                                              if (~var5 >= ~var6) {
                                                break L18;
                                              } else {
                                                ((ef) this).field_e.field_j[((ef) this).field_e.field_g + var6] = (byte)hh.a((int) ((ef) this).field_e.field_j[((ef) this).field_e.field_g + var6], (int) ((ef) this).field_a);
                                                var6++;
                                                continue L19;
                                              }
                                            }
                                          } else {
                                            break L18;
                                          }
                                        }
                                        ((ef) this).field_e.field_g = ((ef) this).field_e.field_g + var5;
                                        if (~((ef) this).field_e.field_g <= ~var4) {
                                          if (((ef) this).field_n == null) {
                                            L20: {
                                              ((ef) this).field_e.field_g = 0;
                                              var6 = ((ef) this).field_e.e((byte) -104);
                                              var7 = ((ef) this).field_e.d(-10674);
                                              var8 = ((ef) this).field_e.e((byte) 63);
                                              var9 = ((ef) this).field_e.d(-10674);
                                              var10 = var8 & 127;
                                              if ((var8 & 128) == 0) {
                                                stackOut_50_0 = 0;
                                                stackIn_51_0 = stackOut_50_0;
                                                break L20;
                                              } else {
                                                stackOut_49_0 = 1;
                                                stackIn_51_0 = stackOut_49_0;
                                                break L20;
                                              }
                                            }
                                            L21: {
                                              var11 = stackIn_51_0;
                                              var12 = (long)var7 + ((long)var6 << 32);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (vk) (Object) ((ef) this).field_g.b(54);
                                                L22: while (true) {
                                                  if (var14_ref == null) {
                                                    break L21;
                                                  } else {
                                                    if (~var14_ref.field_k != ~var12) {
                                                      var14_ref = (vk) (Object) ((ef) this).field_g.e(124);
                                                      continue L22;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (vk) (Object) ((ef) this).field_m.b(54);
                                                L23: while (true) {
                                                  if (var14_ref == null) {
                                                    break L21;
                                                  } else {
                                                    if (~var12 != ~var14_ref.field_k) {
                                                      var14_ref = (vk) (Object) ((ef) this).field_m.e(-6);
                                                      continue L23;
                                                    } else {
                                                      break L21;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref == null) {
                                              throw new IOException();
                                            } else {
                                              L24: {
                                                ((ef) this).field_n = var14_ref;
                                                if (var10 != 0) {
                                                  stackOut_67_0 = 9;
                                                  stackIn_68_0 = stackOut_67_0;
                                                  break L24;
                                                } else {
                                                  stackOut_66_0 = 5;
                                                  stackIn_68_0 = stackOut_66_0;
                                                  break L24;
                                                }
                                              }
                                              var15 = stackIn_68_0;
                                              ((ef) this).field_n.field_A = new wk(var15 + (var9 - -((ef) this).field_n.field_y));
                                              ((ef) this).field_n.field_A.f(var10, (byte) -62);
                                              ((ef) this).field_n.field_A.a(var9, (byte) -101);
                                              ((ef) this).field_e.field_g = 0;
                                              ((ef) this).field_n.field_x = 10;
                                              break L12;
                                            }
                                          } else {
                                            if (((ef) this).field_n.field_x == 0) {
                                              if (-1 == ((ef) this).field_e.field_j[0]) {
                                                ((ef) this).field_e.field_g = 0;
                                                ((ef) this).field_n.field_x = 1;
                                                break L12;
                                              } else {
                                                ((ef) this).field_n = null;
                                                break L12;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L9;
                                  }
                                }
                              }
                            }
                            stackOut_91_0 = 1;
                            stackIn_92_0 = stackOut_91_0;
                            break L5;
                          }
                        } else {
                          ((ef) this).field_c.field_g = 0;
                          ((ef) this).field_c.f(0, (byte) -68);
                          ((ef) this).field_c.a((byte) -121, var2_ref.field_k);
                          ((ef) this).field_w.a(((ef) this).field_c.field_j.length, 0, (byte) 116, ((ef) this).field_c.field_j);
                          ((ef) this).field_m.a((tf) (Object) var2_ref, 15893);
                          var2_ref = (vk) (Object) ((ef) this).field_f.e(param0 + 3265);
                          continue L8;
                        }
                      }
                    } else {
                      ((ef) this).field_c.field_g = 0;
                      ((ef) this).field_c.f(1, (byte) -64);
                      ((ef) this).field_c.a((byte) -127, var2_ref.field_k);
                      ((ef) this).field_w.a(((ef) this).field_c.field_j.length, 0, (byte) 116, ((ef) this).field_c.field_j);
                      ((ef) this).field_g.a((tf) (Object) var2_ref, 15893);
                      var2_ref = (vk) (Object) ((ef) this).field_b.e(-30);
                      continue L6;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L25: {
                    ((ef) this).field_w.d(-23482);
                    break L25;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L26: {
                    var3 = (Exception) (Object) decompiledCaughtException;
                    break L26;
                  }
                }
                ((ef) this).field_w = null;
                ((ef) this).field_o = -2;
                ((ef) this).field_i = ((ef) this).field_i + 1;
                if (((ef) this).b((byte) 88) != 0) {
                  return false;
                } else {
                  if (((ef) this).a(-120) == 0) {
                    return true;
                  } else {
                    return false;
                  }
                }
              }
              return stackIn_92_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ef() {
    }

    private final void d(byte param0) {
        try {
            int var2_int = 0;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((ef) this).field_w != null) {
              {
                L0: {
                  ((ef) this).field_c.field_g = 0;
                  ((ef) this).field_c.f(6, (byte) -18);
                  var2_int = 0;
                  ((ef) this).field_c.a((byte) -120, 3);
                  ((ef) this).field_c.c(0, (byte) -66);
                  ((ef) this).field_w.a(((ef) this).field_c.field_j.length, 0, (byte) 117, ((ef) this).field_c.field_j);
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

    public static void g(int param0) {
        field_u = null;
        field_q = null;
        field_s = null;
        field_v = null;
        if (param0 != -1) {
            ef.g(65);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Game options changed (<%0>)";
        field_s = "Quick Chat game";
        field_q = "Rating";
        field_r = true;
        field_u = new vn();
    }
}
