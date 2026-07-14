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
                if (!(-2 != (var4.field_b.field_h ^ -1))) {
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
            return -44 == (var3 ^ -1) ? 140 : -6 + (((ah) this).field_p - -38);
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
        ih.a(false, param0, param2, 2);
        if (param1 != 11455) {
            field_v = -30;
        }
    }

    final void a(int param0, int param1, char param2) {
        int var5 = 0;
        L0: {
          var5 = BrickABrac.field_J ? 1 : 0;
          if (((ah) this).field_m.length == -3) {
            ((ah) this).field_h.a(0, param0 + 119);
            break L0;
          } else {
            L1: {
              if (param1 == -97) {
                if (-1 >= ((ah) this).field_h.field_j) {
                  ((ah) this).field_h.a(false, 3);
                  break L1;
                } else {
                  if (-5 > ((ah) this).field_h.field_j) {
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
              if ((param1 ^ -1) == -98) {
                if (3 <= ((ah) this).field_h.field_j) {
                  if (((ah) this).field_h.field_j == -4) {
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
              if (-100 == param1) {
                if ((((ah) this).field_h.field_j ^ -1) > -5) {
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
              if ((param1 ^ -1) != -99) {
                break L4;
              } else {
                if (4 > ((ah) this).field_h.field_j) {
                  ((ah) this).field_h.a(false, 4);
                  ((ah) this).field_r.c(param0 ^ 119);
                  ((ah) this).field_h.d((byte) -124);
                  break L0;
                } else {
                  if (!((ah) this).field_r.a(param1, param2, -67)) {
                    break L4;
                  } else {
                    ((ah) this).field_h.a(false, 0);
                    ((ah) this).field_h.d((byte) -124);
                    break L0;
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
        if (!(param0 == -1)) {
            ob.field_D.a(param0 + 1 + ". ", lq.field_b[0], param2, param3, -1);
        }
        ob.field_D.c(param7, lq.field_b[0], param2, param3, -1);
        ob.field_D.b(Integer.toString(1 + param1), lq.field_b[1] - nn.field_g.c(mn.field_u) / 2, param2, param3, -1);
        ob.field_D.b(Integer.toString(1 - -param4), lq.field_b[2] - nn.field_g.c(ba.field_u) / 2, param2, param3, -1);
        ob.field_D.a(Integer.toString(param6), lq.field_b[3], param2, param3, -1);
        int var9 = 102 % ((param5 - -15) / 45);
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 207) {
          L0: {
            var2 = param1;
            if (32 != var2) {
              if (160 != var2) {
                if (var2 != -96) {
                  if (-46 == var2) {
                    break L0;
                  } else {
                    L1: {
                      if ((var2 ^ -1) != -92) {
                        if (var2 != 93) {
                          if (35 == var2) {
                            break L1;
                          } else {
                            L2: {
                              if (var2 == -225) {
                                break L2;
                              } else {
                                if (225 != var2) {
                                  if (-227 == var2) {
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
                                                                if (-203 == (var2 ^ -1)) {
                                                                  break L3;
                                                                } else {
                                                                  if (var2 != -204) {
                                                                    L4: {
                                                                      if (-238 != var2) {
                                                                        if (var2 != 238) {
                                                                          if (var2 == -240) {
                                                                            break L4;
                                                                          } else {
                                                                            if (-206 != var2) {
                                                                              if (var2 != 206) {
                                                                                if (207 != var2) {
                                                                                  L5: {
                                                                                    if (var2 == 242) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (-244 == var2) {
                                                                                        break L5;
                                                                                      } else {
                                                                                        if (-245 != var2) {
                                                                                          if ((var2 ^ -1) == -247) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (245 != var2) {
                                                                                              if ((var2 ^ -1) == -211) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if (211 == var2) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if ((var2 ^ -1) != -213) {
                                                                                                    if ((var2 ^ -1) != -215) {
                                                                                                      if (var2 != -214) {
                                                                                                        L6: {
                                                                                                          if (249 != var2) {
                                                                                                            if (var2 != 250) {
                                                                                                              if (251 == var2) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (-253 == var2) {
                                                                                                                  break L6;
                                                                                                                } else {
                                                                                                                  if (217 == var2) {
                                                                                                                    break L6;
                                                                                                                  } else {
                                                                                                                    if (218 != var2) {
                                                                                                                      if (var2 == -220) {
                                                                                                                        break L6;
                                                                                                                      } else {
                                                                                                                        if (var2 == 220) {
                                                                                                                          break L6;
                                                                                                                        } else {
                                                                                                                          L7: {
                                                                                                                            if (-232 != var2) {
                                                                                                                              if (var2 != -200) {
                                                                                                                                L8: {
                                                                                                                                  if (-256 == var2) {
                                                                                                                                    break L8;
                                                                                                                                  } else {
                                                                                                                                    if (-377 != (var2 ^ -1)) {
                                                                                                                                      L9: {
                                                                                                                                        if (var2 != 241) {
                                                                                                                                          if ((var2 ^ -1) != -210) {
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
        } else {
          return 'j';
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        q var4_ref_q = null;
        int var5_int = 0;
        q var5 = null;
        q var6 = null;
        int var6_int = 0;
        int var7 = 0;
        q var8 = null;
        String var9 = null;
        q var10 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0;
        String stackOut_6_0;
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
          if ((((ah) this).field_m.length ^ -1) == -3) {
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
                  if ((var4_ref_q.field_f ^ -1) == -9) {
                    stackOut_7_0 = ((ah) this).e((byte) 125);
                    stackIn_8_0 = stackOut_7_0;
                    break L4;
                  } else {
                    stackOut_6_0 = ag.field_D[var4_ref_q.field_f];
                    stackIn_8_0 = stackOut_6_0;
                    break L4;
                  }
                }
                var9 = (String) (Object) stackIn_8_0;
                var5 = (q) (Object) var9;
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

    final static void a(pi param0, byte param1) {
        try {
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
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var18 = null;
                        var16 = null;
                        var20 = null;
                        var22 = null;
                        var12 = BrickABrac.field_J ? 1 : 0;
                        var13 = (bg) (Object) mf.field_i.d(-48);
                        var17 = var13;
                        if (var17 != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        var3 = 0;
                        var4 = 0;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (var17.field_s <= var4) {
                            statePc = 17;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        if (null != var13.field_j[var4]) {
                            statePc = 6;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        if (var13.field_j[var4].field_f != 2) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var13.field_k[var4] = -5;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (0 != var13.field_j[var4].field_f) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var3 = 1;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (var13.field_l[var4] != null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var4++;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 12: {
                        if (2 != var13.field_l[var4].field_f) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var13.field_k[var4] = -6;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (0 == var13.field_l[var4].field_f) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var4++;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 16: {
                        var3 = 1;
                        var4++;
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 17: {
                        if (var3 == 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        return;
                    }
                    case 19: {
                        var4 = param0.field_l;
                        param0.a(var17.field_i, (byte) -79);
                        var5 = 0;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (var17.field_s <= var5) {
                            statePc = 58;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (-1 == (var17.field_k[var5] ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        param0.a(87, var17.field_k[var5]);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 23: {
                        try {
                            var6_int = var17.field_t[var5];
                            if (var6_int == 0) {
                                statePc = 29;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ClassNotFoundException ? 45 : (stateCaught_23 instanceof InvalidClassException ? 46 : (stateCaught_23 instanceof StreamCorruptedException ? 47 : (stateCaught_23 instanceof OptionalDataException ? 48 : (stateCaught_23 instanceof IllegalAccessException ? 49 : (stateCaught_23 instanceof IllegalArgumentException ? 50 : (stateCaught_23 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_23 instanceof SecurityException ? 52 : (stateCaught_23 instanceof IOException ? 53 : (stateCaught_23 instanceof NullPointerException ? 54 : (stateCaught_23 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if ((var6_int ^ -1) == -2) {
                                statePc = 28;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ClassNotFoundException ? 45 : (stateCaught_24 instanceof InvalidClassException ? 46 : (stateCaught_24 instanceof StreamCorruptedException ? 47 : (stateCaught_24 instanceof OptionalDataException ? 48 : (stateCaught_24 instanceof IllegalAccessException ? 49 : (stateCaught_24 instanceof IllegalArgumentException ? 50 : (stateCaught_24 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_24 instanceof SecurityException ? 52 : (stateCaught_24 instanceof IOException ? 53 : (stateCaught_24 instanceof NullPointerException ? 54 : (stateCaught_24 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if ((var6_int ^ -1) == -3) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ClassNotFoundException ? 45 : (stateCaught_25 instanceof InvalidClassException ? 46 : (stateCaught_25 instanceof StreamCorruptedException ? 47 : (stateCaught_25 instanceof OptionalDataException ? 48 : (stateCaught_25 instanceof IllegalAccessException ? 49 : (stateCaught_25 instanceof IllegalArgumentException ? 50 : (stateCaught_25 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_25 instanceof SecurityException ? 52 : (stateCaught_25 instanceof IOException ? 53 : (stateCaught_25 instanceof NullPointerException ? 54 : (stateCaught_25 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ClassNotFoundException ? 45 : (stateCaught_26 instanceof InvalidClassException ? 46 : (stateCaught_26 instanceof StreamCorruptedException ? 47 : (stateCaught_26 instanceof OptionalDataException ? 48 : (stateCaught_26 instanceof IllegalAccessException ? 49 : (stateCaught_26 instanceof IllegalArgumentException ? 50 : (stateCaught_26 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_26 instanceof SecurityException ? 52 : (stateCaught_26 instanceof IOException ? 53 : (stateCaught_26 instanceof NullPointerException ? 54 : (stateCaught_26 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var26 = (java.lang.reflect.Field) var17.field_j[var5].field_e;
                            var8 = var26.getModifiers();
                            param0.a(param1 + -4, 0);
                            param0.a(var8, (byte) -79);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ClassNotFoundException ? 45 : (stateCaught_27 instanceof InvalidClassException ? 46 : (stateCaught_27 instanceof StreamCorruptedException ? 47 : (stateCaught_27 instanceof OptionalDataException ? 48 : (stateCaught_27 instanceof IllegalAccessException ? 49 : (stateCaught_27 instanceof IllegalArgumentException ? 50 : (stateCaught_27 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_27 instanceof SecurityException ? 52 : (stateCaught_27 instanceof IOException ? 53 : (stateCaught_27 instanceof NullPointerException ? 54 : (stateCaught_27 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var16_ref = (java.lang.reflect.Field) var17.field_j[var5].field_e;
                            var19 = var16_ref;
                            var19.setInt((Object) null, var17.field_q[var5]);
                            param0.a(-15, 0);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ClassNotFoundException ? 45 : (stateCaught_28 instanceof InvalidClassException ? 46 : (stateCaught_28 instanceof StreamCorruptedException ? 47 : (stateCaught_28 instanceof OptionalDataException ? 48 : (stateCaught_28 instanceof IllegalAccessException ? 49 : (stateCaught_28 instanceof IllegalArgumentException ? 50 : (stateCaught_28 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_28 instanceof SecurityException ? 52 : (stateCaught_28 instanceof IOException ? 53 : (stateCaught_28 instanceof NullPointerException ? 54 : (stateCaught_28 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var15 = (java.lang.reflect.Field) var17.field_j[var5].field_e;
                            var8 = var15.getInt((Object) null);
                            param0.a(-7, 0);
                            param0.a(var8, (byte) -79);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ClassNotFoundException ? 45 : (stateCaught_29 instanceof InvalidClassException ? 46 : (stateCaught_29 instanceof StreamCorruptedException ? 47 : (stateCaught_29 instanceof OptionalDataException ? 48 : (stateCaught_29 instanceof IllegalAccessException ? 49 : (stateCaught_29 instanceof IllegalArgumentException ? 50 : (stateCaught_29 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_29 instanceof SecurityException ? 52 : (stateCaught_29 instanceof IOException ? 53 : (stateCaught_29 instanceof NullPointerException ? 54 : (stateCaught_29 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((var6_int ^ -1) == -4) {
                                statePc = 34;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ClassNotFoundException ? 45 : (stateCaught_30 instanceof InvalidClassException ? 46 : (stateCaught_30 instanceof StreamCorruptedException ? 47 : (stateCaught_30 instanceof OptionalDataException ? 48 : (stateCaught_30 instanceof IllegalAccessException ? 49 : (stateCaught_30 instanceof IllegalArgumentException ? 50 : (stateCaught_30 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_30 instanceof SecurityException ? 52 : (stateCaught_30 instanceof IOException ? 53 : (stateCaught_30 instanceof NullPointerException ? 54 : (stateCaught_30 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var6_int == 4) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ClassNotFoundException ? 45 : (stateCaught_31 instanceof InvalidClassException ? 46 : (stateCaught_31 instanceof StreamCorruptedException ? 47 : (stateCaught_31 instanceof OptionalDataException ? 48 : (stateCaught_31 instanceof IllegalAccessException ? 49 : (stateCaught_31 instanceof IllegalArgumentException ? 50 : (stateCaught_31 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_31 instanceof SecurityException ? 52 : (stateCaught_31 instanceof IOException ? 53 : (stateCaught_31 instanceof NullPointerException ? 54 : (stateCaught_31 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ClassNotFoundException ? 45 : (stateCaught_32 instanceof InvalidClassException ? 46 : (stateCaught_32 instanceof StreamCorruptedException ? 47 : (stateCaught_32 instanceof OptionalDataException ? 48 : (stateCaught_32 instanceof IllegalAccessException ? 49 : (stateCaught_32 instanceof IllegalArgumentException ? 50 : (stateCaught_32 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_32 instanceof SecurityException ? 52 : (stateCaught_32 instanceof IOException ? 53 : (stateCaught_32 instanceof NullPointerException ? 54 : (stateCaught_32 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var27 = (java.lang.reflect.Method) var17.field_l[var5].field_e;
                            var8 = var27.getModifiers();
                            param0.a(-123, 0);
                            param0.a(var8, (byte) -79);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ClassNotFoundException ? 45 : (stateCaught_33 instanceof InvalidClassException ? 46 : (stateCaught_33 instanceof StreamCorruptedException ? 47 : (stateCaught_33 instanceof OptionalDataException ? 48 : (stateCaught_33 instanceof IllegalAccessException ? 49 : (stateCaught_33 instanceof IllegalArgumentException ? 50 : (stateCaught_33 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_33 instanceof SecurityException ? 52 : (stateCaught_33 instanceof IOException ? 53 : (stateCaught_33 instanceof NullPointerException ? 54 : (stateCaught_33 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var28 = (java.lang.reflect.Method) var17.field_l[var5].field_e;
                            var25 = var17.field_m[var5];
                            var9 = new Object[var25.length];
                            var10_int = 0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ClassNotFoundException ? 45 : (stateCaught_34 instanceof InvalidClassException ? 46 : (stateCaught_34 instanceof StreamCorruptedException ? 47 : (stateCaught_34 instanceof OptionalDataException ? 48 : (stateCaught_34 instanceof IllegalAccessException ? 49 : (stateCaught_34 instanceof IllegalArgumentException ? 50 : (stateCaught_34 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_34 instanceof SecurityException ? 52 : (stateCaught_34 instanceof IOException ? 53 : (stateCaught_34 instanceof NullPointerException ? 54 : (stateCaught_34 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var25.length <= var10_int) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ClassNotFoundException ? 45 : (stateCaught_35 instanceof InvalidClassException ? 46 : (stateCaught_35 instanceof StreamCorruptedException ? 47 : (stateCaught_35 instanceof OptionalDataException ? 48 : (stateCaught_35 instanceof IllegalAccessException ? 49 : (stateCaught_35 instanceof IllegalArgumentException ? 50 : (stateCaught_35 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_35 instanceof SecurityException ? 52 : (stateCaught_35 instanceof IOException ? 53 : (stateCaught_35 instanceof NullPointerException ? 54 : (stateCaught_35 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                            var9[var10_int] = var11.readObject();
                            var10_int++;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ClassNotFoundException ? 45 : (stateCaught_36 instanceof InvalidClassException ? 46 : (stateCaught_36 instanceof StreamCorruptedException ? 47 : (stateCaught_36 instanceof OptionalDataException ? 48 : (stateCaught_36 instanceof IllegalAccessException ? 49 : (stateCaught_36 instanceof IllegalArgumentException ? 50 : (stateCaught_36 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_36 instanceof SecurityException ? 52 : (stateCaught_36 instanceof IOException ? 53 : (stateCaught_36 instanceof NullPointerException ? 54 : (stateCaught_36 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var10 = var28.invoke((Object) null, var9);
                            if (var10 == null) {
                                statePc = 43;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ClassNotFoundException ? 45 : (stateCaught_37 instanceof InvalidClassException ? 46 : (stateCaught_37 instanceof StreamCorruptedException ? 47 : (stateCaught_37 instanceof OptionalDataException ? 48 : (stateCaught_37 instanceof IllegalAccessException ? 49 : (stateCaught_37 instanceof IllegalArgumentException ? 50 : (stateCaught_37 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_37 instanceof SecurityException ? 52 : (stateCaught_37 instanceof IOException ? 53 : (stateCaught_37 instanceof NullPointerException ? 54 : (stateCaught_37 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var10 instanceof Number) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ClassNotFoundException ? 45 : (stateCaught_38 instanceof InvalidClassException ? 46 : (stateCaught_38 instanceof StreamCorruptedException ? 47 : (stateCaught_38 instanceof OptionalDataException ? 48 : (stateCaught_38 instanceof IllegalAccessException ? 49 : (stateCaught_38 instanceof IllegalArgumentException ? 50 : (stateCaught_38 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_38 instanceof SecurityException ? 52 : (stateCaught_38 instanceof IOException ? 53 : (stateCaught_38 instanceof NullPointerException ? 54 : (stateCaught_38 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (!(var10 instanceof String)) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ClassNotFoundException ? 45 : (stateCaught_39 instanceof InvalidClassException ? 46 : (stateCaught_39 instanceof StreamCorruptedException ? 47 : (stateCaught_39 instanceof OptionalDataException ? 48 : (stateCaught_39 instanceof IllegalAccessException ? 49 : (stateCaught_39 instanceof IllegalArgumentException ? 50 : (stateCaught_39 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_39 instanceof SecurityException ? 52 : (stateCaught_39 instanceof IOException ? 53 : (stateCaught_39 instanceof NullPointerException ? 54 : (stateCaught_39 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            param0.a(param1 ^ -103, 2);
                            param0.a((String) var10, -1);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ClassNotFoundException ? 45 : (stateCaught_40 instanceof InvalidClassException ? 46 : (stateCaught_40 instanceof StreamCorruptedException ? 47 : (stateCaught_40 instanceof OptionalDataException ? 48 : (stateCaught_40 instanceof IllegalAccessException ? 49 : (stateCaught_40 instanceof IllegalArgumentException ? 50 : (stateCaught_40 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_40 instanceof SecurityException ? 52 : (stateCaught_40 instanceof IOException ? 53 : (stateCaught_40 instanceof NullPointerException ? 54 : (stateCaught_40 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            param0.a(22, 4);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ClassNotFoundException ? 45 : (stateCaught_41 instanceof InvalidClassException ? 46 : (stateCaught_41 instanceof StreamCorruptedException ? 47 : (stateCaught_41 instanceof OptionalDataException ? 48 : (stateCaught_41 instanceof IllegalAccessException ? 49 : (stateCaught_41 instanceof IllegalArgumentException ? 50 : (stateCaught_41 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_41 instanceof SecurityException ? 52 : (stateCaught_41 instanceof IOException ? 53 : (stateCaught_41 instanceof NullPointerException ? 54 : (stateCaught_41 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            param0.a(param1 ^ -114, 1);
                            param0.a(-23054, ((Number) var10).longValue());
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ClassNotFoundException ? 45 : (stateCaught_42 instanceof InvalidClassException ? 46 : (stateCaught_42 instanceof StreamCorruptedException ? 47 : (stateCaught_42 instanceof OptionalDataException ? 48 : (stateCaught_42 instanceof IllegalAccessException ? 49 : (stateCaught_42 instanceof IllegalArgumentException ? 50 : (stateCaught_42 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_42 instanceof SecurityException ? 52 : (stateCaught_42 instanceof IOException ? 53 : (stateCaught_42 instanceof NullPointerException ? 54 : (stateCaught_42 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            param0.a(param1 ^ 61, 0);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ClassNotFoundException ? 45 : (stateCaught_43 instanceof InvalidClassException ? 46 : (stateCaught_43 instanceof StreamCorruptedException ? 47 : (stateCaught_43 instanceof OptionalDataException ? 48 : (stateCaught_43 instanceof IllegalAccessException ? 49 : (stateCaught_43 instanceof IllegalArgumentException ? 50 : (stateCaught_43 instanceof java.lang.reflect.InvocationTargetException ? 51 : (stateCaught_43 instanceof SecurityException ? 52 : (stateCaught_43 instanceof IOException ? 53 : (stateCaught_43 instanceof NullPointerException ? 54 : (stateCaught_43 instanceof Exception ? 55 : 56)))))))))));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        var6 = (ClassNotFoundException) (Object) caughtException;
                        param0.a(80, -10);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 46: {
                        var6_ref = (InvalidClassException) (Object) caughtException;
                        param0.a(param1 + -127, -11);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 47: {
                        var6_ref2 = (StreamCorruptedException) (Object) caughtException;
                        param0.a(param1 ^ -126, -12);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 48: {
                        var6_ref3 = (OptionalDataException) (Object) caughtException;
                        param0.a(param1 + -16, -13);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 49: {
                        var6_ref4 = (IllegalAccessException) (Object) caughtException;
                        param0.a(109, -14);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 50: {
                        var6_ref5 = (IllegalArgumentException) (Object) caughtException;
                        param0.a(-126, -15);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 51: {
                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) caughtException;
                        param0.a(-114, -16);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 52: {
                        var6_ref7 = (SecurityException) (Object) caughtException;
                        param0.a(71, -17);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 53: {
                        var6_ref8 = (IOException) (Object) caughtException;
                        param0.a(-111, -18);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 54: {
                        var6_ref9 = (NullPointerException) (Object) caughtException;
                        param0.a(param1 + -112, -19);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 55: {
                        var6_ref10 = (Exception) (Object) caughtException;
                        param0.a(101, -20);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 56: {
                        var6_ref11 = caughtException;
                        param0.a(87, -21);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        var5++;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 58: {
                        if (param1 == 9) {
                            statePc = 60;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    }
                    case 59: {
                        char discarded$2 = ah.a(-62, '&');
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        int discarded$3 = param0.d(3, var4);
                        var17.b((byte) 111);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
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
                  if (-44 != (var7 ^ -1)) {
                    return super.a(param0, param1, (byte) 123);
                  } else {
                    if (!((ah) this).field_h.a((byte) 113)) {
                      break L0;
                    } else {
                      if ((((ah) this).field_r.field_i ^ -1) != 0) {
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
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = BrickABrac.field_J ? 1 : 0;
          var2 = 0L;
          var4 = param1.length();
          var5 = 0;
          if (!param0) {
            break L0;
          } else {
            field_w = null;
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var4 <= var5) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param1.charAt(var5);
                  if (var6 < 65) {
                    break L4;
                  } else {
                    if (var6 <= 90) {
                      var2 = var2 + (long)(-65 + (1 + var6));
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
                      var2 = var2 + (long)(1 + var6 - 97);
                      break L3;
                    }
                  }
                }
                if (48 > var6) {
                  break L3;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(var6 + -21);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if ((var2 ^ -1L) <= -177917621779460414L) {
                break L2;
              } else {
                var5++;
                continue L1;
              }
            }
          }
          L6: while (true) {
            L7: {
              if (var2 % 37L != 0L) {
                break L7;
              } else {
                if (var2 == 0L) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
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
        int stackOut_15_0;
        int stackOut_14_0;
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
                    var4 = da.field_J;
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
                            var9 = var16[1] >> -1831449328 & 65535;
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
                            var10 = var13[2 * var8 - -1] >> -478415920 & 65535;
                            var11 = var13[1 + 2 * var8] & 65535;
                            if (-1 != (1 & var8 ^ -1)) {
                              break L5;
                            } else {
                              lb.d(125, var2 - 15, 465, 18, 16777215, 16);
                              break L5;
                            }
                          }
                          var4 = "";
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
                    var4 = rn.field_d;
                    break L1;
                  }
                }
              }
            }
            var4 = kd.field_a;
            break L1;
          }
          L6: {
            if (var4 == null) {
              break L6;
            } else {
              sa.a(178, nn.field_g, var4, 357, 243, 2, 15);
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
            rf.field_g = cp.b(-2, ((ah) this).field_s, 2, 10, 3);
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
