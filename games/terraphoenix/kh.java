/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kh extends gb {
    static String field_O;
    static String field_L;
    private int field_G;
    static String field_K;
    static String field_I;
    private d field_N;
    static String field_M;
    static String[] field_H;
    static String[] field_F;
    boolean field_J;

    abstract void a(int param0, int param1, byte param2);

    kh(d param0, int param1, int param2) {
        super(-param1 + vk.field_c >> 1, -param2 + be.field_v >> 1, param1, param2, (cj) null);
        try {
            ((kh) this).field_J = false;
            ((kh) this).field_G = 0;
            ((kh) this).field_N = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "kh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (((kh) this).field_G != 0) {
          if (((kh) this).field_G < 256) {
            if (hf.field_y != null) {
              if (((kh) this).field_p <= hf.field_y.field_r) {
                if (((kh) this).field_n <= hf.field_y.field_t) {
                  if (param1 > -106) {
                    ((kh) this).field_G = 14;
                    il.a(1, hf.field_y);
                    l.a();
                    ((kh) this).a(0, 0, (byte) 82);
                    super.a(-param0 + -((kh) this).field_w, -127, param2, -param3 - ((kh) this).field_u);
                    ij.a(false);
                    hf.field_y.a(param0 - -((kh) this).field_w, param3 - -((kh) this).field_u, ((kh) this).field_G);
                    return;
                  } else {
                    il.a(1, hf.field_y);
                    l.a();
                    ((kh) this).a(0, 0, (byte) 82);
                    super.a(-param0 + -((kh) this).field_w, -127, param2, -param3 - ((kh) this).field_u);
                    ij.a(false);
                    hf.field_y.a(param0 - -((kh) this).field_w, param3 - -((kh) this).field_u, ((kh) this).field_G);
                    return;
                  }
                } else {
                  hf.field_y = new ci(((kh) this).field_p, ((kh) this).field_n);
                  if (param1 > -106) {
                    ((kh) this).field_G = 14;
                    il.a(1, hf.field_y);
                    l.a();
                    ((kh) this).a(0, 0, (byte) 82);
                    super.a(-param0 + -((kh) this).field_w, -127, param2, -param3 - ((kh) this).field_u);
                    ij.a(false);
                    hf.field_y.a(param0 - -((kh) this).field_w, param3 - -((kh) this).field_u, ((kh) this).field_G);
                    return;
                  } else {
                    il.a(1, hf.field_y);
                    l.a();
                    ((kh) this).a(0, 0, (byte) 82);
                    super.a(-param0 + -((kh) this).field_w, -127, param2, -param3 - ((kh) this).field_u);
                    ij.a(false);
                    hf.field_y.a(param0 - -((kh) this).field_w, param3 - -((kh) this).field_u, ((kh) this).field_G);
                    return;
                  }
                }
              } else {
                hf.field_y = new ci(((kh) this).field_p, ((kh) this).field_n);
                if (param1 > -106) {
                  ((kh) this).field_G = 14;
                  il.a(1, hf.field_y);
                  l.a();
                  ((kh) this).a(0, 0, (byte) 82);
                  super.a(-param0 + -((kh) this).field_w, -127, param2, -param3 - ((kh) this).field_u);
                  ij.a(false);
                  hf.field_y.a(param0 - -((kh) this).field_w, param3 - -((kh) this).field_u, ((kh) this).field_G);
                  return;
                } else {
                  il.a(1, hf.field_y);
                  l.a();
                  ((kh) this).a(0, 0, (byte) 82);
                  super.a(-param0 + -((kh) this).field_w, -127, param2, -param3 - ((kh) this).field_u);
                  ij.a(false);
                  hf.field_y.a(param0 - -((kh) this).field_w, param3 - -((kh) this).field_u, ((kh) this).field_G);
                  return;
                }
              }
            } else {
              hf.field_y = new ci(((kh) this).field_p, ((kh) this).field_n);
              if (param1 > -106) {
                ((kh) this).field_G = 14;
                il.a(1, hf.field_y);
                l.a();
                ((kh) this).a(0, 0, (byte) 82);
                super.a(-param0 + -((kh) this).field_w, -127, param2, -param3 - ((kh) this).field_u);
                ij.a(false);
                hf.field_y.a(param0 - -((kh) this).field_w, param3 - -((kh) this).field_u, ((kh) this).field_G);
                return;
              } else {
                il.a(1, hf.field_y);
                l.a();
                ((kh) this).a(0, 0, (byte) 82);
                super.a(-param0 + -((kh) this).field_w, -127, param2, -param3 - ((kh) this).field_u);
                ij.a(false);
                hf.field_y.a(param0 - -((kh) this).field_w, param3 - -((kh) this).field_u, ((kh) this).field_G);
                return;
              }
            }
          } else {
            if (0 != param2) {
              return;
            } else {
              ((kh) this).a(((kh) this).field_w + param0, param3 + ((kh) this).field_u, (byte) 82);
              super.a(param0, -124, param2, param3);
              return;
            }
          }
        } else {
          return;
        }
    }

    private final int h() {
        return !((kh) this).field_J ? 0 : (Object) (Object) ((kh) this).field_N.c(true) != this ? 0 : 256;
    }

    boolean i(int param0) {
        int var2 = 0;
        int discarded$2 = 0;
        ((kh) this).field_G = this.h();
        var2 = 17 / ((param0 - -2) / 63);
        if (0 == ((kh) this).field_G) {
          if (((kh) this).field_J) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static char a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Terraphoenix.field_V;
        if (param1 >= -125) {
          L0: {
            char discarded$1 = kh.a('￥', (byte) -127);
            var2 = param0;
            if (var2 != 32) {
              if (160 != var2) {
                if (var2 != 95) {
                  if (var2 != 45) {
                    L1: {
                      if (var2 != 91) {
                        if (93 != var2) {
                          if (var2 != 35) {
                            L2: {
                              if (var2 == 224) {
                                break L2;
                              } else {
                                if (var2 != 225) {
                                  if (var2 == 226) {
                                    break L2;
                                  } else {
                                    if (var2 != 228) {
                                      if (var2 != 227) {
                                        if (var2 == 192) {
                                          break L2;
                                        } else {
                                          if (var2 != 193) {
                                            if (var2 != 194) {
                                              if (196 == var2) {
                                                break L2;
                                              } else {
                                                if (var2 == 195) {
                                                  break L2;
                                                } else {
                                                  L3: {
                                                    if (var2 != 232) {
                                                      if (233 == var2) {
                                                        break L3;
                                                      } else {
                                                        if (var2 != 234) {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (var2 != 200) {
                                                              if (201 != var2) {
                                                                if (var2 != 202) {
                                                                  if (203 != var2) {
                                                                    if (237 != var2) {
                                                                      L4: {
                                                                        if (238 == var2) {
                                                                          break L4;
                                                                        } else {
                                                                          if (var2 == 239) {
                                                                            break L4;
                                                                          } else {
                                                                            if (var2 == 205) {
                                                                              break L4;
                                                                            } else {
                                                                              if (var2 == 206) {
                                                                                break L4;
                                                                              } else {
                                                                                if (var2 != 207) {
                                                                                  if (242 != var2) {
                                                                                    L5: {
                                                                                      if (243 == var2) {
                                                                                        break L5;
                                                                                      } else {
                                                                                        if (var2 == 244) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (var2 == 246) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (245 != var2) {
                                                                                              if (var2 != 210) {
                                                                                                if (var2 == 211) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (var2 == 212) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if (var2 != 214) {
                                                                                                      if (var2 == 213) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        L6: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L6;
                                                                                                          } else {
                                                                                                            if (250 == var2) {
                                                                                                              break L6;
                                                                                                            } else {
                                                                                                              if (var2 == 251) {
                                                                                                                break L6;
                                                                                                              } else {
                                                                                                                if (var2 != 252) {
                                                                                                                  if (217 != var2) {
                                                                                                                    if (var2 == 218) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (var2 == 219) {
                                                                                                                        break L6;
                                                                                                                      } else {
                                                                                                                        if (var2 == 220) {
                                                                                                                          break L6;
                                                                                                                        } else {
                                                                                                                          if (231 == var2) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (var2 != 199) {
                                                                                                                              if (var2 != 255) {
                                                                                                                                if (376 != var2) {
                                                                                                                                  if (var2 != 241) {
                                                                                                                                    if (209 != var2) {
                                                                                                                                      if (var2 == 223) {
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
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'c';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
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
                                                                                                        }
                                                                                                        return 'u';
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
                                                                                      }
                                                                                    }
                                                                                    return 'o';
                                                                                  } else {
                                                                                    return 'o';
                                                                                  }
                                                                                } else {
                                                                                  return 'i';
                                                                                }
                                                                              }
                                                                            }
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
                                                          }
                                                        } else {
                                                          return 'e';
                                                        }
                                                      }
                                                    } else {
                                                      break L3;
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
                                      } else {
                                        break L2;
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
                        } else {
                          break L1;
                        }
                      } else {
                        break L1;
                      }
                    }
                    return param0;
                  } else {
                    break L0;
                  }
                } else {
                  return '_';
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
          L7: {
            var2 = param0;
            if (var2 != 32) {
              if (160 != var2) {
                if (var2 != 95) {
                  if (var2 != 45) {
                    L8: {
                      if (var2 != 91) {
                        if (93 != var2) {
                          if (var2 != 35) {
                            if (var2 != 224) {
                              L9: {
                                if (var2 != 225) {
                                  if (var2 != 226) {
                                    if (var2 != 228) {
                                      if (var2 != 227) {
                                        if (var2 != 192) {
                                          if (var2 != 193) {
                                            if (var2 != 194) {
                                              if (196 == var2) {
                                                break L9;
                                              } else {
                                                if (var2 == 195) {
                                                  break L9;
                                                } else {
                                                  L10: {
                                                    if (var2 != 232) {
                                                      if (233 == var2) {
                                                        break L10;
                                                      } else {
                                                        if (var2 != 234) {
                                                          if (var2 == 235) {
                                                            break L10;
                                                          } else {
                                                            if (var2 != 200) {
                                                              if (201 != var2) {
                                                                if (var2 != 202) {
                                                                  if (203 != var2) {
                                                                    L11: {
                                                                      if (237 != var2) {
                                                                        if (238 == var2) {
                                                                          break L11;
                                                                        } else {
                                                                          if (var2 == 239) {
                                                                            break L11;
                                                                          } else {
                                                                            if (var2 == 205) {
                                                                              break L11;
                                                                            } else {
                                                                              if (var2 == 206) {
                                                                                break L11;
                                                                              } else {
                                                                                if (var2 != 207) {
                                                                                  L12: {
                                                                                    if (242 != var2) {
                                                                                      if (243 == var2) {
                                                                                        break L12;
                                                                                      } else {
                                                                                        if (var2 == 244) {
                                                                                          break L12;
                                                                                        } else {
                                                                                          if (var2 == 246) {
                                                                                            break L12;
                                                                                          } else {
                                                                                            if (245 != var2) {
                                                                                              if (var2 != 210) {
                                                                                                if (var2 == 211) {
                                                                                                  break L12;
                                                                                                } else {
                                                                                                  if (var2 == 212) {
                                                                                                    break L12;
                                                                                                  } else {
                                                                                                    if (var2 != 214) {
                                                                                                      if (var2 == 213) {
                                                                                                        break L12;
                                                                                                      } else {
                                                                                                        L13: {
                                                                                                          if (var2 == 249) {
                                                                                                            break L13;
                                                                                                          } else {
                                                                                                            if (250 == var2) {
                                                                                                              break L13;
                                                                                                            } else {
                                                                                                              if (var2 == 251) {
                                                                                                                break L13;
                                                                                                              } else {
                                                                                                                if (var2 != 252) {
                                                                                                                  if (217 != var2) {
                                                                                                                    if (var2 == 218) {
                                                                                                                      break L13;
                                                                                                                    } else {
                                                                                                                      if (var2 == 219) {
                                                                                                                        break L13;
                                                                                                                      } else {
                                                                                                                        if (var2 == 220) {
                                                                                                                          break L13;
                                                                                                                        } else {
                                                                                                                          if (231 == var2) {
                                                                                                                            return 'c';
                                                                                                                          } else {
                                                                                                                            if (var2 != 199) {
                                                                                                                              if (var2 != 255) {
                                                                                                                                if (376 != var2) {
                                                                                                                                  if (var2 != 241) {
                                                                                                                                    if (209 != var2) {
                                                                                                                                      if (var2 == 223) {
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
                                                                                                                                } else {
                                                                                                                                  return 'y';
                                                                                                                                }
                                                                                                                              } else {
                                                                                                                                return 'y';
                                                                                                                              }
                                                                                                                            } else {
                                                                                                                              return 'c';
                                                                                                                            }
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    return 'u';
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L13;
                                                                                                                }
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    } else {
                                                                                                      break L12;
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
                                                                                    } else {
                                                                                      break L12;
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                } else {
                                                                                  break L11;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L11;
                                                                      }
                                                                    }
                                                                    return 'i';
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
                                                        } else {
                                                          break L10;
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
                                        } else {
                                          return 'a';
                                        }
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    return 'a';
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              return 'a';
                            } else {
                              return 'a';
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
                    return param0;
                  } else {
                    break L7;
                  }
                } else {
                  return '_';
                }
              } else {
                break L7;
              }
            } else {
              break L7;
            }
          }
          return '_';
        }
    }

    final gl e(byte param0) {
        gl var2 = super.e(param0);
        if (var2 != null) {
            return var2;
        }
        return (gl) this;
    }

    boolean f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int discarded$1 = 0;
        var2 = this.h();
        if (param0 == -121) {
          var3 = -((kh) this).field_G + var2;
          if (0 < var3) {
            L0: {
              ((kh) this).field_G = ((kh) this).field_G + (var3 + 7) / 8;
              if (var3 < 0) {
                ((kh) this).field_G = ((kh) this).field_G + (-16 + (var3 + 1)) / 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              L2: {
                if (((kh) this).field_G != 0) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (((kh) this).field_J) {
                      break L2;
                    } else {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_40_0 = 0;
              stackIn_41_0 = stackOut_40_0;
              break L1;
            }
            return stackIn_41_0 != 0;
          } else {
            L3: {
              if (var3 < 0) {
                ((kh) this).field_G = ((kh) this).field_G + (-16 + (var3 + 1)) / 16;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (((kh) this).field_G != 0) {
                  break L5;
                } else {
                  if (var2 != 0) {
                    break L5;
                  } else {
                    if (((kh) this).field_J) {
                      break L5;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      break L4;
                    }
                  }
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L4;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          ((kh) this).field_N = null;
          var3 = -((kh) this).field_G + var2;
          if (0 >= var3) {
            L6: {
              if (var3 < 0) {
                ((kh) this).field_G = ((kh) this).field_G + (-16 + (var3 + 1)) / 16;
                break L6;
              } else {
                break L6;
              }
            }
            if (((kh) this).field_G == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L7: {
                  if (((kh) this).field_J) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L7;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L7;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            L8: {
              ((kh) this).field_G = ((kh) this).field_G + (var3 + 7) / 8;
              if (var3 < 0) {
                ((kh) this).field_G = ((kh) this).field_G + (-16 + (var3 + 1)) / 16;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                if (((kh) this).field_G != 0) {
                  break L10;
                } else {
                  if (var2 != 0) {
                    break L10;
                  } else {
                    if (((kh) this).field_J) {
                      break L10;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L9;
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L9;
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    public static void a(int param0) {
        field_H = null;
        field_L = null;
        field_F = null;
        field_I = null;
        field_O = null;
        field_M = null;
        field_K = null;
    }

    final void b(int param0, int param1, int param2) {
        ((kh) this).a(be.field_v + -param1 >> 1, (byte) 80, param2, vk.field_c - param2 >> 1, param1);
        if (param0 != 98) {
            ((kh) this).a(-2, -19, (byte) -5);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "PMGG-2";
        field_I = "Quit";
        field_K = "Fire TQ: ";
        field_L = "Mission ";
        field_F = new String[16];
        field_H = new String[]{"Combat Jacket", "Combat Armour", "Battle Armour", "Shielded Armour"};
        field_M = "Passwords must be between 5 and 20 characters long";
    }
}
