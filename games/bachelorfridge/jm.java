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
        int var2 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
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
            String discarded$2 = jm.a((byte) 31, 92);
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
                    stackOut_17_0 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    break L5;
                  } else {
                    stackOut_16_0 = 0;
                    stackIn_19_0 = stackOut_16_0;
                    break L5;
                  }
                } else {
                  stackOut_14_0 = 0;
                  stackIn_19_0 = stackOut_14_0;
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
                        stackOut_22_0 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        break L6;
                      }
                    }
                  }
                }
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L6;
              }
              ji.a(stackIn_24_0 != 0, 76);
              if (var2 == 0) {
                break L4;
              } else {
                L8: {
                  L9: {
                    stackOut_25_0 = 0;
                    stackIn_28_0 = stackOut_25_0;
                    stackIn_26_0 = stackOut_25_0;
                    if (!param0) {
                      break L9;
                    } else {
                      stackOut_26_0 = stackIn_26_0;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (!aja.e(11)) {
                        break L9;
                      } else {
                        stackOut_27_0 = stackIn_27_0;
                        stackOut_27_1 = 1;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        break L8;
                      }
                    }
                  }
                  stackOut_28_0 = stackIn_28_0;
                  stackOut_28_1 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
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
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          var4 = param1.length();
          var5 = param3.length();
          var6 = var4;
          var7 = var5 + -1;
          if (var7 == 0) {
            break L0;
          } else {
            var8_int = 0;
            L1: while (true) {
              var8_int = param1.indexOf((int) param2, var8_int);
              if (-1 >= (var8_int ^ -1)) {
                var8_int++;
                var6 = var6 + var7;
                continue L1;
              } else {
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 == 75) {
            break L2;
          } else {
            field_i = null;
            break L2;
          }
        }
        var8 = new StringBuilder(var6);
        var9 = 0;
        L3: while (true) {
          var10 = param1.indexOf((int) param2, var9);
          if (var10 < 0) {
            StringBuilder discarded$3 = var8.append(param1.substring(var9));
            return var8.toString();
          } else {
            StringBuilder discarded$4 = var8.append(param1.substring(var9, var10));
            StringBuilder discarded$5 = var8.append(param3);
            var9 = var10 + 1;
            continue L3;
          }
        }
    }

    final void a(lu param0, byte param1) {
        param0.d(((jm) this).field_j, 0);
        if (param1 != -63) {
            field_f = null;
        }
        ((jm) this).b(param0, (byte) 87);
    }

    void b(lu param0, byte param1) {
        int var3 = -10 / ((37 - param1) / 38);
    }

    jm() {
    }

    abstract void a(boolean param0, op param1);

    final static String a(byte param0, int param1) {
        if (param0 > -15) {
            field_l = null;
        }
        return 1 + param1 + "/6";
    }

    final static int a(int param0, int param1, int param2, CharSequence param3, byte[] param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          var6 = -param5 + param0;
          if (param1 <= -46) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        var7 = 0;
        L1: while (true) {
          L2: {
            if (var6 <= var7) {
              break L2;
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
                  L7: {
                    if (8364 == var8) {
                      break L7;
                    } else {
                      L8: {
                        if (var8 == 8218) {
                          break L8;
                        } else {
                          L9: {
                            if (var8 == 402) {
                              break L9;
                            } else {
                              L10: {
                                if (var8 == 8222) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (var8 == 8230) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (8224 == var8) {
                                          break L12;
                                        } else {
                                          L13: {
                                            if (var8 != 8225) {
                                              break L13;
                                            } else {
                                              param4[var7 + param2] = (byte)-121;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          L14: {
                                            if (var8 != 710) {
                                              break L14;
                                            } else {
                                              param4[var7 + param2] = (byte)-120;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          L15: {
                                            if (var8 == 8240) {
                                              break L15;
                                            } else {
                                              L16: {
                                                if (var8 != 352) {
                                                  break L16;
                                                } else {
                                                  param4[param2 + var7] = (byte)-118;
                                                  if (0 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                              L17: {
                                                if (var8 != 8249) {
                                                  break L17;
                                                } else {
                                                  param4[var7 + param2] = (byte)-117;
                                                  if (0 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                              }
                                              L18: {
                                                if (338 == var8) {
                                                  break L18;
                                                } else {
                                                  L19: {
                                                    if (var8 != 381) {
                                                      break L19;
                                                    } else {
                                                      param4[param2 + var7] = (byte)-114;
                                                      if (0 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  L20: {
                                                    if (8216 != var8) {
                                                      break L20;
                                                    } else {
                                                      param4[var7 + param2] = (byte)-111;
                                                      if (0 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  L21: {
                                                    if (var8 == 8217) {
                                                      break L21;
                                                    } else {
                                                      L22: {
                                                        if (var8 == 8220) {
                                                          break L22;
                                                        } else {
                                                          L23: {
                                                            if (var8 != 8221) {
                                                              break L23;
                                                            } else {
                                                              param4[param2 + var7] = (byte)-108;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L23;
                                                              }
                                                            }
                                                          }
                                                          L24: {
                                                            if (8226 == var8) {
                                                              break L24;
                                                            } else {
                                                              L25: {
                                                                if (8211 == var8) {
                                                                  break L25;
                                                                } else {
                                                                  L26: {
                                                                    if (8212 != var8) {
                                                                      break L26;
                                                                    } else {
                                                                      param4[param2 + var7] = (byte)-105;
                                                                      if (0 == 0) {
                                                                        break L3;
                                                                      } else {
                                                                        break L26;
                                                                      }
                                                                    }
                                                                  }
                                                                  L27: {
                                                                    if (var8 == 732) {
                                                                      break L27;
                                                                    } else {
                                                                      L28: {
                                                                        if (var8 != 8482) {
                                                                          break L28;
                                                                        } else {
                                                                          param4[var7 + param2] = (byte)-103;
                                                                          if (0 == 0) {
                                                                            break L3;
                                                                          } else {
                                                                            break L28;
                                                                          }
                                                                        }
                                                                      }
                                                                      L29: {
                                                                        if (var8 != 353) {
                                                                          break L29;
                                                                        } else {
                                                                          param4[var7 + param2] = (byte)-102;
                                                                          if (0 == 0) {
                                                                            break L3;
                                                                          } else {
                                                                            break L29;
                                                                          }
                                                                        }
                                                                      }
                                                                      L30: {
                                                                        if (var8 != 8250) {
                                                                          break L30;
                                                                        } else {
                                                                          param4[param2 + var7] = (byte)-101;
                                                                          if (0 == 0) {
                                                                            break L3;
                                                                          } else {
                                                                            break L30;
                                                                          }
                                                                        }
                                                                      }
                                                                      L31: {
                                                                        if (var8 == 339) {
                                                                          break L31;
                                                                        } else {
                                                                          L32: {
                                                                            if (382 == var8) {
                                                                              break L32;
                                                                            } else {
                                                                              L33: {
                                                                                if (var8 == 376) {
                                                                                  break L33;
                                                                                } else {
                                                                                  param4[var7 + param2] = (byte)63;
                                                                                  if (0 == 0) {
                                                                                    break L3;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                }
                                                                              }
                                                                              param4[param2 - -var7] = (byte)-97;
                                                                              if (0 == 0) {
                                                                                break L3;
                                                                              } else {
                                                                                break L32;
                                                                              }
                                                                            }
                                                                          }
                                                                          param4[var7 + param2] = (byte)-98;
                                                                          if (0 == 0) {
                                                                            break L3;
                                                                          } else {
                                                                            break L31;
                                                                          }
                                                                        }
                                                                      }
                                                                      param4[var7 + param2] = (byte)-100;
                                                                      if (0 == 0) {
                                                                        break L3;
                                                                      } else {
                                                                        break L27;
                                                                      }
                                                                    }
                                                                  }
                                                                  param4[var7 + param2] = (byte)-104;
                                                                  if (0 == 0) {
                                                                    break L3;
                                                                  } else {
                                                                    break L25;
                                                                  }
                                                                }
                                                              }
                                                              param4[param2 + var7] = (byte)-106;
                                                              if (0 == 0) {
                                                                break L3;
                                                              } else {
                                                                break L24;
                                                              }
                                                            }
                                                          }
                                                          param4[var7 + param2] = (byte)-107;
                                                          if (0 == 0) {
                                                            break L3;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      param4[param2 + var7] = (byte)-109;
                                                      if (0 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L21;
                                                      }
                                                    }
                                                  }
                                                  param4[var7 + param2] = (byte)-110;
                                                  if (0 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              param4[var7 + param2] = (byte)-116;
                                              if (0 == 0) {
                                                break L3;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          param4[param2 + var7] = (byte)-119;
                                          if (0 == 0) {
                                            break L3;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      param4[var7 + param2] = (byte)-122;
                                      if (0 == 0) {
                                        break L3;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  param4[var7 + param2] = (byte)-123;
                                  if (0 == 0) {
                                    break L3;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              param4[param2 + var7] = (byte)-124;
                              if (0 == 0) {
                                break L3;
                              } else {
                                break L9;
                              }
                            }
                          }
                          param4[var7 + param2] = (byte)-125;
                          if (0 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      param4[param2 + var7] = (byte)-126;
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                  }
                  param4[var7 + param2] = (byte)-128;
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                param4[var7 + param2] = (byte)var8;
                break L3;
              }
              var7++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          return var6;
        }
    }

    void a(ub param0, int param1) {
        if (param1 > -2) {
            field_i = null;
        }
        ((jm) this).a(false, param0.field_o.field_h);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Please try changing the following settings:  ";
        field_k = new String[]{"Attempting to Identify Mystery Meat", "Calculating Chunk Density", "Tenderising Roast Beef", "Smoking Kippers for Breakfast", "Toasting Hot Cross Buns", "Nerfing Tofu", "Reticulating Slimes", "Awaiting Pizza Delivery", "Distributing Gas Masks", "Searching for Cutlery", "Attempting to Force Lid", "Recharging Energy Drink", "Discarding Fish Heads", "Wrestling with Shellfish", "Compiling Grocery List", "Retrieving Last Year's Data", "Pondering Purpose of Trainer", "Lying about Cake", "Fetching Filth", "P-P-P-Picking up Packets", "Decoding Sell-By Date", "Corrupting Vegetables", "Saving up Sporx", "Shaking Cola Bottles", "Cutting off Mouldy Bits", "Prepping Flies for Launch", "Crying over Spilt Milk", "Churning Memory (into Butter)", "Cerealizing Objects", "Loading Haggis. Reluctantly", "Going to Brussels for Sprouts"};
        field_h = "Most objects in the fridge can be used by clicking or dragging. Mouse over objects to see what they are, when you're done click here to continue. <br><col=BBFF00> Next</col>";
        field_g = new StringBuilder(80);
    }
}
