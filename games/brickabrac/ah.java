/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ah extends km {
    static int field_v;
    static int[][] field_w;
    private int field_s;
    private jf field_r;
    static int[] field_u;
    private int field_t;

    final void a(boolean param0, int param1, int param2) {
        oi var4 = null;
        if (param2 < 96) {
            return;
        }
        super.a(param0, param1, 101);
        rf.field_g = null;
        ((ah) this).field_s = 0;
        if (pe.field_o != null) {
            if (!pe.field_o.field_p) {
                var4 = pe.field_o.field_w.field_b;
                if (!(var4.field_b.field_h != 1)) {
                    ((ah) this).field_s = 1;
                }
            }
        }
    }

    final int b(int param0, int param1) {
        int var3 = 0;
        if (param1 != 1) {
            field_u = null;
        }
        if (((ah) this).field_m.length != 2) {
            var3 = ((ah) this).field_m[param0].field_f;
            return var3 == 43 ? 140 : -6 + (((ah) this).field_p - -38);
        }
        return ((ah) this).field_p;
    }

    final void d(byte param0) {
        rf.field_g = null;
        if (param0 != 79) {
            ((ah) this).field_s = -114;
        }
    }

    final static void a(String param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
              int discarded$3 = 2;
              ih.a(false, param0, param2);
              if (param1 == 11455) {
                break L1;
              } else {
                field_v = -30;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ah.KA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(int param0, int param1, char param2) {
        int var5 = 0;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          if (((ah) this).field_m.length == 2) {
            ((ah) this).field_h.a(0, param0 + 119);
            break L0;
          } else {
            L1: {
              if (param1 == 96) {
                if (((ah) this).field_h.field_j <= 0) {
                  ((ah) this).field_h.a(false, 3);
                  break L1;
                } else {
                  if (((ah) this).field_h.field_j < 4) {
                    ((ah) this).field_h.a(false, -1 + ((ah) this).field_h.field_j);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == 97) {
                if (3 <= ((ah) this).field_h.field_j) {
                  if (((ah) this).field_h.field_j == 3) {
                    ((ah) this).field_h.a(false, 0);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  ((ah) this).field_h.a(false, 1 + ((ah) this).field_h.field_j);
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 == 99) {
                if (((ah) this).field_h.field_j < 4) {
                  ((ah) this).field_h.a(false, 4);
                  ((ah) this).field_r.a((byte) 108);
                  break L3;
                } else {
                  if (!((ah) this).field_r.a(param1, param2, -94)) {
                    break L3;
                  } else {
                    ((ah) this).field_h.a(false, 0);
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 != 98) {
                break L4;
              } else {
                if (4 > ((ah) this).field_h.field_j) {
                  ((ah) this).field_h.a(false, 4);
                  ((ah) this).field_r.c(param0 ^ 119);
                  break L4;
                } else {
                  if (!((ah) this).field_r.a(param1, param2, -67)) {
                    break L4;
                  } else {
                    ((ah) this).field_h.a(false, 0);
                    break L4;
                  }
                }
              }
            }
            ((ah) this).field_h.d((byte) -124);
            break L0;
          }
        }
        L5: {
          if (param0 == -120) {
            break L5;
          } else {
            field_u = null;
            break L5;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7) {
        RuntimeException var9 = null;
        int var9_int = 0;
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
              if (param0 != -1) {
                ob.field_D.a(param0 + 1 + ". ", lq.field_b[0], param2, param3, -1);
                break L1;
              } else {
                break L1;
              }
            }
            ob.field_D.c(param7, lq.field_b[0], param2, param3, -1);
            ob.field_D.b(Integer.toString(1 + param1), lq.field_b[1] - nn.field_g.c(mn.field_u) / 2, param2, param3, -1);
            ob.field_D.b(Integer.toString(1 - -param4), lq.field_b[2] - nn.field_g.c(ba.field_u) / 2, param2, param3, -1);
            ob.field_D.a(Integer.toString(param6), lq.field_b[3], param2, param3, -1);
            var9_int = 102 % ((param5 - -15) / 45);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var9;
            stackOut_5_1 = new StringBuilder().append("ah.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param7 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BrickABrac.field_J ? 1 : 0;
          var2 = param1;
          if (32 != var2) {
            if (160 != var2) {
              if (var2 != 95) {
                if (var2 == 45) {
                  break L0;
                } else {
                  L1: {
                    if (var2 != 91) {
                      if (var2 != 93) {
                        if (35 == var2) {
                          break L1;
                        } else {
                          L2: {
                            if (var2 == 224) {
                              break L2;
                            } else {
                              if (225 != var2) {
                                if (var2 == 226) {
                                  break L2;
                                } else {
                                  if (228 == var2) {
                                    break L2;
                                  } else {
                                    if (227 != var2) {
                                      if (var2 == 192) {
                                        break L2;
                                      } else {
                                        if (193 == var2) {
                                          break L2;
                                        } else {
                                          if (194 == var2) {
                                            break L2;
                                          } else {
                                            if (var2 != 196) {
                                              if (var2 != 195) {
                                                L3: {
                                                  if (232 != var2) {
                                                    if (var2 != 233) {
                                                      if (var2 == 234) {
                                                        break L3;
                                                      } else {
                                                        if (var2 == 235) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 200) {
                                                            break L3;
                                                          } else {
                                                            if (201 != var2) {
                                                              if (var2 == 202) {
                                                                break L3;
                                                              } else {
                                                                if (var2 != 203) {
                                                                  L4: {
                                                                    if (var2 != 237) {
                                                                      if (var2 != 238) {
                                                                        if (var2 == 239) {
                                                                          break L4;
                                                                        } else {
                                                                          if (var2 != 205) {
                                                                            if (var2 != 206) {
                                                                              if (207 != var2) {
                                                                                L5: {
                                                                                  if (var2 == 242) {
                                                                                    break L5;
                                                                                  } else {
                                                                                    if (var2 == 243) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (var2 != 244) {
                                                                                        if (var2 == 246) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (245 != var2) {
                                                                                            if (var2 == 210) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if (211 == var2) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if (var2 != 212) {
                                                                                                  if (var2 != 214) {
                                                                                                    if (var2 != 213) {
                                                                                                      L6: {
                                                                                                        if (249 != var2) {
                                                                                                          if (var2 != 250) {
                                                                                                            if (251 == var2) {
                                                                                                              break L6;
                                                                                                            } else {
                                                                                                              if (var2 == 252) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (217 == var2) {
                                                                                                                  break L6;
                                                                                                                } else {
                                                                                                                  if (218 != var2) {
                                                                                                                    if (var2 == 219) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (var2 == 220) {
                                                                                                                        break L6;
                                                                                                                      } else {
                                                                                                                        L7: {
                                                                                                                          if (var2 != 231) {
                                                                                                                            if (var2 != 199) {
                                                                                                                              L8: {
                                                                                                                                if (var2 == 255) {
                                                                                                                                  break L8;
                                                                                                                                } else {
                                                                                                                                  if (var2 != 376) {
                                                                                                                                    L9: {
                                                                                                                                      if (var2 != 241) {
                                                                                                                                        if (var2 != 209) {
                                                                                                                                          if (223 != var2) {
                                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                                          } else {
                                                                                                                                            return 'b';
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          break L9;
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        break L9;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                    return 'n';
                                                                                                                                  } else {
                                                                                                                                    break L8;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              return 'y';
                                                                                                                            } else {
                                                                                                                              break L7;
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            break L7;
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    break L6;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L6;
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L6;
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    } else {
                                                                                                      break L5;
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L5;
                                                                                                  }
                                                                                                } else {
                                                                                                  break L5;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            break L5;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        break L5;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              } else {
                                                                                break L4;
                                                                              }
                                                                            } else {
                                                                              break L4;
                                                                            }
                                                                          } else {
                                                                            break L4;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L4;
                                                                      }
                                                                    } else {
                                                                      break L4;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L3;
                                                    }
                                                  } else {
                                                    break L3;
                                                  }
                                                }
                                                return 'e';
                                              } else {
                                                break L2;
                                              }
                                            } else {
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          return 'a';
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                  return param1;
                }
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        return '_';
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        q var4_ref_q = null;
        int var5_int = 0;
        q var5 = null;
        String var5_ref = null;
        q var6 = null;
        int var6_int = 0;
        int var7 = 0;
        q var8 = null;
        String var9 = null;
        q var10 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        String stackOut_6_0 = null;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            field_v = -11;
            break L0;
          }
        }
        L1: {
          if (((ah) this).field_m.length == 2) {
            ((ah) this).e(2);
            break L1;
          } else {
            var2 = 0;
            var3 = 0;
            L2: while (true) {
              if (var3 >= -1 + ((ah) this).field_m.length) {
                var3 = 30 + var2 * 4;
                var4 = 120 - -((-var3 + 475) / 2);
                var5_int = 0;
                L3: while (true) {
                  if (((ah) this).field_m.length - 1 <= var5_int) {
                    var8 = ((ah) this).field_m[((ah) this).field_m.length - 1];
                    var10 = var8;
                    var5 = var10;
                    var8.field_j = hq.field_s[0].field_x;
                    var8.field_d = hq.field_s[0].field_z * 2;
                    var5.field_c = (-var10.field_j + 240) / 4;
                    var5.field_a = 140;
                    break L1;
                  } else {
                    var6 = ((ah) this).field_m[var5_int];
                    var6.field_c = var4;
                    var6.field_a = ((ah) this).b(var5_int, 1);
                    var6.field_j = var2;
                    var6.field_d = ((ah) this).b((byte) 118, var5_int);
                    var4 = var4 + (10 - -var6.field_j);
                    var5_int++;
                    continue L3;
                  }
                }
              } else {
                L4: {
                  var4_ref_q = ((ah) this).field_m[var3];
                  if (var4_ref_q.field_f == 8) {
                    stackOut_7_0 = ((ah) this).e((byte) 125);
                    stackIn_8_0 = stackOut_7_0;
                    break L4;
                  } else {
                    stackOut_6_0 = ag.field_D[var4_ref_q.field_f];
                    stackIn_8_0 = stackOut_6_0;
                    break L4;
                  }
                }
                var9 = stackIn_8_0;
                var5_ref = var9;
                var6_int = nn.field_g.c(var9) + 30;
                if (var6_int > var2) {
                  var2 = var6_int;
                  var3++;
                  continue L2;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static void a(pi param0) {
        try {
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            int var6_int = 0;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            bg var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            bg var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            String stackIn_67_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            String stackOut_66_2 = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            String stackOut_65_2 = null;
            var18 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = BrickABrac.field_J ? 1 : 0;
            try {
              L0: {
                var13 = (bg) (Object) mf.field_i.d(-48);
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var17.field_s <= var4) {
                      if (var3 == 0) {
                        var4 = param0.field_l;
                        param0.a(var17.field_i, (byte) -79);
                        var5 = 0;
                        L2: while (true) {
                          if (var17.field_s <= var5) {
                            int discarded$1 = param0.d(3, var4);
                            var17.b((byte) 111);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_k[var5] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_t[var5];
                                      if (var6_int == 0) {
                                        var15 = (java.lang.reflect.Field) var17.field_j[var5].field_e;
                                        var8 = var15.getInt((Object) null);
                                        param0.a(-7, 0);
                                        param0.a(var8, (byte) -79);
                                        break L5;
                                      } else {
                                        if (var6_int == 1) {
                                          var16_ref = (java.lang.reflect.Field) var17.field_j[var5].field_e;
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_q[var5]);
                                          param0.a(-15, 0);
                                          break L5;
                                        } else {
                                          if (var6_int == 2) {
                                            var26 = (java.lang.reflect.Field) var17.field_j[var5].field_e;
                                            var8 = var26.getModifiers();
                                            param0.a(5, 0);
                                            param0.a(var8, (byte) -79);
                                            break L5;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var6_int == 3) {
                                        var28 = (java.lang.reflect.Method) var17.field_l[var5].field_e;
                                        var25 = var17.field_m[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var25.length <= var10_int) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param0.a(52, 0);
                                              break L6;
                                            } else {
                                              if (var10 instanceof Number) {
                                                param0.a(-121, 1);
                                                param0.a(-23054, ((Number) var10).longValue());
                                                break L6;
                                              } else {
                                                if (!(var10 instanceof String)) {
                                                  param0.a(22, 4);
                                                  break L6;
                                                } else {
                                                  param0.a(-112, 2);
                                                  param0.a((String) var10, -1);
                                                  break L6;
                                                }
                                              }
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        if (var6_int == 4) {
                                          var27 = (java.lang.reflect.Method) var17.field_l[var5].field_e;
                                          var8 = var27.getModifiers();
                                          param0.a(-123, 0);
                                          param0.a(var8, (byte) -79);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.a(109, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.a(-126, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.a(-114, -16);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.a(-111, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.a(-103, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.a(101, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.a(87, -21);
                                    break L19;
                                  }
                                }
                                break L3;
                              } else {
                                param0.a(87, var17.field_k[var5]);
                                break L3;
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      L20: {
                        if (null != var13.field_j[var4]) {
                          L21: {
                            if (var13.field_j[var4].field_f != 2) {
                              break L21;
                            } else {
                              var13.field_k[var4] = -5;
                              break L21;
                            }
                          }
                          if (0 != var13.field_j[var4].field_f) {
                            break L20;
                          } else {
                            var3 = 1;
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                      L22: {
                        if (var13.field_l[var4] != null) {
                          L23: {
                            if (2 != var13.field_l[var4].field_f) {
                              break L23;
                            } else {
                              var13.field_k[var4] = -6;
                              break L23;
                            }
                          }
                          if (0 == var13.field_l[var4].field_f) {
                            var3 = 1;
                            break L22;
                          } else {
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_64_0 = (RuntimeException) var2;
                stackOut_64_1 = new StringBuilder().append("ah.B(");
                stackIn_66_0 = stackOut_64_0;
                stackIn_66_1 = stackOut_64_1;
                stackIn_65_0 = stackOut_64_0;
                stackIn_65_1 = stackOut_64_1;
                if (param0 == null) {
                  stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
                  stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
                  stackOut_66_2 = "null";
                  stackIn_67_0 = stackOut_66_0;
                  stackIn_67_1 = stackOut_66_1;
                  stackIn_67_2 = stackOut_66_2;
                  break L24;
                } else {
                  stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
                  stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
                  stackOut_65_2 = "{...}";
                  stackIn_67_0 = stackOut_65_0;
                  stackIn_67_1 = stackOut_65_1;
                  stackIn_67_2 = stackOut_65_2;
                  break L24;
                }
              }
              throw qb.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + ',' + 9 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        field_u = null;
        if (param0 != -5) {
            Object var2 = null;
            ah.a((String) null, -31, (String) null);
        }
        field_w = null;
    }

    final boolean a(int param0, boolean param1, byte param2) {
        int var4 = 0;
        q var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        var4 = 0;
        if (param2 == 123) {
          L0: {
            var5 = ((ah) this).field_m[param0];
            var6 = var5.field_f;
            var7 = var6;
            if (14 != var7) {
              if (var7 == 15) {
                if (((ah) this).field_h.a((byte) 113)) {
                  ((ah) this).field_t = 1;
                  ((ah) this).b(true, param0);
                  var4 = 1;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                if (var7 == 16) {
                  if (!((ah) this).field_h.a((byte) 113)) {
                    break L0;
                  } else {
                    ((ah) this).field_t = 2;
                    var4 = 1;
                    ((ah) this).b(true, param0);
                    break L0;
                  }
                } else {
                  if (var7 != 43) {
                    return super.a(param0, param1, (byte) 123);
                  } else {
                    if (!((ah) this).field_h.a((byte) 113)) {
                      break L0;
                    } else {
                      if (((ah) this).field_r.field_i != -1) {
                        rf.field_g = null;
                        var4 = 1;
                        ((ah) this).field_s = ((ah) this).field_r.field_i;
                        break L0;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              if (((ah) this).field_h.a((byte) 113)) {
                ((ah) this).field_t = 0;
                ((ah) this).b(true, param0);
                var4 = 1;
                break L0;
              } else {
                break L0;
              }
            }
          }
          return var4 != 0;
        } else {
          return true;
        }
    }

    ah() {
        super(5, 38, 460, 402, 35, nc.field_a);
        ((ah) this).field_s = 0;
        ((ah) this).field_t = 0;
        fk.field_g = ob.field_D.c("10. ") + 10;
        lq.field_b = new int[4];
        lq.field_b[2] = 125 - -fk.field_g - -330;
        lq.field_b[1] = 125 + fk.field_g + 240;
        lq.field_b[0] = 125 + fk.field_g;
        lq.field_b[3] = 50 - (-fk.field_g - 500);
        ((ah) this).field_r = new jf((ah) this, ao.field_k.length - 1, 2);
    }

    final void d(int param0) {
        ((ah) this).a(ao.field_k, 0);
        ((ah) this).b(true, 1);
        if (param0 >= -60) {
            ah.f(-46);
        }
    }

    final static long a(boolean param0, CharSequence param1) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_21_0 = 0L;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_20_0 = 0L;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_long = 0L;
            var4 = param1.length();
            var5 = 0;
            L1: while (true) {
              L2: {
                if (var4 <= var5) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var2_long = var2_long * 37L;
                      var6 = param1.charAt(var5);
                      if (var6 < 65) {
                        break L4;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(-65 + (1 + var6));
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 97) {
                        break L5;
                      } else {
                        if (122 < var6) {
                          break L5;
                        } else {
                          var2_long = var2_long + (long)(1 + var6 - 97);
                          break L3;
                        }
                      }
                    }
                    if (48 > var6) {
                      break L3;
                    } else {
                      if (var6 <= 57) {
                        var2_long = var2_long + (long)(var6 + -21);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (var2_long >= 177917621779460413L) {
                    break L2;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
              L6: while (true) {
                L7: {
                  if (var2_long % 37L != 0L) {
                    break L7;
                  } else {
                    if (var2_long == 0L) {
                      break L7;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L6;
                    }
                  }
                }
                stackOut_20_0 = var2_long;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("ah.D(").append(false).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        String var4_ref = null;
        String[] var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        int[] var16 = null;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        super.b((byte) -38);
        al.a(((ah) this).field_a, 19);
        ((ah) this).a(0);
        if (og.h(-26090)) {
          im.a(550, 5, 243, 5, 140, (byte) -108, 45);
          fj.a(243, na.field_N, 140, nn.field_g, -15531, 2);
          return;
        } else {
          L0: {
            im.a(475, 5, 33, 5, 140, (byte) -101, 120);
            nn.field_g.b(qn.field_u[((ah) this).field_s], 357, 1 + (-nn.field_g.field_L + 178), 0, -1);
            da.field_E[((ah) this).field_s].e(565, 140, -2048, 4096);
            if (param0 < -14) {
              break L0;
            } else {
              field_v = -65;
              break L0;
            }
          }
          L1: {
            L2: {
              im.a(475, 5, 243, 5, 178, (byte) -57, 120);
              var2 = 149 - -nn.field_g.field_B + 38;
              var3 = 0;
              nn.field_g.c(ae.field_i, -fk.field_g + lq.field_b[0] + 12, var2, var3, -1);
              nn.field_g.a(mn.field_u, lq.field_b[1], var2, var3, -1);
              nn.field_g.a(ba.field_u, lq.field_b[2], var2, var3, -1);
              nn.field_g.a(pj.field_d, lq.field_b[3], var2, var3, -1);
              var2 = 5 * (nn.field_g.field_P + nn.field_g.field_B) / 2 + 187;
              var4 = null;
              if (rf.field_g == null) {
                break L2;
              } else {
                if (!rf.field_g.field_o) {
                  break L2;
                } else {
                  if (null != rf.field_g.field_i) {
                    var4_ref = da.field_J;
                    var5 = rf.field_g.field_i[((ah) this).field_t];
                    var13 = rf.field_g.field_n[((ah) this).field_t];
                    var7 = gj.a(rf.field_g, fj.field_Ub, -87, ((ah) this).field_t);
                    var8 = 0;
                    L3: while (true) {
                      if (10 <= var8) {
                        if (fj.field_Ub == null) {
                          break L1;
                        } else {
                          if (var7 >= 0) {
                            break L1;
                          } else {
                            var16 = fj.field_Ub.field_i;
                            var8 = var16[0];
                            var9 = var16[1] >> 16 & 65535;
                            var10 = 65535 & var16[1];
                            this.a(-1, var9, var2, 1, var10, 63, var8, tb.field_cb);
                            break L1;
                          }
                        }
                      } else {
                        if (var5[var8] != null) {
                          L4: {
                            if (var7 == var8) {
                              stackOut_15_0 = 1;
                              stackIn_16_0 = stackOut_15_0;
                              break L4;
                            } else {
                              stackOut_14_0 = 2;
                              stackIn_16_0 = stackOut_14_0;
                              break L4;
                            }
                          }
                          L5: {
                            var3 = stackIn_16_0;
                            var9 = var13[2 * var8];
                            var10 = var13[2 * var8 - -1] >> 16 & 65535;
                            var11 = var13[1 + 2 * var8] & 65535;
                            if ((1 & var8) != 0) {
                              break L5;
                            } else {
                              lb.d(125, var2 - 15, 465, 18, 16777215, 16);
                              break L5;
                            }
                          }
                          var4_ref = "";
                          this.a(var8, var10, var2, var3, var11, 105, var9, var5[var8]);
                          var2 += 18;
                          var8++;
                          continue L3;
                        } else {
                          var2 += 18;
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var4_ref = rn.field_d;
                    break L1;
                  }
                }
              }
            }
            var4_ref = kd.field_a;
            break L1;
          }
          L6: {
            if (var4_ref == null) {
              break L6;
            } else {
              sa.a(178, nn.field_g, var4_ref, 357, 243, 2, 15);
              break L6;
            }
          }
          ((ah) this).field_r.b(117);
          return;
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        super.a(param0, param1, -100);
        if (param2 >= -52) {
            return;
        }
        if (og.h(-26090)) {
            return;
        }
        if (rf.field_g == null) {
            int discarded$0 = 3;
            int discarded$1 = 10;
            int discarded$2 = 2;
            rf.field_g = cp.b(-2, ((ah) this).field_s);
        }
        ((ah) this).field_r.a(111);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = 0;
    }
}
