/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends kc {
    static qb[] field_Jb;
    static int field_Eb;
    static boolean field_Ib;
    private kc field_Db;
    static String field_Gb;
    static String field_Kb;
    static String field_Cb;
    static String[] field_Bb;
    static float field_Hb;
    private kc field_Fb;

    final static ll a(String param0, String param1, int param2, eg param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ll stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        ll stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 19412) {
                break L1;
              } else {
                field_Gb = (String) null;
                break L1;
              }
            }
            var4_int = param3.c(param1, 90);
            var5 = param3.a(param0, (byte) 98, var4_int);
            stackOut_2_0 = me.a(param3, 31027, var4_int, var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("af.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.a(param2, param0, param3, param1, (byte) -120);
        this.b(param5, 196);
        if (param4 != -31179) {
            field_Hb = -0.7085046172142029f;
        }
    }

    final static char a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 != 22) {
          L0: {
            field_Kb = (String) null;
            var2 = param0;
            if ((var2 ^ -1) != -33) {
              if (var2 != 160) {
                if (-96 == (var2 ^ -1)) {
                  break L0;
                } else {
                  if (45 == var2) {
                    break L0;
                  } else {
                    L1: {
                      if (-92 == (var2 ^ -1)) {
                        break L1;
                      } else {
                        if (var2 == 93) {
                          break L1;
                        } else {
                          if (var2 != 35) {
                            L2: {
                              if (224 == var2) {
                                break L2;
                              } else {
                                if (-226 != (var2 ^ -1)) {
                                  if (var2 == 226) {
                                    break L2;
                                  } else {
                                    if (228 != var2) {
                                      if ((var2 ^ -1) == -228) {
                                        break L2;
                                      } else {
                                        if ((var2 ^ -1) != -193) {
                                          if (var2 != 193) {
                                            if (-195 == (var2 ^ -1)) {
                                              break L2;
                                            } else {
                                              if (var2 == 196) {
                                                break L2;
                                              } else {
                                                if (-196 == (var2 ^ -1)) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (232 == var2) {
                                                      break L3;
                                                    } else {
                                                      if ((var2 ^ -1) == -234) {
                                                        break L3;
                                                      } else {
                                                        if (var2 == 234) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (var2 == 200) {
                                                              break L3;
                                                            } else {
                                                              if (var2 == 201) {
                                                                break L3;
                                                              } else {
                                                                if (var2 != 202) {
                                                                  if (var2 != 203) {
                                                                    if (-238 != (var2 ^ -1)) {
                                                                      if ((var2 ^ -1) != -239) {
                                                                        if (var2 != 239) {
                                                                          if (var2 != 205) {
                                                                            if (206 == var2) {
                                                                              return 'i';
                                                                            } else {
                                                                              if ((var2 ^ -1) != -208) {
                                                                                L4: {
                                                                                  if (242 == var2) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    if (var2 != 243) {
                                                                                      if (-245 == (var2 ^ -1)) {
                                                                                        break L4;
                                                                                      } else {
                                                                                        if (var2 != 246) {
                                                                                          if (245 == var2) {
                                                                                            break L4;
                                                                                          } else {
                                                                                            if ((var2 ^ -1) == -211) {
                                                                                              break L4;
                                                                                            } else {
                                                                                              if ((var2 ^ -1) != -212) {
                                                                                                if (212 == var2) {
                                                                                                  break L4;
                                                                                                } else {
                                                                                                  if (var2 != 214) {
                                                                                                    if (213 != var2) {
                                                                                                      L5: {
                                                                                                        if (-250 == (var2 ^ -1)) {
                                                                                                          break L5;
                                                                                                        } else {
                                                                                                          if (-251 == (var2 ^ -1)) {
                                                                                                            break L5;
                                                                                                          } else {
                                                                                                            if (251 != var2) {
                                                                                                              if (252 != var2) {
                                                                                                                if (217 == var2) {
                                                                                                                  break L5;
                                                                                                                } else {
                                                                                                                  if (218 != var2) {
                                                                                                                    if ((var2 ^ -1) == -220) {
                                                                                                                      break L5;
                                                                                                                    } else {
                                                                                                                      if ((var2 ^ -1) == -221) {
                                                                                                                        break L5;
                                                                                                                      } else {
                                                                                                                        if (231 != var2) {
                                                                                                                          if (199 == var2) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            L6: {
                                                                                                                              if (255 == var2) {
                                                                                                                                break L6;
                                                                                                                              } else {
                                                                                                                                if (-377 == (var2 ^ -1)) {
                                                                                                                                  break L6;
                                                                                                                                } else {
                                                                                                                                  if (241 != var2) {
                                                                                                                                    if ((var2 ^ -1) == -210) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (223 != var2) {
                                                                                                                                        return Character.toLowerCase(param0);
                                                                                                                                      } else {
                                                                                                                                        return 'b';
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            return 'y';
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'c';
                                                                                                                        }
                                                                                                                      }
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
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
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
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              }
                                            }
                                          } else {
                                            return 'a';
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    } else {
                                      break L2;
                                    }
                                  }
                                } else {
                                  break L2;
                                }
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    return param0;
                  }
                }
              } else {
                return '_';
              }
            } else {
              break L0;
            }
          }
          return '_';
        } else {
          var2 = param0;
          if ((var2 ^ -1) != -33) {
            if (var2 != 160) {
              if (-96 != (var2 ^ -1)) {
                if (45 != var2) {
                  if (-92 != (var2 ^ -1)) {
                    L7: {
                      if (var2 == 93) {
                        break L7;
                      } else {
                        if (var2 != 35) {
                          L8: {
                            if (224 == var2) {
                              break L8;
                            } else {
                              if (-226 != (var2 ^ -1)) {
                                if (var2 == 226) {
                                  break L8;
                                } else {
                                  if (228 != var2) {
                                    if ((var2 ^ -1) == -228) {
                                      break L8;
                                    } else {
                                      if ((var2 ^ -1) != -193) {
                                        if (var2 != 193) {
                                          if (-195 == (var2 ^ -1)) {
                                            break L8;
                                          } else {
                                            if (var2 == 196) {
                                              break L8;
                                            } else {
                                              if (-196 == (var2 ^ -1)) {
                                                break L8;
                                              } else {
                                                L9: {
                                                  if (232 == var2) {
                                                    break L9;
                                                  } else {
                                                    if ((var2 ^ -1) == -234) {
                                                      break L9;
                                                    } else {
                                                      if (var2 == 234) {
                                                        break L9;
                                                      } else {
                                                        if (var2 == 235) {
                                                          break L9;
                                                        } else {
                                                          if (var2 == 200) {
                                                            break L9;
                                                          } else {
                                                            if (var2 == 201) {
                                                              break L9;
                                                            } else {
                                                              if (var2 != 202) {
                                                                if (var2 != 203) {
                                                                  L10: {
                                                                    if (-238 != (var2 ^ -1)) {
                                                                      if ((var2 ^ -1) != -239) {
                                                                        if (var2 != 239) {
                                                                          if (var2 != 205) {
                                                                            if (206 == var2) {
                                                                              break L10;
                                                                            } else {
                                                                              if ((var2 ^ -1) != -208) {
                                                                                L11: {
                                                                                  if (242 == var2) {
                                                                                    break L11;
                                                                                  } else {
                                                                                    if (var2 != 243) {
                                                                                      if (-245 == (var2 ^ -1)) {
                                                                                        break L11;
                                                                                      } else {
                                                                                        if (var2 != 246) {
                                                                                          if (245 == var2) {
                                                                                            break L11;
                                                                                          } else {
                                                                                            if ((var2 ^ -1) == -211) {
                                                                                              break L11;
                                                                                            } else {
                                                                                              if ((var2 ^ -1) != -212) {
                                                                                                if (212 == var2) {
                                                                                                  break L11;
                                                                                                } else {
                                                                                                  if (var2 != 214) {
                                                                                                    if (213 != var2) {
                                                                                                      L12: {
                                                                                                        if (-250 == (var2 ^ -1)) {
                                                                                                          break L12;
                                                                                                        } else {
                                                                                                          if (-251 == (var2 ^ -1)) {
                                                                                                            break L12;
                                                                                                          } else {
                                                                                                            if (251 != var2) {
                                                                                                              if (252 != var2) {
                                                                                                                if (217 == var2) {
                                                                                                                  break L12;
                                                                                                                } else {
                                                                                                                  if (218 != var2) {
                                                                                                                    if ((var2 ^ -1) == -220) {
                                                                                                                      break L12;
                                                                                                                    } else {
                                                                                                                      if ((var2 ^ -1) == -221) {
                                                                                                                        break L12;
                                                                                                                      } else {
                                                                                                                        if (231 != var2) {
                                                                                                                          if (199 == var2) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            L13: {
                                                                                                                              if (255 == var2) {
                                                                                                                                break L13;
                                                                                                                              } else {
                                                                                                                                if (-377 == (var2 ^ -1)) {
                                                                                                                                  break L13;
                                                                                                                                } else {
                                                                                                                                  if (241 != var2) {
                                                                                                                                    if ((var2 ^ -1) == -210) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (223 != var2) {
                                                                                                                                        return Character.toLowerCase(param0);
                                                                                                                                      } else {
                                                                                                                                        return 'b';
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            return 'y';
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'c';
                                                                                                                        }
                                                                                                                      }
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
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    } else {
                                                                                                      return 'o';
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L11;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                break L11;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } else {
                                                                                          break L11;
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      break L11;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
                                                                              } else {
                                                                                break L10;
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
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L9;
                                                                }
                                                              } else {
                                                                break L9;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                return 'e';
                                              }
                                            }
                                          }
                                        } else {
                                          break L8;
                                        }
                                      } else {
                                        break L8;
                                      }
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                          return 'a';
                        } else {
                          break L7;
                        }
                      }
                    }
                    return param0;
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
    }

    af(long param0, af param1, String param2) {
        this(param0, param1.field_Fb, param1.field_Db, param2);
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        if (param1 != 196) {
          this.a(28, 56, 27, -126, 76, 103);
          this.field_Fb.a(this.field_Fb.c(param1 + -26117), 0, 0, this.field_I, (byte) -120);
          var3 = this.field_Fb.field_x - -param0;
          this.field_Db.a(-var3 + this.field_x, var3, 0, this.field_I, (byte) -120);
          return;
        } else {
          this.field_Fb.a(this.field_Fb.c(param1 + -26117), 0, 0, this.field_I, (byte) -120);
          var3 = this.field_Fb.field_x - -param0;
          this.field_Db.a(-var3 + this.field_x, var3, 0, this.field_I, (byte) -120);
          return;
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -126) {
          return -111;
        } else {
          return this.field_Fb.c(param1 + -25795) + param0 + this.field_Db.c(-25921);
        }
    }

    public static void e(int param0) {
        field_Kb = null;
        field_Gb = null;
        field_Bb = null;
        field_Jb = null;
        field_Cb = null;
        int var1 = 66 / ((-6 - param0) / 44);
    }

    af(long param0, qb param1, qb param2, int param3, kc param4, String param5) {
        this(param0, (kc) null, param4, param5);
        try {
            this.field_Fb.field_gb = param3;
            this.field_Fb.field_W = param2;
            this.field_Fb.field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "af.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    private af(long param0, kc param1, kc param2, String param3) {
        super(param0, (kc) null);
        try {
            this.field_Fb = new kc(0L, param1);
            this.field_Db = new kc(0L, param2);
            this.field_Db.field_rb = param3;
            this.a(this.field_Fb, 51);
            this.a(this.field_Db, 106);
            this.e((byte) 20);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "af.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Gb = "Enter name of friend to delete from list";
        field_Kb = "Please enter a year between <%0> and <%1>";
        field_Bb = new String[]{"Win a Rated game", "Win 5 Rated games", "Win 20 Rated games", "Win 50 Rated games", "Obtain a rating of 2000 after winning 50 Rated games", "Obtain a rating of 4000 after winning 50 Rated games", "Win a Rated game with the full Book of Flame", "Win a Rated game with the full Book of Frost", "Win a Rated game with the full Book of Storm", "Win a Rated game with the full Book of Stone", "Win a Rated game with the full Book of Overlight", "Win a Rated game with the full Book of Underdark", "Win a Rated game with 10 minion spells in your spellbook", "Win 2 Rated games in a row during one session", "Win 5 Rated games in a row during one session", "Deal 250 damage in one attack, during a Rated game", "Win a Rated game with the full Book of Nature", "Win a Rated game with the full Book of Seas", "Win a Rated game, over 1500 rating, using a Harpy Flame familiar", "Win a Rated game, over 1500 rating, using a Frost Sprite familiar", "Win a Rated game, over 1500 rating, using a Storm Cloud familiar", "Win a Rated game, over 1500 rating, using a Pet Rock familiar", "Win a Rated game, over 2000 rating, using a Soul Jar", "Win a Rated game, over 2000 rating, using a Cherub familiar", "Win a Rated game, over 2500 rating, using a Fungus familiar", "Win a Rated game, over 2500 rating, using a Seahorse familiar", "Win a Rated team game taking no losses to your team", "Win a Rated team game, over 2000 rating, taking no losses to your team", "Win a Free-For-All Rated game with 4+ players", "Win a Free-For-All Rated game, over 2000 rating, with 4+ players", "Win a Rated game, over 3000 rating, with any full spellbook", "Purchase the fifth prestige hat for your Arcanist", "Win a Rated game with the full Book of Cogs", "Win a Rated game, over 3000 rating, using a Alarm Clock familiar", "Kill an Arcanist in a Rated game with a ball, bomb or bolt spell... from the opposite side of the map", "Win a Rated game with a very weak attack", "Win a Rated game with 1 health remaining", "Win a Rated game because the enviroment aided you", "Win a Rated game by knocking your opponent into the water", "Kill at three or more Arcanists in the final turn within a Rated game", "Win a Rated team game using teammate's minion to kill the last enemy", "Win a Rated game with an army of at least four Hard Water Trolls", "Use a flurry with at least four Elves at maximum power in a Rated game", "Only deal damage with minions and win a Rated game", "Win a Rated game ending as a Lich with a Zombie Dragon", "Win a Rated game, over 2000 rating, taking no towers", "Win Rated games on every map without changing your spellbook", "Purchase the tenth (and final) prestige hat for your Arcanist", "Defeat an Arcane Master Moderator in an epic battle of skill and arcane cunning!", "Deal 1,000 damage to your enemies in Rated games", "Deal 5,000 damage to your enemies in Rated games", "Deal 25,000 damage to your enemies in Rated games", "Deal 250,000 damage to your enemies in Rated games", "Deal 1,000,000 damage to your enemies in Rated games", "Win a Rated game, over 3000 rating, with the full Arcane Book", "Play a Rated game and kill the most enemy Zombie Monkeys in the Mos Le'Harmless arena during the Hallowe'en holiday", "Win a Rated game in resizable mode", "Win a Rated game in which you cause great rifts in the world", "Win a Rated game in which you exhibit great celestial control", "Win a Rated game having summoned forth the greatest foes", "Win a Rated game having controlled the weather blocking out the sun", "Win a Rated game where you show mastery of your whole spell book", "Deal excessive damage with control of nature", "Show your superiority of tower ownership", "Show how well you use your Beasts of Burden to shield you from enemy attack", "Destroy an enemy with the ultimate weapon of light", "Zombify the mount another Arcanist is riding", "Subvert the ultimate weapon of light", "Prove yourself the lord of dragons in a six player free-for-all fight", "Destroy an enemy's soul jar", "Exhibit your skill of sanctification", "Kill a player with the power of plants", "Win a Rated game using no direct fire spells (Balls, Bombs or Arrows)", "Win a Rated game using only bombs", "Kill at least 2 enemies using bombs thrown from the ground", "Cast four spells in a turn killing an enemy without finishing your turn", "Charge the ultimate defence of the arcane powers", "Kill a player by recalling them into the path of impending doom", "Kill a player while holding the remnants of his feeble attempt to destroy the world", "Heal excessively using the greatest powers of darkness", "Prove your familar's mastery in a six player game where all chose a different path", "Kill a player using an arcane portal to curcumnavigate their defences", "Deal excessive damage using the staff of the storm", "Kill a player with a skimming throw across the water", "Kill a player with a drop arrow", "Punch, Bash or Whip your enemies far and wide", "Insta-kill with the Dark Knight", "Win a game at the last possible moment", "Deal excessive damage by pulling all minions into darkness", "Shake the world causing the drowning of many foes", "Show your extreme hatred of towers by destoying them as soon as they rise", "Launch yourself into space!", "Sacrifice your windy minion and laugh at the concequences", "Wash your enemy's shields off for him", "Show your mastery of Flash or Vine Whip"};
        field_Cb = "As mentioned before, you can cycle through your minions by pressing 'N'; they move in the same way as yourself.  Select a minion now.";
        field_Ib = false;
    }
}
