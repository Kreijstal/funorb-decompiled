/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static volatile long field_g;
    private boolean field_b;
    static fn field_f;
    private float field_i;
    private int field_h;
    private int field_a;
    static int field_d;
    static int field_e;
    static vn[][] field_j;
    private int field_c;

    final void a(byte param0) {
        fn discarded$4 = null;
        fn discarded$5 = null;
        if (param0 != 29) {
          this.c(19);
          this.field_b = true;
          discarded$4 = kh.a(59, false);
          return;
        } else {
          this.field_b = true;
          discarded$5 = kh.a(59, false);
          return;
        }
    }

    final void c(int param0) {
        this.field_b = false;
        fn discarded$0 = kh.a(param0, false);
    }

    final void b(int param0) {
        if ((float)param0 != this.field_i) {
          this.field_i = this.field_i + 0.5f;
          if (5.0f >= this.field_i) {
            if (this.field_a > 25) {
              this.field_a = this.field_a - 25;
              return;
            } else {
              return;
            }
          } else {
            this.field_i = -1.0f;
            if (this.field_a <= 25) {
              return;
            } else {
              this.field_a = this.field_a - 25;
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0, wk param1) {
        RuntimeException var3 = null;
        vn[] stackIn_5_0 = null;
        vn[] stackIn_6_0 = null;
        vn[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn[] stackOut_4_0 = null;
        vn[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        vn[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 6) {
                break L1;
              } else {
                field_j = (vn[][]) null;
                break L1;
              }
            }
            L2: {
              if (this.field_i >= 0.0f) {
                L3: {
                  stackOut_4_0 = lb.field_eb;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!this.field_b) {
                    stackOut_6_0 = (vn[]) ((Object) stackIn_6_0);
                    stackOut_6_1 = (int)this.field_i;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L3;
                  } else {
                    stackOut_5_0 = (vn[]) ((Object) stackIn_5_0);
                    stackOut_5_1 = 6;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L3;
                  }
                }
                ((vn) (Object) stackIn_7_0[stackIn_7_1]).e(param1.a(this.field_h, (byte) -72) - 12, param1.a(this.field_c, 0) - 12, this.field_a);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("qj.A(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_j = (vn[][]) null;
        if (param0 != 97) {
            field_f = (fn) null;
        }
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 < 48) {
          field_g = 75L;
          this.field_a = 256;
          this.field_h = param1;
          this.field_c = param2;
          this.field_i = 0.0f;
          return;
        } else {
          this.field_a = 256;
          this.field_h = param1;
          this.field_c = param2;
          this.field_i = 0.0f;
          return;
        }
    }

    final static char a(int param0, char param1) {
        char discarded$1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        if (param0 >= -98) {
          L0: {
            discarded$1 = qj.a(-122, 'ﾛ');
            var2 = param1;
            if (32 != var2) {
              if (var2 != 160) {
                if (-96 != (var2 ^ -1)) {
                  if (45 != var2) {
                    if (-92 != (var2 ^ -1)) {
                      L1: {
                        if (-94 == (var2 ^ -1)) {
                          break L1;
                        } else {
                          if (-36 != (var2 ^ -1)) {
                            L2: {
                              if (var2 != 224) {
                                if ((var2 ^ -1) != -226) {
                                  if ((var2 ^ -1) == -227) {
                                    break L2;
                                  } else {
                                    if (-229 == (var2 ^ -1)) {
                                      break L2;
                                    } else {
                                      if (-228 == (var2 ^ -1)) {
                                        break L2;
                                      } else {
                                        if (var2 == 192) {
                                          break L2;
                                        } else {
                                          if (193 != var2) {
                                            if (-195 != (var2 ^ -1)) {
                                              if ((var2 ^ -1) == -197) {
                                                break L2;
                                              } else {
                                                if (-196 == (var2 ^ -1)) {
                                                  break L2;
                                                } else {
                                                  if (-233 != (var2 ^ -1)) {
                                                    L3: {
                                                      if (var2 == 233) {
                                                        break L3;
                                                      } else {
                                                        if (-235 == (var2 ^ -1)) {
                                                          break L3;
                                                        } else {
                                                          if (var2 != 235) {
                                                            if (var2 == 200) {
                                                              break L3;
                                                            } else {
                                                              if (var2 == 201) {
                                                                break L3;
                                                              } else {
                                                                if (202 == var2) {
                                                                  break L3;
                                                                } else {
                                                                  if (-204 == (var2 ^ -1)) {
                                                                    break L3;
                                                                  } else {
                                                                    if (var2 != 237) {
                                                                      if (var2 != 238) {
                                                                        if (239 != var2) {
                                                                          if (-206 != (var2 ^ -1)) {
                                                                            if (206 != var2) {
                                                                              if (-208 != (var2 ^ -1)) {
                                                                                L4: {
                                                                                  if ((var2 ^ -1) == -243) {
                                                                                    break L4;
                                                                                  } else {
                                                                                    if (-244 == (var2 ^ -1)) {
                                                                                      break L4;
                                                                                    } else {
                                                                                      if ((var2 ^ -1) != -245) {
                                                                                        if (246 != var2) {
                                                                                          if ((var2 ^ -1) == -246) {
                                                                                            break L4;
                                                                                          } else {
                                                                                            if (-211 == (var2 ^ -1)) {
                                                                                              break L4;
                                                                                            } else {
                                                                                              if (-212 == (var2 ^ -1)) {
                                                                                                break L4;
                                                                                              } else {
                                                                                                if (212 == var2) {
                                                                                                  break L4;
                                                                                                } else {
                                                                                                  if ((var2 ^ -1) != -215) {
                                                                                                    if ((var2 ^ -1) == -214) {
                                                                                                      break L4;
                                                                                                    } else {
                                                                                                      if (var2 != 249) {
                                                                                                        if (-251 != (var2 ^ -1)) {
                                                                                                          if (-252 != (var2 ^ -1)) {
                                                                                                            L5: {
                                                                                                              if (-253 == (var2 ^ -1)) {
                                                                                                                break L5;
                                                                                                              } else {
                                                                                                                if (var2 != 217) {
                                                                                                                  if ((var2 ^ -1) != -219) {
                                                                                                                    if ((var2 ^ -1) == -220) {
                                                                                                                      break L5;
                                                                                                                    } else {
                                                                                                                      if (220 != var2) {
                                                                                                                        L6: {
                                                                                                                          if ((var2 ^ -1) == -232) {
                                                                                                                            break L6;
                                                                                                                          } else {
                                                                                                                            if (199 == var2) {
                                                                                                                              break L6;
                                                                                                                            } else {
                                                                                                                              L7: {
                                                                                                                                if (var2 == 255) {
                                                                                                                                  break L7;
                                                                                                                                } else {
                                                                                                                                  if (376 == var2) {
                                                                                                                                    break L7;
                                                                                                                                  } else {
                                                                                                                                    if (var2 == 241) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (-210 != (var2 ^ -1)) {
                                                                                                                                        if (-224 == (var2 ^ -1)) {
                                                                                                                                          return 'b';
                                                                                                                                        } else {
                                                                                                                                          return Character.toLowerCase(param1);
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
                                                                                                              }
                                                                                                            }
                                                                                                            return 'u';
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
                                                                                                    return 'o';
                                                                                                  }
                                                                                                }
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
                                                                                }
                                                                                return 'o';
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
                                                                        return 'i';
                                                                      }
                                                                    } else {
                                                                      return 'i';
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            return 'e';
                                                          }
                                                        }
                                                      }
                                                    }
                                                    return 'e';
                                                  } else {
                                                    return 'e';
                                                  }
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
                                    }
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
                      return param1;
                    } else {
                      return param1;
                    }
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              } else {
                break L0;
              }
            } else {
              break L0;
            }
          }
          return '_';
        } else {
          L8: {
            var2 = param1;
            if (32 != var2) {
              if (var2 != 160) {
                if (-96 != (var2 ^ -1)) {
                  if (45 != var2) {
                    if (-92 != (var2 ^ -1)) {
                      if (-94 != (var2 ^ -1)) {
                        if (-36 != (var2 ^ -1)) {
                          L9: {
                            if (var2 != 224) {
                              if ((var2 ^ -1) != -226) {
                                if ((var2 ^ -1) != -227) {
                                  if (-229 != (var2 ^ -1)) {
                                    if (-228 == (var2 ^ -1)) {
                                      break L9;
                                    } else {
                                      if (var2 == 192) {
                                        break L9;
                                      } else {
                                        if (193 != var2) {
                                          if (-195 != (var2 ^ -1)) {
                                            if ((var2 ^ -1) == -197) {
                                              break L9;
                                            } else {
                                              if (-196 == (var2 ^ -1)) {
                                                break L9;
                                              } else {
                                                L10: {
                                                  if (-233 != (var2 ^ -1)) {
                                                    if (var2 == 233) {
                                                      break L10;
                                                    } else {
                                                      if (-235 == (var2 ^ -1)) {
                                                        break L10;
                                                      } else {
                                                        if (var2 != 235) {
                                                          if (var2 == 200) {
                                                            break L10;
                                                          } else {
                                                            if (var2 == 201) {
                                                              break L10;
                                                            } else {
                                                              if (202 == var2) {
                                                                break L10;
                                                              } else {
                                                                if (-204 == (var2 ^ -1)) {
                                                                  break L10;
                                                                } else {
                                                                  L11: {
                                                                    if (var2 != 237) {
                                                                      if (var2 != 238) {
                                                                        if (239 != var2) {
                                                                          if (-206 != (var2 ^ -1)) {
                                                                            if (206 != var2) {
                                                                              if (-208 != (var2 ^ -1)) {
                                                                                L12: {
                                                                                  if ((var2 ^ -1) == -243) {
                                                                                    break L12;
                                                                                  } else {
                                                                                    if (-244 == (var2 ^ -1)) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      if ((var2 ^ -1) != -245) {
                                                                                        if (246 != var2) {
                                                                                          if ((var2 ^ -1) == -246) {
                                                                                            break L12;
                                                                                          } else {
                                                                                            if (-211 == (var2 ^ -1)) {
                                                                                              break L12;
                                                                                            } else {
                                                                                              if (-212 == (var2 ^ -1)) {
                                                                                                break L12;
                                                                                              } else {
                                                                                                if (212 == var2) {
                                                                                                  break L12;
                                                                                                } else {
                                                                                                  if ((var2 ^ -1) != -215) {
                                                                                                    if ((var2 ^ -1) == -214) {
                                                                                                      break L12;
                                                                                                    } else {
                                                                                                      L13: {
                                                                                                        if (var2 != 249) {
                                                                                                          if (-251 != (var2 ^ -1)) {
                                                                                                            if (-252 != (var2 ^ -1)) {
                                                                                                              if (-253 == (var2 ^ -1)) {
                                                                                                                break L13;
                                                                                                              } else {
                                                                                                                if (var2 != 217) {
                                                                                                                  if ((var2 ^ -1) != -219) {
                                                                                                                    if ((var2 ^ -1) == -220) {
                                                                                                                      break L13;
                                                                                                                    } else {
                                                                                                                      if (220 != var2) {
                                                                                                                        L14: {
                                                                                                                          if ((var2 ^ -1) == -232) {
                                                                                                                            break L14;
                                                                                                                          } else {
                                                                                                                            if (199 == var2) {
                                                                                                                              break L14;
                                                                                                                            } else {
                                                                                                                              L15: {
                                                                                                                                if (var2 == 255) {
                                                                                                                                  break L15;
                                                                                                                                } else {
                                                                                                                                  if (376 == var2) {
                                                                                                                                    break L15;
                                                                                                                                  } else {
                                                                                                                                    if (var2 == 241) {
                                                                                                                                      return 'n';
                                                                                                                                    } else {
                                                                                                                                      if (-210 != (var2 ^ -1)) {
                                                                                                                                        if (-224 == (var2 ^ -1)) {
                                                                                                                                          return 'b';
                                                                                                                                        } else {
                                                                                                                                          return Character.toLowerCase(param1);
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
                                                                                                              }
                                                                                                            } else {
                                                                                                              return 'u';
                                                                                                            }
                                                                                                          } else {
                                                                                                            return 'u';
                                                                                                          }
                                                                                                        } else {
                                                                                                          break L13;
                                                                                                        }
                                                                                                      }
                                                                                                      return 'u';
                                                                                                    }
                                                                                                  } else {
                                                                                                    break L12;
                                                                                                  }
                                                                                                }
                                                                                              }
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
                                                                                }
                                                                                return 'o';
                                                                              } else {
                                                                                break L11;
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
                                                                      } else {
                                                                        break L11;
                                                                      }
                                                                    } else {
                                                                      break L11;
                                                                    }
                                                                  }
                                                                  return 'i';
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          break L10;
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    break L10;
                                                  }
                                                }
                                                return 'e';
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
                                  } else {
                                    return 'a';
                                  }
                                } else {
                                  return 'a';
                                }
                              } else {
                                break L9;
                              }
                            } else {
                              break L9;
                            }
                          }
                          return 'a';
                        } else {
                          return param1;
                        }
                      } else {
                        return param1;
                      }
                    } else {
                      return param1;
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
          return '_';
        }
    }

    qj() {
        this.field_i = -1.0f;
        this.field_h = 0;
        this.field_b = false;
        this.field_c = 0;
    }

    static {
        field_g = 0L;
        field_f = null;
        field_d = 640;
        field_j = new vn[10][];
    }
}
