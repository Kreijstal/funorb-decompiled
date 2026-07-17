/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is extends jea {
    private jea field_tb;
    private StringBuilder field_vb;
    private int field_ub;
    private jea field_zb;
    static hra field_wb;
    static pea field_xb;
    static float field_Ab;
    static jea field_yb;

    public static void f(int param0) {
        field_xb = null;
        field_wb = null;
        field_yb = null;
    }

    final boolean a(boolean param0) {
        int var2 = 0;
        if (((is) this).field_ub == 0) {
          if (fna.field_h == 85) {
            L0: {
              if (0 < ((is) this).field_vb.length()) {
                StringBuilder discarded$7 = ana.a(-1 + ((is) this).field_vb.length(), ' ', -11, ((is) this).field_vb);
                break L0;
              } else {
                break L0;
              }
            }
            if (((is) this).field_vb.length() < 12) {
              L1: {
                var2 = Character.toLowerCase(kda.field_td);
                if (var2 == 32) {
                  var2 = 95;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (95 != var2) {
                  break L2;
                } else {
                  if (((is) this).field_vb.length() > 0) {
                    StringBuilder discarded$8 = ((is) this).field_vb.append(var2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              if (dja.a((byte) -17, (char) var2)) {
                L3: {
                  StringBuilder discarded$9 = ((is) this).field_vb.append(var2);
                  if (fna.field_h == 84) {
                    if (((is) this).field_vb.length() <= 0) {
                      ((is) this).field_ub = 1;
                      break L3;
                    } else {
                      ((is) this).field_r = ((is) this).field_vb.toString();
                      ((is) this).field_ub = 2;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (fna.field_h == 13) {
                    ((is) this).field_ub = 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (param0) {
                  field_Ab = -0.0745474174618721f;
                  return true;
                } else {
                  return true;
                }
              } else {
                if (!dp.a(125, (char) var2)) {
                  if (fna.field_h == 84) {
                    if (((is) this).field_vb.length() <= 0) {
                      L5: {
                        ((is) this).field_ub = 1;
                        if (fna.field_h == 13) {
                          ((is) this).field_ub = 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        field_Ab = -0.0745474174618721f;
                        return true;
                      }
                    } else {
                      L6: {
                        ((is) this).field_r = ((is) this).field_vb.toString();
                        ((is) this).field_ub = 2;
                        if (fna.field_h == 13) {
                          ((is) this).field_ub = 1;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (!param0) {
                        return true;
                      } else {
                        field_Ab = -0.0745474174618721f;
                        return true;
                      }
                    }
                  } else {
                    L7: {
                      if (fna.field_h == 13) {
                        ((is) this).field_ub = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    if (!param0) {
                      return true;
                    } else {
                      field_Ab = -0.0745474174618721f;
                      return true;
                    }
                  }
                } else {
                  StringBuilder discarded$10 = ((is) this).field_vb.append(var2);
                  if (fna.field_h == 84) {
                    if (((is) this).field_vb.length() <= 0) {
                      L8: {
                        ((is) this).field_ub = 1;
                        if (fna.field_h == 13) {
                          ((is) this).field_ub = 1;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        if (!param0) {
                          break L9;
                        } else {
                          field_Ab = -0.0745474174618721f;
                          break L9;
                        }
                      }
                      return true;
                    } else {
                      L10: {
                        ((is) this).field_r = ((is) this).field_vb.toString();
                        ((is) this).field_ub = 2;
                        if (fna.field_h == 13) {
                          ((is) this).field_ub = 1;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      if (param0) {
                        field_Ab = -0.0745474174618721f;
                        return true;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    L11: {
                      if (fna.field_h == 13) {
                        ((is) this).field_ub = 1;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    if (!param0) {
                      return true;
                    } else {
                      field_Ab = -0.0745474174618721f;
                      return true;
                    }
                  }
                }
              }
            } else {
              if (fna.field_h == 84) {
                if (((is) this).field_vb.length() <= 0) {
                  L12: {
                    ((is) this).field_ub = 1;
                    if (fna.field_h == 13) {
                      ((is) this).field_ub = 1;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (!param0) {
                      break L13;
                    } else {
                      field_Ab = -0.0745474174618721f;
                      break L13;
                    }
                  }
                  return true;
                } else {
                  L14: {
                    ((is) this).field_r = ((is) this).field_vb.toString();
                    ((is) this).field_ub = 2;
                    if (fna.field_h == 13) {
                      ((is) this).field_ub = 1;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (!param0) {
                      break L15;
                    } else {
                      field_Ab = -0.0745474174618721f;
                      break L15;
                    }
                  }
                  return true;
                }
              } else {
                L16: {
                  if (fna.field_h == 13) {
                    ((is) this).field_ub = 1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (!param0) {
                    break L17;
                  } else {
                    field_Ab = -0.0745474174618721f;
                    break L17;
                  }
                }
                return true;
              }
            }
          } else {
            L18: {
              if (((is) this).field_vb.length() >= 12) {
                break L18;
              } else {
                L19: {
                  var2 = Character.toLowerCase(kda.field_td);
                  if (var2 == 32) {
                    var2 = 95;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (95 != var2) {
                    break L20;
                  } else {
                    if (((is) this).field_vb.length() > 0) {
                      StringBuilder discarded$11 = ((is) this).field_vb.append(var2);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
                if (dja.a((byte) -17, (char) var2)) {
                  L21: {
                    StringBuilder discarded$12 = ((is) this).field_vb.append(var2);
                    if (fna.field_h == 84) {
                      if (((is) this).field_vb.length() <= 0) {
                        ((is) this).field_ub = 1;
                        break L21;
                      } else {
                        ((is) this).field_r = ((is) this).field_vb.toString();
                        ((is) this).field_ub = 2;
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (fna.field_h == 13) {
                      ((is) this).field_ub = 1;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  if (!param0) {
                    return true;
                  } else {
                    field_Ab = -0.0745474174618721f;
                    return true;
                  }
                } else {
                  if (!dp.a(125, (char) var2)) {
                    break L18;
                  } else {
                    L23: {
                      StringBuilder discarded$13 = ((is) this).field_vb.append(var2);
                      if (fna.field_h == 84) {
                        if (((is) this).field_vb.length() <= 0) {
                          ((is) this).field_ub = 1;
                          break L23;
                        } else {
                          ((is) this).field_r = ((is) this).field_vb.toString();
                          ((is) this).field_ub = 2;
                          break L23;
                        }
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if (fna.field_h == 13) {
                        ((is) this).field_ub = 1;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L25: {
                      if (!param0) {
                        break L25;
                      } else {
                        field_Ab = -0.0745474174618721f;
                        break L25;
                      }
                    }
                    return true;
                  }
                }
              }
            }
            if (fna.field_h == 84) {
              if (((is) this).field_vb.length() <= 0) {
                L26: {
                  ((is) this).field_ub = 1;
                  if (fna.field_h == 13) {
                    ((is) this).field_ub = 1;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (!param0) {
                    break L27;
                  } else {
                    field_Ab = -0.0745474174618721f;
                    break L27;
                  }
                }
                return true;
              } else {
                L28: {
                  ((is) this).field_r = ((is) this).field_vb.toString();
                  ((is) this).field_ub = 2;
                  if (fna.field_h == 13) {
                    ((is) this).field_ub = 1;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (!param0) {
                    break L29;
                  } else {
                    field_Ab = -0.0745474174618721f;
                    break L29;
                  }
                }
                return true;
              }
            } else {
              L30: {
                if (fna.field_h == 13) {
                  ((is) this).field_ub = 1;
                  break L30;
                } else {
                  break L30;
                }
              }
              L31: {
                if (!param0) {
                  break L31;
                } else {
                  field_Ab = -0.0745474174618721f;
                  break L31;
                }
              }
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final int a(boolean param0, int param1) {
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 == 1513) {
          ((is) this).c(-57, param0);
          if (param0) {
            L0: while (true) {
              if (!es.a(true)) {
                L1: {
                  ((is) this).field_tb.field_r = ((is) this).field_vb.toString();
                  if (!param0) {
                    break L1;
                  } else {
                    if (hf.field_b == 0) {
                      break L1;
                    } else {
                      if (0 != ((is) this).field_y) {
                        break L1;
                      } else {
                        ((is) this).field_ub = 1;
                        return ((is) this).field_ub;
                      }
                    }
                  }
                }
                return ((is) this).field_ub;
              } else {
                L2: {
                  if (fna.field_h != 85) {
                    break L2;
                  } else {
                    if (((is) this).field_vb.length() > 0) {
                      StringBuilder discarded$10 = ana.a(-1 + ((is) this).field_vb.length(), ' ', -11, ((is) this).field_vb);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (ih.a((CharSequence) (Object) ((is) this).field_vb, true, kda.field_td)) {
                    StringBuilder discarded$11 = ((is) this).field_vb.append(kda.field_td);
                    break L3;
                  } else {
                    L4: {
                      if (((is) this).field_vb.length() != 0) {
                        break L4;
                      } else {
                        if (91 == kda.field_td) {
                          StringBuilder discarded$12 = ((is) this).field_vb.append(kda.field_td);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (1 != ((is) this).field_vb.length()) {
                        break L5;
                      } else {
                        if (kda.field_td == 35) {
                          StringBuilder discarded$13 = ((is) this).field_vb.append(kda.field_td);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (kda.field_td != 93) {
                      break L3;
                    } else {
                      StringBuilder discarded$14 = ((is) this).field_vb.append(kda.field_td);
                      break L3;
                    }
                  }
                }
                if (fna.field_h == 84) {
                  if (((is) this).field_vb.length() <= 0) {
                    return 1;
                  } else {
                    ((is) this).field_r = ((is) this).field_vb.toString();
                    return 2;
                  }
                } else {
                  if (13 == fna.field_h) {
                    return 1;
                  } else {
                    continue L0;
                  }
                }
              }
            }
          } else {
            L6: {
              ((is) this).field_tb.field_r = ((is) this).field_vb.toString();
              if (!param0) {
                break L6;
              } else {
                if (hf.field_b == 0) {
                  break L6;
                } else {
                  if (0 != ((is) this).field_y) {
                    break L6;
                  } else {
                    ((is) this).field_ub = 1;
                    return ((is) this).field_ub;
                  }
                }
              }
            }
            return ((is) this).field_ub;
          }
        } else {
          field_wb = null;
          ((is) this).c(-57, param0);
          if (!param0) {
            ((is) this).field_tb.field_r = ((is) this).field_vb.toString();
            if (param0) {
              if (hf.field_b != 0) {
                if (0 != ((is) this).field_y) {
                  return ((is) this).field_ub;
                } else {
                  ((is) this).field_ub = 1;
                  return ((is) this).field_ub;
                }
              } else {
                return ((is) this).field_ub;
              }
            } else {
              return ((is) this).field_ub;
            }
          } else {
            L7: while (true) {
              if (!es.a(true)) {
                L8: {
                  ((is) this).field_tb.field_r = ((is) this).field_vb.toString();
                  if (!param0) {
                    break L8;
                  } else {
                    if (hf.field_b == 0) {
                      break L8;
                    } else {
                      if (0 != ((is) this).field_y) {
                        break L8;
                      } else {
                        ((is) this).field_ub = 1;
                        break L8;
                      }
                    }
                  }
                }
                return ((is) this).field_ub;
              } else {
                L9: {
                  if (fna.field_h != 85) {
                    break L9;
                  } else {
                    if (((is) this).field_vb.length() > 0) {
                      StringBuilder discarded$15 = ana.a(-1 + ((is) this).field_vb.length(), ' ', -11, ((is) this).field_vb);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (ih.a((CharSequence) (Object) ((is) this).field_vb, true, kda.field_td)) {
                    StringBuilder discarded$16 = ((is) this).field_vb.append(kda.field_td);
                    break L10;
                  } else {
                    L11: {
                      if (((is) this).field_vb.length() != 0) {
                        break L11;
                      } else {
                        if (91 == kda.field_td) {
                          StringBuilder discarded$17 = ((is) this).field_vb.append(kda.field_td);
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (1 != ((is) this).field_vb.length()) {
                        break L12;
                      } else {
                        if (kda.field_td == 35) {
                          StringBuilder discarded$18 = ((is) this).field_vb.append(kda.field_td);
                          break L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (kda.field_td != 93) {
                      break L10;
                    } else {
                      StringBuilder discarded$19 = ((is) this).field_vb.append(kda.field_td);
                      break L10;
                    }
                  }
                }
                if (fna.field_h == 84) {
                  if (((is) this).field_vb.length() <= 0) {
                    return 1;
                  } else {
                    ((is) this).field_r = ((is) this).field_vb.toString();
                    return 2;
                  }
                } else {
                  if (13 == fna.field_h) {
                    return 1;
                  } else {
                    continue L7;
                  }
                }
              }
            }
          }
        }
    }

    is(int param0, int param1, int param2, int param3, String param4, jea param5, jea param6, jea param7) {
        super(0L, param5);
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
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
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        ((is) this).field_ub = 0;
        try {
          L0: {
            ((is) this).field_zb = new jea(0L, param6, param4);
            ((is) this).b(-125, ((is) this).field_zb);
            ((is) this).field_tb = new jea(0L, param7);
            ((is) this).field_tb.field_ib = 16764006;
            ((is) this).b(-128, ((is) this).field_tb);
            ((is) this).field_tb.field_sb = "|";
            ((is) this).field_vb = new StringBuilder(12);
            var9_int = ((is) this).field_zb.b((byte) 69);
            ((is) this).field_zb.a(var9_int, di.field_a, -23776, 3, 5);
            ((is) this).field_tb.a(var9_int, di.field_a, -23776, 3 + di.field_a, 5);
            var10 = 5 + (var9_int - -5);
            var11 = di.field_a * 2 + 6;
            var12 = bt.a((byte) -8, var10, param2, param0);
            var13 = hsa.a(param3, var11, param1, (byte) 69);
            ((is) this).a(var10, var11, -23776, var13, var12);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var9;
            stackOut_3_1 = new StringBuilder().append("is.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param4 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param7 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = new hra();
        field_xb = new pea(16);
    }
}
