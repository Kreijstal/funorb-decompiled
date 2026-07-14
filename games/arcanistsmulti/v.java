/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v {
    private int field_v;
    private int field_q;
    private int field_o;
    private qi field_a;
    private float field_b;
    private int field_u;
    private int field_f;
    private int field_s;
    static boolean field_t;
    int field_c;
    private int field_j;
    boolean field_l;
    static int[] field_p;
    static String field_n;
    int field_m;
    private int field_d;
    static int[] field_g;
    private int field_k;
    private int field_h;
    private int field_e;
    private int field_i;
    private int field_r;

    final uk a(int param0) {
        uk var2 = null;
        ((v) this).field_j = o.field_r;
        ((v) this).field_r = co.field_c;
        ((v) this).field_a.a(((v) this).field_m, ((v) this).field_c, 120);
        jm.field_j = false;
        var2 = ol.a(0, 0, false, fi.field_d, ((v) this).field_c, ((v) this).field_m);
        if (param0 <= 116) {
          L0: {
            ((v) this).field_b = -0.11936065554618835f;
            if (var2 == null) {
              ((v) this).a(true);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (var2 == null) {
              ((v) this).a(true);
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    final static kc b(byte param0) {
        if (param0 <= 112) {
            eg discarded$0 = v.a((byte) -59, true, false, -83, -46);
            return uc.b(115);
        }
        return uc.b(115);
    }

    final boolean a(int param0, int param1, int param2) {
        int stackIn_13_0 = 0;
        int stackIn_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param2 == -17969) {
          if (param0 >= ((v) this).field_f) {
            if (param0 <= ((v) this).field_k) {
              if (((v) this).field_v <= param1) {
                if (param1 <= ((v) this).field_h) {
                  if (((v) this).field_b != 0.0f) {
                    if (Math.round((float)param1 * ((v) this).field_b) == param0) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    return stackIn_27_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((v) this).a((byte) 7, -10, -36);
          if (param0 >= ((v) this).field_f) {
            if (param0 <= ((v) this).field_k) {
              if (((v) this).field_v <= param1) {
                if (param1 <= ((v) this).field_h) {
                  if (((v) this).field_b == 0.0f) {
                    return true;
                  } else {
                    L0: {
                      if (Math.round((float)param1 * ((v) this).field_b) != param0) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L0;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L0;
                      }
                    }
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = ((v) this).field_d;
        if (param0 <= 82) {
          ((v) this).b(-127, -102, 24);
          var3 = ((v) this).field_u;
          if (!((v) this).d((byte) 127)) {
            ((v) this).field_l = false;
            return;
          } else {
            L0: {
              if (((v) this).field_k < var2) {
                var2 = ((v) this).field_k;
                break L0;
              } else {
                if (var2 < ((v) this).field_f) {
                  var2 = ((v) this).field_f;
                  break L0;
                } else {
                  L1: {
                    if (var3 <= ((v) this).field_h) {
                      if (var3 < ((v) this).field_v) {
                        var3 = ((v) this).field_v;
                        break L1;
                      } else {
                        L2: {
                          if (0.0f >= ((v) this).field_b) {
                            break L2;
                          } else {
                            var4 = (int)((float)var3 * ((v) this).field_b + 0.5f);
                            if (var4 <= var2) {
                              if (var4 < var2) {
                                var2 = var4;
                                break L2;
                              } else {
                                break L2;
                              }
                            } else {
                              var3 = (int)((float)var2 / ((v) this).field_b);
                              break L2;
                            }
                          }
                        }
                        L3: {
                          if (o.field_r != var2) {
                            ((v) this).field_a.a(var2, var3, 121);
                            break L3;
                          } else {
                            if (co.field_c != var3) {
                              ((v) this).field_a.a(var2, var3, 121);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                        L4: {
                          if ((((v) this).field_d ^ -1) < -1) {
                            ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        return;
                      }
                    } else {
                      var3 = ((v) this).field_h;
                      break L1;
                    }
                  }
                  L5: {
                    if (0.0f >= ((v) this).field_b) {
                      break L5;
                    } else {
                      var4 = (int)((float)var3 * ((v) this).field_b + 0.5f);
                      if (var4 <= var2) {
                        if (var4 < var2) {
                          var2 = var4;
                          break L5;
                        } else {
                          L6: {
                            if (o.field_r != var2) {
                              ((v) this).field_a.a(var2, var3, 121);
                              break L6;
                            } else {
                              if (co.field_c != var3) {
                                ((v) this).field_a.a(var2, var3, 121);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if ((((v) this).field_d ^ -1) < -1) {
                              ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          return;
                        }
                      } else {
                        L8: {
                          var3 = (int)((float)var2 / ((v) this).field_b);
                          if (o.field_r != var2) {
                            ((v) this).field_a.a(var2, var3, 121);
                            break L8;
                          } else {
                            if (co.field_c != var3) {
                              ((v) this).field_a.a(var2, var3, 121);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        L9: {
                          if ((((v) this).field_d ^ -1) < -1) {
                            ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (o.field_r == var2) {
                    if (co.field_c == var3) {
                      L10: {
                        if ((((v) this).field_d ^ -1) < -1) {
                          ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      return;
                    } else {
                      L11: {
                        ((v) this).field_a.a(var2, var3, 121);
                        if ((((v) this).field_d ^ -1) < -1) {
                          ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      return;
                    }
                  } else {
                    L12: {
                      ((v) this).field_a.a(var2, var3, 121);
                      if ((((v) this).field_d ^ -1) < -1) {
                        ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    return;
                  }
                }
              }
            }
            L13: {
              if (var3 <= ((v) this).field_h) {
                if (var3 < ((v) this).field_v) {
                  var3 = ((v) this).field_v;
                  break L13;
                } else {
                  L14: {
                    if (0.0f >= ((v) this).field_b) {
                      break L14;
                    } else {
                      var4 = (int)((float)var3 * ((v) this).field_b + 0.5f);
                      if (var4 <= var2) {
                        if (var4 < var2) {
                          var2 = var4;
                          break L14;
                        } else {
                          break L14;
                        }
                      } else {
                        var3 = (int)((float)var2 / ((v) this).field_b);
                        break L14;
                      }
                    }
                  }
                  L15: {
                    if (o.field_r != var2) {
                      ((v) this).field_a.a(var2, var3, 121);
                      break L15;
                    } else {
                      if (co.field_c != var3) {
                        ((v) this).field_a.a(var2, var3, 121);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                  }
                  L16: {
                    if ((((v) this).field_d ^ -1) < -1) {
                      ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  return;
                }
              } else {
                var3 = ((v) this).field_h;
                break L13;
              }
            }
            L17: {
              if (0.0f >= ((v) this).field_b) {
                break L17;
              } else {
                var4 = (int)((float)var3 * ((v) this).field_b + 0.5f);
                if (var4 <= var2) {
                  if (var4 < var2) {
                    var2 = var4;
                    break L17;
                  } else {
                    if (o.field_r == var2) {
                      if (co.field_c == var3) {
                        L18: {
                          if ((((v) this).field_d ^ -1) < -1) {
                            ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                            break L18;
                          } else {
                            break L18;
                          }
                        }
                        return;
                      } else {
                        L19: {
                          ((v) this).field_a.a(var2, var3, 121);
                          if ((((v) this).field_d ^ -1) < -1) {
                            ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        return;
                      }
                    } else {
                      L20: {
                        ((v) this).field_a.a(var2, var3, 121);
                        if ((((v) this).field_d ^ -1) < -1) {
                          ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  var3 = (int)((float)var2 / ((v) this).field_b);
                  if (o.field_r == var2) {
                    if (co.field_c == var3) {
                      L21: {
                        if ((((v) this).field_d ^ -1) < -1) {
                          ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      return;
                    } else {
                      L22: {
                        ((v) this).field_a.a(var2, var3, 121);
                        if ((((v) this).field_d ^ -1) < -1) {
                          ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      return;
                    }
                  } else {
                    L23: {
                      ((v) this).field_a.a(var2, var3, 121);
                      if ((((v) this).field_d ^ -1) < -1) {
                        ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (o.field_r == var2) {
              if (co.field_c != var3) {
                L24: {
                  ((v) this).field_a.a(var2, var3, 121);
                  if ((((v) this).field_d ^ -1) < -1) {
                    ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                return;
              } else {
                L25: {
                  if ((((v) this).field_d ^ -1) < -1) {
                    ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                return;
              }
            } else {
              L26: {
                ((v) this).field_a.a(var2, var3, 121);
                if ((((v) this).field_d ^ -1) < -1) {
                  ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                  break L26;
                } else {
                  break L26;
                }
              }
              return;
            }
          }
        } else {
          var3 = ((v) this).field_u;
          if (!((v) this).d((byte) 127)) {
            ((v) this).field_l = false;
            return;
          } else {
            L27: {
              if (((v) this).field_k < var2) {
                var2 = ((v) this).field_k;
                break L27;
              } else {
                if (var2 >= ((v) this).field_f) {
                  break L27;
                } else {
                  var2 = ((v) this).field_f;
                  break L27;
                }
              }
            }
            L28: {
              if (var3 <= ((v) this).field_h) {
                if (var3 < ((v) this).field_v) {
                  var3 = ((v) this).field_v;
                  break L28;
                } else {
                  L29: {
                    if (0.0f >= ((v) this).field_b) {
                      break L29;
                    } else {
                      var4 = (int)((float)var3 * ((v) this).field_b + 0.5f);
                      if (var4 <= var2) {
                        if (var4 < var2) {
                          var2 = var4;
                          break L29;
                        } else {
                          break L29;
                        }
                      } else {
                        var3 = (int)((float)var2 / ((v) this).field_b);
                        break L29;
                      }
                    }
                  }
                  L30: {
                    if (o.field_r != var2) {
                      ((v) this).field_a.a(var2, var3, 121);
                      break L30;
                    } else {
                      if (co.field_c != var3) {
                        ((v) this).field_a.a(var2, var3, 121);
                        break L30;
                      } else {
                        break L30;
                      }
                    }
                  }
                  L31: {
                    if ((((v) this).field_d ^ -1) < -1) {
                      ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  return;
                }
              } else {
                var3 = ((v) this).field_h;
                break L28;
              }
            }
            L32: {
              if (0.0f >= ((v) this).field_b) {
                break L32;
              } else {
                var4 = (int)((float)var3 * ((v) this).field_b + 0.5f);
                if (var4 <= var2) {
                  if (var4 < var2) {
                    var2 = var4;
                    break L32;
                  } else {
                    L33: {
                      if (o.field_r != var2) {
                        ((v) this).field_a.a(var2, var3, 121);
                        break L33;
                      } else {
                        if (co.field_c != var3) {
                          ((v) this).field_a.a(var2, var3, 121);
                          break L33;
                        } else {
                          break L33;
                        }
                      }
                    }
                    L34: {
                      if ((((v) this).field_d ^ -1) < -1) {
                        ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                        break L34;
                      } else {
                        break L34;
                      }
                    }
                    return;
                  }
                } else {
                  L35: {
                    var3 = (int)((float)var2 / ((v) this).field_b);
                    if (o.field_r != var2) {
                      ((v) this).field_a.a(var2, var3, 121);
                      break L35;
                    } else {
                      if (co.field_c != var3) {
                        ((v) this).field_a.a(var2, var3, 121);
                        break L35;
                      } else {
                        break L35;
                      }
                    }
                  }
                  L36: {
                    if ((((v) this).field_d ^ -1) < -1) {
                      ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                  return;
                }
              }
            }
            if (o.field_r == var2) {
              if (co.field_c == var3) {
                L37: {
                  if ((((v) this).field_d ^ -1) < -1) {
                    ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                return;
              } else {
                L38: {
                  ((v) this).field_a.a(var2, var3, 121);
                  if ((((v) this).field_d ^ -1) < -1) {
                    ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                return;
              }
            } else {
              L39: {
                ((v) this).field_a.a(var2, var3, 121);
                if ((((v) this).field_d ^ -1) < -1) {
                  ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                  break L39;
                } else {
                  break L39;
                }
              }
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 > -23) {
            return;
        }
        ((v) this).field_m = param1;
        ((v) this).field_c = param0;
    }

    final void a(int param0, int param1, boolean param2) {
        if (!param2) {
            return;
        }
        ((v) this).field_d = param1;
        ((v) this).field_u = param0;
    }

    final boolean d(byte param0) {
        int var2 = 0;
        var2 = 40 % ((32 - param0) / 43);
        if (((v) this).field_q <= wl.field_K) {
          if (ah.field_c <= 0) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static eg a(byte param0, boolean param1, boolean param2, int param3, int param4) {
        if (param0 != -93) {
          eg discarded$2 = v.a((byte) -92, false, true, 53, 6);
          return me.a(param3, param2, param0 + 2097245, param1, param4, false);
        } else {
          return me.a(param3, param2, param0 + 2097245, param1, param4, false);
        }
    }

    final boolean b(boolean param0) {
        if (!param0) {
          if ((ah.field_c ^ -1) < -1) {
            if (wl.field_K >= ((v) this).field_q) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((v) this).a(-12, -65, (byte) -64);
          if ((ah.field_c ^ -1) < -1) {
            if (wl.field_K >= ((v) this).field_q) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param1 != 8110) {
          ((v) this).b(38, -64, 88);
          ((v) this).field_f = param2;
          ((v) this).field_v = param0;
          return;
        } else {
          ((v) this).field_f = param2;
          ((v) this).field_v = param0;
          return;
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        ((v) this).field_a.a(((v) this).field_j, ((v) this).field_r, 9);
    }

    v(qi param0) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, param0);
    }

    final void a(byte param0) {
        if (param0 == 93) {
          if (ka.field_m == null) {
            L0: {
              if (-1 <= (ah.field_c ^ -1)) {
                ((v) this).field_l = false;
                break L0;
              } else {
                break L0;
              }
            }
            if (((v) this).field_l) {
              ((v) this).field_s = ((v) this).field_s - 1;
              if (((v) this).field_s - 1 <= 0) {
                ((v) this).field_s = ((v) this).field_i;
                if (((v) this).field_q > wl.field_K) {
                  ((v) this).field_l = false;
                  return;
                } else {
                  this.c((byte) 89);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (((v) this).field_d > o.field_r) {
                ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                if (((v) this).field_o == o.field_r) {
                  if (((v) this).field_e != co.field_c) {
                    ((v) this).field_a.a(((v) this).field_o, ((v) this).field_e, param0 ^ -4);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((v) this).field_a.a(((v) this).field_o, ((v) this).field_e, param0 ^ -4);
                  return;
                }
              } else {
                if ((((v) this).field_d ^ -1) >= -1) {
                  if (((v) this).field_o == o.field_r) {
                    if (((v) this).field_e != co.field_c) {
                      ((v) this).field_a.a(((v) this).field_o, ((v) this).field_e, param0 ^ -4);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((v) this).field_a.a(((v) this).field_o, ((v) this).field_e, param0 ^ -4);
                    return;
                  }
                } else {
                  ta.field_e = 0;
                  if (((v) this).field_o == o.field_r) {
                    if (((v) this).field_e != co.field_c) {
                      ((v) this).field_a.a(((v) this).field_o, ((v) this).field_e, param0 ^ -4);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((v) this).field_a.a(((v) this).field_o, ((v) this).field_e, param0 ^ -4);
                    return;
                  }
                }
              }
            }
          } else {
            return;
          }
        } else {
          v.b(1);
          if (ka.field_m == null) {
            L1: {
              if (-1 <= (ah.field_c ^ -1)) {
                ((v) this).field_l = false;
                break L1;
              } else {
                break L1;
              }
            }
            if (((v) this).field_l) {
              ((v) this).field_s = ((v) this).field_s - 1;
              if (((v) this).field_s - 1 <= 0) {
                ((v) this).field_s = ((v) this).field_i;
                if (((v) this).field_q > wl.field_K) {
                  ((v) this).field_l = false;
                  return;
                } else {
                  this.c((byte) 89);
                  return;
                }
              } else {
                return;
              }
            } else {
              L2: {
                if (((v) this).field_d > o.field_r) {
                  ta.field_e = (-o.field_r + ((v) this).field_d) / 2;
                  break L2;
                } else {
                  if ((((v) this).field_d ^ -1) < -1) {
                    ta.field_e = 0;
                    break L2;
                  } else {
                    L3: {
                      L4: {
                        if (((v) this).field_o != o.field_r) {
                          break L4;
                        } else {
                          if (((v) this).field_e == co.field_c) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ((v) this).field_a.a(((v) this).field_o, ((v) this).field_e, param0 ^ -4);
                      break L3;
                    }
                    return;
                  }
                }
              }
              if (((v) this).field_o == o.field_r) {
                if (((v) this).field_e != co.field_c) {
                  ((v) this).field_a.a(((v) this).field_o, ((v) this).field_e, param0 ^ -4);
                  return;
                } else {
                  return;
                }
              } else {
                ((v) this).field_a.a(((v) this).field_o, ((v) this).field_e, param0 ^ -4);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != -18033) {
          field_n = null;
          field_g = null;
          field_n = null;
          field_p = null;
          return;
        } else {
          field_g = null;
          field_n = null;
          field_p = null;
          return;
        }
    }

    final void a(byte param0, int param1, int param2) {
        ((v) this).field_h = param1;
        ((v) this).field_k = param2;
        if (param0 > -14) {
            this.c((byte) -10);
        }
    }

    private v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, qi param8) {
        ((v) this).field_c = 480;
        ((v) this).field_h = param3;
        ((v) this).field_v = param1;
        ((v) this).field_l = false;
        ((v) this).field_m = 640;
        ((v) this).field_q = param6;
        ((v) this).field_f = param0;
        ((v) this).field_e = param5;
        ((v) this).field_b = 0.0f;
        ((v) this).field_o = param4;
        ((v) this).field_a = param8;
        ((v) this).field_k = param2;
        ((v) this).field_i = param7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "The invitation has been withdrawn.";
        field_p = new int[128];
        field_g = new int[8192];
        field_t = true;
    }
}
