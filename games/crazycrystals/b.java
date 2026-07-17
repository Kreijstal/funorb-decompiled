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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("b.D(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    public static void a(int param0) {
        field_b = null;
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
        DataInputStream var17 = null;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        Vector stackIn_37_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        Vector stackOut_36_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var16 = CrazyCrystals.field_B;
        try {
          L0: {
            var17 = new DataInputStream(param1);
            var3_ref = var17;
            var4 = var3_ref.readByte();
            var5 = var3_ref.readShort();
            var6 = new Vector();
            var7 = param0;
            L1: while (true) {
              if (var5 <= var7) {
                stackOut_36_0 = (Vector) var6;
                stackIn_37_0 = stackOut_36_0;
                break L0;
              } else {
                var8 = sb.a(1, var3_ref);
                var9 = var3_ref.readUnsignedByte();
                var10 = var3_ref.readInt();
                var11 = var3_ref.readInt();
                var12 = new f[var11 - -2][2 + var10];
                var13 = ff.a(0, 0, 1, var4, var3_ref);
                var14 = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var14 >= 2 + var10) {
                        break L4;
                      } else {
                        var12[0][var14] = var13;
                        var14++;
                        if (var16 != 0) {
                          break L3;
                        } else {
                          if (var16 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var14 = 1;
                    break L3;
                  }
                  L5: while (true) {
                    L6: {
                      L7: {
                        if (1 + var11 <= var14) {
                          break L7;
                        } else {
                          var12[var14][0] = var13;
                          stackOut_10_0 = 1;
                          stackIn_19_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var16 != 0) {
                            break L6;
                          } else {
                            var15 = stackIn_11_0;
                            L8: while (true) {
                              L9: {
                                L10: {
                                  if (var10 + 1 <= var15) {
                                    break L10;
                                  } else {
                                    var12[var14][var15] = ff.a(var4, var15, oe.a(param0, 1), var14, var17);
                                    var15++;
                                    if (var16 != 0) {
                                      break L9;
                                    } else {
                                      if (var16 == 0) {
                                        continue L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                var12[var14][var10 - -1] = var13;
                                var14++;
                                break L9;
                              }
                              if (var16 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                      }
                      stackOut_18_0 = 0;
                      stackIn_19_0 = stackOut_18_0;
                      break L6;
                    }
                    var14 = stackIn_19_0;
                    L11: while (true) {
                      L12: {
                        L13: {
                          L14: {
                            L15: {
                              if (var14 >= 2 + var10) {
                                break L15;
                              } else {
                                var12[1 + var11][var14] = var13;
                                var14++;
                                if (var16 != 0) {
                                  break L14;
                                } else {
                                  if (var16 == 0) {
                                    continue L11;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            if (param2 != null) {
                              break L14;
                            } else {
                              break L13;
                            }
                          }
                          L16: {
                            if (var8.length() != 0) {
                              break L16;
                            } else {
                              var6.addElement((Object) null);
                              if (var16 == 0) {
                                break L12;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L17: {
                            if (ul.field_g != 0) {
                              break L17;
                            } else {
                              if (!param2[var7].equals((Object) (Object) var8)) {
                                throw new IllegalStateException(Integer.toString(var7));
                              } else {
                                break L17;
                              }
                            }
                          }
                          var8 = param2[var7];
                          if (go.field_l.a(var8) > 146) {
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        var6.addElement((Object) (Object) new kb(var12, var8, var9));
                        break L12;
                      }
                      var7++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var3;
            stackOut_38_1 = new StringBuilder().append("b.H(").append(param0).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L18;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L18;
            }
          }
          L19: {
            stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
            stackOut_41_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_41_2).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L19;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L19;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 41);
        }
        return stackIn_37_0;
    }

    final Object a(int param0, long param1) {
        ib var4 = null;
        Object var5 = null;
        qd var6 = null;
        var4 = (ib) (Object) ((b) this).field_e.a(param1, -114);
        if (var4 != null) {
          if (param0 >= 83) {
            var5 = var4.f(-18088);
            if (var5 == null) {
              var4.a(false);
              var4.a(1);
              ((b) this).field_g = ((b) this).field_g + var4.field_n;
              return null;
            } else {
              if (!var4.h(-964)) {
                ((b) this).field_c.a((byte) 8, (ij) (Object) var4);
                var4.field_k = 0L;
                if (CrazyCrystals.field_B != 0) {
                  var6 = new qd(var5, var4.field_n);
                  ((b) this).field_e.a(var4.field_e, (byte) 42, (jb) (Object) var6);
                  ((b) this).field_c.a((byte) 124, (ij) (Object) var6);
                  ((ib) (Object) var6).field_k = 0L;
                  var4.a(false);
                  var4.a(1);
                  return var5;
                } else {
                  return var5;
                }
              } else {
                var6 = new qd(var5, var4.field_n);
                ((b) this).field_e.a(var4.field_e, (byte) 42, (jb) (Object) var6);
                ((b) this).field_c.a((byte) 124, (ij) (Object) var6);
                ((ib) (Object) var6).field_k = 0L;
                var4.a(false);
                var4.a(1);
                return var5;
              }
            }
          } else {
            field_b = null;
            var5 = var4.f(-18088);
            if (var5 == null) {
              var4.a(false);
              var4.a(1);
              ((b) this).field_g = ((b) this).field_g + var4.field_n;
              return null;
            } else {
              if (!var4.h(-964)) {
                ((b) this).field_c.a((byte) 8, (ij) (Object) var4);
                var4.field_k = 0L;
                if (CrazyCrystals.field_B == 0) {
                  return var5;
                } else {
                  var6 = new qd(var5, var4.field_n);
                  ((b) this).field_e.a(var4.field_e, (byte) 42, (jb) (Object) var6);
                  ((b) this).field_c.a((byte) 124, (ij) (Object) var6);
                  ((ib) (Object) var6).field_k = 0L;
                  var4.a(false);
                  var4.a(1);
                  return var5;
                }
              } else {
                var6 = new qd(var5, var4.field_n);
                ((b) this).field_e.a(var4.field_e, (byte) 42, (jb) (Object) var6);
                ((b) this).field_c.a((byte) 124, (ij) (Object) var6);
                ((ib) (Object) var6).field_k = 0L;
                var4.a(false);
                var4.a(1);
                return var5;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final void a(Object param0, int param1, byte param2, long param3) {
        RuntimeException runtimeException = null;
        ib var6 = null;
        qd var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            runtimeException = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("b.J(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = CrazyCrystals.field_B;
        if (param10 != 44) {
          b.a(127);
          if (param11 <= param13) {
            L0: {
              if (param3 <= param13) {
                if (param3 <= param11) {
                  cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                  return;
                } else {
                  cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, 60, param8, param6, 2, kh.field_i, param0);
                  if (var17 == 0) {
                    break L0;
                  } else {
                    cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                    return;
                  }
                }
              } else {
                cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, 60, param9, param14, param7, param1, 2, kh.field_i, param0);
                if (var17 == 0) {
                  break L0;
                } else {
                  if (param3 <= param11) {
                    cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                    return;
                  } else {
                    cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, 60, param8, param6, 2, kh.field_i, param0);
                    cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                    return;
                  }
                }
              }
            }
            return;
          } else {
            if (param3 > param11) {
              cd.a(param1, param5, param13, param4, param3, param9, param6, param12, param11, param0, param8, param14, param7, param2, 2, kh.field_i, 60);
              if (var17 != 0) {
                if (param3 <= param13) {
                  cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, 60, param7, param0, param9, param1, 2, kh.field_i, param14);
                  if (var17 != 0) {
                    if (param3 <= param13) {
                      if (param3 <= param11) {
                        cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                        return;
                      } else {
                        cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, 60, param8, param6, 2, kh.field_i, param0);
                        if (var17 == 0) {
                          return;
                        } else {
                          cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                          return;
                        }
                      }
                    } else {
                      cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, 60, param9, param14, param7, param1, 2, kh.field_i, param0);
                      if (var17 != 0) {
                        if (param3 <= param11) {
                          cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                          return;
                        } else {
                          cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, 60, param8, param6, 2, kh.field_i, param0);
                          cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  cd.a(param1, param4, param13, param5, param11, param7, param2, param12, param3, param14, param8, param0, param9, param6, 2, kh.field_i, 60);
                  if (var17 != 0) {
                    cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, 60, param7, param0, param9, param1, 2, kh.field_i, param14);
                    if (var17 != 0) {
                      L1: {
                        if (param3 <= param13) {
                          break L1;
                        } else {
                          cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, 60, param9, param14, param7, param1, 2, kh.field_i, param0);
                          break L1;
                        }
                      }
                      if (param3 > param11) {
                        cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, 60, param8, param6, 2, kh.field_i, param0);
                        if (var17 == 0) {
                          return;
                        } else {
                          cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                          return;
                        }
                      } else {
                        cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              if (param3 <= param13) {
                cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, 60, param7, param0, param9, param1, 2, kh.field_i, param14);
                if (var17 != 0) {
                  L2: {
                    if (param3 <= param13) {
                      break L2;
                    } else {
                      cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, 60, param9, param14, param7, param1, 2, kh.field_i, param0);
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (param3 <= param11) {
                        break L4;
                      } else {
                        cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, 60, param8, param6, 2, kh.field_i, param0);
                        if (var17 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                    break L3;
                  }
                  return;
                } else {
                  return;
                }
              } else {
                cd.a(param1, param4, param13, param5, param11, param7, param2, param12, param3, param14, param8, param0, param9, param6, 2, kh.field_i, 60);
                if (var17 != 0) {
                  L5: {
                    cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, 60, param7, param0, param9, param1, 2, kh.field_i, param14);
                    if (param3 <= param13) {
                      break L5;
                    } else {
                      cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, 60, param9, param14, param7, param1, 2, kh.field_i, param0);
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      if (param3 <= param11) {
                        break L7;
                      } else {
                        cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, 60, param8, param6, 2, kh.field_i, param0);
                        if (var17 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                    break L6;
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          if (param11 <= param13) {
            if (param3 <= param13) {
              if (param3 > param11) {
                cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, 60, param8, param6, 2, kh.field_i, param0);
                if (var17 != 0) {
                  cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                  return;
                } else {
                  return;
                }
              } else {
                cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                return;
              }
            } else {
              cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, 60, param9, param14, param7, param1, 2, kh.field_i, param0);
              if (var17 != 0) {
                L8: {
                  if (param3 <= param11) {
                    break L8;
                  } else {
                    cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, 60, param8, param6, 2, kh.field_i, param0);
                    break L8;
                  }
                }
                cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                return;
              } else {
                return;
              }
            }
          } else {
            L9: {
              if (param3 <= param11) {
                break L9;
              } else {
                cd.a(param1, param5, param13, param4, param3, param9, param6, param12, param11, param0, param8, param14, param7, param2, 2, kh.field_i, 60);
                if (var17 != 0) {
                  break L9;
                } else {
                  return;
                }
              }
            }
            if (param3 <= param13) {
              cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, 60, param7, param0, param9, param1, 2, kh.field_i, param14);
              if (var17 != 0) {
                L10: {
                  if (param3 <= param13) {
                    break L10;
                  } else {
                    cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, 60, param9, param14, param7, param1, 2, kh.field_i, param0);
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if (param3 <= param11) {
                      break L12;
                    } else {
                      cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, 60, param8, param6, 2, kh.field_i, param0);
                      if (var17 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                  break L11;
                }
                return;
              } else {
                return;
              }
            } else {
              cd.a(param1, param4, param13, param5, param11, param7, param2, param12, param3, param14, param8, param0, param9, param6, 2, kh.field_i, 60);
              if (var17 != 0) {
                L13: {
                  cd.a(param6, param4, param3, param12, param11, param8, param2, param5, param13, 60, param7, param0, param9, param1, 2, kh.field_i, param14);
                  if (param3 <= param13) {
                    break L13;
                  } else {
                    cd.a(param2, param5, param11, param12, param3, param8, param6, param4, param13, 60, param9, param14, param7, param1, 2, kh.field_i, param0);
                    break L13;
                  }
                }
                L14: {
                  L15: {
                    if (param3 <= param11) {
                      break L15;
                    } else {
                      cd.a(param2, param12, param11, param5, param13, param7, param1, param4, param3, param14, param9, 60, param8, param6, 2, kh.field_i, param0);
                      if (var17 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  cd.a(param6, param12, param3, param4, param13, param9, param1, param5, param11, param0, param7, 60, param8, param2, 2, kh.field_i, param14);
                  break L14;
                }
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static boolean b(int param0) {
        if (param0 == 0) {
          if (null != oi.field_c) {
            if (!gj.field_k.a(-2)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_a = -27;
          if (null != oi.field_c) {
            if (!gj.field_k.a(-2)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
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
        byte[] stackIn_7_0 = null;
        byte[] stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_21_0 = null;
        byte[] stackOut_6_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
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
                      stackOut_21_0 = (byte[]) var6;
                      stackIn_22_0 = stackOut_21_0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                } else {
                  var5_ref_byte__ = new byte[var4];
                  var2.a(var4, var5_ref_byte__, (byte) -58, 0);
                  stackOut_6_0 = (byte[]) var5_ref_byte__;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2_ref;
            stackOut_23_1 = new StringBuilder().append("b.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 41);
        }
        return stackIn_22_0;
    }

    private final void a(long param0, int param1) {
        ib var4 = (ib) (Object) ((b) this).field_e.a(param0, -117);
        this.a(98, var4);
    }

    final void a(Object param0, int param1, long param2) {
        try {
            this.a(param0, param1, (byte) 60, param2);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "b.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private b() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Select Level";
        field_d = "Arcade Levels";
    }
}
