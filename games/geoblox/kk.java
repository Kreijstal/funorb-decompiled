/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kk extends ji {
    static lh field_w;
    private ba field_u;
    static int field_t;
    static float field_x;
    static String field_v;
    static int[] field_s;

    public static void i() {
        field_s = null;
        field_v = null;
        field_w = null;
    }

    final boolean a(byte param0) {
        try {
            IOException var2 = null;
            long var2_long = 0L;
            sd var2_ref = null;
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
            sd var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int var17 = 0;
            int stackIn_49_0 = 0;
            int stackIn_66_0 = 0;
            int stackIn_86_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_85_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_47_0 = 0;
            int stackOut_65_0 = 0;
            int stackOut_64_0 = 0;
            L0: {
              var16 = Geoblox.field_C;
              if (((kk) this).field_u != null) {
                L1: {
                  var2_long = oa.a(-12520);
                  var4 = (int)(-((kk) this).field_k + var2_long);
                  if (var4 > 200) {
                    var4 = 200;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                ((kk) this).field_k = var2_long;
                ((kk) this).field_o = ((kk) this).field_o + var4;
                if (((kk) this).field_o > 30000) {
                  try {
                    L2: {
                      ((kk) this).field_u.b(param0 ^ -43);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
                      break L3;
                    }
                  }
                  ((kk) this).field_u = null;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            }
            if (((kk) this).field_u != null) {
              try {
                L4: {
                  ((kk) this).field_u.d(-108);
                  var2_ref = (sd) (Object) ((kk) this).field_g.c((byte) 121);
                  L5: while (true) {
                    if (var2_ref == null) {
                      L6: {
                        var2_ref = (sd) (Object) ((kk) this).field_p.c((byte) 121);
                        if (param0 == 95) {
                          break L6;
                        } else {
                          ((kk) this).e(-90);
                          break L6;
                        }
                      }
                      L7: while (true) {
                        if (var2_ref == null) {
                          var2_int = 0;
                          L8: while (true) {
                            if (var2_int >= 100) {
                              stackOut_85_0 = 1;
                              stackIn_86_0 = stackOut_85_0;
                              break L4;
                            } else {
                              var3_int = ((kk) this).field_u.a((byte) 82);
                              if (var3_int >= 0) {
                                if (var3_int != 0) {
                                  L9: {
                                    ((kk) this).field_o = 0;
                                    var4 = 0;
                                    if (((kk) this).field_f != null) {
                                      if (((kk) this).field_f.field_D == 0) {
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
                                    if (0 >= var4) {
                                      L11: {
                                        var5 = ((kk) this).field_f.field_A.field_j.length + -((kk) this).field_f.field_E;
                                        var6 = 512 - ((kk) this).field_f.field_D;
                                        if (-((kk) this).field_f.field_A.field_f + var5 >= var6) {
                                          break L11;
                                        } else {
                                          var6 = -((kk) this).field_f.field_A.field_f + var5;
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (var6 <= var3_int) {
                                          break L12;
                                        } else {
                                          var6 = var3_int;
                                          break L12;
                                        }
                                      }
                                      L13: {
                                        ((kk) this).field_u.a(((kk) this).field_f.field_A.field_j, (byte) -97, ((kk) this).field_f.field_A.field_f, var6);
                                        if (((kk) this).field_i == 0) {
                                          break L13;
                                        } else {
                                          var17 = 0;
                                          var7 = var17;
                                          L14: while (true) {
                                            if (var6 <= var17) {
                                              break L13;
                                            } else {
                                              ((kk) this).field_f.field_A.field_j[((kk) this).field_f.field_A.field_f - -var17] = (byte)h.a((int) ((kk) this).field_f.field_A.field_j[((kk) this).field_f.field_A.field_f + var17], (int) ((kk) this).field_i);
                                              var17++;
                                              continue L14;
                                            }
                                          }
                                        }
                                      }
                                      ((kk) this).field_f.field_D = ((kk) this).field_f.field_D + var6;
                                      ((kk) this).field_f.field_A.field_f = ((kk) this).field_f.field_A.field_f + var6;
                                      if (var5 == ((kk) this).field_f.field_A.field_f) {
                                        ((kk) this).field_f.a((byte) 57);
                                        ((kk) this).field_f.field_u = false;
                                        ((kk) this).field_f = null;
                                        break L10;
                                      } else {
                                        if (((kk) this).field_f.field_D != 512) {
                                          break L10;
                                        } else {
                                          ((kk) this).field_f.field_D = 0;
                                          break L10;
                                        }
                                      }
                                    } else {
                                      L15: {
                                        var5 = -((kk) this).field_j.field_f + var4;
                                        if (var5 > var3_int) {
                                          var5 = var3_int;
                                          break L15;
                                        } else {
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        ((kk) this).field_u.a(((kk) this).field_j.field_j, (byte) -97, ((kk) this).field_j.field_f, var5);
                                        if (((kk) this).field_i == 0) {
                                          break L16;
                                        } else {
                                          var6 = 0;
                                          L17: while (true) {
                                            if (var6 >= var5) {
                                              break L16;
                                            } else {
                                              ((kk) this).field_j.field_j[((kk) this).field_j.field_f + var6] = (byte)h.a((int) ((kk) this).field_j.field_j[((kk) this).field_j.field_f + var6], (int) ((kk) this).field_i);
                                              var6++;
                                              continue L17;
                                            }
                                          }
                                        }
                                      }
                                      ((kk) this).field_j.field_f = ((kk) this).field_j.field_f + var5;
                                      if (((kk) this).field_j.field_f >= var4) {
                                        if (null == ((kk) this).field_f) {
                                          L18: {
                                            ((kk) this).field_j.field_f = 0;
                                            var6 = ((kk) this).field_j.c((byte) 34);
                                            var7 = ((kk) this).field_j.a((byte) -90);
                                            var8 = ((kk) this).field_j.c((byte) 34);
                                            var9 = ((kk) this).field_j.a((byte) -61);
                                            var10 = var8 & 127;
                                            if ((128 & var8) == 0) {
                                              stackOut_48_0 = 0;
                                              stackIn_49_0 = stackOut_48_0;
                                              break L18;
                                            } else {
                                              stackOut_47_0 = 1;
                                              stackIn_49_0 = stackOut_47_0;
                                              break L18;
                                            }
                                          }
                                          L19: {
                                            var11 = stackIn_49_0;
                                            var12 = (long)var7 + ((long)var6 << 32);
                                            var14 = null;
                                            if (var11 != 0) {
                                              var14_ref = (sd) (Object) ((kk) this).field_c.c((byte) 121);
                                              L20: while (true) {
                                                if (var14_ref == null) {
                                                  break L19;
                                                } else {
                                                  if (var12 != var14_ref.field_i) {
                                                    var14_ref = (sd) (Object) ((kk) this).field_c.a(-30);
                                                    continue L20;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                            } else {
                                              var14_ref = (sd) (Object) ((kk) this).field_e.c((byte) 121);
                                              L21: while (true) {
                                                if (var14_ref == null) {
                                                  break L19;
                                                } else {
                                                  if (~var12 != ~var14_ref.field_i) {
                                                    var14_ref = (sd) (Object) ((kk) this).field_e.a(72);
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
                                              ((kk) this).field_f = var14_ref;
                                              if (0 != var10) {
                                                stackOut_65_0 = 9;
                                                stackIn_66_0 = stackOut_65_0;
                                                break L22;
                                              } else {
                                                stackOut_64_0 = 5;
                                                stackIn_66_0 = stackOut_64_0;
                                                break L22;
                                              }
                                            }
                                            var15 = stackIn_66_0;
                                            ((kk) this).field_f.field_A = new qc(var9 + var15 + ((kk) this).field_f.field_E);
                                            ((kk) this).field_f.field_A.d((byte) -26, var10);
                                            ((kk) this).field_f.field_A.c((byte) 95, var9);
                                            ((kk) this).field_j.field_f = 0;
                                            ((kk) this).field_f.field_D = 10;
                                            break L10;
                                          }
                                        } else {
                                          if (0 != ((kk) this).field_f.field_D) {
                                            throw new IOException();
                                          } else {
                                            if (-1 == ((kk) this).field_j.field_j[0]) {
                                              ((kk) this).field_j.field_f = 0;
                                              ((kk) this).field_f.field_D = 1;
                                              break L10;
                                            } else {
                                              ((kk) this).field_f = null;
                                              break L10;
                                            }
                                          }
                                        }
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  var2_int++;
                                  continue L8;
                                } else {
                                  return true;
                                }
                              } else {
                                throw new IOException();
                              }
                            }
                          }
                        } else {
                          ((kk) this).field_m.field_f = 0;
                          ((kk) this).field_m.d((byte) 8, 0);
                          ((kk) this).field_m.a((byte) -127, var2_ref.field_i);
                          ((kk) this).field_u.a(100, 0, ((kk) this).field_m.field_j.length, ((kk) this).field_m.field_j);
                          ((kk) this).field_c.a(112, (rc) (Object) var2_ref);
                          var2_ref = (sd) (Object) ((kk) this).field_p.a(54);
                          continue L7;
                        }
                      }
                    } else {
                      ((kk) this).field_m.field_f = 0;
                      ((kk) this).field_m.d((byte) -54, 1);
                      ((kk) this).field_m.a((byte) -127, var2_ref.field_i);
                      ((kk) this).field_u.a(100, 0, ((kk) this).field_m.field_j.length, ((kk) this).field_m.field_j);
                      ((kk) this).field_e.a(-93, (rc) (Object) var2_ref);
                      var2_ref = (sd) (Object) ((kk) this).field_g.a(param0 ^ 41);
                      continue L5;
                    }
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2 = (IOException) (Object) decompiledCaughtException;
                try {
                  L23: {
                    ((kk) this).field_u.b(-122);
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
                  ((kk) this).field_b = ((kk) this).field_b + 1;
                  ((kk) this).field_q = -2;
                  ((kk) this).field_u = null;
                  if (0 != ((kk) this).a(param0 + -216)) {
                    break L25;
                  } else {
                    if (((kk) this).a(false) == 0) {
                      return true;
                    } else {
                      break L25;
                    }
                  }
                }
                return false;
              }
              return stackIn_86_0 != 0;
            } else {
              L26: {
                if (((kk) this).a(-78) != 0) {
                  break L26;
                } else {
                  if (0 != ((kk) this).a(false)) {
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

    final static boolean a(boolean param0, CharSequence param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (12 < var3_int) {
                    break L1;
                  } else {
                    var4 = oe.a(param1, 12);
                    if (var4 == null) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      if (var4.length() >= 1) {
                        L2: {
                          if (gg.a((byte) -62, var4.charAt(0))) {
                            break L2;
                          } else {
                            if (gg.a((byte) -98, var4.charAt(-1 + var4.length()))) {
                              break L2;
                            } else {
                              var5 = 0;
                              var6 = 0;
                              L3: while (true) {
                                if (var6 >= param1.length()) {
                                  if (var5 > 0) {
                                    stackOut_34_0 = 0;
                                    stackIn_35_0 = stackOut_34_0;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                } else {
                                  L4: {
                                    var7 = param1.charAt(var6);
                                    if (!gg.a((byte) -93, (char) var7)) {
                                      var5 = 0;
                                      break L4;
                                    } else {
                                      var5++;
                                      break L4;
                                    }
                                  }
                                  if (var5 < 2) {
                                    var6++;
                                    continue L3;
                                  } else {
                                    stackOut_26_0 = 0;
                                    stackIn_27_0 = stackOut_26_0;
                                    return stackIn_27_0 != 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0 != 0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("kk.O(").append(false).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L5;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ',' + 118 + ')');
        }
        return stackIn_35_0 != 0;
    }

    final static rh a(int param0, byte param1) {
        int discarded$0 = 0;
        int discarded$1 = 1;
        int discarded$2 = 1;
        return am.a(-72, param0, false);
    }

    public kk() {
    }

    final void a(Object param0, boolean param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            sd var4_ref3 = null;
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
            var6 = Geoblox.field_C;
            try {
              L0: {
                L1: {
                  if (null == ((kk) this).field_u) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ((kk) this).field_u.b(-120);
                        break L2;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var4 = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    ((kk) this).field_u = null;
                    break L1;
                  }
                }
                ((kk) this).field_u = (ba) param0;
                int discarded$1 = -113;
                this.b();
                this.a(param1, param2);
                ((kk) this).field_j.field_f = 0;
                ((kk) this).field_f = null;
                L4: while (true) {
                  var4_ref3 = (sd) (Object) ((kk) this).field_e.a(true);
                  if (var4_ref3 == null) {
                    L5: {
                      if (!param1) {
                        break L5;
                      } else {
                        field_t = 110;
                        break L5;
                      }
                    }
                    L6: while (true) {
                      var4_ref3 = (sd) (Object) ((kk) this).field_c.a(true);
                      if (var4_ref3 != null) {
                        ((kk) this).field_p.a(116, (rc) (Object) var4_ref3);
                        continue L6;
                      } else {
                        L7: {
                          if (((kk) this).field_i != 0) {
                            {
                              L8: {
                                ((kk) this).field_m.field_f = 0;
                                ((kk) this).field_m.d((byte) -62, 4);
                                ((kk) this).field_m.d((byte) 122, (int) ((kk) this).field_i);
                                ((kk) this).field_m.c((byte) 95, 0);
                                ((kk) this).field_u.a(100, 0, ((kk) this).field_m.field_j.length, ((kk) this).field_m.field_j);
                                break L8;
                              }
                            }
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        ((kk) this).field_o = 0;
                        ((kk) this).field_k = oa.a(-12520);
                        break L0;
                      }
                    }
                  } else {
                    ((kk) this).field_g.a(-74, (rc) (Object) var4_ref3);
                    continue L4;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L12: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_25_0 = (RuntimeException) var4_ref2;
                stackOut_25_1 = new StringBuilder().append("kk.C(");
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                if (param0 == null) {
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
              throw t.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ',' + param2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        if (param0 > -50) {
            field_w = null;
        }
        if (!(((kk) this).field_u == null)) {
            ((kk) this).field_u.b(-123);
        }
    }

    private final void b() {
        try {
            IOException var2 = null;
            Exception var3 = null;
            Throwable decompiledCaughtException = null;
            if (((kk) this).field_u != null) {
              {
                L0: {
                  ((kk) this).field_m.field_f = 0;
                  ((kk) this).field_m.d((byte) 126, 6);
                  ((kk) this).field_m.b(-12, 3);
                  ((kk) this).field_m.e(0, 28695);
                  ((kk) this).field_u.a(100, 0, ((kk) this).field_m.field_j.length, ((kk) this).field_m.field_j);
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

    final void e(int param0) {
        try {
            ((kk) this).field_u.b(param0 ^ -106);
        } catch (Exception exception) {
        }
        if (param0 != 20) {
            return;
        }
        ((kk) this).field_b = ((kk) this).field_b + 1;
        ((kk) this).field_q = -1;
        ((kk) this).field_u = null;
        ((kk) this).field_i = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    private final void a(boolean param0, boolean param1) {
        try {
            IOException var3 = null;
            Exception var4 = null;
            qc stackIn_4_0 = null;
            int stackIn_4_1 = 0;
            qc stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            qc stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            Throwable decompiledCaughtException = null;
            qc stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            qc stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            qc stackOut_4_0 = null;
            int stackOut_4_1 = 0;
            int stackOut_4_2 = 0;
            if (null == ((kk) this).field_u) {
              return;
            } else {
              try {
                L0: {
                  L1: {
                    ((kk) this).field_m.field_f = 0;
                    stackOut_3_0 = ((kk) this).field_m;
                    stackOut_3_1 = 124;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (param1) {
                      stackOut_5_0 = (qc) (Object) stackIn_5_0;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = 2;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      stackIn_6_2 = stackOut_5_2;
                      break L1;
                    } else {
                      stackOut_4_0 = (qc) (Object) stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 3;
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      break L1;
                    }
                  }
                  L2: {
                    ((qc) (Object) stackIn_6_0).d((byte) stackIn_6_1, stackIn_6_2);
                    ((kk) this).field_m.a((byte) -127, 0L);
                    ((kk) this).field_u.a(100, 0, ((kk) this).field_m.field_j.length, ((kk) this).field_m.field_j);
                    if (!param0) {
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
                      ((kk) this).field_u.b(-126);
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var4 = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  ((kk) this).field_u = null;
                  ((kk) this).field_q = -2;
                  ((kk) this).field_b = ((kk) this).field_b + 1;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new lh();
        field_v = "The account name you use to access RuneScape and other Jagex.com games";
        field_s = new int[]{1, 2, 5, 3, 3, 5, 5, 5, 1, 1, 1, 2, 2, 2, 3, 10, 3};
    }
}
