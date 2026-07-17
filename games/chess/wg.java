/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends pk {
    private int field_s;
    private int field_u;
    private rk field_n;
    private boolean field_z;
    private km field_o;
    private km field_t;
    private rk field_m;
    private boolean field_v;
    static hg field_r;
    int field_y;
    static String field_p;
    static um field_q;
    int field_x;
    static int field_w;
    private rk field_A;
    static int field_B;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var2 = ((wg) this).field_i;
          var3 = 0;
          if (null == ((wg) this).field_n) {
            break L0;
          } else {
            var3 = var3 + ((wg) this).field_n.field_j;
            break L0;
          }
        }
        L1: {
          if (null == ((wg) this).field_m) {
            break L1;
          } else {
            var3 = var3 + ((wg) this).field_m.field_j;
            break L1;
          }
        }
        L2: {
          if (null != ((wg) this).field_n) {
            ((wg) this).field_n.a(var2, ((wg) this).field_k);
            var2 = var2 + ((wg) this).field_n.field_k;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          ((wg) this).field_A.c(var2, ((wg) this).field_k, ((wg) this).field_u - var3, ((wg) this).field_A.field_i);
          var4 = 126 % ((param0 - -4) / 63);
          var2 = var2 + (-var3 + ((wg) this).field_u);
          if (((wg) this).field_m != null) {
            ((wg) this).field_m.a(var2, ((wg) this).field_k);
            break L3;
          } else {
            break L3;
          }
        }
        var5 = (((wg) this).field_x - ((wg) this).field_s) * ((wg) this).field_u / (((wg) this).field_y + -((wg) this).field_s);
        if (((wg) this).field_v) {
          if (null == ((wg) this).field_t) {
            ((wg) this).field_o.a(var5 + ((wg) this).field_i + -(((wg) this).field_o.field_w / 8), ((wg) this).field_k + -(((wg) this).field_o.field_t / 8));
            return;
          } else {
            ((wg) this).field_t.b(((wg) this).field_i - -var5 - ((wg) this).field_t.field_w / 2, ((wg) this).field_k + -(((wg) this).field_t.field_t / 2));
            return;
          }
        } else {
          ((wg) this).field_o.a(var5 + ((wg) this).field_i + -(((wg) this).field_o.field_w / 8), ((wg) this).field_k + -(((wg) this).field_o.field_t / 8));
          return;
        }
    }

    final static void a(String param0, byte param1, long param2) {
        CharSequence var5 = null;
        try {
            ij.field_c = param0;
            vk.field_g = 2;
            var5 = (CharSequence) (Object) param0;
            ec.field_f = ad.a(var5, -2);
            re.field_p = param2;
            if (param1 > -74) {
                wg.b(88);
            }
            kn.field_L = true;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "wg.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        L0: {
          var2 = 0;
          var3 = ((wg) this).field_i;
          var4 = 0;
          if (((wg) this).field_n == null) {
            break L0;
          } else {
            var4 = var4 + ((wg) this).field_n.field_j;
            break L0;
          }
        }
        L1: {
          if (null != ((wg) this).field_m) {
            var4 = var4 + ((wg) this).field_m.field_j;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (null != ((wg) this).field_n) {
            var2 = var2 != 0 | ((wg) this).field_n.b(var3, ((wg) this).field_k, hn.field_k, rf.field_b) ? 1 : 0;
            var3 = var3 + ((wg) this).field_n.field_k;
            break L2;
          } else {
            break L2;
          }
        }
        stackOut_8_0 = var2;
        stackIn_16_0 = stackOut_8_0;
        stackIn_9_0 = stackOut_8_0;
        if (hn.field_k < var3) {
          stackOut_16_0 = stackIn_16_0;
          stackIn_24_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (rf.field_b < ((wg) this).field_k) {
            L3: {
              stackOut_24_0 = stackIn_24_0;
              stackIn_33_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (hn.field_k <= ((wg) this).field_u - var4) {
                stackOut_33_0 = stackIn_33_0;
                stackOut_33_1 = 1;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                break L3;
              } else {
                stackOut_25_0 = stackIn_25_0;
                stackIn_34_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (rf.field_b > ((wg) this).field_A.field_i) {
                  stackOut_34_0 = stackIn_34_0;
                  stackOut_34_1 = 0;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  break L3;
                } else {
                  L4: {
                    var2 = stackIn_26_0 | 1;
                    var3 = var3 + (((wg) this).field_u + -var4);
                    if (((wg) this).field_m != null) {
                      var2 = var2 != 0 | ((wg) this).field_m.b(var3, ((wg) this).field_k, hn.field_k, rf.field_b) ? 1 : 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (param0 != -9) {
                    return true;
                  } else {
                    return var2 != 0;
                  }
                }
              }
            }
            L5: {
              var2 = stackIn_35_0 | stackIn_35_1;
              var3 = var3 + (((wg) this).field_u + -var4);
              if (((wg) this).field_m != null) {
                var2 = var2 != 0 | ((wg) this).field_m.b(var3, ((wg) this).field_k, hn.field_k, rf.field_b) ? 1 : 0;
                break L5;
              } else {
                break L5;
              }
            }
            if (param0 != -9) {
              return true;
            } else {
              return var2 != 0;
            }
          } else {
            L6: {
              var2 = stackIn_17_0 | 1;
              var3 = var3 + (((wg) this).field_u + -var4);
              if (((wg) this).field_m != null) {
                var2 = var2 != 0 | ((wg) this).field_m.b(var3, ((wg) this).field_k, hn.field_k, rf.field_b) ? 1 : 0;
                break L6;
              } else {
                break L6;
              }
            }
            if (param0 != -9) {
              return true;
            } else {
              return var2 != 0;
            }
          }
        } else {
          L7: {
            var2 = stackIn_9_0 | 1;
            var3 = var3 + (((wg) this).field_u + -var4);
            if (((wg) this).field_m != null) {
              var2 = var2 != 0 | ((wg) this).field_m.b(var3, ((wg) this).field_k, hn.field_k, rf.field_b) ? 1 : 0;
              break L7;
            } else {
              break L7;
            }
          }
          if (param0 != -9) {
            return true;
          } else {
            return var2 != 0;
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Chess.field_G;
        if (((wg) this).field_v) {
          L0: {
            if (null != ((wg) this).field_t) {
              var2 = ((wg) this).field_t.field_t;
              break L0;
            } else {
              var2 = ((wg) this).field_o.field_t / 4;
              break L0;
            }
          }
          if (th.field_d == 0) {
            if (wh.field_f == 0) {
              L1: {
                ((wg) this).field_d = false;
                ((wg) this).field_z = false;
                if (((wg) this).field_s > ((wg) this).field_x) {
                  ((wg) this).field_x = ((wg) this).field_s;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((wg) this).field_y >= ((wg) this).field_x) {
                var3 = 77 / ((-32 - param0) / 63);
                return;
              } else {
                ((wg) this).field_x = ((wg) this).field_y;
                var3 = 77 / ((-32 - param0) / 63);
                return;
              }
            } else {
              L2: {
                if (((wg) this).field_z) {
                  break L2;
                } else {
                  if (((wg) this).field_k - var2 / 2 > rf.field_b) {
                    L3: {
                      ((wg) this).field_d = false;
                      if (((wg) this).field_s > ((wg) this).field_x) {
                        ((wg) this).field_x = ((wg) this).field_s;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (((wg) this).field_y < ((wg) this).field_x) {
                      ((wg) this).field_x = ((wg) this).field_y;
                      var3 = 77 / ((-32 - param0) / 63);
                      return;
                    } else {
                      var3 = 77 / ((-32 - param0) / 63);
                      return;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (((wg) this).field_z) {
                var3 = -((wg) this).field_i + hn.field_k;
                if (((wg) this).field_z) {
                  L4: {
                    var3 = var3 + (((wg) this).field_u / (-((wg) this).field_s + ((wg) this).field_y) >> 1);
                    ((wg) this).field_x = ((wg) this).field_s - -((((wg) this).field_y + -((wg) this).field_s) * var3 / ((wg) this).field_u);
                    ((wg) this).field_z = true;
                    ((wg) this).field_d = true;
                    if (((wg) this).field_s > ((wg) this).field_x) {
                      ((wg) this).field_x = ((wg) this).field_s;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (((wg) this).field_y < ((wg) this).field_x) {
                    ((wg) this).field_x = ((wg) this).field_y;
                    var3 = 77 / ((-32 - param0) / 63);
                    return;
                  } else {
                    var3 = 77 / ((-32 - param0) / 63);
                    return;
                  }
                } else {
                  if (var3 >= 0) {
                    if (((wg) this).field_u >= var3) {
                      L5: {
                        var3 = var3 + (((wg) this).field_u / (-((wg) this).field_s + ((wg) this).field_y) >> 1);
                        ((wg) this).field_x = ((wg) this).field_s - -((((wg) this).field_y + -((wg) this).field_s) * var3 / ((wg) this).field_u);
                        ((wg) this).field_z = true;
                        ((wg) this).field_d = true;
                        if (((wg) this).field_s > ((wg) this).field_x) {
                          ((wg) this).field_x = ((wg) this).field_s;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (((wg) this).field_y < ((wg) this).field_x) {
                        ((wg) this).field_x = ((wg) this).field_y;
                        var3 = 77 / ((-32 - param0) / 63);
                        return;
                      } else {
                        var3 = 77 / ((-32 - param0) / 63);
                        return;
                      }
                    } else {
                      ((wg) this).field_d = false;
                      return;
                    }
                  } else {
                    ((wg) this).field_d = false;
                    return;
                  }
                }
              } else {
                if (-(var2 / 2) + ((wg) this).field_k + var2 < rf.field_b) {
                  L6: {
                    ((wg) this).field_d = false;
                    if (((wg) this).field_s > ((wg) this).field_x) {
                      ((wg) this).field_x = ((wg) this).field_s;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (((wg) this).field_y < ((wg) this).field_x) {
                    ((wg) this).field_x = ((wg) this).field_y;
                    var3 = 77 / ((-32 - param0) / 63);
                    return;
                  } else {
                    var3 = 77 / ((-32 - param0) / 63);
                    return;
                  }
                } else {
                  var3 = -((wg) this).field_i + hn.field_k;
                  if (!((wg) this).field_z) {
                    if (var3 >= 0) {
                      if (((wg) this).field_u < var3) {
                        ((wg) this).field_d = false;
                        return;
                      } else {
                        L7: {
                          var3 = var3 + (((wg) this).field_u / (-((wg) this).field_s + ((wg) this).field_y) >> 1);
                          ((wg) this).field_x = ((wg) this).field_s - -((((wg) this).field_y + -((wg) this).field_s) * var3 / ((wg) this).field_u);
                          ((wg) this).field_z = true;
                          ((wg) this).field_d = true;
                          if (((wg) this).field_s > ((wg) this).field_x) {
                            ((wg) this).field_x = ((wg) this).field_s;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (((wg) this).field_y >= ((wg) this).field_x) {
                            break L8;
                          } else {
                            ((wg) this).field_x = ((wg) this).field_y;
                            break L8;
                          }
                        }
                        var3 = 77 / ((-32 - param0) / 63);
                        return;
                      }
                    } else {
                      ((wg) this).field_d = false;
                      return;
                    }
                  } else {
                    L9: {
                      var3 = var3 + (((wg) this).field_u / (-((wg) this).field_s + ((wg) this).field_y) >> 1);
                      ((wg) this).field_x = ((wg) this).field_s - -((((wg) this).field_y + -((wg) this).field_s) * var3 / ((wg) this).field_u);
                      ((wg) this).field_z = true;
                      ((wg) this).field_d = true;
                      if (((wg) this).field_s > ((wg) this).field_x) {
                        ((wg) this).field_x = ((wg) this).field_s;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (((wg) this).field_y >= ((wg) this).field_x) {
                        break L10;
                      } else {
                        ((wg) this).field_x = ((wg) this).field_y;
                        break L10;
                      }
                    }
                    var3 = 77 / ((-32 - param0) / 63);
                    return;
                  }
                }
              }
            }
          } else {
            L11: {
              if (((wg) this).field_z) {
                break L11;
              } else {
                if (((wg) this).field_k - var2 / 2 <= rf.field_b) {
                  break L11;
                } else {
                  L12: {
                    ((wg) this).field_d = false;
                    if (((wg) this).field_s > ((wg) this).field_x) {
                      ((wg) this).field_x = ((wg) this).field_s;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (((wg) this).field_y >= ((wg) this).field_x) {
                      break L13;
                    } else {
                      ((wg) this).field_x = ((wg) this).field_y;
                      break L13;
                    }
                  }
                  var3 = 77 / ((-32 - param0) / 63);
                  return;
                }
              }
            }
            L14: {
              if (((wg) this).field_z) {
                break L14;
              } else {
                if (-(var2 / 2) + ((wg) this).field_k + var2 >= rf.field_b) {
                  break L14;
                } else {
                  L15: {
                    ((wg) this).field_d = false;
                    if (((wg) this).field_s > ((wg) this).field_x) {
                      ((wg) this).field_x = ((wg) this).field_s;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (((wg) this).field_y >= ((wg) this).field_x) {
                      break L16;
                    } else {
                      ((wg) this).field_x = ((wg) this).field_y;
                      break L16;
                    }
                  }
                  var3 = 77 / ((-32 - param0) / 63);
                  return;
                }
              }
            }
            var3 = -((wg) this).field_i + hn.field_k;
            if (!((wg) this).field_z) {
              if (var3 >= 0) {
                if (((wg) this).field_u < var3) {
                  ((wg) this).field_d = false;
                  return;
                } else {
                  L17: {
                    var3 = var3 + (((wg) this).field_u / (-((wg) this).field_s + ((wg) this).field_y) >> 1);
                    ((wg) this).field_x = ((wg) this).field_s - -((((wg) this).field_y + -((wg) this).field_s) * var3 / ((wg) this).field_u);
                    ((wg) this).field_z = true;
                    ((wg) this).field_d = true;
                    if (((wg) this).field_s > ((wg) this).field_x) {
                      ((wg) this).field_x = ((wg) this).field_s;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (((wg) this).field_y >= ((wg) this).field_x) {
                      break L18;
                    } else {
                      ((wg) this).field_x = ((wg) this).field_y;
                      break L18;
                    }
                  }
                  var3 = 77 / ((-32 - param0) / 63);
                  return;
                }
              } else {
                ((wg) this).field_d = false;
                return;
              }
            } else {
              L19: {
                var3 = var3 + (((wg) this).field_u / (-((wg) this).field_s + ((wg) this).field_y) >> 1);
                ((wg) this).field_x = ((wg) this).field_s - -((((wg) this).field_y + -((wg) this).field_s) * var3 / ((wg) this).field_u);
                ((wg) this).field_z = true;
                ((wg) this).field_d = true;
                if (((wg) this).field_s > ((wg) this).field_x) {
                  ((wg) this).field_x = ((wg) this).field_s;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (((wg) this).field_y >= ((wg) this).field_x) {
                  break L20;
                } else {
                  ((wg) this).field_x = ((wg) this).field_y;
                  break L20;
                }
              }
              var3 = 77 / ((-32 - param0) / 63);
              return;
            }
          }
        } else {
          L21: {
            var2 = ((wg) this).field_o.field_t / 4;
            if (th.field_d != 0) {
              break L21;
            } else {
              if (wh.field_f != 0) {
                break L21;
              } else {
                L22: {
                  ((wg) this).field_d = false;
                  ((wg) this).field_z = false;
                  if (((wg) this).field_s > ((wg) this).field_x) {
                    ((wg) this).field_x = ((wg) this).field_s;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (((wg) this).field_y >= ((wg) this).field_x) {
                    break L23;
                  } else {
                    ((wg) this).field_x = ((wg) this).field_y;
                    break L23;
                  }
                }
                var3 = 77 / ((-32 - param0) / 63);
                return;
              }
            }
          }
          L24: {
            if (((wg) this).field_z) {
              break L24;
            } else {
              if (((wg) this).field_k - var2 / 2 <= rf.field_b) {
                break L24;
              } else {
                L25: {
                  ((wg) this).field_d = false;
                  if (((wg) this).field_s > ((wg) this).field_x) {
                    ((wg) this).field_x = ((wg) this).field_s;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (((wg) this).field_y >= ((wg) this).field_x) {
                    break L26;
                  } else {
                    ((wg) this).field_x = ((wg) this).field_y;
                    break L26;
                  }
                }
                var3 = 77 / ((-32 - param0) / 63);
                return;
              }
            }
          }
          L27: {
            if (((wg) this).field_z) {
              break L27;
            } else {
              if (-(var2 / 2) + ((wg) this).field_k + var2 >= rf.field_b) {
                break L27;
              } else {
                L28: {
                  ((wg) this).field_d = false;
                  if (((wg) this).field_s > ((wg) this).field_x) {
                    ((wg) this).field_x = ((wg) this).field_s;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (((wg) this).field_y >= ((wg) this).field_x) {
                    break L29;
                  } else {
                    ((wg) this).field_x = ((wg) this).field_y;
                    break L29;
                  }
                }
                var3 = 77 / ((-32 - param0) / 63);
                return;
              }
            }
          }
          var3 = -((wg) this).field_i + hn.field_k;
          if (!((wg) this).field_z) {
            if (var3 >= 0) {
              if (((wg) this).field_u >= var3) {
                L30: {
                  var3 = var3 + (((wg) this).field_u / (-((wg) this).field_s + ((wg) this).field_y) >> 1);
                  ((wg) this).field_x = ((wg) this).field_s - -((((wg) this).field_y + -((wg) this).field_s) * var3 / ((wg) this).field_u);
                  ((wg) this).field_z = true;
                  ((wg) this).field_d = true;
                  if (((wg) this).field_s > ((wg) this).field_x) {
                    ((wg) this).field_x = ((wg) this).field_s;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (((wg) this).field_y >= ((wg) this).field_x) {
                    break L31;
                  } else {
                    ((wg) this).field_x = ((wg) this).field_y;
                    break L31;
                  }
                }
                var3 = 77 / ((-32 - param0) / 63);
                return;
              } else {
                ((wg) this).field_d = false;
                return;
              }
            } else {
              ((wg) this).field_d = false;
              return;
            }
          } else {
            L32: {
              var3 = var3 + (((wg) this).field_u / (-((wg) this).field_s + ((wg) this).field_y) >> 1);
              ((wg) this).field_x = ((wg) this).field_s - -((((wg) this).field_y + -((wg) this).field_s) * var3 / ((wg) this).field_u);
              ((wg) this).field_z = true;
              ((wg) this).field_d = true;
              if (((wg) this).field_s > ((wg) this).field_x) {
                ((wg) this).field_x = ((wg) this).field_s;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (((wg) this).field_y >= ((wg) this).field_x) {
                break L33;
              } else {
                ((wg) this).field_x = ((wg) this).field_y;
                break L33;
              }
            }
            var3 = 77 / ((-32 - param0) / 63);
            return;
          }
        }
    }

    public static void b(int param0) {
        field_p = null;
        field_r = null;
        field_q = null;
        if (param0 <= 60) {
            field_w = 21;
        }
    }

    wg(int param0, int param1, int param2, rk param3, rk param4, rk param5, km param6, km param7) {
        ((wg) this).field_s = 0;
        ((wg) this).field_v = false;
        ((wg) this).field_z = false;
        ((wg) this).field_y = 100;
        ((wg) this).field_x = 50;
        try {
            ((wg) this).field_o = param6;
            ((wg) this).field_i = param1;
            ((wg) this).field_t = param7;
            ((wg) this).field_A = param4;
            ((wg) this).field_m = param5;
            ((wg) this).field_k = param0;
            ((wg) this).field_n = param3;
            ((wg) this).field_u = param2;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "wg.<init>(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + (param6 != null ? "{...}" : "null") + 44 + (param7 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new hg(8, 0, 4, 1);
        field_B = -1;
    }
}
