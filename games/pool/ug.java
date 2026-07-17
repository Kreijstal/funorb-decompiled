/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ug extends no {
    static ml field_v;
    static vh field_x;
    static int field_u;
    private vb field_w;

    private final void f(int param0) {
        try {
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (null != ((ug) this).field_w) {
              {
                L0: {
                  ((ug) this).field_r.field_v = 0;
                  ((ug) this).field_r.a(6, false);
                  ((ug) this).field_r.b(3, 99);
                  ((ug) this).field_r.a((byte) -81, 0);
                  ((ug) this).field_w.a(((ug) this).field_r.field_t, (byte) -105, ((ug) this).field_r.field_t.length, 0);
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

    final void a(byte param0) {
        try {
            ((ug) this).field_w.c(-98);
        } catch (Exception exception) {
        }
        ((ug) this).field_a = -1;
        if (param0 >= -4) {
            ((ug) this).field_w = null;
        }
        ((ug) this).field_e = ((ug) this).field_e + 1;
        ((ug) this).field_w = null;
        ((ug) this).field_c = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static ko a(int[] param0, int param1, String param2, int param3, lr param4, boolean param5, int param6) {
        RuntimeException var7 = null;
        String[] var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        String[] var12 = null;
        int var13 = 0;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        gi var19 = null;
        gi var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        ko var26 = null;
        Object stackIn_2_0 = null;
        ko stackIn_42_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_49_2 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        ko stackOut_41_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        try {
          L0: {
            var26 = new ko();
            var8 = new String[100];
            if (param5) {
              var9 = param4.a(param2, new int[1], var8);
              var10 = param2.toLowerCase();
              var11 = 0;
              L1: while (true) {
                if (var11 >= lb.field_P.length) {
                  stackOut_41_0 = (ko) var26;
                  stackIn_42_0 = stackOut_41_0;
                  break L0;
                } else {
                  var12 = lb.field_P[var11];
                  var13 = 0;
                  L2: while (true) {
                    if (var12.length <= var13) {
                      var11++;
                      continue L1;
                    } else {
                      L3: {
                        var14 = var12[var13];
                        if (var14 == null) {
                          break L3;
                        } else {
                          var15 = var14.length();
                          if (var15 == 0) {
                            break L3;
                          } else {
                            var16 = var10.indexOf(var14);
                            L4: while (true) {
                              if (-1 == var16) {
                                break L3;
                              } else {
                                L5: {
                                  L6: {
                                    if (var16 <= 0) {
                                      break L6;
                                    } else {
                                      if (vq.a(var10.charAt(-1 + var16), 22987)) {
                                        break L5;
                                      } else {
                                        if (35 != var10.charAt(-1 + var16)) {
                                          break L6;
                                        } else {
                                          var16 = var10.indexOf(var14, var16 - -1);
                                          continue L4;
                                        }
                                      }
                                    }
                                  }
                                  L7: {
                                    if (var10.length() <= var15 + var16) {
                                      break L7;
                                    } else {
                                      if (!vq.a(var10.charAt(var16 - -var15), 22987)) {
                                        break L7;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  var17 = var15 + var16;
                                  var18 = 0;
                                  var19 = new gi(var11);
                                  var20 = var19;
                                  var21 = 0;
                                  var22 = param3;
                                  L8: while (true) {
                                    L9: {
                                      if (var21 >= var9) {
                                        break L9;
                                      } else {
                                        L10: {
                                          L11: {
                                            var23 = var8[var21].length();
                                            var24 = param0[(-1 + (var21 - -param0.length)) % param0.length];
                                            if (var18 > var16) {
                                              break L11;
                                            } else {
                                              if (var18 + var23 <= var16) {
                                                break L11;
                                              } else {
                                                L12: {
                                                  var25 = param4.b(var8[var21].substring(0, var16 + -var18));
                                                  var20.field_r = 1 + param4.field_C - -param4.field_w;
                                                  var20.field_m = param6 + var25;
                                                  var20.field_q = var22;
                                                  if (var17 < var18) {
                                                    break L12;
                                                  } else {
                                                    if (var23 + var18 < var17) {
                                                      break L12;
                                                    } else {
                                                      var20.field_l = param4.b(var8[var21].substring(-var18 + var16, var17 - var18));
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                var20.field_l = param4.b(var8[var21].substring(var16 - var18));
                                                var20.field_s = new gi(var20.field_p);
                                                var20 = var20.field_s;
                                                break L10;
                                              }
                                            }
                                          }
                                          L13: {
                                            if (var18 > var17) {
                                              break L13;
                                            } else {
                                              if (var17 < var23 + var18) {
                                                var25 = param4.b(var8[var21].substring(0, -var18 + var17));
                                                var20.field_m = param6;
                                                var20.field_l = var25;
                                                var20.field_q = var22;
                                                var20.field_r = var24;
                                                break L9;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          if (var16 >= var18) {
                                            break L10;
                                          } else {
                                            if (var18 + var23 >= var17) {
                                              break L10;
                                            } else {
                                              var20.field_l = param1;
                                              var20.field_m = param6;
                                              var20.field_r = var24;
                                              var20.field_q = var22;
                                              var20.field_s = new gi(var20.field_p);
                                              var20 = var20.field_s;
                                              break L10;
                                            }
                                          }
                                        }
                                        L14: {
                                          if (var8[var21].endsWith("<br>")) {
                                            var18 = var18 + var23;
                                            break L14;
                                          } else {
                                            var18 = var18 + (var23 + 1);
                                            break L14;
                                          }
                                        }
                                        var21++;
                                        var22 = var22 + param0[var21 % param0.length];
                                        continue L8;
                                      }
                                    }
                                    var26.b((byte) 116, (ma) (Object) var19);
                                    break L5;
                                  }
                                }
                                var16 = var10.indexOf(var14, var16 - -1);
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                      var13++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ko) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var7;
            stackOut_43_1 = new StringBuilder().append("ug.G(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L15;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L15;
            }
          }
          L16: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(44).append(param1).append(44);
            stackIn_48_0 = stackOut_46_0;
            stackIn_48_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param2 == null) {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "null";
              stackIn_49_0 = stackOut_48_0;
              stackIn_49_1 = stackOut_48_1;
              stackIn_49_2 = stackOut_48_2;
              break L16;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_49_0 = stackOut_47_0;
              stackIn_49_1 = stackOut_47_1;
              stackIn_49_2 = stackOut_47_2;
              break L16;
            }
          }
          L17: {
            stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
            stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(44).append(param3).append(44);
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param4 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_42_0;
    }

    final static kb e(int param0) {
        return (kb) (Object) new hk();
    }

    private final void a(byte param0, boolean param1) {
        try {
            IOException iOException = null;
            Exception var4 = null;
            ge stackIn_5_0 = null;
            ge stackIn_6_0 = null;
            ge stackIn_7_0 = null;
            int stackIn_7_1 = 0;
            Throwable decompiledCaughtException = null;
            ge stackOut_4_0 = null;
            ge stackOut_6_0 = null;
            int stackOut_6_1 = 0;
            ge stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            if (((ug) this).field_w != null) {
              try {
                L0: {
                  L1: {
                    ((ug) this).field_r.field_v = 0;
                    if (param0 == 72) {
                      break L1;
                    } else {
                      this.a((byte) 2, true);
                      break L1;
                    }
                  }
                  L2: {
                    stackOut_4_0 = ((ug) this).field_r;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = (ge) (Object) stackIn_6_0;
                      stackOut_6_1 = 3;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = (ge) (Object) stackIn_5_0;
                      stackOut_5_1 = 2;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((ge) (Object) stackIn_7_0).a(stackIn_7_1, false);
                  ((ug) this).field_r.b(0L, 24136);
                  ((ug) this).field_w.a(((ug) this).field_r.field_t, (byte) -102, ((ug) this).field_r.field_t.length, 0);
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  iOException = (IOException) (Object) decompiledCaughtException;
                  try {
                    L4: {
                      ((ug) this).field_w.c(-83);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  ((ug) this).field_a = -2;
                  ((ug) this).field_w = null;
                  ((ug) this).field_e = ((ug) this).field_e + 1;
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

    final void a(int param0, boolean param1, Object param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            sp var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            var6 = Pool.field_O;
            try {
              L0: {
                L1: {
                  if (((ug) this).field_w == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ((ug) this).field_w.c(-112);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((ug) this).field_w = null;
                    break L1;
                  }
                }
                ((ug) this).field_w = (vb) param2;
                this.f(-55);
                this.a((byte) 72, param1);
                ((ug) this).field_p.field_v = 0;
                ((ug) this).field_i = null;
                L4: while (true) {
                  var4_ref3 = (sp) (Object) ((ug) this).field_f.a(0);
                  if (var4_ref3 == null) {
                    L5: while (true) {
                      var4_ref3 = (sp) (Object) ((ug) this).field_o.a(0);
                      if (var4_ref3 == null) {
                        L6: {
                          if (((ug) this).field_c == 0) {
                            break L6;
                          } else {
                            {
                              L7: {
                                ((ug) this).field_r.field_v = 0;
                                ((ug) this).field_r.a(4, false);
                                ((ug) this).field_r.a((int) ((ug) this).field_c, false);
                                ((ug) this).field_r.a(true, 0);
                                ((ug) this).field_w.a(((ug) this).field_r.field_t, (byte) -102, ((ug) this).field_r.field_t.length, 0);
                                break L7;
                              }
                            }
                            break L6;
                          }
                        }
                        ((ug) this).field_m = 0;
                        if (param0 > 8) {
                          ((ug) this).field_d = rl.a((byte) -117);
                          break L0;
                        } else {
                          return;
                        }
                      } else {
                        ((ug) this).field_t.a((rg) (Object) var4_ref3, false);
                        continue L5;
                      }
                    }
                  } else {
                    ((ug) this).field_j.a((rg) (Object) var4_ref3, false);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L11: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) var4_ref2;
                stackOut_23_1 = new StringBuilder().append("ug.H(").append(param0).append(44).append(param1).append(44);
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param2 == null) {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "null";
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L11;
                } else {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "{...}";
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  break L11;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void h(int param0) {
        if (param0 > -60) {
            return;
        }
        field_x = null;
        field_v = null;
    }

    final boolean d(int param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            sp var2_ref = null;
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
            sp var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            Object var17 = null;
            int stackIn_46_0 = 0;
            int stackIn_62_0 = 0;
            int stackIn_84_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_61_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_83_0 = 0;
            L0: {
              var16 = Pool.field_O;
              if (null == ((ug) this).field_w) {
                break L0;
              } else {
                L1: {
                  var2_long = rl.a((byte) -126);
                  var4 = (int)(-((ug) this).field_d + var2_long);
                  ((ug) this).field_d = var2_long;
                  if (200 < var4) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((ug) this).field_m = ((ug) this).field_m + var4;
                if (((ug) this).field_m > 30000) {
                  try {
                    L2: {
                      ((ug) this).field_w.c(-100);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((ug) this).field_w = null;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            if (((ug) this).field_w != null) {
              try {
                L4: {
                  ((ug) this).field_w.e(0);
                  var2_ref = (sp) (Object) ((ug) this).field_j.a((byte) -22);
                  L5: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (sp) (Object) ((ug) this).field_t.a((byte) 117);
                      L6: while (true) {
                        if (var2_ref == null) {
                          L7: {
                            if (param0 == -2147483648) {
                              break L7;
                            } else {
                              var17 = null;
                              ko discarded$1 = ug.a((int[]) null, 69, (String) null, 35, (lr) null, true, -63);
                              break L7;
                            }
                          }
                          var2_int = 0;
                          L8: while (true) {
                            L9: {
                              if (100 <= var2_int) {
                                break L9;
                              } else {
                                var3_int = ((ug) this).field_w.d(75);
                                if (0 <= var3_int) {
                                  if (var3_int == 0) {
                                    break L9;
                                  } else {
                                    L10: {
                                      ((ug) this).field_m = 0;
                                      var4 = 0;
                                      if (null == ((ug) this).field_i) {
                                        var4 = 10;
                                        break L10;
                                      } else {
                                        if (((ug) this).field_i.field_J == 0) {
                                          var4 = 1;
                                          break L10;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (var4 <= 0) {
                                        L12: {
                                          var5 = -((ug) this).field_i.field_L + ((ug) this).field_i.field_K.field_t.length;
                                          var6 = -((ug) this).field_i.field_J + 512;
                                          if (var5 + -((ug) this).field_i.field_K.field_v >= var6) {
                                            break L12;
                                          } else {
                                            var6 = -((ug) this).field_i.field_K.field_v + var5;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          if (var3_int >= var6) {
                                            break L13;
                                          } else {
                                            var6 = var3_int;
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          ((ug) this).field_w.a(var6, param0 + -2147483648, ((ug) this).field_i.field_K.field_v, ((ug) this).field_i.field_K.field_t);
                                          if (((ug) this).field_c != 0) {
                                            var7 = 0;
                                            L15: while (true) {
                                              if (var7 >= var6) {
                                                break L14;
                                              } else {
                                                ((ug) this).field_i.field_K.field_t[var7 + ((ug) this).field_i.field_K.field_v] = (byte)cq.a((int) ((ug) this).field_i.field_K.field_t[var7 + ((ug) this).field_i.field_K.field_v], (int) ((ug) this).field_c);
                                                var7++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            break L14;
                                          }
                                        }
                                        ((ug) this).field_i.field_K.field_v = ((ug) this).field_i.field_K.field_v + var6;
                                        ((ug) this).field_i.field_J = ((ug) this).field_i.field_J + var6;
                                        if (((ug) this).field_i.field_K.field_v == var5) {
                                          ((ug) this).field_i.a(false);
                                          ((ug) this).field_i.field_F = false;
                                          ((ug) this).field_i = null;
                                          break L11;
                                        } else {
                                          if (((ug) this).field_i.field_J != 512) {
                                            break L11;
                                          } else {
                                            ((ug) this).field_i.field_J = 0;
                                            break L11;
                                          }
                                        }
                                      } else {
                                        L16: {
                                          var5 = -((ug) this).field_p.field_v + var4;
                                          if (var3_int >= var5) {
                                            break L16;
                                          } else {
                                            var5 = var3_int;
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          ((ug) this).field_w.a(var5, 0, ((ug) this).field_p.field_v, ((ug) this).field_p.field_t);
                                          if (((ug) this).field_c == 0) {
                                            break L17;
                                          } else {
                                            var6 = 0;
                                            L18: while (true) {
                                              if (var5 <= var6) {
                                                break L17;
                                              } else {
                                                ((ug) this).field_p.field_t[((ug) this).field_p.field_v - -var6] = (byte)cq.a((int) ((ug) this).field_p.field_t[((ug) this).field_p.field_v + var6], (int) ((ug) this).field_c);
                                                var6++;
                                                continue L18;
                                              }
                                            }
                                          }
                                        }
                                        ((ug) this).field_p.field_v = ((ug) this).field_p.field_v + var5;
                                        if (((ug) this).field_p.field_v >= var4) {
                                          if (((ug) this).field_i != null) {
                                            if (((ug) this).field_i.field_J == 0) {
                                              if (((ug) this).field_p.field_t[0] == -1) {
                                                ((ug) this).field_i.field_J = 1;
                                                ((ug) this).field_p.field_v = 0;
                                                break L11;
                                              } else {
                                                ((ug) this).field_i = null;
                                                break L11;
                                              }
                                            } else {
                                              throw new IOException();
                                            }
                                          } else {
                                            L19: {
                                              ((ug) this).field_p.field_v = 0;
                                              var6 = ((ug) this).field_p.g(param0 + 2147483550);
                                              var7 = ((ug) this).field_p.b(true);
                                              var8 = ((ug) this).field_p.g(param0 + 2147483525);
                                              var9 = ((ug) this).field_p.b(true);
                                              var10 = var8 & 127;
                                              if (0 == (128 & var8)) {
                                                stackOut_45_0 = 0;
                                                stackIn_46_0 = stackOut_45_0;
                                                break L19;
                                              } else {
                                                stackOut_44_0 = 1;
                                                stackIn_46_0 = stackOut_44_0;
                                                break L19;
                                              }
                                            }
                                            L20: {
                                              var11 = stackIn_46_0;
                                              var12 = (long)var7 + ((long)var6 << 32);
                                              var14 = null;
                                              if (var11 == 0) {
                                                var14_ref = (sp) (Object) ((ug) this).field_f.a((byte) -113);
                                                L21: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if (~var12 != ~var14_ref.field_m) {
                                                      var14_ref = (sp) (Object) ((ug) this).field_f.b((byte) -87);
                                                      continue L21;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              } else {
                                                var14_ref = (sp) (Object) ((ug) this).field_o.a((byte) 96);
                                                L22: while (true) {
                                                  if (var14_ref == null) {
                                                    break L20;
                                                  } else {
                                                    if (var12 != var14_ref.field_m) {
                                                      var14_ref = (sp) (Object) ((ug) this).field_o.b((byte) -99);
                                                      continue L22;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            if (var14_ref != null) {
                                              L23: {
                                                if (var10 != 0) {
                                                  stackOut_61_0 = 9;
                                                  stackIn_62_0 = stackOut_61_0;
                                                  break L23;
                                                } else {
                                                  stackOut_60_0 = 5;
                                                  stackIn_62_0 = stackOut_60_0;
                                                  break L23;
                                                }
                                              }
                                              var15 = stackIn_62_0;
                                              ((ug) this).field_i = var14_ref;
                                              ((ug) this).field_i.field_K = new ge(var15 + (var9 + ((ug) this).field_i.field_L));
                                              ((ug) this).field_i.field_K.a(var10, false);
                                              ((ug) this).field_i.field_K.a(true, var9);
                                              ((ug) this).field_p.field_v = 0;
                                              ((ug) this).field_i.field_J = 10;
                                              break L11;
                                            } else {
                                              throw new IOException();
                                            }
                                          }
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    var2_int++;
                                    continue L8;
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
                          ((ug) this).field_r.field_v = 0;
                          ((ug) this).field_r.a(0, false);
                          ((ug) this).field_r.b(var2_ref.field_m, 24136);
                          ((ug) this).field_w.a(((ug) this).field_r.field_t, (byte) 55, ((ug) this).field_r.field_t.length, 0);
                          ((ug) this).field_o.a((rg) (Object) var2_ref, false);
                          var2_ref = (sp) (Object) ((ug) this).field_t.b((byte) -112);
                          continue L6;
                        }
                      }
                    } else {
                      ((ug) this).field_r.field_v = 0;
                      ((ug) this).field_r.a(1, false);
                      ((ug) this).field_r.b(var2_ref.field_m, 24136);
                      ((ug) this).field_w.a(((ug) this).field_r.field_t, (byte) -97, ((ug) this).field_r.field_t.length, 0);
                      ((ug) this).field_f.a((rg) (Object) var2_ref, false);
                      var2_ref = (sp) (Object) ((ug) this).field_j.b((byte) -116);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L24: {
                    ((ug) this).field_w.c(-128);
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
                  ((ug) this).field_e = ((ug) this).field_e + 1;
                  ((ug) this).field_w = null;
                  ((ug) this).field_a = -2;
                  if (((ug) this).c(4609) != 0) {
                    break L26;
                  } else {
                    if (((ug) this).a(false) != 0) {
                      break L26;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
              return stackIn_84_0 != 0;
            } else {
              L27: {
                if (0 != ((ug) this).c(4609)) {
                  break L27;
                } else {
                  if (((ug) this).a(false) != 0) {
                    break L27;
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

    final void c(byte param0) {
        if (null != ((ug) this).field_w) {
            ((ug) this).field_w.c(-102);
        }
        if (param0 >= -24) {
            ((ug) this).field_w = null;
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var12 = Pool.field_O;
        try {
          L0: {
            var4_int = param2.length();
            var5 = param0.length();
            var6 = param1.length();
            if (var5 != 0) {
              L1: {
                var7 = var4_int;
                var8 = -var5 + var6;
                if (var8 != 0) {
                  var9_int = 0;
                  L2: while (true) {
                    var9_int = param2.indexOf(param0, var9_int);
                    if (0 <= var9_int) {
                      var7 = var7 + var8;
                      var9_int = var9_int + var5;
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var9 = new StringBuilder(var7);
              var10 = 0;
              L3: while (true) {
                var11 = param2.indexOf(param0, var10);
                if (var11 >= 0) {
                  StringBuilder discarded$3 = var9.append(param2.substring(var10, var11));
                  var10 = var11 - -var5;
                  StringBuilder discarded$4 = var9.append(param1);
                  continue L3;
                } else {
                  StringBuilder discarded$5 = var9.append(param2.substring(var10));
                  stackOut_13_0 = var9.toString();
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              }
            } else {
              throw new IllegalArgumentException("Key cannot have zero length");
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("ug.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + -1 + 41);
        }
        return stackIn_14_0;
    }

    public ug() {
    }

    final static int g(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ge var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_30_0 = 0;
            if (sq.field_c.field_e < 4) {
              try {
                L0: {
                  L1: {
                    if (rl.field_e == 0) {
                      mq.field_c = fe.field_M.a(nr.field_X, na.field_a, 0);
                      rl.field_e = rl.field_e + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (rl.field_e != 1) {
                      break L2;
                    } else {
                      if (mq.field_c.field_f == 2) {
                        stackOut_13_0 = sd.a(false, -1);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if (mq.field_c.field_f == 1) {
                          rl.field_e = rl.field_e + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (2 != rl.field_e) {
                      break L3;
                    } else {
                      dq.field_h = new vb((java.net.Socket) mq.field_c.field_e, fe.field_M);
                      var2 = new ge(13);
                      fm.a(var2, true, ci.field_k, om.field_v, ei.field_B);
                      var2.a(15, false);
                      var2.a(true, qf.field_f);
                      dq.field_h.a(var2.field_t, (byte) 72, 13, 0);
                      rl.field_e = rl.field_e + 1;
                      ae.field_d = rl.a((byte) -105) - -30000L;
                      break L3;
                    }
                  }
                  L4: {
                    if (rl.field_e != 3) {
                      break L4;
                    } else {
                      if (0 < dq.field_h.d(72)) {
                        var1_int = dq.field_h.a(14528);
                        if (var1_int == 0) {
                          rl.field_e = rl.field_e + 1;
                          break L4;
                        } else {
                          stackOut_26_0 = sd.a(false, var1_int);
                          stackIn_27_0 = stackOut_26_0;
                          return stackIn_27_0;
                        }
                      } else {
                        if (rl.a((byte) -110) <= ae.field_d) {
                          break L4;
                        } else {
                          stackOut_23_0 = sd.a(false, -2);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      }
                    }
                  }
                  if (rl.field_e != 4) {
                    stackOut_33_0 = -1;
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    sq.field_c.a(101, sa.field_k, (Object) (Object) dq.field_h);
                    mq.field_c = null;
                    rl.field_e = 0;
                    dq.field_h = null;
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return sd.a(false, -3);
              }
              return stackIn_34_0;
            } else {
              if (-1 == sq.field_c.field_a) {
                return 3;
              } else {
                if (-2 != sq.field_c.field_a) {
                  return 1;
                } else {
                  return 4;
                }
              }
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
        field_v = new ml("usename");
    }
}
