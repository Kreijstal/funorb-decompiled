/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class b {
    static int field_a;
    private be field_c;
    private int field_f;
    private ug field_e;
    static String field_b;
    static String field_d;
    private int field_g;

    private final void a(int param0, ib param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 62) {
                break L1;
              } else {
                this.a((Object) null, -109, (byte) 8, -120L);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                param1.a(false);
                param1.a(1);
                ((b) this).field_g = ((b) this).field_g + param1.field_n;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("b.D(").append(param0).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
            return;
        }
        try {
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "b.I(" + param0 + ')');
        }
    }

    final static Vector a(int param0, InputStream param1, String[] param2) throws IOException {
        RuntimeException var3 = null;
        DataInputStream var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        Vector var6 = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        f[][] var12 = null;
        f var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
        Vector stackIn_49_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_22_0 = 0;
        Vector stackOut_48_0 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var16 = CrazyCrystals.field_B;
        try {
          L0: {
            var3_ref = new DataInputStream(param1);
            var4 = var3_ref.readByte();
            var5 = var3_ref.readShort();
            var6 = new Vector();
            var7 = param0;
            L1: while (true) {
              L2: {
                if (var5 <= var7) {
                  break L2;
                } else {
                  var8 = sb.a(1, var3_ref);
                  var9 = var3_ref.readUnsignedByte();
                  var10 = var3_ref.readInt();
                  var11 = var3_ref.readInt();
                  var12 = new f[var11 - -2][2 + var10];
                  var13 = ff.a(0, 0, 1, var4, var3_ref);
                  var14 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (~var14 <= ~(2 + var10)) {
                          break L5;
                        } else {
                          var12[0][var14] = var13;
                          var14++;
                          if (var16 != 0) {
                            break L4;
                          } else {
                            if (var16 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var14 = 1;
                      break L4;
                    }
                    L6: while (true) {
                      L7: {
                        L8: {
                          if (1 + var11 <= var14) {
                            break L8;
                          } else {
                            var12[var14][0] = var13;
                            stackOut_11_0 = 1;
                            stackIn_23_0 = stackOut_11_0;
                            stackIn_12_0 = stackOut_11_0;
                            if (var16 != 0) {
                              break L7;
                            } else {
                              stackOut_12_0 = stackIn_12_0;
                              stackIn_14_0 = stackOut_12_0;
                              var15 = stackIn_14_0;
                              L9: while (true) {
                                L10: {
                                  L11: {
                                    if (~(var10 + 1) >= ~var15) {
                                      break L11;
                                    } else {
                                      var12[var14][var15] = ff.a(var4, var15, oe.a(param0, 1), var14, var3_ref);
                                      var15++;
                                      if (var16 != 0) {
                                        break L10;
                                      } else {
                                        if (var16 == 0) {
                                          continue L9;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  var12[var14][var10 - -1] = var13;
                                  var14++;
                                  break L10;
                                }
                                if (var16 == 0) {
                                  continue L6;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        stackOut_22_0 = 0;
                        stackIn_23_0 = stackOut_22_0;
                        break L7;
                      }
                      var14 = stackIn_23_0;
                      L12: while (true) {
                        L13: {
                          L14: {
                            L15: {
                              L16: {
                                if (var14 >= 2 + var10) {
                                  break L16;
                                } else {
                                  var12[1 + var11][var14] = var13;
                                  var14++;
                                  if (var16 != 0) {
                                    break L15;
                                  } else {
                                    if (var16 == 0) {
                                      continue L12;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                              }
                              if (param2 != null) {
                                break L15;
                              } else {
                                break L14;
                              }
                            }
                            L17: {
                              if (var8.length() != 0) {
                                break L17;
                              } else {
                                var6.addElement((Object) null);
                                if (var16 == 0) {
                                  break L13;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            L18: {
                              if (ul.field_g != 0) {
                                break L18;
                              } else {
                                if (!param2[var7].equals((Object) (Object) var8)) {
                                  throw new IllegalStateException(Integer.toString(var7));
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var8 = param2[var7];
                            if (go.field_l.a(var8) > 146) {
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          var6.addElement((Object) (Object) new kb(var12, var8, var9));
                          break L13;
                        }
                        var7++;
                        if (var16 == 0) {
                          continue L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackOut_48_0 = (Vector) var6;
              stackIn_49_0 = stackOut_48_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var3;
            stackOut_50_1 = new StringBuilder().append("b.H(").append(param0).append(',');
            stackIn_53_0 = stackOut_50_0;
            stackIn_53_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L19;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_54_0 = stackOut_51_0;
              stackIn_54_1 = stackOut_51_1;
              stackIn_54_2 = stackOut_51_2;
              break L19;
            }
          }
          L20: {
            stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
            stackOut_54_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_54_2).append(',');
            stackIn_57_0 = stackOut_54_0;
            stackIn_57_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param2 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L20;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_58_0 = stackOut_55_0;
              stackIn_58_1 = stackOut_55_1;
              stackIn_58_2 = stackOut_55_2;
              break L20;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ')');
        }
        return stackIn_49_0;
    }

    final Object a(int param0, long param1) {
        ib var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        qd var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_18_0 = null;
        try {
          L0: {
            var4 = (ib) (Object) ((b) this).field_e.a(param1, -114);
            if (null == var4) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 >= 83) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              var5 = var4.f(-18088);
              if (var5 == null) {
                var4.a(false);
                var4.a(1);
                ((b) this).field_g = ((b) this).field_g + var4.field_n;
                stackOut_11_0 = null;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0;
              } else {
                L2: {
                  L3: {
                    if (var4.h(-964)) {
                      break L3;
                    } else {
                      ((b) this).field_c.a((byte) 8, (ij) (Object) var4);
                      var4.field_k = 0L;
                      if (CrazyCrystals.field_B == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var6 = new qd(var5, var4.field_n);
                  ((b) this).field_e.a(var4.field_e, (byte) 42, (jb) (Object) var6);
                  ((b) this).field_c.a((byte) 124, (ij) (Object) var6);
                  ((ib) (Object) var6).field_k = 0L;
                  var4.a(false);
                  var4.a(1);
                  break L2;
                }
                stackOut_18_0 = var5;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var4_ref, "b.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_19_0;
    }

    private final void a(Object param0, int param1, byte param2, long param3) {
        ib var6 = null;
        qd var6_ref = null;
        RuntimeException var6_ref2 = null;
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var7 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param2 >= 46) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            if (param1 <= ((b) this).field_f) {
              this.a(param3, -70);
              ((b) this).field_g = ((b) this).field_g - param1;
              L2: while (true) {
                L3: {
                  if (((b) this).field_g >= 0) {
                    break L3;
                  } else {
                    var6 = (ib) (Object) ((b) this).field_c.a(30244);
                    this.a(66, var6);
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var6_ref = new qd(param0, param1);
                ((b) this).field_e.a(param3, (byte) 42, (jb) (Object) var6_ref);
                ((b) this).field_c.a((byte) 119, (ij) (Object) var6_ref);
                ((ib) (Object) var6_ref).field_k = 0L;
                break L0;
              }
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6_ref2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6_ref2;
            stackOut_12_1 = new StringBuilder().append("b.J(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        RuntimeException var16 = null;
        int var17 = 0;
        RuntimeException decompiledCaughtException = null;
        var17 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param10 == 44) {
                break L1;
              } else {
                b.a(127);
                break L1;
              }
            }
            L2: {
              L3: {
                if (~param11 >= ~param13) {
                  break L3;
                } else {
                  L4: {
                    if (~param3 >= ~param11) {
                      break L4;
                    } else {
                      cd.a(param1, param5, param13, param4, param3, param9, param6, param12, param11, param0, param8, param14, param7, param2, 2, kh.field_i, param15);
                      if (var17 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (param3 <= param13) {
                      break L5;
                    } else {
                      cd.a(param1, param4, param13, param5, param11, param7, param2, param12, param3, param14, param8, param0, param9, param6, 2, kh.field_i, param15);
                      if (var17 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, param15, param7, param0, param9, param1, 2, kh.field_i, param14);
                  if (var17 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (~param3 >= ~param13) {
                  break L6;
                } else {
                  cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, param15, param9, param14, param7, param1, 2, kh.field_i, param0);
                  if (var17 == 0) {
                    break L2;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (param3 <= param11) {
                  break L7;
                } else {
                  cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, param15, param8, param6, 2, kh.field_i, param0);
                  if (var17 == 0) {
                    break L2;
                  } else {
                    break L7;
                  }
                }
              }
              cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, param15, param8, param2, 2, kh.field_i, param14);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var16 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var16, "b.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ',' + param15 + ')');
        }
    }

    final static boolean b(int param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_a = -27;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == oi.field_c) {
                  break L3;
                } else {
                  if (!gj.field_k.a(-2)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "b.E(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static byte[] a(byte[] param0, int param1) {
        ng var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_32_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_31_0 = null;
        byte[] stackOut_10_0 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        try {
          L0: {
            L1: {
              var2 = new ng(param0);
              var3 = var2.h(255);
              var4 = var2.b((byte) 127);
              if (param1 < ~var4) {
                break L1;
              } else {
                L2: {
                  if (0 == w.field_g) {
                    break L2;
                  } else {
                    if (w.field_g >= var4) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                if (var3 != 0) {
                  L3: {
                    var5 = var2.b((byte) 126);
                    if (var5 < 0) {
                      break L3;
                    } else {
                      L4: {
                        if (w.field_g == 0) {
                          break L4;
                        } else {
                          if (~w.field_g > ~var5) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          var6 = new byte[var5];
                          if (var3 == 1) {
                            break L6;
                          } else {
                            var7 = (Object) (Object) qg.field_s;
                            synchronized (var7) {
                              L7: {
                                qg.field_s.a(var6, var2, -19515);
                                break L7;
                              }
                            }
                            if (CrazyCrystals.field_B == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        int discarded$1 = di.a(var6, var5, param0, var4, 9);
                        break L5;
                      }
                      stackOut_31_0 = (byte[]) var6;
                      stackIn_32_0 = stackOut_31_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var5_ref_byte__ = new byte[var4];
                  var2.a(var4, var5_ref_byte__, (byte) -58, 0);
                  stackOut_10_0 = (byte[]) var5_ref_byte__;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var2_ref;
            stackOut_33_1 = new StringBuilder().append("b.A(");
            stackIn_36_0 = stackOut_33_0;
            stackIn_36_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L8;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_37_0 = stackOut_34_0;
              stackIn_37_1 = stackOut_34_1;
              stackIn_37_2 = stackOut_34_2;
              break L8;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + param1 + ')');
        }
        return stackIn_32_0;
    }

    private final void a(long param0, int param1) {
        RuntimeException runtimeException = null;
        ib var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = (ib) (Object) ((b) this).field_e.a(param0, -117);
              this.a(98, var4);
              if (param1 <= -66) {
                break L1;
              } else {
                b.a(6, -67, 121, -107, 106, -115, -66, 114, 26, -103, -124, 35, 74, -126, 34, 60);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dn.a((Throwable) (Object) runtimeException, "b.G(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(Object param0, int param1, long param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            this.a(param0, param1, (byte) 60, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("b.F(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private b() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "b.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Select Level";
        field_d = "Arcade Levels";
    }
}
