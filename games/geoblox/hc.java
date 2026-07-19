/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc extends dj implements nl {
    static int field_T;
    private int field_S;
    static int field_R;
    static String field_U;
    static byte[] field_K;
    private dg field_Q;

    final String c(byte param0) {
        String discarded$6 = null;
        if (param0 == 69) {
          if (this.field_l) {
            if (null == this.field_j) {
              return null;
            } else {
              oe.a(ue.field_e, (byte) -84, qa.field_a - -this.field_r - this.field_S);
              return this.field_j;
            }
          } else {
            return null;
          }
        } else {
          discarded$6 = this.c((byte) -87);
          if (this.field_l) {
            if (null == this.field_j) {
              return null;
            } else {
              oe.a(ue.field_e, (byte) -84, qa.field_a - -this.field_r - this.field_S);
              return this.field_j;
            }
          } else {
            return null;
          }
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 > 80) {
                break L1;
              } else {
                field_R = -109;
                break L1;
              }
            }
            stackOut_2_0 = bi.a(false, param1, (byte) -121);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("hc.IA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        if (param0) {
            return;
        }
        try {
            super.a(param0, param1, param2, param3);
            this.field_S = -this.field_v + (qa.field_a - param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hc.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    hc(String param0, bb param1, int param2) {
        super(param0, param1, param2);
    }

    public final dg a(byte param0) {
        if (param0 > -97) {
            field_U = (String) null;
            return this.field_Q;
        }
        return this.field_Q;
    }

    final static char a(char param0, int param1) {
        int var2 = 0;
        if (param1 != -227) {
          L0: {
            hc.k(82);
            var2 = param0;
            if (32 != var2) {
              if (-161 != (var2 ^ -1)) {
                if (var2 == 95) {
                  break L0;
                } else {
                  if (-46 == (var2 ^ -1)) {
                    break L0;
                  } else {
                    L1: {
                      if ((var2 ^ -1) == -92) {
                        break L1;
                      } else {
                        if (93 == var2) {
                          break L1;
                        } else {
                          if (35 != var2) {
                            L2: {
                              if ((var2 ^ -1) != -225) {
                                if (var2 != 225) {
                                  if ((var2 ^ -1) != -227) {
                                    if (-229 != (var2 ^ -1)) {
                                      if ((var2 ^ -1) == -228) {
                                        break L2;
                                      } else {
                                        if (var2 == 192) {
                                          break L2;
                                        } else {
                                          if (var2 != 193) {
                                            if (var2 != 194) {
                                              if ((var2 ^ -1) == -197) {
                                                break L2;
                                              } else {
                                                if (var2 == 195) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (-233 == (var2 ^ -1)) {
                                                      break L3;
                                                    } else {
                                                      if ((var2 ^ -1) == -234) {
                                                        break L3;
                                                      } else {
                                                        if (-235 != (var2 ^ -1)) {
                                                          if ((var2 ^ -1) == -236) {
                                                            break L3;
                                                          } else {
                                                            if ((var2 ^ -1) != -201) {
                                                              if (var2 != 201) {
                                                                if ((var2 ^ -1) == -203) {
                                                                  break L3;
                                                                } else {
                                                                  if (-204 != (var2 ^ -1)) {
                                                                    if ((var2 ^ -1) != -238) {
                                                                      if ((var2 ^ -1) != -239) {
                                                                        if (239 != var2) {
                                                                          L4: {
                                                                            if ((var2 ^ -1) == -206) {
                                                                              break L4;
                                                                            } else {
                                                                              if (-207 == (var2 ^ -1)) {
                                                                                break L4;
                                                                              } else {
                                                                                if ((var2 ^ -1) == -208) {
                                                                                  break L4;
                                                                                } else {
                                                                                  L5: {
                                                                                    if ((var2 ^ -1) == -243) {
                                                                                      break L5;
                                                                                    } else {
                                                                                      if (243 != var2) {
                                                                                        if ((var2 ^ -1) != -245) {
                                                                                          if (var2 == 246) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (-246 == (var2 ^ -1)) {
                                                                                              break L5;
                                                                                            } else {
                                                                                              if (-211 != (var2 ^ -1)) {
                                                                                                if (-212 != (var2 ^ -1)) {
                                                                                                  if (-213 == (var2 ^ -1)) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if (var2 == 214) {
                                                                                                      break L5;
                                                                                                    } else {
                                                                                                      if (-214 == (var2 ^ -1)) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        L6: {
                                                                                                          if (249 == var2) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (250 != var2) {
                                                                                                              if ((var2 ^ -1) != -252) {
                                                                                                                if (-253 != (var2 ^ -1)) {
                                                                                                                  if ((var2 ^ -1) != -218) {
                                                                                                                    if (218 != var2) {
                                                                                                                      if (-220 != (var2 ^ -1)) {
                                                                                                                        if (var2 == 220) {
                                                                                                                          break L6;
                                                                                                                        } else {
                                                                                                                          if (var2 != 231) {
                                                                                                                            if (var2 == 199) {
                                                                                                                              return 'c';
                                                                                                                            } else {
                                                                                                                              if (-256 != (var2 ^ -1)) {
                                                                                                                                if (-377 == (var2 ^ -1)) {
                                                                                                                                  return 'y';
                                                                                                                                } else {
                                                                                                                                  if (-242 != (var2 ^ -1)) {
                                                                                                                                    if (var2 != 209) {
                                                                                                                                      if ((var2 ^ -1) == -224) {
                                                                                                                                        return 'b';
                                                                                                                                      } else {
                                                                                                                                        return Character.toLowerCase(param0);
                                                                                                                                      }
                                                                                                                                    } else {
                                                                                                                                      return 'n';
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            }
                                                                                                                          } else {
                                                                                                                            return 'c';
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
                                                                                                        return 'u';
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
                                                                                        } else {
                                                                                          return 'o';
                                                                                        }
                                                                                      } else {
                                                                                        return 'o';
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                          return 'i';
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
                                                                }
                                                              } else {
                                                                break L3;
                                                              }
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          break L3;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  return 'e';
                                                }
                                              }
                                            } else {
                                              break L2;
                                            }
                                          } else {
                                            break L2;
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
          if (32 != var2) {
            if (-161 != (var2 ^ -1)) {
              if (var2 != 95) {
                if (-46 != (var2 ^ -1)) {
                  if ((var2 ^ -1) != -92) {
                    L7: {
                      if (93 == var2) {
                        break L7;
                      } else {
                        if (35 != var2) {
                          L8: {
                            if ((var2 ^ -1) != -225) {
                              if (var2 != 225) {
                                if ((var2 ^ -1) != -227) {
                                  if (-229 != (var2 ^ -1)) {
                                    if ((var2 ^ -1) == -228) {
                                      break L8;
                                    } else {
                                      if (var2 == 192) {
                                        break L8;
                                      } else {
                                        if (var2 != 193) {
                                          if (var2 != 194) {
                                            if ((var2 ^ -1) == -197) {
                                              break L8;
                                            } else {
                                              if (var2 == 195) {
                                                break L8;
                                              } else {
                                                L9: {
                                                  if (-233 == (var2 ^ -1)) {
                                                    break L9;
                                                  } else {
                                                    if ((var2 ^ -1) == -234) {
                                                      break L9;
                                                    } else {
                                                      if (-235 != (var2 ^ -1)) {
                                                        if ((var2 ^ -1) == -236) {
                                                          break L9;
                                                        } else {
                                                          if ((var2 ^ -1) != -201) {
                                                            if (var2 != 201) {
                                                              if ((var2 ^ -1) == -203) {
                                                                break L9;
                                                              } else {
                                                                if (-204 != (var2 ^ -1)) {
                                                                  L10: {
                                                                    if ((var2 ^ -1) != -238) {
                                                                      if ((var2 ^ -1) != -239) {
                                                                        if (239 != var2) {
                                                                          if ((var2 ^ -1) == -206) {
                                                                            break L10;
                                                                          } else {
                                                                            if (-207 == (var2 ^ -1)) {
                                                                              break L10;
                                                                            } else {
                                                                              if ((var2 ^ -1) == -208) {
                                                                                break L10;
                                                                              } else {
                                                                                L11: {
                                                                                  if ((var2 ^ -1) == -243) {
                                                                                    break L11;
                                                                                  } else {
                                                                                    if (243 != var2) {
                                                                                      if ((var2 ^ -1) != -245) {
                                                                                        if (var2 == 246) {
                                                                                          break L11;
                                                                                        } else {
                                                                                          if (-246 == (var2 ^ -1)) {
                                                                                            break L11;
                                                                                          } else {
                                                                                            if (-211 != (var2 ^ -1)) {
                                                                                              if (-212 != (var2 ^ -1)) {
                                                                                                if (-213 == (var2 ^ -1)) {
                                                                                                  break L11;
                                                                                                } else {
                                                                                                  if (var2 == 214) {
                                                                                                    break L11;
                                                                                                  } else {
                                                                                                    if (-214 == (var2 ^ -1)) {
                                                                                                      break L11;
                                                                                                    } else {
                                                                                                      L12: {
                                                                                                        if (249 == var2) {
                                                                                                          break L12;
                                                                                                        } else {
                                                                                                          if (250 != var2) {
                                                                                                            if ((var2 ^ -1) != -252) {
                                                                                                              if (-253 != (var2 ^ -1)) {
                                                                                                                if ((var2 ^ -1) != -218) {
                                                                                                                  if (218 != var2) {
                                                                                                                    if (-220 != (var2 ^ -1)) {
                                                                                                                      if (var2 == 220) {
                                                                                                                        break L12;
                                                                                                                      } else {
                                                                                                                        if (var2 != 231) {
                                                                                                                          if (var2 == 199) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (-256 != (var2 ^ -1)) {
                                                                                                                              if (-377 == (var2 ^ -1)) {
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                if (-242 != (var2 ^ -1)) {
                                                                                                                                  if (var2 != 209) {
                                                                                                                                    if ((var2 ^ -1) == -224) {
                                                                                                                                      return 'b';
                                                                                                                                    } else {
                                                                                                                                      return Character.toLowerCase(param0);
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    return 'n';
                                                                                                                                  }
                                                                                                                                } else {
                                                                                                                                  return 'n';
                                                                                                                                }
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'y';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        } else {
                                                                                                                          return 'c';
                                                                                                                        }
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
                                                                                                          } else {
                                                                                                            break L12;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                break L11;
                                                                                              }
                                                                                            } else {
                                                                                              break L11;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        break L11;
                                                                                      }
                                                                                    } else {
                                                                                      break L11;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                return 'o';
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
                                                                  }
                                                                  return 'i';
                                                                } else {
                                                                  break L9;
                                                                }
                                                              }
                                                            } else {
                                                              break L9;
                                                            }
                                                          } else {
                                                            break L9;
                                                          }
                                                        }
                                                      } else {
                                                        break L9;
                                                      }
                                                    }
                                                  }
                                                }
                                                return 'e';
                                              }
                                            }
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
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

    final static void b(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_T = -8;
            break L0;
          }
        }
        if (pg.field_c == null) {
          return;
        } else {
          var1 = pg.field_c;
          synchronized (var1) {
            L1: {
              pg.field_c = null;
              break L1;
            }
          }
          return;
        }
    }

    final void a(byte param0, dg param1) {
        try {
            this.field_Q = param1;
            int var3_int = 48 % ((param0 - 34) / 39);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hc.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void g(byte param0) {
        super.g((byte) -66);
        if (this.field_Q == null) {
          if (param0 > -16) {
            this.field_S = -4;
            return;
          } else {
            return;
          }
        } else {
          this.field_Q.b(-28133);
          if (param0 <= -16) {
            return;
          } else {
            this.field_S = -4;
            return;
          }
        }
    }

    public static void k(int param0) {
        field_U = null;
        field_K = null;
        if (param0 != -243) {
            field_T = -90;
        }
    }

    static {
        field_U = "Go Back";
    }
}
