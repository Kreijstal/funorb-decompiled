/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class un {
    static String field_c;
    static String field_b;
    static String field_a;

    final static void a(byte param0) {
        kf.field_I = null;
        int var1 = -59 / ((-91 - param0) / 32);
        ce.field_C = null;
    }

    final static cd a(int param0, String param1, int param2) {
        cd var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        cd stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        cd stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new cd(false);
            var3.field_f = param1;
            var4 = -78 % ((param2 - 59) / 32);
            var3.field_h = param0;
            stackOut_0_0 = (cd) (var3);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3_ref);
            stackOut_2_1 = new StringBuilder().append("un.F(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static char a(int param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        if (param0 == 228) {
          var2 = param1;
          if ((var2 ^ -1) != -33) {
            if (var2 != 160) {
              if (-96 != (var2 ^ -1)) {
                L0: {
                  if (-46 != (var2 ^ -1)) {
                    break L0;
                  } else {
                    if (var3 != 0) {
                      break L0;
                    } else {
                      return '_';
                    }
                  }
                }
                L1: {
                  if (var2 != 91) {
                    break L1;
                  } else {
                    if (var3 != 0) {
                      break L1;
                    } else {
                      return param1;
                    }
                  }
                }
                L2: {
                  if (-94 != (var2 ^ -1)) {
                    break L2;
                  } else {
                    if (var3 != 0) {
                      break L2;
                    } else {
                      return param1;
                    }
                  }
                }
                L3: {
                  if (35 != var2) {
                    break L3;
                  } else {
                    if (var3 != 0) {
                      break L3;
                    } else {
                      return param1;
                    }
                  }
                }
                if (var2 != 224) {
                  if ((var2 ^ -1) != -226) {
                    if (226 != var2) {
                      L4: {
                        if (228 != var2) {
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
                        if (-228 != (var2 ^ -1)) {
                          break L5;
                        } else {
                          if (var3 != 0) {
                            break L5;
                          } else {
                            return 'a';
                          }
                        }
                      }
                      if ((var2 ^ -1) != -193) {
                        L6: {
                          if (-194 != (var2 ^ -1)) {
                            break L6;
                          } else {
                            if (var3 != 0) {
                              break L6;
                            } else {
                              return 'a';
                            }
                          }
                        }
                        L7: {
                          if (var2 != 194) {
                            break L7;
                          } else {
                            if (var3 != 0) {
                              break L7;
                            } else {
                              return 'a';
                            }
                          }
                        }
                        L8: {
                          if (-197 != (var2 ^ -1)) {
                            break L8;
                          } else {
                            if (var3 != 0) {
                              break L8;
                            } else {
                              return 'a';
                            }
                          }
                        }
                        L9: {
                          if (195 != var2) {
                            break L9;
                          } else {
                            if (var3 != 0) {
                              break L9;
                            } else {
                              return 'a';
                            }
                          }
                        }
                        if (-233 != (var2 ^ -1)) {
                          if (-234 != (var2 ^ -1)) {
                            if (var2 != 234) {
                              L10: {
                                if (-236 != (var2 ^ -1)) {
                                  break L10;
                                } else {
                                  if (var3 != 0) {
                                    break L10;
                                  } else {
                                    return 'e';
                                  }
                                }
                              }
                              L11: {
                                if (200 != var2) {
                                  break L11;
                                } else {
                                  if (var3 != 0) {
                                    break L11;
                                  } else {
                                    return 'e';
                                  }
                                }
                              }
                              L12: {
                                if (var2 != 201) {
                                  break L12;
                                } else {
                                  if (var3 != 0) {
                                    break L12;
                                  } else {
                                    return 'e';
                                  }
                                }
                              }
                              if (var2 != 202) {
                                if ((var2 ^ -1) != -204) {
                                  if (var2 != 237) {
                                    L13: {
                                      if ((var2 ^ -1) != -239) {
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
                                      if ((var2 ^ -1) != -240) {
                                        break L14;
                                      } else {
                                        if (var3 != 0) {
                                          break L14;
                                        } else {
                                          return 'i';
                                        }
                                      }
                                    }
                                    L15: {
                                      if (205 == var2) {
                                        break L15;
                                      } else {
                                        if (var2 == 206) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if (-208 != (var2 ^ -1)) {
                                              break L16;
                                            } else {
                                              if (var3 == 0) {
                                                break L15;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            if (-243 == (var2 ^ -1)) {
                                              break L17;
                                            } else {
                                              if (243 == var2) {
                                                break L17;
                                              } else {
                                                if ((var2 ^ -1) == -245) {
                                                  break L17;
                                                } else {
                                                  L18: {
                                                    if ((var2 ^ -1) != -247) {
                                                      break L18;
                                                    } else {
                                                      if (var3 == 0) {
                                                        break L17;
                                                      } else {
                                                        break L18;
                                                      }
                                                    }
                                                  }
                                                  if (245 == var2) {
                                                    break L17;
                                                  } else {
                                                    if (-211 == (var2 ^ -1)) {
                                                      break L17;
                                                    } else {
                                                      L19: {
                                                        if ((var2 ^ -1) != -212) {
                                                          break L19;
                                                        } else {
                                                          if (var3 == 0) {
                                                            break L17;
                                                          } else {
                                                            break L19;
                                                          }
                                                        }
                                                      }
                                                      if (var2 == 212) {
                                                        break L17;
                                                      } else {
                                                        if (-215 == (var2 ^ -1)) {
                                                          break L17;
                                                        } else {
                                                          if (213 == var2) {
                                                            break L17;
                                                          } else {
                                                            L20: {
                                                              if (249 == var2) {
                                                                break L20;
                                                              } else {
                                                                if (-251 == (var2 ^ -1)) {
                                                                  break L20;
                                                                } else {
                                                                  L21: {
                                                                    if (-252 != (var2 ^ -1)) {
                                                                      break L21;
                                                                    } else {
                                                                      if (var3 == 0) {
                                                                        break L20;
                                                                      } else {
                                                                        break L21;
                                                                      }
                                                                    }
                                                                  }
                                                                  if (252 == var2) {
                                                                    break L20;
                                                                  } else {
                                                                    if (217 != var2) {
                                                                      if (-219 == (var2 ^ -1)) {
                                                                        break L20;
                                                                      } else {
                                                                        if (219 == var2) {
                                                                          break L20;
                                                                        } else {
                                                                          if ((var2 ^ -1) != -221) {
                                                                            L22: {
                                                                              if (231 == var2) {
                                                                                break L22;
                                                                              } else {
                                                                                if (var2 != 199) {
                                                                                  L23: {
                                                                                    if (-256 == (var2 ^ -1)) {
                                                                                      break L23;
                                                                                    } else {
                                                                                      if (-377 != (var2 ^ -1)) {
                                                                                        L24: {
                                                                                          if ((var2 ^ -1) != -242) {
                                                                                            if (209 != var2) {
                                                                                              if (var2 == 223) {
                                                                                                return 'b';
                                                                                              } else {
                                                                                                return Character.toLowerCase(param1);
                                                                                              }
                                                                                            } else {
                                                                                              if (var3 == 0) {
                                                                                                break L24;
                                                                                              } else {
                                                                                                if (var2 == 223) {
                                                                                                  return 'b';
                                                                                                } else {
                                                                                                  return Character.toLowerCase(param1);
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            if (var3 == 0) {
                                                                                              break L24;
                                                                                            } else {
                                                                                              if (209 != var2) {
                                                                                                if (var2 == 223) {
                                                                                                  return 'b';
                                                                                                } else {
                                                                                                  return Character.toLowerCase(param1);
                                                                                                }
                                                                                              } else {
                                                                                                if (var2 == 223) {
                                                                                                  return 'b';
                                                                                                } else {
                                                                                                  return Character.toLowerCase(param1);
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        return 'n';
                                                                                      } else {
                                                                                        if (var3 == 0) {
                                                                                          break L23;
                                                                                        } else {
                                                                                          if ((var2 ^ -1) != -242) {
                                                                                            if (209 != var2) {
                                                                                              if (var2 == 223) {
                                                                                                return 'b';
                                                                                              } else {
                                                                                                return Character.toLowerCase(param1);
                                                                                              }
                                                                                            } else {
                                                                                              if (var3 == 0) {
                                                                                                return 'n';
                                                                                              } else {
                                                                                                if (var2 == 223) {
                                                                                                  return 'b';
                                                                                                } else {
                                                                                                  return Character.toLowerCase(param1);
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            if (209 != var2) {
                                                                                              if (var2 == 223) {
                                                                                                return 'b';
                                                                                              } else {
                                                                                                return Character.toLowerCase(param1);
                                                                                              }
                                                                                            } else {
                                                                                              if (var2 == 223) {
                                                                                                return 'b';
                                                                                              } else {
                                                                                                return Character.toLowerCase(param1);
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  return 'y';
                                                                                } else {
                                                                                  if (var3 == 0) {
                                                                                    break L22;
                                                                                  } else {
                                                                                    if (-256 == (var2 ^ -1)) {
                                                                                      return 'y';
                                                                                    } else {
                                                                                      if (-377 != (var2 ^ -1)) {
                                                                                        L25: {
                                                                                          if ((var2 ^ -1) != -242) {
                                                                                            if (209 != var2) {
                                                                                              if (var2 == 223) {
                                                                                                return 'b';
                                                                                              } else {
                                                                                                return Character.toLowerCase(param1);
                                                                                              }
                                                                                            } else {
                                                                                              if (var3 == 0) {
                                                                                                break L25;
                                                                                              } else {
                                                                                                if (var2 == 223) {
                                                                                                  return 'b';
                                                                                                } else {
                                                                                                  return Character.toLowerCase(param1);
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            if (var3 == 0) {
                                                                                              break L25;
                                                                                            } else {
                                                                                              if (209 != var2) {
                                                                                                if (var2 == 223) {
                                                                                                  return 'b';
                                                                                                } else {
                                                                                                  return Character.toLowerCase(param1);
                                                                                                }
                                                                                              } else {
                                                                                                if (var2 == 223) {
                                                                                                  return 'b';
                                                                                                } else {
                                                                                                  return Character.toLowerCase(param1);
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        return 'n';
                                                                                      } else {
                                                                                        L26: {
                                                                                          if ((var2 ^ -1) != -242) {
                                                                                            break L26;
                                                                                          } else {
                                                                                            break L26;
                                                                                          }
                                                                                        }
                                                                                        L27: {
                                                                                          if (209 != var2) {
                                                                                            break L27;
                                                                                          } else {
                                                                                            if (var3 == 0) {
                                                                                              return 'n';
                                                                                            } else {
                                                                                              break L27;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        if (var2 == 223) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            return 'c';
                                                                          } else {
                                                                            if (var3 == 0) {
                                                                              break L20;
                                                                            } else {
                                                                              if (231 == var2) {
                                                                                return 'c';
                                                                              } else {
                                                                                L28: {
                                                                                  if (var2 != 199) {
                                                                                    break L28;
                                                                                  } else {
                                                                                    break L28;
                                                                                  }
                                                                                }
                                                                                L29: {
                                                                                  if (-256 == (var2 ^ -1)) {
                                                                                    break L29;
                                                                                  } else {
                                                                                    L30: {
                                                                                      if (-377 != (var2 ^ -1)) {
                                                                                        break L30;
                                                                                      } else {
                                                                                        if (var3 == 0) {
                                                                                          break L29;
                                                                                        } else {
                                                                                          break L30;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L31: {
                                                                                      L32: {
                                                                                        if ((var2 ^ -1) != -242) {
                                                                                          break L32;
                                                                                        } else {
                                                                                          if (var3 == 0) {
                                                                                            break L31;
                                                                                          } else {
                                                                                            break L32;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L33: {
                                                                                        if (209 != var2) {
                                                                                          break L33;
                                                                                        } else {
                                                                                          if (var3 == 0) {
                                                                                            break L31;
                                                                                          } else {
                                                                                            break L33;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (var2 == 223) {
                                                                                        return 'b';
                                                                                      } else {
                                                                                        return Character.toLowerCase(param1);
                                                                                      }
                                                                                    }
                                                                                    return 'n';
                                                                                  }
                                                                                }
                                                                                return 'y';
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if (var3 == 0) {
                                                                        break L20;
                                                                      } else {
                                                                        L34: {
                                                                          if (-219 == (var2 ^ -1)) {
                                                                            break L34;
                                                                          } else {
                                                                            if (219 == var2) {
                                                                              break L34;
                                                                            } else {
                                                                              L35: {
                                                                                if ((var2 ^ -1) != -221) {
                                                                                  break L35;
                                                                                } else {
                                                                                  break L35;
                                                                                }
                                                                              }
                                                                              L36: {
                                                                                if (231 == var2) {
                                                                                  break L36;
                                                                                } else {
                                                                                  L37: {
                                                                                    if (var2 != 199) {
                                                                                      break L37;
                                                                                    } else {
                                                                                      if (var3 == 0) {
                                                                                        break L36;
                                                                                      } else {
                                                                                        break L37;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L38: {
                                                                                    if (-256 == (var2 ^ -1)) {
                                                                                      break L38;
                                                                                    } else {
                                                                                      L39: {
                                                                                        if (-377 != (var2 ^ -1)) {
                                                                                          break L39;
                                                                                        } else {
                                                                                          if (var3 == 0) {
                                                                                            break L38;
                                                                                          } else {
                                                                                            break L39;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L40: {
                                                                                        L41: {
                                                                                          if ((var2 ^ -1) != -242) {
                                                                                            break L41;
                                                                                          } else {
                                                                                            if (var3 == 0) {
                                                                                              break L40;
                                                                                            } else {
                                                                                              break L41;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L42: {
                                                                                          if (209 != var2) {
                                                                                            break L42;
                                                                                          } else {
                                                                                            if (var3 == 0) {
                                                                                              break L40;
                                                                                            } else {
                                                                                              break L42;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        if (var2 == 223) {
                                                                                          return 'b';
                                                                                        } else {
                                                                                          return Character.toLowerCase(param1);
                                                                                        }
                                                                                      }
                                                                                      return 'n';
                                                                                    }
                                                                                  }
                                                                                  return 'y';
                                                                                }
                                                                              }
                                                                              return 'c';
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
                                                            return 'u';
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          return 'o';
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
                return '_';
              }
            } else {
              return '_';
            }
          } else {
            return '_';
          }
        } else {
          return 'N';
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int incrementValue$2 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var9 = client.field_A ? 1 : 0;
        try {
          L0: {
            var12 = new char[param3];
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = param1;
            L1: while (true) {
              if (var6 >= param3) {
                stackOut_13_0 = new String(var12, 0, var5);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var7 = param0[var6 + param2] & 255;
                    if (0 != var7) {
                      break L3;
                    } else {
                      if (var9 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (-129 < (var7 ^ -1)) {
                      break L4;
                    } else {
                      if ((var7 ^ -1) <= -161) {
                        break L4;
                      } else {
                        L5: {
                          var8 = nh.field_l[-128 + var7];
                          if (0 != var8) {
                            break L5;
                          } else {
                            var8 = 63;
                            break L5;
                          }
                        }
                        var7 = var8;
                        break L4;
                      }
                    }
                  }
                  incrementValue$2 = var5;
                  var5++;
                  var10[incrementValue$2] = (char)var7;
                  break L2;
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4_ref);
            stackOut_15_1 = new StringBuilder().append("un.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_14_0;
    }

    final static boolean a(int param0, int param1, int param2, byte param3) {
        if (param3 == 52) {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (param1 > 11) {
                break L0;
              } else {
                L1: {
                  if ((param2 ^ -1) > -2) {
                    break L1;
                  } else {
                    if (param2 > gk.c(param0, 1, param1)) {
                      break L1;
                    } else {
                      return true;
                    }
                  }
                }
                return false;
              }
            }
          }
          return false;
        } else {
          field_a = (String) null;
          if (0 <= param1) {
            if (param1 <= 11) {
              L2: {
                if ((param2 ^ -1) > -2) {
                  break L2;
                } else {
                  if (param2 > gk.c(param0, 1, param1)) {
                    break L2;
                  } else {
                    return true;
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static vg a(int param0, uf param1) {
        vg discarded$2 = null;
        int discarded$3 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        vg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        uf var9 = null;
        int var10 = 0;
        int var11 = 0;
        vg stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        vg stackOut_29_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.a(8, (byte) 87);
            if ((var2_int ^ -1) < -1) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = wg.a(param1, (byte) -127) ? 1 : 0;
                if (param0 == -128) {
                  break L1;
                } else {
                  var9 = (uf) null;
                  discarded$2 = un.a(36, (uf) null);
                  break L1;
                }
              }
              L2: {
                var4 = wg.a(param1, (byte) -112) ? 1 : 0;
                var5 = new vg();
                var5.field_l = (short)param1.a(16, (byte) 103);
                var5.field_J = v.a(param1, true, var5.field_J, 16);
                var5.field_o = v.a(param1, true, var5.field_o, 16);
                var5.field_e = v.a(param1, true, var5.field_e, 16);
                var5.field_L = (short)param1.a(16, (byte) 55);
                var5.field_M = v.a(param1, true, var5.field_M, 16);
                var5.field_c = v.a(param1, true, var5.field_c, 16);
                var5.field_A = v.a(param1, true, var5.field_A, 16);
                if (var3 != 0) {
                  var5.field_D = (short)param1.a(16, (byte) 90);
                  var5.field_k = v.a(param1, true, var5.field_k, 16);
                  var5.field_u = v.a(param1, true, var5.field_u, 16);
                  var5.field_O = v.a(param1, true, var5.field_O, 16);
                  var5.field_F = v.a(param1, true, var5.field_F, 16);
                  var5.field_t = v.a(param1, true, var5.field_t, 16);
                  var5.field_r = v.a(param1, true, var5.field_r, 16);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 != 0) {
                  discarded$3 = param1.a(16, (byte) 125);
                  var5.field_y = v.a(param1, true, var5.field_y, 16);
                  var5.field_z = v.a(param1, true, var5.field_z, 16);
                  var5.field_C = v.a(param1, true, var5.field_C, 16);
                  var5.field_N = v.a(param1, true, var5.field_N, 16);
                  var5.field_P = v.a(param1, true, var5.field_P, 16);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (wg.a(param1, (byte) -123)) {
                  var5.field_j = v.a(param1, true, var5.field_j, 16);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (!wg.a(param1, (byte) -115)) {
                  break L5;
                } else {
                  var5.field_Q = he.a((byte) 5, var5.field_Q, 16, param1);
                  var6 = 0;
                  var7 = 0;
                  L6: while (true) {
                    L7: {
                      L8: {
                        L9: {
                          if (var5.field_Q.length <= var7) {
                            break L9;
                          } else {
                            var11 = var5.field_Q[var7] & 255;
                            var10 = var6;
                            if (var8 != 0) {
                              if (var10 != var11) {
                                break L7;
                              } else {
                                break L8;
                              }
                            } else {
                              L10: {
                                if (var10 < var11) {
                                  var6 = var5.field_Q[var7] & 255;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              var7++;
                              if (var8 == 0) {
                                continue L6;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (var6 != 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                      var5.field_Q = null;
                      if (var8 == 0) {
                        break L5;
                      } else {
                        break L7;
                      }
                    }
                    var5.field_B = (byte)(var6 + 1);
                    break L5;
                  }
                }
              }
              stackOut_29_0 = (vg) (var5);
              stackIn_30_0 = stackOut_29_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var2);
            stackOut_31_1 = new StringBuilder().append("un.G(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L11;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        return stackIn_30_0;
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 < 84) {
            return;
        }
        field_a = null;
        field_b = null;
    }

    static {
        field_b = "Names cannot contain consecutive spaces";
        field_a = "Loading fonts";
        field_c = "Kick <%0> from this game";
    }
}
