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
            wf.field_d.c(param6, (param1 >> 670776577) + param7, (-wf.field_d.field_t + -wf.field_d.field_y + var10_int) / 2 + (wf.field_d.field_y + param4), 0, -1);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "jk.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    public final void a(lj param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == this.field_z) {
                bl.a(858);
                break L1;
              } else {
                if (param0 != this.field_w) {
                  if (this.field_C == param0) {
                    gg.b(4);
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
            L2: {
              if (param1 == 17) {
                break L2;
              } else {
                jk.l(-1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var6);

            stackIn_13_1 = new StringBuilder().append("jk.MA(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public jk() {
        super(0, 0, 476, 225, (ui) null);
        this.field_w = new lj(je.field_c, (ma) null);
        this.field_z = new lj(el.field_a, (ma) null);
        this.field_C = new lj(gl.field_z, (ma) null);
        qa var1 = new qa();
        this.field_w.field_q = (ui) ((Object) var1);
        this.field_z.field_q = (ui) ((Object) var1);
        this.field_C.field_q = (ui) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 + -var2 >> -46225983;
        this.field_z.a(-105, -48 + (this.field_h + -var2), this.field_l - var3 >> 486302657, var4, 30);
        this.field_C.a(62, -var2 + (this.field_h - 48), var4 + (-var3 + this.field_l >> 206072577) - -var2, var4, 30);
        this.field_w.a(96, -(var2 * 2) + -78 + this.field_h, this.field_l + -var3 >> 303221089, var3, 30);
        this.field_z.field_m = (ma) (this);
        this.field_w.field_m = (ma) (this);
        this.field_w.field_j = uf.field_b;
        this.field_C.field_m = (ma) (this);
        this.field_C.field_j = pa.field_a;
        this.a((qg) (this.field_z), (byte) -81);
        this.a((qg) (this.field_w), (byte) -92);
        this.a((qg) (this.field_C), (byte) -125);
    }

    final static int l(int param0) {
        String var2;
        if (param0 != -889) {
          var2 = (String) null;
          jk.a(80, 5, -66, 13, 33, false, (String) null, -125, -49, (byte) -7);
          return -ic.field_b + jd.field_a;
        } else {
          return -ic.field_b + jd.field_a;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = param0 + this.field_p;
        int var6 = this.field_n + param1;
        vd.field_h.a(wb.field_d, var5 - -20, 20 + var6, this.field_l + -40, -50 + this.field_h, 16777215, -1, 1, 0, vd.field_h.field_y);
        super.a(param0, param1, param2, (byte) 123);
        int var7 = -112 / ((param3 - 77) / 34);
    }

    final static char a(char param0, boolean param1) {
        int var2;
        int var3;
        var3 = Transmogrify.field_A ? 1 : 0;
        if (param1) {
          jk.l(100);
          var2 = param0;
          if (-33 != (var2 ^ -1)) {
            L0: {
              if ((var2 ^ -1) == -161) {
                break L0;
              } else {
                if ((var2 ^ -1) == -96) {
                  break L0;
                } else {
                  if (var2 != 45) {
                    L1: {
                      if (var2 != 91) {
                        if (-94 == (var2 ^ -1)) {
                          break L1;
                        } else {
                          if ((var2 ^ -1) == -36) {
                            break L1;
                          } else {
                            L2: {
                              if ((var2 ^ -1) != -225) {
                                if ((var2 ^ -1) == -226) {
                                  break L2;
                                } else {
                                  if (226 == var2) {
                                    break L2;
                                  } else {
                                    if ((var2 ^ -1) == -229) {
                                      break L2;
                                    } else {
                                      if ((var2 ^ -1) == -228) {
                                        break L2;
                                      } else {
                                        if (var2 != 192) {
                                          if (-194 != (var2 ^ -1)) {
                                            if ((var2 ^ -1) != -195) {
                                              if (var2 != 196) {
                                                if (var2 == 195) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (232 == var2) {
                                                      break L3;
                                                    } else {
                                                      if (var2 != 233) {
                                                        if (234 != var2) {
                                                          if (-236 == (var2 ^ -1)) {
                                                            break L3;
                                                          } else {
                                                            if ((var2 ^ -1) == -201) {
                                                              break L3;
                                                            } else {
                                                              if (-202 != (var2 ^ -1)) {
                                                                if (202 != var2) {
                                                                  if (-204 != (var2 ^ -1)) {
                                                                    if (237 != var2) {
                                                                      L4: {
                                                                        if (-239 == (var2 ^ -1)) {
                                                                          break L4;
                                                                        } else {
                                                                          if ((var2 ^ -1) != -240) {
                                                                            if (var2 == 205) {
                                                                              break L4;
                                                                            } else {
                                                                              if (var2 == 206) {
                                                                                break L4;
                                                                              } else {
                                                                                if (-208 != (var2 ^ -1)) {
                                                                                  if (242 != var2) {
                                                                                    L5: {
                                                                                      if (var2 == 243) {
                                                                                        break L5;
                                                                                      } else {
                                                                                        if (-245 == (var2 ^ -1)) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (-247 == (var2 ^ -1)) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (var2 == 245) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if (var2 == 210) {
                                                                                                break L5;
                                                                                              } else {
                                                                                                if (211 != var2) {
                                                                                                  if (var2 != 212) {
                                                                                                    if (var2 != 214) {
                                                                                                      if ((var2 ^ -1) == -214) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        L6: {
                                                                                                          if ((var2 ^ -1) == -250) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (250 == var2) {
                                                                                                              break L6;
                                                                                                            } else {
                                                                                                              if ((var2 ^ -1) == -252) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (252 != var2) {
                                                                                                                  if ((var2 ^ -1) != -218) {
                                                                                                                    if (218 != var2) {
                                                                                                                      if ((var2 ^ -1) != -220) {
                                                                                                                        if ((var2 ^ -1) != -221) {
                                                                                                                          if (var2 != 231) {
                                                                                                                            if (-200 != (var2 ^ -1)) {
                                                                                                                              if (var2 == 255) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (-377 != (var2 ^ -1)) {
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
                                                                                                            }
                                                                                                          }
                                                                                                        }
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
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    return 'o';
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'i';
                                                                                }
                                                                              }
                                                                            }
                                                                          } else {
                                                                            return 'i';
                                                                          }
                                                                        }
                                                                      }
                                                                      return 'i';
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
                                                                break L3;
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
                                                  }
                                                  return 'e';
                                                }
                                              } else {
                                                break L2;
                                              }
                                            } else {
                                              break L2;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L2;
                              }
                            }
                            return 'a';
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                    return param0;
                  } else {
                    break L0;
                  }
                }
              }
            }
            return '_';
          } else {
            return '_';
          }
        } else {
          var2 = param0;
          if (-33 != (var2 ^ -1)) {
            if ((var2 ^ -1) != -161) {
              if ((var2 ^ -1) != -96) {
                if (var2 != 45) {
                  L7: {
                    if (var2 != 91) {
                      if (-94 != (var2 ^ -1)) {
                        if ((var2 ^ -1) == -36) {
                          break L7;
                        } else {
                          L8: {
                            if ((var2 ^ -1) != -225) {
                              if ((var2 ^ -1) == -226) {
                                break L8;
                              } else {
                                if (226 == var2) {
                                  break L8;
                                } else {
                                  if ((var2 ^ -1) == -229) {
                                    break L8;
                                  } else {
                                    if ((var2 ^ -1) == -228) {
                                      break L8;
                                    } else {
                                      if (var2 != 192) {
                                        if (-194 != (var2 ^ -1)) {
                                          if ((var2 ^ -1) != -195) {
                                            if (var2 != 196) {
                                              if (var2 == 195) {
                                                break L8;
                                              } else {
                                                L9: {
                                                  if (232 == var2) {
                                                    break L9;
                                                  } else {
                                                    if (var2 != 233) {
                                                      if (234 != var2) {
                                                        if (-236 == (var2 ^ -1)) {
                                                          break L9;
                                                        } else {
                                                          if ((var2 ^ -1) == -201) {
                                                            break L9;
                                                          } else {
                                                            if (-202 != (var2 ^ -1)) {
                                                              if (202 != var2) {
                                                                if (-204 != (var2 ^ -1)) {
                                                                  L10: {
                                                                    if (237 != var2) {
                                                                      if (-239 == (var2 ^ -1)) {
                                                                        break L10;
                                                                      } else {
                                                                        if ((var2 ^ -1) != -240) {
                                                                          if (var2 == 205) {
                                                                            break L10;
                                                                          } else {
                                                                            if (var2 == 206) {
                                                                              break L10;
                                                                            } else {
                                                                              if (-208 != (var2 ^ -1)) {
                                                                                L11: {
                                                                                  if (242 != var2) {
                                                                                    if (var2 == 243) {
                                                                                      break L11;
                                                                                    } else {
                                                                                      if (-245 == (var2 ^ -1)) {
                                                                                        break L11;
                                                                                      } else {
                                                                                        if (-247 == (var2 ^ -1)) {
                                                                                          break L11;
                                                                                        } else {
                                                                                          if (var2 == 245) {
                                                                                            break L11;
                                                                                          } else {
                                                                                            if (var2 == 210) {
                                                                                              break L11;
                                                                                            } else {
                                                                                              if (211 != var2) {
                                                                                                if (var2 != 212) {
                                                                                                  if (var2 != 214) {
                                                                                                    if ((var2 ^ -1) == -214) {
                                                                                                      break L11;
                                                                                                    } else {
                                                                                                      L12: {
                                                                                                        if ((var2 ^ -1) == -250) {
                                                                                                          break L12;
                                                                                                        } else {
                                                                                                          if (250 == var2) {
                                                                                                            break L12;
                                                                                                          } else {
                                                                                                            if ((var2 ^ -1) == -252) {
                                                                                                              break L12;
                                                                                                            } else {
                                                                                                              if (252 != var2) {
                                                                                                                if ((var2 ^ -1) != -218) {
                                                                                                                  if (218 != var2) {
                                                                                                                    if ((var2 ^ -1) != -220) {
                                                                                                                      if ((var2 ^ -1) != -221) {
                                                                                                                        if (var2 != 231) {
                                                                                                                          if (-200 != (var2 ^ -1)) {
                                                                                                                            if (var2 == 255) {
                                                                                                                              return 'y';
                                                                                                                            } else {
                                                                                                                              if (-377 != (var2 ^ -1)) {
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
                                                                                                                    break L12;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L12;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L12;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L11;
                                                                                                  }
                                                                                                } else {
                                                                                                  break L11;
                                                                                                }
                                                                                              } else {
                                                                                                break L11;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    break L11;
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              } else {
                                                                                break L10;
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          break L10;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      break L10;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L9;
                                                                }
                                                              } else {
                                                                break L9;
                                                              }
                                                            } else {
                                                              break L9;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        break L9;
                                                      }
                                                    } else {
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                return 'e';
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              break L8;
                            }
                          }
                          return 'a';
                        }
                      } else {
                        return param0;
                      }
                    } else {
                      break L7;
                    }
                  }
                  return param0;
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
    }

    final static void a(java.awt.Color param0, byte param1, int param2, String param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        java.awt.Graphics var10 = null;
        java.awt.Graphics var11 = null;
        try {
          L0: {
            L1: {
              if (param1 == -119) {
                break L1;
              } else {
                var9 = (String) null;
                jk.a((java.awt.Color) null, (byte) 107, 51, (String) null, false);
                break L1;
              }
            }
            try {
              L2: {
                L3: {
                  var10 = gd.field_k.getGraphics();
                  if (ha.field_a != null) {
                    break L3;
                  } else {
                    ha.field_a = new java.awt.Font("Helvetica", 1, 13);
                    break L3;
                  }
                }
                L4: {
                  if (param4) {
                    var10.setColor(java.awt.Color.black);
                    var10.fillRect(0, 0, fk.field_E, mk.field_x);
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
                    var10.drawImage(hk.field_c, -152 + fk.field_E / 2, mk.field_x / 2 + -18, (java.awt.image.ImageObserver) null);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L8: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + fk.field_E / 2;
                    var8 = -18 + mk.field_x / 2;
                    var10.setColor(param0);
                    var10.drawRect(var7, var8, 303, 33);
                    var10.fillRect(2 + var7, var8 - -2, param2 * 3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1 + var7, var8 + 1, 301, 31);
                    var10.fillRect(2 + (var7 + 3 * param2), 2 + var8, -(param2 * 3) + 300, 30);
                    var10.setFont(ha.field_a);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param3, var7 + (304 - 6 * param3.length()) / 2, 22 + var8);
                    break L8;
                  }
                }
                L9: {
                  if (sj.field_r == null) {
                    break L9;
                  } else {
                    var10.setFont(ha.field_a);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(sj.field_r, fk.field_E / 2 - sj.field_r.length() * 6 / 2, mk.field_x / 2 + -26);
                    break L9;
                  }
                }
                break L2;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var5 = (Exception) (Object) decompiledCaughtException;
                gd.field_k.repaint();
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L11: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5_ref);

            stackIn_23_1 = new StringBuilder().append("jk.G(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L12;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L12;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, qg param1, byte param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, (byte) -61, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var5_int = 42 % ((param2 - 65) / 55);
              if (98 != param0) {
                if ((param0 ^ -1) == -100) {
                  stackIn_10_0 = this.b(param1, 91);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a(2, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("jk.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L1;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L1;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public static void m(int param0) {
        field_y = null;
        if (param0 != 486302657) {
            field_x = (mg) null;
            field_D = null;
            field_x = null;
            return;
        }
        field_D = null;
        field_x = null;
    }

    final static int a(byte param0) {
        if (param0 > -102) {
            String var2 = (String) null;
            jk.a((java.awt.Color) null, (byte) -6, -86, (String) null, false);
            return 1;
        }
        return 1;
    }

    static {
        field_B = 0;
        field_y = new hi();
    }
}
