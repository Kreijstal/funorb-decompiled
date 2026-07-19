/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gu extends me {
    private int field_j;
    private int field_m;
    static Object field_l;
    static String field_k;
    private int field_n;

    final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_i.l(106);
        if (param0 < -13) {
          var3 = 16776960;
          var4 = 11184810;
          var5 = 20;
          var6 = 50 + this.field_g.field_P * var5;
          var7 = this.field_j;
          var8 = var7 - -40;
          rba.a(192, var6, 3145728, this.field_n, (byte) 47, var7 - 16, this.field_m + -(this.field_n / 2));
          tp.a(-(this.field_n / 2) + this.field_m, (byte) -85, var7 - 16, 5242880, 2, var6, this.field_n);
          oka.a(wj.field_b, 16777215, kn.field_p, -1, var7 - -4, this.field_m, 0);
          var9 = 0;
          L0: while (true) {
            if (var9 < this.field_g.field_H.length) {
              var10 = this.field_g.field_e.field_b[var9];
              if (var15 == 0) {
                L1: {
                  L2: {
                    if ((var10 ^ -1) != 0) {
                      break L2;
                    } else {
                      if (var15 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      if (var10 == var2) {
                        break L4;
                      } else {
                        var11 = var4;
                        if (var15 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var11 = var3;
                    break L3;
                  }
                  var12 = this.field_g.field_H[var10].e(false);
                  var13 = this.field_g.field_H[var10].j(false);
                  var14 = var13 + var12;
                  oka.a(rka.a(1 + var9, 114) + "  " + this.field_i.a(var10, false) + "  " + rja.field_c + ": " + var14 + " (" + var12 + "+" + var13 + ")", var11, kn.field_p, -1, var8 + var9 * var5, this.field_m, 0);
                  break L1;
                }
                var9++;
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_k = null;
        if (param0 != -28) {
            field_l = (Object) null;
            field_l = null;
            return;
        }
        field_l = null;
    }

    final static ci a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (param0 <= 0) {
            break L0;
          } else {
            gu.c(-61);
            break L0;
          }
        }
        L1: {
          var2 = param1;
          if (-1 != (var2 ^ -1)) {
            break L1;
          } else {
            if (var3 != 0) {
              break L1;
            } else {
              return (ci) ((Object) new nga());
            }
          }
        }
        L2: {
          if ((var2 ^ -1) != -2) {
            break L2;
          } else {
            if (var3 != 0) {
              break L2;
            } else {
              return (ci) ((Object) new lm());
            }
          }
        }
        if (-3 != (var2 ^ -1)) {
          L3: {
            if (-4 != (var2 ^ -1)) {
              break L3;
            } else {
              if (var3 != 0) {
                break L3;
              } else {
                return (ci) ((Object) new gm());
              }
            }
          }
          L4: {
            if (-5 != (var2 ^ -1)) {
              break L4;
            } else {
              if (var3 != 0) {
                break L4;
              } else {
                return (ci) ((Object) new bma());
              }
            }
          }
          L5: {
            if (var2 != 5) {
              break L5;
            } else {
              if (var3 != 0) {
                break L5;
              } else {
                return (ci) ((Object) new cl());
              }
            }
          }
          L6: {
            if (-7 != (var2 ^ -1)) {
              break L6;
            } else {
              if (var3 != 0) {
                break L6;
              } else {
                return (ci) ((Object) new wja());
              }
            }
          }
          if (var2 != 7) {
            L7: {
              if (-9 != (var2 ^ -1)) {
                break L7;
              } else {
                if (var3 != 0) {
                  break L7;
                } else {
                  return (ci) ((Object) new fs());
                }
              }
            }
            L8: {
              if (-10 != (var2 ^ -1)) {
                break L8;
              } else {
                if (var3 != 0) {
                  break L8;
                } else {
                  return (ci) ((Object) new pv());
                }
              }
            }
            if ((var2 ^ -1) != -11) {
              if ((var2 ^ -1) != -12) {
                L9: {
                  if (-13 != (var2 ^ -1)) {
                    break L9;
                  } else {
                    if (var3 != 0) {
                      break L9;
                    } else {
                      return (ci) ((Object) new ifa());
                    }
                  }
                }
                L10: {
                  if (var2 != 13) {
                    break L10;
                  } else {
                    if (var3 != 0) {
                      break L10;
                    } else {
                      return (ci) ((Object) new bda());
                    }
                  }
                }
                L11: {
                  if (var2 != 14) {
                    break L11;
                  } else {
                    if (var3 != 0) {
                      break L11;
                    } else {
                      return (ci) ((Object) new gla());
                    }
                  }
                }
                L12: {
                  if (var2 != 15) {
                    break L12;
                  } else {
                    if (var3 != 0) {
                      break L12;
                    } else {
                      return (ci) ((Object) new nw());
                    }
                  }
                }
                if ((var2 ^ -1) != -17) {
                  L13: {
                    if (-18 != (var2 ^ -1)) {
                      break L13;
                    } else {
                      if (var3 != 0) {
                        break L13;
                      } else {
                        return (ci) ((Object) new wsa());
                      }
                    }
                  }
                  if (var2 != 18) {
                    if (var2 != 19) {
                      if (var2 != 20) {
                        L14: {
                          if (var2 != 21) {
                            break L14;
                          } else {
                            if (var3 != 0) {
                              break L14;
                            } else {
                              return (ci) ((Object) new nia());
                            }
                          }
                        }
                        if (var2 != 22) {
                          L15: {
                            if (var2 != 23) {
                              break L15;
                            } else {
                              if (var3 != 0) {
                                break L15;
                              } else {
                                return (ci) ((Object) new fl());
                              }
                            }
                          }
                          L16: {
                            if (24 != var2) {
                              break L16;
                            } else {
                              if (var3 == 0) {
                                return (ci) ((Object) new jda());
                              } else {
                                break L16;
                              }
                            }
                          }
                          if ((var2 ^ -1) == -26) {
                            return (ci) ((Object) new cma());
                          } else {
                            if (var2 != 26) {
                              if (-28 == (var2 ^ -1)) {
                                return (ci) ((Object) new bj());
                              } else {
                                if (28 != var2) {
                                  if (29 == var2) {
                                    return (ci) ((Object) new rda());
                                  } else {
                                    if (var2 == 30) {
                                      return (ci) ((Object) new ksa());
                                    } else {
                                      if (var2 == 31) {
                                        return (ci) ((Object) new qv());
                                      } else {
                                        if (32 == var2) {
                                          return (ci) ((Object) new un());
                                        } else {
                                          if (-34 == (var2 ^ -1)) {
                                            return (ci) ((Object) new jv());
                                          } else {
                                            if ((var2 ^ -1) != -35) {
                                              if ((var2 ^ -1) == -36) {
                                                return (ci) ((Object) new go());
                                              } else {
                                                if (-37 != (var2 ^ -1)) {
                                                  if ((var2 ^ -1) == -38) {
                                                    return (ci) ((Object) new voa());
                                                  } else {
                                                    if (38 != var2) {
                                                      if (39 == var2) {
                                                        if (var3 == 0) {
                                                          return (ci) ((Object) new coa());
                                                        } else {
                                                          return (ci) ((Object) new nga());
                                                        }
                                                      } else {
                                                        return null;
                                                      }
                                                    } else {
                                                      if (var3 == 0) {
                                                        return (ci) ((Object) new bk());
                                                      } else {
                                                        if (39 == var2) {
                                                          if (var3 == 0) {
                                                            return (ci) ((Object) new coa());
                                                          } else {
                                                            return (ci) ((Object) new nga());
                                                          }
                                                        } else {
                                                          return null;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (var3 == 0) {
                                                    return (ci) ((Object) new gia());
                                                  } else {
                                                    if ((var2 ^ -1) == -38) {
                                                      return (ci) ((Object) new voa());
                                                    } else {
                                                      if (38 != var2) {
                                                        if (39 == var2) {
                                                          if (var3 == 0) {
                                                            return (ci) ((Object) new coa());
                                                          } else {
                                                            return (ci) ((Object) new nga());
                                                          }
                                                        } else {
                                                          return null;
                                                        }
                                                      } else {
                                                        if (39 == var2) {
                                                          if (var3 == 0) {
                                                            return (ci) ((Object) new coa());
                                                          } else {
                                                            return (ci) ((Object) new nga());
                                                          }
                                                        } else {
                                                          return null;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              if (var3 == 0) {
                                                return (ci) ((Object) new lva());
                                              } else {
                                                if ((var2 ^ -1) == -36) {
                                                  return (ci) ((Object) new go());
                                                } else {
                                                  if (-37 != (var2 ^ -1)) {
                                                    if ((var2 ^ -1) == -38) {
                                                      return (ci) ((Object) new voa());
                                                    } else {
                                                      if (38 != var2) {
                                                        if (39 == var2) {
                                                          if (var3 == 0) {
                                                            return (ci) ((Object) new coa());
                                                          } else {
                                                            return (ci) ((Object) new nga());
                                                          }
                                                        } else {
                                                          return null;
                                                        }
                                                      } else {
                                                        if (var3 == 0) {
                                                          return (ci) ((Object) new bk());
                                                        } else {
                                                          if (39 == var2) {
                                                            if (var3 == 0) {
                                                              return (ci) ((Object) new coa());
                                                            } else {
                                                              return (ci) ((Object) new nga());
                                                            }
                                                          } else {
                                                            return null;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if ((var2 ^ -1) == -38) {
                                                      return (ci) ((Object) new voa());
                                                    } else {
                                                      if (38 != var2) {
                                                        if (39 == var2) {
                                                          if (var3 == 0) {
                                                            return (ci) ((Object) new coa());
                                                          } else {
                                                            return (ci) ((Object) new nga());
                                                          }
                                                        } else {
                                                          return null;
                                                        }
                                                      } else {
                                                        if (39 == var2) {
                                                          if (var3 == 0) {
                                                            return (ci) ((Object) new coa());
                                                          } else {
                                                            return (ci) ((Object) new nga());
                                                          }
                                                        } else {
                                                          return null;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (var3 == 0) {
                                    return (ci) ((Object) new iia());
                                  } else {
                                    if (29 == var2) {
                                      return (ci) ((Object) new rda());
                                    } else {
                                      if (var2 == 30) {
                                        return (ci) ((Object) new ksa());
                                      } else {
                                        if (var2 == 31) {
                                          return (ci) ((Object) new qv());
                                        } else {
                                          if (32 == var2) {
                                            return (ci) ((Object) new un());
                                          } else {
                                            if (-34 == (var2 ^ -1)) {
                                              return (ci) ((Object) new jv());
                                            } else {
                                              if ((var2 ^ -1) != -35) {
                                                if ((var2 ^ -1) == -36) {
                                                  return (ci) ((Object) new go());
                                                } else {
                                                  if (-37 != (var2 ^ -1)) {
                                                    if ((var2 ^ -1) == -38) {
                                                      return (ci) ((Object) new voa());
                                                    } else {
                                                      if (38 != var2) {
                                                        if (39 == var2) {
                                                          if (var3 == 0) {
                                                            return (ci) ((Object) new coa());
                                                          } else {
                                                            return (ci) ((Object) new nga());
                                                          }
                                                        } else {
                                                          return null;
                                                        }
                                                      } else {
                                                        if (var3 == 0) {
                                                          return (ci) ((Object) new bk());
                                                        } else {
                                                          if (39 == var2) {
                                                            if (var3 == 0) {
                                                              return (ci) ((Object) new coa());
                                                            } else {
                                                              return (ci) ((Object) new nga());
                                                            }
                                                          } else {
                                                            return null;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    if (var3 == 0) {
                                                      return (ci) ((Object) new gia());
                                                    } else {
                                                      if ((var2 ^ -1) == -38) {
                                                        return (ci) ((Object) new voa());
                                                      } else {
                                                        L17: {
                                                          if (38 != var2) {
                                                            break L17;
                                                          } else {
                                                            break L17;
                                                          }
                                                        }
                                                        if (39 == var2) {
                                                          if (var3 == 0) {
                                                            return (ci) ((Object) new coa());
                                                          } else {
                                                            return (ci) ((Object) new nga());
                                                          }
                                                        } else {
                                                          return null;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                if ((var2 ^ -1) == -36) {
                                                  return (ci) ((Object) new go());
                                                } else {
                                                  L18: {
                                                    if (-37 != (var2 ^ -1)) {
                                                      break L18;
                                                    } else {
                                                      break L18;
                                                    }
                                                  }
                                                  if ((var2 ^ -1) == -38) {
                                                    return (ci) ((Object) new voa());
                                                  } else {
                                                    L19: {
                                                      if (38 != var2) {
                                                        break L19;
                                                      } else {
                                                        if (var3 == 0) {
                                                          return (ci) ((Object) new bk());
                                                        } else {
                                                          break L19;
                                                        }
                                                      }
                                                    }
                                                    if (39 == var2) {
                                                      if (var3 == 0) {
                                                        return (ci) ((Object) new coa());
                                                      } else {
                                                        return (ci) ((Object) new nga());
                                                      }
                                                    } else {
                                                      return null;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              if (var3 == 0) {
                                return (ci) ((Object) new hv());
                              } else {
                                if (-28 == (var2 ^ -1)) {
                                  return (ci) ((Object) new bj());
                                } else {
                                  L20: {
                                    if (28 != var2) {
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  if (29 == var2) {
                                    return (ci) ((Object) new rda());
                                  } else {
                                    if (var2 == 30) {
                                      return (ci) ((Object) new ksa());
                                    } else {
                                      if (var2 == 31) {
                                        return (ci) ((Object) new qv());
                                      } else {
                                        if (32 == var2) {
                                          return (ci) ((Object) new un());
                                        } else {
                                          if (-34 == (var2 ^ -1)) {
                                            return (ci) ((Object) new jv());
                                          } else {
                                            L21: {
                                              if ((var2 ^ -1) != -35) {
                                                break L21;
                                              } else {
                                                if (var3 == 0) {
                                                  return (ci) ((Object) new lva());
                                                } else {
                                                  break L21;
                                                }
                                              }
                                            }
                                            if ((var2 ^ -1) == -36) {
                                              return (ci) ((Object) new go());
                                            } else {
                                              L22: {
                                                if (-37 != (var2 ^ -1)) {
                                                  break L22;
                                                } else {
                                                  if (var3 == 0) {
                                                    return (ci) ((Object) new gia());
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              if ((var2 ^ -1) == -38) {
                                                return (ci) ((Object) new voa());
                                              } else {
                                                L23: {
                                                  if (38 != var2) {
                                                    break L23;
                                                  } else {
                                                    if (var3 == 0) {
                                                      return (ci) ((Object) new bk());
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                                if (39 == var2) {
                                                  if (var3 == 0) {
                                                    return (ci) ((Object) new coa());
                                                  } else {
                                                    return (ci) ((Object) new nga());
                                                  }
                                                } else {
                                                  return null;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          return (ci) ((Object) new sba());
                        }
                      } else {
                        return (ci) ((Object) new nfa());
                      }
                    } else {
                      return (ci) ((Object) new vla());
                    }
                  } else {
                    return (ci) ((Object) new hb());
                  }
                } else {
                  return (ci) ((Object) new vc());
                }
              } else {
                return (ci) ((Object) new vda());
              }
            } else {
              return (ci) ((Object) new wna());
            }
          } else {
            return (ci) ((Object) new eka());
          }
        } else {
          return (ci) ((Object) new qga());
        }
    }

    final static void a(int param0, boolean param1, String param2, String param3, String param4, int param5) {
        gqa var6 = null;
        try {
            if (!param1) {
                String var7 = (String) null;
                gu.a(-67, true, (String) null, (String) null, (String) null, 15);
            }
            var6 = new gqa(param5, param2, param0, param4, param3);
            tna.a(16599, var6);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gu.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    gu(qh param0) {
        super(param0);
        this.field_j = 350;
        this.field_m = 320;
        this.field_n = 300;
    }

    final void a(byte param0) {
        if (param0 > -107) {
            this.a((byte) -84);
        }
    }

    final boolean a(int param0, char param1, byte param2) {
        int var4 = -43 % ((29 - param2) / 57);
        return false;
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return true;
        }
        return false;
    }

    static {
        field_k = "Hold <img=8><img=9> while walking into a moveable block to grab it, then push or pull it around the room. Release <img=8><img=9> to let go.";
    }
}
