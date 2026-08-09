/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jm extends bw {
    static StringBuilder field_g;
    static String[] field_k;
    static String field_l;
    int field_j;
    static String field_h;
    static kv[] field_f;
    static lna field_i;

    public static void c(byte param0) {
        field_k = null;
        field_f = null;
        field_h = null;
        int var1 = -120 / ((47 - param0) / 40);
        field_l = null;
        field_g = null;
        field_i = null;
    }

    final static void a(boolean param0, boolean param1) {
        int var2;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        L0: {
          if (gs.field_f != null) {
            gs.field_f.a(2, 0, param0);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (dj.field_c == null) {
            break L1;
          } else {
            dj.field_c.b(78, param0);
            break L1;
          }
        }
        L2: {
          if (param1) {
            break L2;
          } else {
            jm.a((byte) 31, 92);
            break L2;
          }
        }
        L3: {
          if (null != sna.field_fb) {
            sna.field_fb.b(106, param0);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!vla.field_w) {
            break L4;
          } else {
            if (sia.field_h) {
              L5: {
                if (vs.field_d) {
                  if (lna.field_q) {
                    stackIn_19_0 = 1;
                    break L5;
                  } else {
                    stackIn_19_0 = 0;
                    break L5;
                  }
                } else {
                  stackIn_19_0 = 0;
                  break L5;
                }
              }
              L6: {
                L7: {
                  var2 = stackIn_19_0;
                  if (!param0) {
                    break L7;
                  } else {
                    if (!aja.e(11)) {
                      break L7;
                    } else {
                      if (var2 != 0) {
                        break L7;
                      } else {
                        stackIn_24_0 = 1;
                        break L6;
                      }
                    }
                  }
                }
                stackIn_24_0 = 0;
                break L6;
              }
              ji.a(stackIn_24_0 != 0, 76);
              if (var2 == 0) {
                break L4;
              } else {
                L8: {
                  L9: {
                    stackIn_28_0 = 0;

                    if (!param0) {
                      break L9;
                    } else {

                      if (!aja.e(11)) {
                        break L9;
                      } else {
                        stackIn_29_0 = stackIn_28_0;
                        stackIn_29_1 = 1;
                        break L8;
                      }
                    }
                  }
                  stackIn_29_0 = stackIn_28_0;
                  stackIn_29_1 = 0;
                  break L8;
                }
                av.a(stackIn_29_0, stackIn_29_1 != 0);
                break L4;
              }
            } else {
              break L4;
            }
          }
        }
    }

    final static String a(byte param0, String param1, char param2, String param3) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = param1.length();
              var5 = param3.length();
              var6 = var4_int;
              var7 = var5 + -1;
              if (var7 == 0) {
                break L1;
              } else {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param1.indexOf((int) param2, var8_int);
                  if (-1 >= (var8_int ^ -1)) {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L2;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              if (param0 == 75) {
                break L3;
              } else {
                field_i = (lna) null;
                break L3;
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L4: while (true) {
              var10 = param1.indexOf((int) param2, var9);
              if (var10 < 0) {
                discarded$0 = var8.append(param1.substring(var9));
                stackIn_12_0 = var8.toString();
                break L0;
              } else {
                discarded$1 = var8.append(param1.substring(var9, var10));
                discarded$2 = var8.append(param3);
                var9 = var10 + 1;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("jm.I(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        return stackIn_12_0;
    }

    final void a(lu param0, byte param1) {
        try {
            param0.d(this.field_j, 0);
            if (param1 != -63) {
                field_f = (kv[]) null;
            }
            this.b(param0, (byte) 87);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jm.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void b(lu param0, byte param1) {
        try {
            int var3_int = -10 / ((37 - param1) / 38);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jm.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    jm() {
    }

    abstract void a(boolean param0, op param1);

    final static String a(byte param0, int param1) {
        if (param0 > -15) {
            field_l = (String) null;
        }
        return 1 + param1 + "/6";
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4, int param5) {
        int stackIn_69_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_int = -param5 + param0;
              if (param1 <= -46) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var6_int <= var7) {
                stackIn_69_0 = var6_int;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param3.charAt(param5 + var7);
                      if (0 >= var8) {
                        break L5;
                      } else {
                        if (var8 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 < 160) {
                        break L6;
                      } else {
                        if (var8 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (8364 == var8) {
                      param4[var7 + param2] = (byte)-128;
                      break L3;
                    } else {
                      if (var8 == 8218) {
                        param4[param2 + var7] = (byte)-126;
                        break L3;
                      } else {
                        if (var8 == 402) {
                          param4[var7 + param2] = (byte)-125;
                          break L3;
                        } else {
                          if (var8 == 8222) {
                            param4[param2 + var7] = (byte)-124;
                            break L3;
                          } else {
                            if (var8 == 8230) {
                              param4[var7 + param2] = (byte)-123;
                              break L3;
                            } else {
                              if (8224 == var8) {
                                param4[var7 + param2] = (byte)-122;
                                break L3;
                              } else {
                                if (var8 != 8225) {
                                  if (var8 != 710) {
                                    if (var8 == 8240) {
                                      param4[param2 + var7] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var8 != 352) {
                                        if (var8 != 8249) {
                                          if (338 == var8) {
                                            param4[var7 + param2] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (var8 != 381) {
                                              if (8216 != var8) {
                                                if (var8 == 8217) {
                                                  param4[var7 + param2] = (byte)-110;
                                                  break L3;
                                                } else {
                                                  if (var8 == 8220) {
                                                    param4[param2 + var7] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (var8 != 8221) {
                                                      if (8226 == var8) {
                                                        param4[var7 + param2] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (8211 == var8) {
                                                          param4[param2 + var7] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (8212 != var8) {
                                                            if (var8 == 732) {
                                                              param4[var7 + param2] = (byte)-104;
                                                              break L3;
                                                            } else {
                                                              if (var8 != 8482) {
                                                                if (var8 != 353) {
                                                                  if (var8 != 8250) {
                                                                    if (var8 == 339) {
                                                                      param4[var7 + param2] = (byte)-100;
                                                                      break L3;
                                                                    } else {
                                                                      if (382 == var8) {
                                                                        param4[var7 + param2] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var8 == 376) {
                                                                          param4[param2 - -var7] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          param4[var7 + param2] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param4[param2 + var7] = (byte)-101;
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  param4[var7 + param2] = (byte)-102;
                                                                  break L3;
                                                                }
                                                              } else {
                                                                param4[var7 + param2] = (byte)-103;
                                                                break L3;
                                                              }
                                                            }
                                                          } else {
                                                            param4[param2 + var7] = (byte)-105;
                                                            break L3;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      param4[param2 + var7] = (byte)-108;
                                                      break L3;
                                                    }
                                                  }
                                                }
                                              } else {
                                                param4[var7 + param2] = (byte)-111;
                                                break L3;
                                              }
                                            } else {
                                              param4[param2 + var7] = (byte)-114;
                                              break L3;
                                            }
                                          }
                                        } else {
                                          param4[var7 + param2] = (byte)-117;
                                          break L3;
                                        }
                                      } else {
                                        param4[param2 + var7] = (byte)-118;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    param4[var7 + param2] = (byte)-120;
                                    break L3;
                                  }
                                } else {
                                  param4[var7 + param2] = (byte)-121;
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  param4[var7 + param2] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_72_0 = (RuntimeException) (var6);

            stackIn_72_1 = new StringBuilder().append("jm.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L7;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_75_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');

            if (param4 == null) {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "null";
              break L8;
            } else {
              stackIn_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_76_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackIn_76_2 = "{...}";
              break L8;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_73_0), stackIn_76_2 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    void a(ub param0, int param1) {
        try {
            if (param1 > -2) {
                field_i = (lna) null;
            }
            this.a(false, param0.field_o.field_h);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "jm.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_l = "Please try changing the following settings:  ";
        field_k = new String[]{"Attempting to Identify Mystery Meat", "Calculating Chunk Density", "Tenderising Roast Beef", "Smoking Kippers for Breakfast", "Toasting Hot Cross Buns", "Nerfing Tofu", "Reticulating Slimes", "Awaiting Pizza Delivery", "Distributing Gas Masks", "Searching for Cutlery", "Attempting to Force Lid", "Recharging Energy Drink", "Discarding Fish Heads", "Wrestling with Shellfish", "Compiling Grocery List", "Retrieving Last Year's Data", "Pondering Purpose of Trainer", "Lying about Cake", "Fetching Filth", "P-P-P-Picking up Packets", "Decoding Sell-By Date", "Corrupting Vegetables", "Saving up Sporx", "Shaking Cola Bottles", "Cutting off Mouldy Bits", "Prepping Flies for Launch", "Crying over Spilt Milk", "Churning Memory (into Butter)", "Cerealizing Objects", "Loading Haggis. Reluctantly", "Going to Brussels for Sprouts"};
        field_h = "Most objects in the fridge can be used by clicking or dragging. Mouse over objects to see what they are, when you're done click here to continue. <br><col=BBFF00> Next</col>";
        field_g = new StringBuilder(80);
    }
}
