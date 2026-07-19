/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb {
    static mj field_c;
    static String field_d;
    static am field_a;
    static boolean field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 203) {
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(int param0, int param1) {
        hk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_9_0 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            re.field_e = param1;
            var2 = (hk) ((Object) bd.field_c.a((byte) -117));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = var2.field_h.d(-3548);
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (!stackIn_4_0) {
                            break L5;
                          } else {
                            var2.field_g.g(re.field_e * var2.field_j / 256);
                            if (var3 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var2.c(param0 + -20078);
                        break L4;
                      }
                      var2 = (hk) ((Object) bd.field_c.d((byte) 63));
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_9_0 = param0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              L6: {
                if (stackIn_10_0 == 256) {
                  break L6;
                } else {
                  field_a = (am) null;
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "qb.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, le[] param1, byte param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var11 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (-1 <= (param4 ^ -1)) {
                  break L1;
                } else {
                  var5_int = param1[0].field_m;
                  var6 = param1[2].field_m;
                  var7 = param1[1].field_m;
                  param1[0].c(param3, param0);
                  param1[2].c(param4 + (param3 - var6), param0);
                  ge.b(si.field_u);
                  ge.c(param3 - -var5_int, param0, -var6 + param3 - -param4, param0 - -param1[1].field_n);
                  var10 = 29 % ((param2 - 22) / 48);
                  var8 = param3 + var5_int;
                  var9 = param4 + (param3 + -var6);
                  param3 = var8;
                  L2: while (true) {
                    L3: {
                      if (var9 <= param3) {
                        ge.a(si.field_u);
                        break L3;
                      } else {
                        param1[1].c(param3, param0);
                        param3 = param3 + var7;
                        if (var11 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("qb.B(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static char a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        le[] var4 = null;
        L0: {
          var3 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param1 == -201) {
            break L0;
          } else {
            var4 = (le[]) null;
            qb.a(-124, (le[]) null, (byte) -91, -104, 94);
            break L0;
          }
        }
        var2 = param0;
        if (32 != var2) {
          if (var2 != 160) {
            if (95 != var2) {
              if (var2 != 45) {
                L1: {
                  if ((var2 ^ -1) != -92) {
                    break L1;
                  } else {
                    if (var3 != 0) {
                      break L1;
                    } else {
                      return param0;
                    }
                  }
                }
                if (-94 != (var2 ^ -1)) {
                  L2: {
                    if (35 != var2) {
                      break L2;
                    } else {
                      if (var3 != 0) {
                        break L2;
                      } else {
                        return param0;
                      }
                    }
                  }
                  if (-225 != (var2 ^ -1)) {
                    L3: {
                      if (var2 != 225) {
                        break L3;
                      } else {
                        if (var3 != 0) {
                          break L3;
                        } else {
                          return 'a';
                        }
                      }
                    }
                    if (var2 != 226) {
                      if (var2 != 228) {
                        L4: {
                          if ((var2 ^ -1) != -228) {
                            break L4;
                          } else {
                            if (var3 != 0) {
                              break L4;
                            } else {
                              return 'a';
                            }
                          }
                        }
                        L5: {
                          if (192 != var2) {
                            break L5;
                          } else {
                            if (var3 != 0) {
                              break L5;
                            } else {
                              return 'a';
                            }
                          }
                        }
                        if ((var2 ^ -1) != -194) {
                          if (-195 != (var2 ^ -1)) {
                            if (var2 != 196) {
                              if (var2 != 195) {
                                L6: {
                                  if (-233 != (var2 ^ -1)) {
                                    break L6;
                                  } else {
                                    if (var3 != 0) {
                                      break L6;
                                    } else {
                                      return 'e';
                                    }
                                  }
                                }
                                if ((var2 ^ -1) != -234) {
                                  if ((var2 ^ -1) != -235) {
                                    if (-236 != (var2 ^ -1)) {
                                      L7: {
                                        if (-201 != (var2 ^ -1)) {
                                          break L7;
                                        } else {
                                          if (var3 != 0) {
                                            break L7;
                                          } else {
                                            return 'e';
                                          }
                                        }
                                      }
                                      L8: {
                                        if (-202 != (var2 ^ -1)) {
                                          break L8;
                                        } else {
                                          if (var3 != 0) {
                                            break L8;
                                          } else {
                                            return 'e';
                                          }
                                        }
                                      }
                                      if (202 != var2) {
                                        L9: {
                                          if (203 != var2) {
                                            break L9;
                                          } else {
                                            if (var3 != 0) {
                                              break L9;
                                            } else {
                                              return 'e';
                                            }
                                          }
                                        }
                                        if ((var2 ^ -1) != -238) {
                                          L10: {
                                            if (var2 != 238) {
                                              break L10;
                                            } else {
                                              if (var3 != 0) {
                                                break L10;
                                              } else {
                                                return 'i';
                                              }
                                            }
                                          }
                                          L11: {
                                            if ((var2 ^ -1) != -240) {
                                              break L11;
                                            } else {
                                              if (var3 != 0) {
                                                break L11;
                                              } else {
                                                return 'i';
                                              }
                                            }
                                          }
                                          L12: {
                                            if (205 != var2) {
                                              break L12;
                                            } else {
                                              if (var3 != 0) {
                                                break L12;
                                              } else {
                                                return 'i';
                                              }
                                            }
                                          }
                                          L13: {
                                            if (-207 != (var2 ^ -1)) {
                                              break L13;
                                            } else {
                                              if (var3 != 0) {
                                                break L13;
                                              } else {
                                                return 'i';
                                              }
                                            }
                                          }
                                          L14: {
                                            if (-208 != (var2 ^ -1)) {
                                              break L14;
                                            } else {
                                              if (var3 == 0) {
                                                return 'i';
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          L15: {
                                            if (var2 == 242) {
                                              break L15;
                                            } else {
                                              L16: {
                                                if ((var2 ^ -1) != -244) {
                                                  break L16;
                                                } else {
                                                  if (var3 == 0) {
                                                    break L15;
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                              }
                                              if (244 == var2) {
                                                break L15;
                                              } else {
                                                if (-247 == (var2 ^ -1)) {
                                                  break L15;
                                                } else {
                                                  if (var2 == 245) {
                                                    break L15;
                                                  } else {
                                                    L17: {
                                                      if (-211 != (var2 ^ -1)) {
                                                        break L17;
                                                      } else {
                                                        if (var3 == 0) {
                                                          break L15;
                                                        } else {
                                                          break L17;
                                                        }
                                                      }
                                                    }
                                                    L18: {
                                                      if ((var2 ^ -1) != -212) {
                                                        break L18;
                                                      } else {
                                                        if (var3 == 0) {
                                                          break L15;
                                                        } else {
                                                          break L18;
                                                        }
                                                      }
                                                    }
                                                    if (-213 == (var2 ^ -1)) {
                                                      break L15;
                                                    } else {
                                                      if ((var2 ^ -1) == -215) {
                                                        break L15;
                                                      } else {
                                                        if (var2 == 213) {
                                                          break L15;
                                                        } else {
                                                          L19: {
                                                            if ((var2 ^ -1) == -250) {
                                                              break L19;
                                                            } else {
                                                              if (-251 != (var2 ^ -1)) {
                                                                if ((var2 ^ -1) == -252) {
                                                                  break L19;
                                                                } else {
                                                                  if ((var2 ^ -1) != -253) {
                                                                    if (var2 == 217) {
                                                                      break L19;
                                                                    } else {
                                                                      if (218 == var2) {
                                                                        break L19;
                                                                      } else {
                                                                        if ((var2 ^ -1) != -220) {
                                                                          if (var2 != 220) {
                                                                            L20: {
                                                                              if ((var2 ^ -1) == -232) {
                                                                                break L20;
                                                                              } else {
                                                                                if (-200 == (var2 ^ -1)) {
                                                                                  break L20;
                                                                                } else {
                                                                                  L21: {
                                                                                    if ((var2 ^ -1) != -256) {
                                                                                      if (376 == var2) {
                                                                                        break L21;
                                                                                      } else {
                                                                                        L22: {
                                                                                          if (-242 == (var2 ^ -1)) {
                                                                                            break L22;
                                                                                          } else {
                                                                                            if (var2 == 209) {
                                                                                              break L22;
                                                                                            } else {
                                                                                              if (-224 != (var2 ^ -1)) {
                                                                                                return Character.toLowerCase(param0);
                                                                                              } else {
                                                                                                if (var3 == 0) {
                                                                                                  return 'b';
                                                                                                } else {
                                                                                                  return '_';
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        return 'n';
                                                                                      }
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        break L21;
                                                                                      } else {
                                                                                        if (376 == var2) {
                                                                                          return 'y';
                                                                                        } else {
                                                                                          L23: {
                                                                                            if (-242 == (var2 ^ -1)) {
                                                                                              break L23;
                                                                                            } else {
                                                                                              if (var2 == 209) {
                                                                                                break L23;
                                                                                              } else {
                                                                                                if (-224 != (var2 ^ -1)) {
                                                                                                  return Character.toLowerCase(param0);
                                                                                                } else {
                                                                                                  return '_';
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          return 'n';
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
                                                                            if (var3 == 0) {
                                                                              break L19;
                                                                            } else {
                                                                              L24: {
                                                                                if ((var2 ^ -1) == -232) {
                                                                                  break L24;
                                                                                } else {
                                                                                  if (-200 == (var2 ^ -1)) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    if ((var2 ^ -1) != -256) {
                                                                                      if (376 == var2) {
                                                                                        return 'y';
                                                                                      } else {
                                                                                        L25: {
                                                                                          if (-242 == (var2 ^ -1)) {
                                                                                            break L25;
                                                                                          } else {
                                                                                            if (var2 == 209) {
                                                                                              break L25;
                                                                                            } else {
                                                                                              if (-224 != (var2 ^ -1)) {
                                                                                                return Character.toLowerCase(param0);
                                                                                              } else {
                                                                                                if (var3 == 0) {
                                                                                                  return 'b';
                                                                                                } else {
                                                                                                  return '_';
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        return 'n';
                                                                                      }
                                                                                    } else {
                                                                                      if (376 == var2) {
                                                                                        return 'y';
                                                                                      } else {
                                                                                        L26: {
                                                                                          if (-242 == (var2 ^ -1)) {
                                                                                            break L26;
                                                                                          } else {
                                                                                            if (var2 == 209) {
                                                                                              break L26;
                                                                                            } else {
                                                                                              if (-224 != (var2 ^ -1)) {
                                                                                                return Character.toLowerCase(param0);
                                                                                              } else {
                                                                                                return '_';
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        return 'n';
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              return 'c';
                                                                            }
                                                                          }
                                                                        } else {
                                                                          if (var3 == 0) {
                                                                            break L19;
                                                                          } else {
                                                                            if (var2 != 220) {
                                                                              L27: {
                                                                                if ((var2 ^ -1) == -232) {
                                                                                  break L27;
                                                                                } else {
                                                                                  if (-200 == (var2 ^ -1)) {
                                                                                    break L27;
                                                                                  } else {
                                                                                    L28: {
                                                                                      if ((var2 ^ -1) != -256) {
                                                                                        if (376 == var2) {
                                                                                          break L28;
                                                                                        } else {
                                                                                          L29: {
                                                                                            if (-242 == (var2 ^ -1)) {
                                                                                              break L29;
                                                                                            } else {
                                                                                              if (var2 == 209) {
                                                                                                break L29;
                                                                                              } else {
                                                                                                if (-224 != (var2 ^ -1)) {
                                                                                                  return Character.toLowerCase(param0);
                                                                                                } else {
                                                                                                  if (var3 == 0) {
                                                                                                    return 'b';
                                                                                                  } else {
                                                                                                    return '_';
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          return 'n';
                                                                                        }
                                                                                      } else {
                                                                                        if (var3 == 0) {
                                                                                          break L28;
                                                                                        } else {
                                                                                          if (376 == var2) {
                                                                                            return 'y';
                                                                                          } else {
                                                                                            L30: {
                                                                                              if (-242 == (var2 ^ -1)) {
                                                                                                break L30;
                                                                                              } else {
                                                                                                if (var2 == 209) {
                                                                                                  break L30;
                                                                                                } else {
                                                                                                  if (-224 != (var2 ^ -1)) {
                                                                                                    return Character.toLowerCase(param0);
                                                                                                  } else {
                                                                                                    return '_';
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            return 'n';
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
                                                                              L31: {
                                                                                if ((var2 ^ -1) == -232) {
                                                                                  break L31;
                                                                                } else {
                                                                                  if (-200 == (var2 ^ -1)) {
                                                                                    break L31;
                                                                                  } else {
                                                                                    L32: {
                                                                                      if ((var2 ^ -1) != -256) {
                                                                                        break L32;
                                                                                      } else {
                                                                                        break L32;
                                                                                      }
                                                                                    }
                                                                                    if (376 == var2) {
                                                                                      return 'y';
                                                                                    } else {
                                                                                      L33: {
                                                                                        if (-242 == (var2 ^ -1)) {
                                                                                          break L33;
                                                                                        } else {
                                                                                          if (var2 == 209) {
                                                                                            break L33;
                                                                                          } else {
                                                                                            if (-224 != (var2 ^ -1)) {
                                                                                              return Character.toLowerCase(param0);
                                                                                            } else {
                                                                                              if (var3 == 0) {
                                                                                                return 'b';
                                                                                              } else {
                                                                                                return '_';
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      return 'n';
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                              return 'c';
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    if (var3 == 0) {
                                                                      break L19;
                                                                    } else {
                                                                      L34: {
                                                                        if (var2 == 217) {
                                                                          break L34;
                                                                        } else {
                                                                          if (218 == var2) {
                                                                            break L34;
                                                                          } else {
                                                                            if ((var2 ^ -1) != -220) {
                                                                              if (var2 != 220) {
                                                                                L35: {
                                                                                  if ((var2 ^ -1) == -232) {
                                                                                    break L35;
                                                                                  } else {
                                                                                    if (-200 == (var2 ^ -1)) {
                                                                                      break L35;
                                                                                    } else {
                                                                                      L36: {
                                                                                        if ((var2 ^ -1) != -256) {
                                                                                          if (376 == var2) {
                                                                                            break L36;
                                                                                          } else {
                                                                                            L37: {
                                                                                              if (-242 == (var2 ^ -1)) {
                                                                                                break L37;
                                                                                              } else {
                                                                                                if (var2 == 209) {
                                                                                                  break L37;
                                                                                                } else {
                                                                                                  if (-224 != (var2 ^ -1)) {
                                                                                                    return Character.toLowerCase(param0);
                                                                                                  } else {
                                                                                                    if (var3 == 0) {
                                                                                                      return 'b';
                                                                                                    } else {
                                                                                                      return '_';
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            return 'n';
                                                                                          }
                                                                                        } else {
                                                                                          if (var3 == 0) {
                                                                                            break L36;
                                                                                          } else {
                                                                                            if (376 == var2) {
                                                                                              return 'y';
                                                                                            } else {
                                                                                              L38: {
                                                                                                if (-242 == (var2 ^ -1)) {
                                                                                                  break L38;
                                                                                                } else {
                                                                                                  if (var2 == 209) {
                                                                                                    break L38;
                                                                                                  } else {
                                                                                                    if (-224 != (var2 ^ -1)) {
                                                                                                      return Character.toLowerCase(param0);
                                                                                                    } else {
                                                                                                      return '_';
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              return 'n';
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
                                                                                if (var3 == 0) {
                                                                                  break L34;
                                                                                } else {
                                                                                  L39: {
                                                                                    if ((var2 ^ -1) == -232) {
                                                                                      break L39;
                                                                                    } else {
                                                                                      if (-200 == (var2 ^ -1)) {
                                                                                        break L39;
                                                                                      } else {
                                                                                        L40: {
                                                                                          if ((var2 ^ -1) != -256) {
                                                                                            break L40;
                                                                                          } else {
                                                                                            break L40;
                                                                                          }
                                                                                        }
                                                                                        if (376 == var2) {
                                                                                          return 'y';
                                                                                        } else {
                                                                                          L41: {
                                                                                            if (-242 == (var2 ^ -1)) {
                                                                                              break L41;
                                                                                            } else {
                                                                                              if (var2 == 209) {
                                                                                                break L41;
                                                                                              } else {
                                                                                                if (-224 != (var2 ^ -1)) {
                                                                                                  return Character.toLowerCase(param0);
                                                                                                } else {
                                                                                                  if (var3 == 0) {
                                                                                                    return 'b';
                                                                                                  } else {
                                                                                                    return '_';
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          return 'n';
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  return 'c';
                                                                                }
                                                                              }
                                                                            } else {
                                                                              L42: {
                                                                                if (var2 != 220) {
                                                                                  break L42;
                                                                                } else {
                                                                                  break L42;
                                                                                }
                                                                              }
                                                                              L43: {
                                                                                if ((var2 ^ -1) == -232) {
                                                                                  break L43;
                                                                                } else {
                                                                                  if (-200 == (var2 ^ -1)) {
                                                                                    break L43;
                                                                                  } else {
                                                                                    L44: {
                                                                                      L45: {
                                                                                        if ((var2 ^ -1) != -256) {
                                                                                          break L45;
                                                                                        } else {
                                                                                          if (var3 == 0) {
                                                                                            break L44;
                                                                                          } else {
                                                                                            break L45;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (376 == var2) {
                                                                                        break L44;
                                                                                      } else {
                                                                                        L46: {
                                                                                          if (-242 == (var2 ^ -1)) {
                                                                                            break L46;
                                                                                          } else {
                                                                                            if (var2 == 209) {
                                                                                              break L46;
                                                                                            } else {
                                                                                              if (-224 != (var2 ^ -1)) {
                                                                                                return Character.toLowerCase(param0);
                                                                                              } else {
                                                                                                if (var3 == 0) {
                                                                                                  return 'b';
                                                                                                } else {
                                                                                                  return '_';
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        return 'n';
                                                                                      }
                                                                                    }
                                                                                    return 'y';
                                                                                  }
                                                                                }
                                                                              }
                                                                              return 'c';
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      return 'u';
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (var3 == 0) {
                                                                  break L19;
                                                                } else {
                                                                  L47: {
                                                                    if ((var2 ^ -1) == -252) {
                                                                      break L47;
                                                                    } else {
                                                                      L48: {
                                                                        if ((var2 ^ -1) != -253) {
                                                                          break L48;
                                                                        } else {
                                                                          break L48;
                                                                        }
                                                                      }
                                                                      if (var2 == 217) {
                                                                        break L47;
                                                                      } else {
                                                                        if (218 == var2) {
                                                                          break L47;
                                                                        } else {
                                                                          L49: {
                                                                            if ((var2 ^ -1) != -220) {
                                                                              break L49;
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                break L47;
                                                                              } else {
                                                                                break L49;
                                                                              }
                                                                            }
                                                                          }
                                                                          L50: {
                                                                            if (var2 != 220) {
                                                                              break L50;
                                                                            } else {
                                                                              if (var3 == 0) {
                                                                                break L47;
                                                                              } else {
                                                                                break L50;
                                                                              }
                                                                            }
                                                                          }
                                                                          L51: {
                                                                            if ((var2 ^ -1) == -232) {
                                                                              break L51;
                                                                            } else {
                                                                              if (-200 == (var2 ^ -1)) {
                                                                                break L51;
                                                                              } else {
                                                                                L52: {
                                                                                  L53: {
                                                                                    if ((var2 ^ -1) != -256) {
                                                                                      break L53;
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        break L52;
                                                                                      } else {
                                                                                        break L53;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if (376 == var2) {
                                                                                    break L52;
                                                                                  } else {
                                                                                    L54: {
                                                                                      if (-242 == (var2 ^ -1)) {
                                                                                        break L54;
                                                                                      } else {
                                                                                        if (var2 == 209) {
                                                                                          break L54;
                                                                                        } else {
                                                                                          if (-224 != (var2 ^ -1)) {
                                                                                            return Character.toLowerCase(param0);
                                                                                          } else {
                                                                                            if (var3 == 0) {
                                                                                              return 'b';
                                                                                            } else {
                                                                                              return '_';
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    return 'n';
                                                                                  }
                                                                                }
                                                                                return 'y';
                                                                              }
                                                                            }
                                                                          }
                                                                          return 'c';
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  return 'u';
                                                                }
                                                              }
                                                            }
                                                          }
                                                          return 'u';
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          return 'o';
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

    static {
        field_d = "Click";
        pj discarded$0 = new pj();
        field_a = new am();
        field_b = false;
    }
}
