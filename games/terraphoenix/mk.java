/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mk {
    private int field_l;
    int field_a;
    int field_b;
    int field_g;
    private dk field_i;
    private int field_n;
    static String field_h;
    int field_e;
    private int field_c;
    static String field_f;
    private int field_m;
    int field_d;
    int field_k;
    static uc field_j;

    public static void d(byte param0) {
        field_j = null;
        field_f = null;
        int var1 = 61 % ((-36 - param0) / 54);
        field_h = null;
    }

    final void b(int param0) {
        int var2 = 0;
        dl var3 = null;
        int var4 = 0;
        int var5 = 0;
        dl stackIn_90_0 = null;
        dl stackIn_91_0 = null;
        dl stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        dl stackIn_95_0 = null;
        dl stackIn_96_0 = null;
        dl stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        dl stackIn_101_0 = null;
        dl stackIn_102_0 = null;
        dl stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        dl stackOut_100_0 = null;
        dl stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        dl stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        dl stackOut_89_0 = null;
        dl stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        dl stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        dl stackOut_94_0 = null;
        dl stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        dl stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        L0: {
          var5 = Terraphoenix.field_V;
          if (1 == ((mk) this).field_a) {
            L1: {
              if (((mk) this).field_b <= 0) {
                break L1;
              } else {
                ((mk) this).field_b = ((mk) this).field_b - 1;
                ((mk) this).field_m = ((mk) this).field_m + 1;
                break L1;
              }
            }
            L2: {
              if (((mk) this).field_b >= 0) {
                break L2;
              } else {
                ((mk) this).field_b = ((mk) this).field_b + 1;
                ((mk) this).field_m = ((mk) this).field_m - 1;
                break L2;
              }
            }
            L3: {
              if (((mk) this).field_m < 0) {
                ((mk) this).field_m = ((mk) this).field_m + 16;
                break L3;
              } else {
                break L3;
              }
            }
            if (16 > ((mk) this).field_m) {
              break L0;
            } else {
              ((mk) this).field_m = ((mk) this).field_m - 16;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (0 >= j.field_R) {
            break L4;
          } else {
            j.field_R = j.field_R - 1;
            break L4;
          }
        }
        L5: {
          if (((mk) this).field_a == 2) {
            L6: {
              if (((mk) this).field_b <= 0) {
                break L6;
              } else {
                ((mk) this).field_b = ((mk) this).field_b - 1;
                ((mk) this).field_l = ((mk) this).field_l + 4;
                break L6;
              }
            }
            L7: {
              if (((mk) this).field_b < 0) {
                ((mk) this).field_b = ((mk) this).field_b + 1;
                ((mk) this).field_l = ((mk) this).field_l - 4;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((mk) this).field_l < 0) {
                ((mk) this).field_l = ((mk) this).field_l + 84;
                break L8;
              } else {
                break L8;
              }
            }
            if (((mk) this).field_l < 84) {
              break L5;
            } else {
              ((mk) this).field_l = ((mk) this).field_l - 84;
              break L5;
            }
          } else {
            break L5;
          }
        }
        L9: {
          var2 = -51 % ((param0 - 35) / 37);
          if (3 != ((mk) this).field_a) {
            break L9;
          } else {
            L10: {
              if (((mk) this).field_b <= 0) {
                break L10;
              } else {
                ((mk) this).field_b = ((mk) this).field_b - 1;
                ((mk) this).field_n = ((mk) this).field_n + 1;
                break L10;
              }
            }
            L11: {
              if (((mk) this).field_b >= 0) {
                break L11;
              } else {
                ((mk) this).field_n = ((mk) this).field_n - 1;
                ((mk) this).field_b = ((mk) this).field_b + 1;
                break L11;
              }
            }
            L12: {
              if (((mk) this).field_n < 0) {
                ((mk) this).field_n = ((mk) this).field_n + 80;
                break L12;
              } else {
                break L12;
              }
            }
            if (((mk) this).field_n < 80) {
              break L9;
            } else {
              ((mk) this).field_n = ((mk) this).field_n - 80;
              break L9;
            }
          }
        }
        L13: {
          L14: {
            if (((mk) this).field_g != 0) {
              break L14;
            } else {
              if (((mk) this).field_e == 0) {
                break L13;
              } else {
                break L14;
              }
            }
          }
          if (null == ((mk) this).field_i) {
            break L13;
          } else {
            if (uf.field_c != -1) {
              L15: {
                var3 = ((mk) this).field_i.field_f[uf.field_c][vf.field_a];
                if (((mk) this).field_a != 0) {
                  L16: {
                    if (var3 != null) {
                      break L16;
                    } else {
                      ((mk) this).field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, ((mk) this).field_i);
                      break L16;
                    }
                  }
                  var3 = ((mk) this).field_i.field_f[uf.field_c][vf.field_a];
                  break L15;
                } else {
                  break L15;
                }
              }
              L17: {
                if (tg.field_l <= 0) {
                  break L17;
                } else {
                  if (var3 == null) {
                    break L17;
                  } else {
                    L18: {
                      if (null == var3.field_C) {
                        break L18;
                      } else {
                        if (tg.field_l <= var3.field_r) {
                          break L18;
                        } else {
                          var3 = var3.field_C;
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (var3.field_C == null) {
                        break L19;
                      } else {
                        if (var3.field_r >= tg.field_l) {
                          break L19;
                        } else {
                          var3 = var3.field_C;
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (null == var3.field_C) {
                        break L20;
                      } else {
                        if (tg.field_l <= var3.field_r) {
                          break L20;
                        } else {
                          var3 = var3.field_C;
                          break L20;
                        }
                      }
                    }
                    L21: {
                      if (var3.field_C == null) {
                        break L21;
                      } else {
                        if (var3.field_r >= tg.field_l) {
                          break L21;
                        } else {
                          var3 = var3.field_C;
                          break L21;
                        }
                      }
                    }
                    L22: while (true) {
                      if (var3.field_r >= tg.field_l) {
                        break L17;
                      } else {
                        var3.field_C = new dl(uf.field_c, vf.field_a, 1 + var3.field_r, ((mk) this).field_i);
                        var3.field_C.field_c = var3;
                        var3 = var3.field_C;
                        continue L22;
                      }
                    }
                  }
                }
              }
              var4 = ((mk) this).field_a;
              if (var4 != 0) {
                if (var4 != 1) {
                  if (var4 != 2) {
                    if (var4 != 3) {
                      break L13;
                    } else {
                      L23: {
                        if (1 == ((mk) this).field_g) {
                          L24: {
                            stackOut_100_0 = (dl) var3;
                            stackIn_102_0 = stackOut_100_0;
                            stackIn_101_0 = stackOut_100_0;
                            if (((mk) this).field_n != var3.field_j) {
                              stackOut_102_0 = (dl) (Object) stackIn_102_0;
                              stackOut_102_1 = ((mk) this).field_n;
                              stackIn_103_0 = stackOut_102_0;
                              stackIn_103_1 = stackOut_102_1;
                              break L24;
                            } else {
                              stackOut_101_0 = (dl) (Object) stackIn_101_0;
                              stackOut_101_1 = -1;
                              stackIn_103_0 = stackOut_101_0;
                              stackIn_103_1 = stackOut_101_1;
                              break L24;
                            }
                          }
                          stackIn_103_0.field_j = stackIn_103_1;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      if (((mk) this).field_e == 2) {
                        var3.field_j = -1;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  } else {
                    L25: {
                      if (((mk) this).field_g != 2) {
                        break L25;
                      } else {
                        L26: {
                          stackOut_89_0 = (dl) var3;
                          stackIn_91_0 = stackOut_89_0;
                          stackIn_90_0 = stackOut_89_0;
                          if (((mk) this).field_l == var3.field_k) {
                            stackOut_91_0 = (dl) (Object) stackIn_91_0;
                            stackOut_91_1 = -1;
                            stackIn_92_0 = stackOut_91_0;
                            stackIn_92_1 = stackOut_91_1;
                            break L26;
                          } else {
                            stackOut_90_0 = (dl) (Object) stackIn_90_0;
                            stackOut_90_1 = ((mk) this).field_l;
                            stackIn_92_0 = stackOut_90_0;
                            stackIn_92_1 = stackOut_90_1;
                            break L26;
                          }
                        }
                        stackIn_92_0.field_k = stackIn_92_1;
                        break L25;
                      }
                    }
                    if (((mk) this).field_g != 1) {
                      break L13;
                    } else {
                      L27: {
                        stackOut_94_0 = (dl) var3;
                        stackIn_96_0 = stackOut_94_0;
                        stackIn_95_0 = stackOut_94_0;
                        if (var3.field_g != ((mk) this).field_l) {
                          stackOut_96_0 = (dl) (Object) stackIn_96_0;
                          stackOut_96_1 = ((mk) this).field_l;
                          stackIn_97_0 = stackOut_96_0;
                          stackIn_97_1 = stackOut_96_1;
                          break L27;
                        } else {
                          stackOut_95_0 = (dl) (Object) stackIn_95_0;
                          stackOut_95_1 = -1;
                          stackIn_97_0 = stackOut_95_0;
                          stackIn_97_1 = stackOut_95_1;
                          break L27;
                        }
                      }
                      stackIn_97_0.field_g = stackIn_97_1;
                      break L13;
                    }
                  }
                } else {
                  L28: {
                    if (1 != ((mk) this).field_e) {
                      break L28;
                    } else {
                      var3.field_b = ((mk) this).field_m;
                      break L28;
                    }
                  }
                  if (((mk) this).field_e != 2) {
                    break L13;
                  } else {
                    var3.field_b = -1;
                    break L13;
                  }
                }
              } else {
                L29: {
                  if (((mk) this).field_g != 1) {
                    break L29;
                  } else {
                    if (var3 != null) {
                      L30: while (true) {
                        if (null == var3.field_C) {
                          var3.field_C = new dl(uf.field_c, vf.field_a, 1 + var3.field_r, ((mk) this).field_i);
                          var3.field_C.field_c = var3;
                          break L29;
                        } else {
                          var3 = var3.field_C;
                          continue L30;
                        }
                      }
                    } else {
                      ((mk) this).field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, ((mk) this).field_i);
                      break L29;
                    }
                  }
                }
                if (((mk) this).field_e != 2) {
                  break L13;
                } else {
                  if (var3 != null) {
                    L31: while (true) {
                      if (null == var3.field_C) {
                        if (var3.field_c == null) {
                          ((mk) this).field_i.field_f[uf.field_c][vf.field_a] = null;
                          break L13;
                        } else {
                          var3.field_c.field_C = null;
                          break L13;
                        }
                      } else {
                        var3 = var3.field_C;
                        continue L31;
                      }
                    }
                  } else {
                    break L13;
                  }
                }
              }
            } else {
              break L13;
            }
          }
        }
    }

    final void a(byte param0) {
        Object var2 = null;
        byte[] var2_array = null;
        var2 = null;
        var2_array = of.field_k[((mk) this).field_c];
        if (var2_array == null) {
          ((mk) this).field_i = new dk(16, 16);
          ((mk) this).field_i.field_l = (mk) this;
          return;
        } else {
          L0: {
            this.a(false, var2_array);
            if (param0 <= -42) {
              break L0;
            } else {
              this.a(true, (byte[]) null);
              break L0;
            }
          }
          return;
        }
    }

    final void b(byte param0) {
        dl var2 = null;
        int var3 = 0;
        L0: {
          var3 = Terraphoenix.field_V;
          var2 = ((mk) this).field_i.field_f[uf.field_c][vf.field_a];
          if (param0 > 121) {
            break L0;
          } else {
            mk.d((byte) 89);
            break L0;
          }
        }
        L1: {
          if (0 != ((mk) this).field_a) {
            L2: {
              if (var2 != null) {
                break L2;
              } else {
                ((mk) this).field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, ((mk) this).field_i);
                break L2;
              }
            }
            var2 = ((mk) this).field_i.field_f[uf.field_c][vf.field_a];
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          if (tg.field_l <= 0) {
            break L3;
          } else {
            if (var2 == null) {
              break L3;
            } else {
              L4: {
                if (null == var2.field_C) {
                  break L4;
                } else {
                  if (var2.field_r >= tg.field_l) {
                    break L4;
                  } else {
                    var2 = var2.field_C;
                    break L4;
                  }
                }
              }
              L5: {
                if (null == var2.field_C) {
                  break L5;
                } else {
                  if (var2.field_r < tg.field_l) {
                    var2 = var2.field_C;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (null == var2.field_C) {
                  break L6;
                } else {
                  if (var2.field_r < tg.field_l) {
                    var2 = var2.field_C;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (var2.field_C == null) {
                  break L7;
                } else {
                  if (var2.field_r >= tg.field_l) {
                    break L7;
                  } else {
                    var2 = var2.field_C;
                    break L7;
                  }
                }
              }
              L8: while (true) {
                if (tg.field_l <= var2.field_r) {
                  break L3;
                } else {
                  var2.field_C = new dl(uf.field_c, vf.field_a, 1 + var2.field_r, ((mk) this).field_i);
                  var2.field_C.field_c = var2;
                  var2 = var2.field_C;
                  continue L8;
                }
              }
            }
          }
        }
        L9: {
          if (var2 != null) {
            L10: {
              if (var2.field_k == -1) {
                break L10;
              } else {
                var2.field_k = 3 + var2.field_k / 4 * 4;
                break L10;
              }
            }
            if (var2.field_g != -1) {
              var2.field_g = 3 + 4 * (var2.field_g / 4);
              break L9;
            } else {
              break L9;
            }
          } else {
            break L9;
          }
        }
    }

    final void a(int param0, int param1) {
        ((mk) this).c(-13859);
        ((mk) this).field_c = ((mk) this).field_c + param1;
        if (param0 != 23172) {
            this.a(true, (byte[]) null);
        }
        if (((mk) this).field_c < 0) {
            ((mk) this).field_c = ph.field_n.length + -1;
        }
        if (!(((mk) this).field_c < ph.field_n.length)) {
            ((mk) this).field_c = 0;
        }
        ((mk) this).a((byte) -118);
        fg.field_c = "LEVEL CHANGED";
        j.field_R = 256;
    }

    final void c(int param0) {
        if (!(null != ((mk) this).field_i)) {
            return;
        }
        fg.field_c = "MAP SAVING";
        j.field_R = 256;
        String var2 = ph.field_n[((mk) this).field_c] + ".lev";
        byte[] var3 = ((mk) this).field_i.a(true);
        int discarded$0 = 1;
        of.field_k[wf.a(var2)] = var3;
        fg.field_c = "MAP SAVED";
        j.field_R = 256;
        if (param0 != -13859) {
            ((mk) this).b(-93, 17);
        }
    }

    final static int a(int param0) {
        if (param0 != -1) {
            field_f = null;
        }
        return -vi.field_o + ql.field_g;
    }

    private final void a(boolean param0, String param1, int param2, int param3) {
        og.field_f.a(param1, 619, param2 - -3, 8421504, -1);
        og.field_f.a(param1, 618, param2 + 2, 8421504, -1);
        try {
            og.field_f.a(param1, 617, param2 + 1, 8421504, -1);
            og.field_f.a(param1, 617, param2, 0, -1);
            og.field_f.a(param1, 615, param2, 0, -1);
            og.field_f.a(param1, 616, -1 + param2, 0, -1);
            og.field_f.a(param1, 616, param2 - -1, 0, -1);
            og.field_f.a(param1, 616, param2, param3, -1);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "mk.I(" + 0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + 616 + 41);
        }
    }

    private final void a(boolean param0, byte[] param1) {
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
              fg.field_c = "MAP LOADING";
              j.field_R = 256;
              ((mk) this).field_i = new dk(param1);
              if (!param0) {
                break L1;
              } else {
                ((mk) this).b((byte) -127);
                break L1;
              }
            }
            L2: {
              fg.field_c = "MAP LOADED";
              j.field_R = 256;
              if (((mk) this).field_i == null) {
                break L2;
              } else {
                ((mk) this).field_i.field_l = (mk) this;
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
            stackOut_5_1 = new StringBuilder().append("mk.A(").append(param0).append(44);
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
          throw qk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final void b(int param0, int param1) {
        Exception exception = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        byte[] var5_array = null;
        String var6 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null == ((mk) this).field_i) {
            break L0;
          } else {
            if (param0 <= 0) {
              L1: {
                ((mk) this).field_i.field_b = ((mk) this).field_i.field_b + param0;
                ((mk) this).field_i.field_e = ((mk) this).field_i.field_e + param0;
                if (((mk) this).field_i.field_b < 2) {
                  ((mk) this).field_i.field_b = 2;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((mk) this).field_i.field_e >= 2) {
                break L0;
              } else {
                ((mk) this).field_i.field_e = 2;
                break L0;
              }
            } else {
              var3 = param0 + ((mk) this).field_i.field_b;
              var4 = ((mk) this).field_i.field_e + param0;
              ((mk) this).c(-13859);
              var5 = null;
              var6 = ph.field_n[((mk) this).field_c] + ".lev";
              try {
                L2: {
                  var5_array = vl.a(75, new File(var6));
                  break L2;
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  exception = (Exception) (Object) decompiledCaughtException;
                  System.out.println((Object) (Object) exception);
                  break L3;
                }
              }
              ((mk) this).field_i = new dk(var3, var4);
              ((mk) this).field_i.field_l = (mk) this;
              if (var5_array == null) {
                break L0;
              } else {
                ((mk) this).field_i.a(0, (byte) 104, 0, var5_array);
                break L0;
              }
            }
          }
        }
        L4: {
          if (param1 > 83) {
            break L4;
          } else {
            ((mk) this).b(51, -121);
            break L4;
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Terraphoenix.field_V;
          vc.field_f.b(ph.field_n[((mk) this).field_c], 24, 24, 0, -1);
          if (((mk) this).field_i == null) {
            vc.field_f.b("MAP IS NULL", 24, 48, 16711680, -1);
            break L0;
          } else {
            vc.field_f.b("MAP: " + ((mk) this).field_i.field_b + " x " + ((mk) this).field_i.field_e, 24, 48, 16711935, -1);
            vc.field_f.b("Level:" + tg.field_l, 24, 72, 16711935, -1);
            ((mk) this).field_i.d(-125);
            break L0;
          }
        }
        L1: {
          if (((mk) this).field_a < 0) {
            ((mk) this).field_a = 0;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (3 < ((mk) this).field_a) {
            ((mk) this).field_a = 3;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (0 != ((mk) this).field_a) {
            break L3;
          } else {
            var2 = 616;
            var3 = 36;
            this.a(false, "MODE: Add/Remove Squares", var3, 16777215);
            var3 += 14;
            this.a(false, "lmb - add square", var3, 16777215);
            var3 += 12;
            this.a(false, "rmb - remove square", var3, 16777215);
            var3 += 20;
            this.a(false, "a/s - change mode", var3, 16777215);
            break L3;
          }
        }
        L4: {
          if (((mk) this).field_a == 1) {
            var2 = 616;
            var3 = 36;
            this.a(false, "MODE: Floors", var3, 16777215);
            var3 += 14;
            this.a(false, "lmb - set floor", var3, 16777215);
            var3 += 12;
            this.a(false, "rmb - remove floor", var3, 16777215);
            var3 += 12;
            this.a(false, "z/x - change floor", var3, 16777215);
            var3 += 20;
            this.a(false, "a/s - change mode", var3, 16777215);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (2 != ((mk) this).field_a) {
            break L5;
          } else {
            var2 = 616;
            var3 = 36;
            this.a(false, "MODE: Walls", var3, 16777215);
            var3 += 14;
            this.a(false, "lmb - toggle left", var3, 16777215);
            var3 += 12;
            this.a(false, "rmb - toggle right", var3, 16777215);
            var3 += 12;
            this.a(false, "z/x - change wall", var3, 16777215);
            var3 += 20;
            this.a(false, "a/s - change mode", var3, 16777215);
            this.a(false, "MODE: Objects", var3, 16777215);
            var3 += 14;
            this.a(false, "lmb - add object", var3, 16777215);
            var3 += 12;
            this.a(false, "rmb - remove object", var3, 16777215);
            var3 += 12;
            this.a(false, "z/x - change object", var3, 16777215);
            var3 += 20;
            this.a(false, "a/s - change mode", var3, 16777215);
            var4 = 40;
            var5 = 32;
            var6 = 0;
            L6: while (true) {
              if (80 <= var6) {
                break L5;
              } else {
                var3 = -192 + (var5 * (var6 / 16) - -480);
                var2 = var4 * (var6 % 16);
                kg.field_r[var6].a(var2, var3, var4, var5);
                if (((mk) this).field_n == var6) {
                  l.e(var2, var3, var4, var5, 65280);
                  var6++;
                  continue L6;
                } else {
                  var6++;
                  continue L6;
                }
              }
            }
          }
        }
        L7: {
          var2 = 616;
          var3 = 110;
          this.a(false, "9 / 0 - change level size", var3, 16711680);
          var3 += 14;
          this.a(false, "[ / ] - switch level", var3, 16711680);
          var3 += 14;
          this.a(false, "o / p - change view level", var3, 16777215);
          var3 += 14;
          if (!dh.field_j) {
            break L7;
          } else {
            this.a(false, "q - view current level", var3, 65535);
            break L7;
          }
        }
        L8: {
          var3 += 14;
          if (dh.field_j) {
            break L8;
          } else {
            this.a(false, "q - view below", var3, 16776960);
            break L8;
          }
        }
        L9: {
          var3 += 14;
          if (!ll.field_c) {
            break L9;
          } else {
            this.a(false, "w - turn off walls", var3, 65535);
            break L9;
          }
        }
        L10: {
          var3 += 14;
          if (ll.field_c) {
            break L10;
          } else {
            this.a(false, "w - turn on walls", var3, 16776960);
            break L10;
          }
        }
        L11: {
          var3 += 14;
          if (!jb.field_a) {
            break L11;
          } else {
            this.a(false, "e - hide objects", var3, 65535);
            break L11;
          }
        }
        L12: {
          var3 += 14;
          if (!jb.field_a) {
            this.a(false, "e - show objects", var3, 16776960);
            break L12;
          } else {
            break L12;
          }
        }
        var3 += 14;
        var3 += 14;
        this.a(false, "IMPORTANT", var3, 16711680);
        var3 += 14;
        this.a(false, "YOU CANNOT SAVE LEVELS", var3, 16711680);
        var3 += 14;
        this.a(false, "DO NOT BUILD LEVELS ON", var3, 16711680);
        if (param0 > -17) {
          return;
        } else {
          L13: {
            var3 += 14;
            this.a(false, "THIS VERSION THAT YOU", var3, 16711680);
            var3 += 14;
            this.a(false, "WISH TO KEEP", var3, 16711680);
            var3 += 14;
            if (null != fg.field_c) {
              vc.field_f.b(fg.field_c, 24, 456, j.field_R, -1);
              break L13;
            } else {
              break L13;
            }
          }
          return;
        }
    }

    mk() {
        j.field_R = 256;
        ((mk) this).field_l = 0;
        ((mk) this).field_a = 0;
        ((mk) this).field_n = 0;
        ((mk) this).field_m = 0;
        ((mk) this).field_b = 0;
        ((mk) this).field_c = 0;
        fg.field_c = "Editor started";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Try again";
        field_f = "Enemy Turn";
    }
}
