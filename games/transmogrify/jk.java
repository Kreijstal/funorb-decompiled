/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk extends aj implements df {
    private lj field_z;
    static int field_B;
    static hi field_y;
    private lj field_C;
    private lj field_w;
    static lc field_D;
    static mg field_x;

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, String param6, int param7, int param8, byte param9) {
        int var10_int = 0;
        int var11 = 0;
        int var13 = 0;
        try {
            int var12 = -30 % ((33 - param9) / 46);
            var10_int = -10 + field_x.a(true);
            var11 = !param5 ? param3 : param2;
            var13 = !param5 ? param0 : param8;
            field_x.a(var13, -5 + param4, 3, 10 + param1, -5 + param7, var11);
            wf.field_d.c(param6, (param1 >> 1) + param7, (-wf.field_d.field_t + -wf.field_d.field_y + var10_int) / 2 + (wf.field_d.field_y + param4), 0, -1);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "jk.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == ((jk) this).field_z) {
                bl.a(858);
                break L1;
              } else {
                if (param0 != ((jk) this).field_w) {
                  if (((jk) this).field_C == param0) {
                    int discarded$18 = 4;
                    gg.b();
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  hg.c(param1 + -17);
                  break L1;
                }
              }
            }
            if (param1 == 17) {
              break L0;
            } else {
              int discarded$19 = jk.l(-1);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var6;
            stackOut_11_1 = new StringBuilder().append("jk.MA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public jk() {
        super(0, 0, 476, 225, (ui) null);
        ((jk) this).field_w = new lj(je.field_c, (ma) null);
        ((jk) this).field_z = new lj(el.field_a, (ma) null);
        ((jk) this).field_C = new lj(gl.field_z, (ma) null);
        qa var1 = new qa();
        ((jk) this).field_w.field_q = (ui) (Object) var1;
        ((jk) this).field_z.field_q = (ui) (Object) var1;
        ((jk) this).field_C.field_q = (ui) (Object) var1;
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> 1;
        ((jk) this).field_z.a(-105, -48 + (((jk) this).field_h + -var2), ((jk) this).field_l - var3 >> 1, var4, 30);
        ((jk) this).field_C.a(62, -var2 + (((jk) this).field_h - 48), var4 + (-var3 + ((jk) this).field_l >> 1) - -var2, var4, 30);
        ((jk) this).field_w.a(96, -(var2 * 2) + -78 + ((jk) this).field_h, ((jk) this).field_l + -var3 >> 1, var3, 30);
        ((jk) this).field_z.field_m = (ma) this;
        ((jk) this).field_w.field_m = (ma) this;
        ((jk) this).field_w.field_j = uf.field_b;
        ((jk) this).field_C.field_m = (ma) this;
        ((jk) this).field_C.field_j = pa.field_a;
        ((jk) this).a((qg) (Object) ((jk) this).field_z, (byte) -81);
        ((jk) this).a((qg) (Object) ((jk) this).field_w, (byte) -92);
        ((jk) this).a((qg) (Object) ((jk) this).field_C, (byte) -125);
    }

    final static int l(int param0) {
        Object var2 = null;
        if (param0 != -889) {
          var2 = null;
          jk.a(80, 5, -66, 13, 33, false, (String) null, -125, -49, (byte) -7);
          return -ic.field_b + jd.field_a;
        } else {
          return -ic.field_b + jd.field_a;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = param0 + ((jk) this).field_p;
        int var6 = ((jk) this).field_n + param1;
        int discarded$0 = vd.field_h.a(wb.field_d, var5 - -20, 20 + var6, ((jk) this).field_l + -40, -50 + ((jk) this).field_h, 16777215, -1, 1, 0, vd.field_h.field_y);
        super.a(param0, param1, param2, (byte) 123);
        int var7 = -112 / ((param3 - 77) / 34);
    }

    final static char a(char param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        var2 = param0;
        if (var2 != 32) {
          if (var2 != 160) {
            if (var2 != 95) {
              if (var2 != 45) {
                if (var2 != 91) {
                  if (var2 != 93) {
                    if (var2 != 35) {
                      if (var2 != 224) {
                        if (var2 != 225) {
                          if (226 != var2) {
                            if (var2 != 228) {
                              if (var2 != 227) {
                                if (var2 != 192) {
                                  if (var2 != 193) {
                                    if (var2 != 194) {
                                      if (var2 != 196) {
                                        if (var2 != 195) {
                                          if (232 != var2) {
                                            if (var2 != 233) {
                                              if (234 != var2) {
                                                if (var2 != 235) {
                                                  if (var2 == 200) {
                                                    return 'e';
                                                  } else {
                                                    if (var2 != 201) {
                                                      if (202 != var2) {
                                                        if (var2 != 203) {
                                                          if (237 != var2) {
                                                            if (var2 != 238) {
                                                              if (var2 != 239) {
                                                                if (var2 != 205) {
                                                                  if (var2 == 206) {
                                                                    return 'i';
                                                                  } else {
                                                                    if (var2 != 207) {
                                                                      if (242 != var2) {
                                                                        if (var2 != 243) {
                                                                          if (var2 != 244) {
                                                                            if (var2 != 246) {
                                                                              if (var2 != 245) {
                                                                                if (var2 != 210) {
                                                                                  if (211 != var2) {
                                                                                    if (var2 != 212) {
                                                                                      if (var2 != 214) {
                                                                                        if (var2 != 213) {
                                                                                          if (var2 != 249) {
                                                                                            if (250 != var2) {
                                                                                              if (var2 == 251) {
                                                                                                return 'u';
                                                                                              } else {
                                                                                                if (252 != var2) {
                                                                                                  if (var2 != 217) {
                                                                                                    if (218 != var2) {
                                                                                                      if (var2 != 219) {
                                                                                                        if (var2 != 220) {
                                                                                                          if (var2 != 231) {
                                                                                                            if (var2 != 199) {
                                                                                                              if (var2 == 255) {
                                                                                                                return 'y';
                                                                                                              } else {
                                                                                                                if (var2 != 376) {
                                                                                                                  if (241 != var2) {
                                                                                                                    if (var2 == 209) {
                                                                                                                      return 'n';
                                                                                                                    } else {
                                                                                                                      if (var2 != 223) {
                                                                                                                        return Character.toLowerCase(param0);
                                                                                                                      } else {
                                                                                                                        return 'b';
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'n';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  return 'y';
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'c';
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'c';
                                                                                                          }
                                                                                                        } else {
                                                                                                          return 'u';
                                                                                                        }
                                                                                                      } else {
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    } else {
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    return 'u';
                                                                                                  }
                                                                                                } else {
                                                                                                  return 'u';
                                                                                                }
                                                                                              }
                                                                                            } else {
                                                                                              return 'u';
                                                                                            }
                                                                                          } else {
                                                                                            return 'u';
                                                                                          }
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    } else {
                                                                                      return 'o';
                                                                                    }
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'o';
                                                                                }
                                                                              } else {
                                                                                return 'o';
                                                                              }
                                                                            } else {
                                                                              return 'o';
                                                                            }
                                                                          } else {
                                                                            return 'o';
                                                                          }
                                                                        } else {
                                                                          return 'o';
                                                                        }
                                                                      } else {
                                                                        return 'o';
                                                                      }
                                                                    } else {
                                                                      return 'i';
                                                                    }
                                                                  }
                                                                } else {
                                                                  return 'i';
                                                                }
                                                              } else {
                                                                return 'i';
                                                              }
                                                            } else {
                                                              return 'i';
                                                            }
                                                          } else {
                                                            return 'i';
                                                          }
                                                        } else {
                                                          return 'e';
                                                        }
                                                      } else {
                                                        return 'e';
                                                      }
                                                    } else {
                                                      return 'e';
                                                    }
                                                  }
                                                } else {
                                                  return 'e';
                                                }
                                              } else {
                                                return 'e';
                                              }
                                            } else {
                                              return 'e';
                                            }
                                          } else {
                                            return 'e';
                                          }
                                        } else {
                                          return 'a';
                                        }
                                      } else {
                                        return 'a';
                                      }
                                    } else {
                                      return 'a';
                                    }
                                  } else {
                                    return 'a';
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                return 'a';
                              }
                            } else {
                              return 'a';
                            }
                          } else {
                            return 'a';
                          }
                        } else {
                          return 'a';
                        }
                      } else {
                        return 'a';
                      }
                    } else {
                      return param0;
                    }
                  } else {
                    return param0;
                  }
                } else {
                  return param0;
                }
              } else {
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        } else {
          return '_';
        }
    }

    final static void a(java.awt.Color param0, byte param1, int param2, String param3, boolean param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        Object var10 = null;
        java.awt.Graphics var10_ref = null;
        java.awt.Graphics var11 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == -119) {
                break L1;
              } else {
                var9 = null;
                jk.a((java.awt.Color) null, (byte) 107, 51, (String) null, false);
                break L1;
              }
            }
            try {
              L2: {
                L3: {
                  var10_ref = gd.field_k.getGraphics();
                  if (ha.field_a != null) {
                    break L3;
                  } else {
                    ha.field_a = new java.awt.Font("Helvetica", 1, 13);
                    break L3;
                  }
                }
                L4: {
                  if (param4) {
                    var10_ref.setColor(java.awt.Color.black);
                    var10_ref.fillRect(0, 0, fk.field_E, mk.field_x);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0 == null) {
                    param0 = new java.awt.Color(140, 17, 17);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                try {
                  L6: {
                    L7: {
                      if (hk.field_c == null) {
                        hk.field_c = gd.field_k.createImage(304, 34);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var11 = hk.field_c.getGraphics();
                    var11.setColor(param0);
                    var11.drawRect(0, 0, 303, 33);
                    var11.fillRect(2, 2, param2 * 3, 30);
                    var11.setColor(java.awt.Color.black);
                    var11.drawRect(1, 1, 301, 31);
                    var11.fillRect(2 - -(3 * param2), 2, 300 - 3 * param2, 30);
                    var11.setFont(ha.field_a);
                    var11.setColor(java.awt.Color.white);
                    var11.drawString(param3, (-(6 * param3.length()) + 304) / 2, 22);
                    boolean discarded$1 = var10_ref.drawImage(hk.field_c, -152 + fk.field_E / 2, mk.field_x / 2 + -18, (java.awt.image.ImageObserver) null);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L8: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + fk.field_E / 2;
                    var8 = -18 + mk.field_x / 2;
                    var10_ref.setColor(param0);
                    var10_ref.drawRect(var7, var8, 303, 33);
                    var10_ref.fillRect(2 + var7, var8 - -2, param2 * 3, 30);
                    var10_ref.setColor(java.awt.Color.black);
                    var10_ref.drawRect(1 + var7, var8 + 1, 301, 31);
                    var10_ref.fillRect(2 + (var7 + 3 * param2), 2 + var8, -(param2 * 3) + 300, 30);
                    var10_ref.setFont(ha.field_a);
                    var10_ref.setColor(java.awt.Color.white);
                    var10_ref.drawString(param3, var7 + (304 - 6 * param3.length()) / 2, 22 + var8);
                    break L8;
                  }
                }
                if (sj.field_r == null) {
                  break L2;
                } else {
                  var10_ref.setFont(ha.field_a);
                  var10_ref.setColor(java.awt.Color.white);
                  var10_ref.drawString(sj.field_r, fk.field_E / 2 - sj.field_r.length() * 6 / 2, mk.field_x / 2 + -26);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              gd.field_k.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L9: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var5_ref;
            stackOut_21_1 = new StringBuilder().append("jk.G(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param4 + 41);
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_9_0 = false;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) -61, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              var5_int = 42 % ((param2 - 65) / 55);
              if (98 != param0) {
                if (param0 == 99) {
                  stackOut_9_0 = ((jk) this).b(param1, 91);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackOut_5_0 = ((jk) this).a(2, param1);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var5;
            stackOut_11_1 = new StringBuilder().append("jk.K(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_10_0;
    }

    public static void m() {
        field_y = null;
        field_D = null;
        field_x = null;
    }

    final static int a() {
        return 1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = 0;
        field_y = new hi();
    }
}
