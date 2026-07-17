/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static kb field_b;
    static int[] field_a;

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (ak.field_c != -1) {
                break L1;
              } else {
                if (jf.field_b != -1) {
                  break L1;
                } else {
                  jf.field_b = rf.field_X;
                  ak.field_c = nc.field_g;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                dm.field_a = dm.field_a + 1;
                if (param0 == null) {
                  if (null != n.field_s) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (param0.equals((Object) (Object) n.field_s)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (sk.field_h) {
                    break L5;
                  } else {
                    if (dm.field_a < g.field_h) {
                      break L5;
                    } else {
                      if (~(we.field_l + g.field_h) >= ~dm.field_a) {
                        break L5;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              }
              L6: {
                var2_int = stackIn_13_0;
                if (param0 == null) {
                  dm.field_a = 0;
                  break L6;
                } else {
                  if (sk.field_h) {
                    dm.field_a = g.field_h;
                    break L6;
                  } else {
                    if (var2_int == 0) {
                      dm.field_a = 0;
                      break L6;
                    } else {
                      dm.field_a = g.field_h;
                      break L6;
                    }
                  }
                }
              }
              L7: {
                ac.field_e = ak.field_c;
                if (param0 == null) {
                  if (var2_int == 0) {
                    break L7;
                  } else {
                    sk.field_h = true;
                    break L7;
                  }
                } else {
                  sk.field_h = false;
                  break L7;
                }
              }
              em.field_l = jf.field_b;
              break L2;
            }
            L8: {
              if (sk.field_h) {
                break L8;
              } else {
                if (g.field_h <= dm.field_a) {
                  break L8;
                } else {
                  if (!na.field_k) {
                    break L8;
                  } else {
                    ac.field_e = ak.field_c;
                    dm.field_a = 0;
                    em.field_l = jf.field_b;
                    break L8;
                  }
                }
              }
            }
            L9: {
              L10: {
                n.field_s = param0;
                jf.field_b = -1;
                ak.field_c = -1;
                if (!sk.field_h) {
                  break L10;
                } else {
                  if (~rb.field_m == ~dm.field_a) {
                    dm.field_a = 0;
                    sk.field_h = false;
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              break L9;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var2;
            stackOut_35_1 = new StringBuilder().append("ba.D(");
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param0 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L11;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L11;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + 44 + 0 + 41);
        }
    }

    final static int a(lb param0, int param1, gj param2) {
        RuntimeException var3 = null;
        wb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        wb var11 = null;
        int stackIn_2_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            var11 = new wb(param0.field_r, param0.field_s);
            var4 = new wb(param0.field_r, param2.field_t);
            var5 = var11.a(-105, var4);
            var6 = var11.a(false, var4);
            var7 = var11.a(51);
            var8 = (float)param2.field_u * (float)var7 * (float)param2.field_u - (float)var6 * (float)var6;
            if (var8 >= (float)param1) {
              L1: {
                var9 = 0;
                var10 = (float)Math.sqrt((double)var8);
                mm.field_d = ((float)var5 + var10) / (float)var7;
                if (mm.field_d < 0.0f) {
                  break L1;
                } else {
                  if (1.0f < mm.field_d) {
                    break L1;
                  } else {
                    lk.field_b = ha.a(param2.field_t, param0.a(false, mm.field_d), false);
                    if (param2.a(lk.field_b, 13012)) {
                      var9++;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (var10 > 0.0f) {
                  rb.field_g = ((float)var5 - var10) / (float)var7;
                  if (rb.field_g < 0.0f) {
                    break L2;
                  } else {
                    if (rb.field_g > 1.0f) {
                      break L2;
                    } else {
                      L3: {
                        cj.field_G = ha.a(param2.field_t, param0.a(false, rb.field_g), false);
                        if (param2.a(cj.field_G, 13012)) {
                          var9++;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      if (var9 != 1) {
                        break L2;
                      } else {
                        lk.field_b = cj.field_G;
                        mm.field_d = rb.field_g;
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_17_0 = var9;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("ba.B(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          L5: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L5;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_18_0;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    final static char a(boolean param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        if (!param0) {
          field_b = null;
          var2 = param1;
          if (32 != var2) {
            L0: {
              if (var2 == 160) {
                break L0;
              } else {
                if (var2 == 95) {
                  break L0;
                } else {
                  if (var2 != 45) {
                    L1: {
                      if (var2 == 91) {
                        break L1;
                      } else {
                        if (93 == var2) {
                          break L1;
                        } else {
                          if (var2 != 35) {
                            L2: {
                              if (var2 != 224) {
                                if (var2 != 225) {
                                  if (var2 != 226) {
                                    if (228 != var2) {
                                      if (var2 != 227) {
                                        if (var2 == 192) {
                                          break L2;
                                        } else {
                                          if (var2 == 193) {
                                            break L2;
                                          } else {
                                            if (var2 == 194) {
                                              break L2;
                                            } else {
                                              if (var2 != 196) {
                                                if (var2 == 195) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (232 == var2) {
                                                      break L3;
                                                    } else {
                                                      if (233 != var2) {
                                                        if (var2 == 234) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (200 == var2) {
                                                              break L3;
                                                            } else {
                                                              if (var2 != 201) {
                                                                if (202 == var2) {
                                                                  break L3;
                                                                } else {
                                                                  if (var2 != 203) {
                                                                    L4: {
                                                                      if (var2 == 237) {
                                                                        break L4;
                                                                      } else {
                                                                        if (238 != var2) {
                                                                          if (239 != var2) {
                                                                            if (var2 == 205) {
                                                                              break L4;
                                                                            } else {
                                                                              if (206 != var2) {
                                                                                if (var2 != 207) {
                                                                                  L5: {
                                                                                    if (242 == var2) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (var2 != 243) {
                                                                                        if (var2 != 244) {
                                                                                          if (var2 == 246) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (var2 == 245) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if (var2 != 210) {
                                                                                                if (var2 == 211) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (212 != var2) {
                                                                                                    if (var2 != 214) {
                                                                                                      if (var2 == 213) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        L6: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (var2 != 250) {
                                                                                                              if (var2 == 251) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (var2 != 252) {
                                                                                                                  if (var2 != 217) {
                                                                                                                    if (var2 != 218) {
                                                                                                                      if (var2 == 219) {
                                                                                                                        break L6;
                                                                                                                      } else {
                                                                                                                        if (var2 != 220) {
                                                                                                                          L7: {
                                                                                                                            if (var2 == 231) {
                                                                                                                              break L7;
                                                                                                                            } else {
                                                                                                                              if (var2 == 199) {
                                                                                                                                break L7;
                                                                                                                              } else {
                                                                                                                                L8: {
                                                                                                                                  if (255 == var2) {
                                                                                                                                    break L8;
                                                                                                                                  } else {
                                                                                                                                    if (var2 == 376) {
                                                                                                                                      break L8;
                                                                                                                                    } else {
                                                                                                                                      if (var2 == 241) {
                                                                                                                                        return 'n';
                                                                                                                                      } else {
                                                                                                                                        if (var2 != 209) {
                                                                                                                                          if (var2 != 223) {
                                                                                                                                            return Character.toLowerCase(param1);
                                                                                                                                          } else {
                                                                                                                                            return 'b';
                                                                                                                                          }
                                                                                                                                        } else {
                                                                                                                                          return 'n';
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                          return 'c';
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
                                                                                                                  return 'u';
                                                                                                                }
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
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
                                                                                                }
                                                                                              } else {
                                                                                                return 'o';
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                } else {
                                                                                  return 'i';
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
                                                                      }
                                                                    }
                                                                    return 'i';
                                                                  } else {
                                                                    return 'e';
                                                                  }
                                                                }
                                                              } else {
                                                                return 'e';
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        return 'e';
                                                      }
                                                    }
                                                  }
                                                  return 'e';
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
                            return 'a';
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    return param1;
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
          var2 = param1;
          if (32 != var2) {
            if (var2 != 160) {
              if (var2 != 95) {
                if (var2 != 45) {
                  if (var2 != 91) {
                    L9: {
                      if (93 == var2) {
                        break L9;
                      } else {
                        if (var2 != 35) {
                          L10: {
                            if (var2 != 224) {
                              if (var2 != 225) {
                                if (var2 != 226) {
                                  if (228 != var2) {
                                    if (var2 != 227) {
                                      if (var2 == 192) {
                                        break L10;
                                      } else {
                                        if (var2 == 193) {
                                          break L10;
                                        } else {
                                          if (var2 == 194) {
                                            break L10;
                                          } else {
                                            if (var2 != 196) {
                                              if (var2 == 195) {
                                                break L10;
                                              } else {
                                                L11: {
                                                  if (232 == var2) {
                                                    break L11;
                                                  } else {
                                                    if (233 != var2) {
                                                      if (var2 == 234) {
                                                        break L11;
                                                      } else {
                                                        if (var2 == 235) {
                                                          break L11;
                                                        } else {
                                                          if (200 == var2) {
                                                            break L11;
                                                          } else {
                                                            if (var2 != 201) {
                                                              if (202 == var2) {
                                                                break L11;
                                                              } else {
                                                                if (var2 != 203) {
                                                                  L12: {
                                                                    if (var2 == 237) {
                                                                      break L12;
                                                                    } else {
                                                                      if (238 != var2) {
                                                                        if (239 != var2) {
                                                                          if (var2 == 205) {
                                                                            break L12;
                                                                          } else {
                                                                            if (206 != var2) {
                                                                              if (var2 != 207) {
                                                                                L13: {
                                                                                  if (242 == var2) {
                                                                                    break L13;
                                                                                  } else {
                                                                                    if (var2 != 243) {
                                                                                      if (var2 != 244) {
                                                                                        if (var2 == 246) {
                                                                                          break L13;
                                                                                        } else {
                                                                                          if (var2 == 245) {
                                                                                            break L13;
                                                                                          } else {
                                                                                            if (var2 != 210) {
                                                                                              if (var2 == 211) {
                                                                                                break L13;
                                                                                              } else {
                                                                                                if (212 != var2) {
                                                                                                  if (var2 != 214) {
                                                                                                    if (var2 == 213) {
                                                                                                      break L13;
                                                                                                    } else {
                                                                                                      L14: {
                                                                                                        if (var2 == 249) {
                                                                                                          break L14;
                                                                                                        } else {
                                                                                                          if (var2 != 250) {
                                                                                                            if (var2 == 251) {
                                                                                                              break L14;
                                                                                                            } else {
                                                                                                              if (var2 != 252) {
                                                                                                                if (var2 != 217) {
                                                                                                                  if (var2 != 218) {
                                                                                                                    if (var2 == 219) {
                                                                                                                      break L14;
                                                                                                                    } else {
                                                                                                                      if (var2 != 220) {
                                                                                                                        L15: {
                                                                                                                          if (var2 == 231) {
                                                                                                                            break L15;
                                                                                                                          } else {
                                                                                                                            if (var2 == 199) {
                                                                                                                              break L15;
                                                                                                                            } else {
                                                                                                                              L16: {
                                                                                                                                if (255 == var2) {
                                                                                                                                  break L16;
                                                                                                                                } else {
                                                                                                                                  if (var2 == 376) {
                                                                                                                                    break L16;
                                                                                                                                  } else {
                                                                                                                                    if (var2 == 241) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (var2 != 209) {
                                                                                                                                        if (var2 != 223) {
                                                                                                                                          return Character.toLowerCase(param1);
                                                                                                                                        } else {
                                                                                                                                          return 'b';
                                                                                                                                        }
                                                                                                                                      } else {
                                                                                                                                        return 'n';
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                        return 'c';
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
                                                                                                                return 'u';
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L13;
                                                                                                  }
                                                                                                } else {
                                                                                                  break L13;
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
                                                                                    } else {
                                                                                      break L13;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              } else {
                                                                                break L12;
                                                                              }
                                                                            } else {
                                                                              break L12;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          break L12;
                                                                        }
                                                                      } else {
                                                                        break L12;
                                                                      }
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L11;
                                                                }
                                                              }
                                                            } else {
                                                              break L11;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L11;
                                                    }
                                                  }
                                                }
                                                return 'e';
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              } else {
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          }
                          return 'a';
                        } else {
                          break L9;
                        }
                      }
                    }
                    return param1;
                  } else {
                    return param1;
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
    }

    final static void a(int param0, String param1, boolean param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
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
            Throwable decompiledCaughtException = null;
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
            try {
              L0: {
                L1: {
                  if (ib.field_s.startsWith("win")) {
                    if (!hn.a(false, param1)) {
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
                try {
                  L2: {
                    L3: {
                      param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                      if (param0 == -7235) {
                        break L3;
                      } else {
                        field_a = null;
                        break L3;
                      }
                    }
                    break L2;
                  }
                } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                    bl.a((Throwable) null, (byte) 79, "MGR1: " + param1);
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_9_0 = (RuntimeException) var4_ref;
                stackOut_9_1 = new StringBuilder().append("ba.C(").append(param0).append(44);
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                if (param1 == null) {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "null";
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  break L5;
                } else {
                  stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                  stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
                  stackOut_10_2 = "{...}";
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  break L5;
                }
              }
              L6: {
                stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param2).append(44);
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param3 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L6;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_15_1 = stackOut_13_1;
                  stackIn_15_2 = stackOut_13_2;
                  break L6;
                }
              }
              throw kk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new kb(0);
        field_a = new int[8192];
    }
}
