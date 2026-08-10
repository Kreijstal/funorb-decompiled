/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba {
    static kb field_b;
    static int[] field_a;

    final static void a(String param0, int param1) {
        int stackIn_16_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param1 != (ak.field_c ^ -1)) {
                break L1;
              } else {
                if (0 != (jf.field_b ^ -1)) {
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
                  if (param0.equals(n.field_s)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!sk.field_h) {
                  if (dm.field_a >= g.field_h) {
                    if (we.field_l + g.field_h > dm.field_a) {
                      stackIn_16_0 = 1;
                      break L4;
                    } else {
                      stackIn_16_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_16_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_16_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_16_0;
                if (param0 == null) {
                  dm.field_a = 0;
                  break L5;
                } else {
                  if (sk.field_h) {
                    dm.field_a = g.field_h;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      dm.field_a = 0;
                      break L5;
                    } else {
                      dm.field_a = g.field_h;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                ac.field_e = ak.field_c;
                if (param0 == null) {
                  if (var2_int == 0) {
                    break L6;
                  } else {
                    sk.field_h = true;
                    break L6;
                  }
                } else {
                  sk.field_h = false;
                  break L6;
                }
              }
              em.field_l = jf.field_b;
              break L2;
            }
            L7: {
              if (sk.field_h) {
                break L7;
              } else {
                if (g.field_h <= dm.field_a) {
                  break L7;
                } else {
                  if (!na.field_k) {
                    break L7;
                  } else {
                    ac.field_e = ak.field_c;
                    dm.field_a = 0;
                    em.field_l = jf.field_b;
                    break L7;
                  }
                }
              }
            }
            L8: {
              L9: {
                n.field_s = param0;
                jf.field_b = -1;
                ak.field_c = -1;
                if (!sk.field_h) {
                  break L9;
                } else {
                  if (rb.field_m == dm.field_a) {
                    dm.field_a = 0;
                    sk.field_h = false;
                    break L9;
                  } else {
                    break L8;
                  }
                }
              }
              break L8;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackIn_40_0 = (RuntimeException) (var2);

            stackIn_40_1 = new StringBuilder().append("ba.D(");

            if (param0 == null) {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L10;
            } else {
              stackIn_41_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L10;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ',' + param1 + ')');
        }
    }

    final static int a(lb param0, int param1, gj param2) {
        int stackIn_2_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        wb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        wb var11 = null;
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
                      if ((var9 ^ -1) != -2) {
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
              stackIn_18_0 = var9;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("ba.B(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_18_0;
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != 12031) {
            field_b = (kb) null;
        }
    }

    final static char a(boolean param0, char param1) {
        int var2;
        int var3;
        var3 = HoldTheLine.field_D;
        if (!param0) {
          field_b = (kb) null;
          var2 = param1;
          if (32 != var2) {
            L0: {
              if (var2 == 160) {
                break L0;
              } else {
                if (var2 == 95) {
                  break L0;
                } else {
                  if ((var2 ^ -1) != -46) {
                    L1: {
                      if (-92 == (var2 ^ -1)) {
                        break L1;
                      } else {
                        if (93 == var2) {
                          break L1;
                        } else {
                          if (var2 != 35) {
                            L2: {
                              if ((var2 ^ -1) != -225) {
                                if (var2 != 225) {
                                  if (-227 != (var2 ^ -1)) {
                                    if (228 != var2) {
                                      if (-228 != (var2 ^ -1)) {
                                        if (var2 == 192) {
                                          break L2;
                                        } else {
                                          if (-194 == (var2 ^ -1)) {
                                            break L2;
                                          } else {
                                            if (-195 == (var2 ^ -1)) {
                                              break L2;
                                            } else {
                                              if ((var2 ^ -1) != -197) {
                                                if ((var2 ^ -1) == -196) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (232 == var2) {
                                                      break L3;
                                                    } else {
                                                      if (233 != var2) {
                                                        if (-235 == (var2 ^ -1)) {
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
                                                                  if (-204 != (var2 ^ -1)) {
                                                                    L4: {
                                                                      if ((var2 ^ -1) == -238) {
                                                                        break L4;
                                                                      } else {
                                                                        if (238 != var2) {
                                                                          if (239 != var2) {
                                                                            if (-206 == (var2 ^ -1)) {
                                                                              break L4;
                                                                            } else {
                                                                              if (206 != var2) {
                                                                                if ((var2 ^ -1) != -208) {
                                                                                  L5: {
                                                                                    if (242 == var2) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if ((var2 ^ -1) != -244) {
                                                                                        if (-245 != (var2 ^ -1)) {
                                                                                          if (var2 == 246) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (-246 == (var2 ^ -1)) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if ((var2 ^ -1) != -211) {
                                                                                                if ((var2 ^ -1) == -212) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (212 != var2) {
                                                                                                    if ((var2 ^ -1) != -215) {
                                                                                                      if (-214 == (var2 ^ -1)) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        L6: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if ((var2 ^ -1) != -251) {
                                                                                                              if ((var2 ^ -1) == -252) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if ((var2 ^ -1) != -253) {
                                                                                                                  if (-218 != (var2 ^ -1)) {
                                                                                                                    if ((var2 ^ -1) != -219) {
                                                                                                                      if (var2 == 219) {
                                                                                                                        break L6;
                                                                                                                      } else {
                                                                                                                        if (-221 != (var2 ^ -1)) {
                                                                                                                          L7: {
                                                                                                                            if ((var2 ^ -1) == -232) {
                                                                                                                              break L7;
                                                                                                                            } else {
                                                                                                                              if ((var2 ^ -1) == -200) {
                                                                                                                                break L7;
                                                                                                                              } else {
                                                                                                                                L8: {
                                                                                                                                  if (255 == var2) {
                                                                                                                                    break L8;
                                                                                                                                  } else {
                                                                                                                                    if (var2 == 376) {
                                                                                                                                      break L8;
                                                                                                                                    } else {
                                                                                                                                      if (-242 == (var2 ^ -1)) {
                                                                                                                                        return 'n';
                                                                                                                                      } else {
                                                                                                                                        if (-210 != (var2 ^ -1)) {
                                                                                                                                          if (-224 != (var2 ^ -1)) {
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
                if ((var2 ^ -1) != -46) {
                  if (-92 != (var2 ^ -1)) {
                    L9: {
                      if (93 == var2) {
                        break L9;
                      } else {
                        if (var2 != 35) {
                          L10: {
                            if ((var2 ^ -1) != -225) {
                              if (var2 != 225) {
                                if (-227 != (var2 ^ -1)) {
                                  if (228 != var2) {
                                    if (-228 != (var2 ^ -1)) {
                                      if (var2 == 192) {
                                        break L10;
                                      } else {
                                        if (-194 == (var2 ^ -1)) {
                                          break L10;
                                        } else {
                                          if (-195 == (var2 ^ -1)) {
                                            break L10;
                                          } else {
                                            if ((var2 ^ -1) != -197) {
                                              if ((var2 ^ -1) == -196) {
                                                break L10;
                                              } else {
                                                L11: {
                                                  if (232 == var2) {
                                                    break L11;
                                                  } else {
                                                    if (233 != var2) {
                                                      if (-235 == (var2 ^ -1)) {
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
                                                                if (-204 != (var2 ^ -1)) {
                                                                  L12: {
                                                                    if ((var2 ^ -1) == -238) {
                                                                      break L12;
                                                                    } else {
                                                                      if (238 != var2) {
                                                                        if (239 != var2) {
                                                                          if (-206 == (var2 ^ -1)) {
                                                                            break L12;
                                                                          } else {
                                                                            if (206 != var2) {
                                                                              if ((var2 ^ -1) != -208) {
                                                                                L13: {
                                                                                  if (242 == var2) {
                                                                                    break L13;
                                                                                  } else {
                                                                                    if ((var2 ^ -1) != -244) {
                                                                                      if (-245 != (var2 ^ -1)) {
                                                                                        if (var2 == 246) {
                                                                                          break L13;
                                                                                        } else {
                                                                                          if (-246 == (var2 ^ -1)) {
                                                                                            break L13;
                                                                                          } else {
                                                                                            if ((var2 ^ -1) != -211) {
                                                                                              if ((var2 ^ -1) == -212) {
                                                                                                break L13;
                                                                                              } else {
                                                                                                if (212 != var2) {
                                                                                                  if ((var2 ^ -1) != -215) {
                                                                                                    if (-214 == (var2 ^ -1)) {
                                                                                                      break L13;
                                                                                                    } else {
                                                                                                      L14: {
                                                                                                        if (var2 == 249) {
                                                                                                          break L14;
                                                                                                        } else {
                                                                                                          if ((var2 ^ -1) != -251) {
                                                                                                            if ((var2 ^ -1) == -252) {
                                                                                                              break L14;
                                                                                                            } else {
                                                                                                              if ((var2 ^ -1) != -253) {
                                                                                                                if (-218 != (var2 ^ -1)) {
                                                                                                                  if ((var2 ^ -1) != -219) {
                                                                                                                    if (var2 == 219) {
                                                                                                                      break L14;
                                                                                                                    } else {
                                                                                                                      if (-221 != (var2 ^ -1)) {
                                                                                                                        L15: {
                                                                                                                          if ((var2 ^ -1) == -232) {
                                                                                                                            break L15;
                                                                                                                          } else {
                                                                                                                            if ((var2 ^ -1) == -200) {
                                                                                                                              break L15;
                                                                                                                            } else {
                                                                                                                              L16: {
                                                                                                                                if (255 == var2) {
                                                                                                                                  break L16;
                                                                                                                                } else {
                                                                                                                                  if (var2 == 376) {
                                                                                                                                    break L16;
                                                                                                                                  } else {
                                                                                                                                    if (-242 == (var2 ^ -1)) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (-210 != (var2 ^ -1)) {
                                                                                                                                        if (-224 != (var2 ^ -1)) {
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
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            try {
              L0: {
                L1: {
                  if (ib.field_s.startsWith("win")) {
                    if (!hn.a(false, param1)) {
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
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
                        field_a = (int[]) null;
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
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var4_ref);

                stackIn_11_1 = new StringBuilder().append("ba.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new kb(0);
        field_a = new int[8192];
    }
}
