/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq extends tda {
    private int field_q;
    private kia field_v;
    private jp field_r;
    private int field_t;
    private jp field_s;
    private boolean field_n;
    private int field_l;
    private boolean field_p;
    private kia field_m;
    private int[] field_j;
    private kia field_u;
    private int field_w;
    private int[] field_k;
    private jp field_o;

    final synchronized void a(kia param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        int var7 = 0;
        int var8 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_30_0 = 0;
        jp stackIn_38_0 = null;
        kia stackIn_38_1 = null;
        int stackIn_38_2 = 0;
        jp stackIn_39_0 = null;
        kia stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        jp stackIn_40_0 = null;
        kia stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_40_3 = 0;
        jp stackIn_46_0 = null;
        kia stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        jp stackIn_47_0 = null;
        kia stackIn_47_1 = null;
        int stackIn_47_2 = 0;
        jp stackIn_48_0 = null;
        kia stackIn_48_1 = null;
        int stackIn_48_2 = 0;
        int stackIn_48_3 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        jp stackOut_45_0 = null;
        kia stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        jp stackOut_47_0 = null;
        kia stackOut_47_1 = null;
        int stackOut_47_2 = 0;
        int stackOut_47_3 = 0;
        jp stackOut_46_0 = null;
        kia stackOut_46_1 = null;
        int stackOut_46_2 = 0;
        int stackOut_46_3 = 0;
        jp stackOut_37_0 = null;
        kia stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        jp stackOut_39_0 = null;
        kia stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        int stackOut_39_3 = 0;
        jp stackOut_38_0 = null;
        kia stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_38_3 = 0;
        var8 = BachelorFridge.field_y;
        if (param5) {
          L0: {
            if (!((hq) this).field_p) {
              break L0;
            } else {
              if (!param1) {
                break L0;
              } else {
                L1: {
                  if (0 >= ((hq) this).field_w) {
                    if (null != ((hq) this).field_m) {
                      ((hq) this).field_o.b(true);
                      ((hq) this).field_m = param0;
                      if (param0 == null) {
                        break L1;
                      } else {
                        ((hq) this).field_o.a(param0, (byte) -115, false);
                        this.a(param3, param2, ((hq) this).field_o, -49);
                        break L1;
                      }
                    } else {
                      ((hq) this).field_m = param0;
                      if (param0 == null) {
                        break L1;
                      } else {
                        ((hq) this).field_o.a(param0, (byte) -115, false);
                        this.a(param3, param2, ((hq) this).field_o, -49);
                        break L1;
                      }
                    }
                  } else {
                    L2: {
                      if (null != ((hq) this).field_u) {
                        ((hq) this).field_s.b(true);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ((hq) this).field_u = param0;
                    if (param0 != null) {
                      ((hq) this).field_s.a(param0, (byte) -113, false);
                      this.a(param3, param2, ((hq) this).field_s, -72);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                return;
              }
            }
          }
          L3: {
            stackOut_17_0 = this;
            stackIn_19_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (!param1) {
              stackOut_19_0 = this;
              stackOut_19_1 = 0;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              break L3;
            } else {
              stackOut_18_0 = this;
              stackOut_18_1 = 1;
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              break L3;
            }
          }
          ((hq) this).field_p = stackIn_20_1 != 0;
          if (param0 != ((hq) this).field_u) {
            if (((hq) this).field_m != param0) {
              L4: {
                if (((hq) this).field_u != null) {
                  if (((hq) this).field_m == null) {
                    var7 = 0;
                    break L4;
                  } else {
                    L5: {
                      if (-524289 >= (((hq) this).field_t ^ -1)) {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        break L5;
                      } else {
                        stackOut_28_0 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        break L5;
                      }
                    }
                    var7 = stackIn_30_0;
                    break L4;
                  }
                } else {
                  var7 = 1;
                  break L4;
                }
              }
              L6: {
                if (var7 == 0) {
                  L7: {
                    if (null == ((hq) this).field_m) {
                      break L7;
                    } else {
                      ((hq) this).field_o.b(true);
                      break L7;
                    }
                  }
                  L8: {
                    ((hq) this).field_m = param0;
                    if (param0 == null) {
                      break L8;
                    } else {
                      L9: {
                        stackOut_45_0 = ((hq) this).field_o;
                        stackOut_45_1 = (kia) param0;
                        stackOut_45_2 = -111;
                        stackIn_47_0 = stackOut_45_0;
                        stackIn_47_1 = stackOut_45_1;
                        stackIn_47_2 = stackOut_45_2;
                        stackIn_46_0 = stackOut_45_0;
                        stackIn_46_1 = stackOut_45_1;
                        stackIn_46_2 = stackOut_45_2;
                        if (param1) {
                          stackOut_47_0 = (jp) (Object) stackIn_47_0;
                          stackOut_47_1 = (kia) (Object) stackIn_47_1;
                          stackOut_47_2 = stackIn_47_2;
                          stackOut_47_3 = 0;
                          stackIn_48_0 = stackOut_47_0;
                          stackIn_48_1 = stackOut_47_1;
                          stackIn_48_2 = stackOut_47_2;
                          stackIn_48_3 = stackOut_47_3;
                          break L9;
                        } else {
                          stackOut_46_0 = (jp) (Object) stackIn_46_0;
                          stackOut_46_1 = (kia) (Object) stackIn_46_1;
                          stackOut_46_2 = stackIn_46_2;
                          stackOut_46_3 = 1;
                          stackIn_48_0 = stackOut_46_0;
                          stackIn_48_1 = stackOut_46_1;
                          stackIn_48_2 = stackOut_46_2;
                          stackIn_48_3 = stackOut_46_3;
                          break L9;
                        }
                      }
                      ((jp) (Object) stackIn_48_0).a((kia) (Object) stackIn_48_1, (byte) stackIn_48_2, stackIn_48_3 != 0);
                      this.a(param3, param2, ((hq) this).field_o, -53);
                      break L8;
                    }
                  }
                  ((hq) this).field_w = -param4;
                  break L6;
                } else {
                  L10: {
                    if (null == ((hq) this).field_u) {
                      break L10;
                    } else {
                      ((hq) this).field_s.b(true);
                      break L10;
                    }
                  }
                  L11: {
                    ((hq) this).field_u = param0;
                    if (param0 != null) {
                      L12: {
                        stackOut_37_0 = ((hq) this).field_s;
                        stackOut_37_1 = (kia) param0;
                        stackOut_37_2 = -115;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_39_2 = stackOut_37_2;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        stackIn_38_2 = stackOut_37_2;
                        if (param1) {
                          stackOut_39_0 = (jp) (Object) stackIn_39_0;
                          stackOut_39_1 = (kia) (Object) stackIn_39_1;
                          stackOut_39_2 = stackIn_39_2;
                          stackOut_39_3 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          stackIn_40_3 = stackOut_39_3;
                          break L12;
                        } else {
                          stackOut_38_0 = (jp) (Object) stackIn_38_0;
                          stackOut_38_1 = (kia) (Object) stackIn_38_1;
                          stackOut_38_2 = stackIn_38_2;
                          stackOut_38_3 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          stackIn_40_3 = stackOut_38_3;
                          break L12;
                        }
                      }
                      ((jp) (Object) stackIn_40_0).a((kia) (Object) stackIn_40_1, (byte) stackIn_40_2, stackIn_40_3 != 0);
                      this.a(param3, param2, ((hq) this).field_s, -83);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ((hq) this).field_w = param4;
                  break L6;
                }
              }
              return;
            } else {
              ((hq) this).field_w = -param4;
              this.a(param3, param2, ((hq) this).field_o, -91);
              return;
            }
          } else {
            ((hq) this).field_w = param4;
            this.a(param3, param2, ((hq) this).field_s, -75);
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (-1 > ((hq) this).field_t) {
            if (((hq) this).field_u != null) {
              ((hq) this).field_s.a(param0);
              if (-1048577 < (((hq) this).field_t ^ -1)) {
                if (null != ((hq) this).field_m) {
                  ((hq) this).field_o.a(param0);
                  if ((((hq) this).field_l ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (((hq) this).field_v == null) {
                      break L0;
                    } else {
                      ((hq) this).field_r.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if ((((hq) this).field_l ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (((hq) this).field_v == null) {
                      break L0;
                    } else {
                      ((hq) this).field_r.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if ((((hq) this).field_l ^ -1) >= -1) {
                  break L0;
                } else {
                  if (((hq) this).field_v == null) {
                    break L0;
                  } else {
                    ((hq) this).field_r.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (-1048577 < (((hq) this).field_t ^ -1)) {
                if (null != ((hq) this).field_m) {
                  ((hq) this).field_o.a(param0);
                  if ((((hq) this).field_l ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (((hq) this).field_v == null) {
                      break L0;
                    } else {
                      ((hq) this).field_r.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if ((((hq) this).field_l ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (((hq) this).field_v == null) {
                      break L0;
                    } else {
                      ((hq) this).field_r.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if ((((hq) this).field_l ^ -1) >= -1) {
                  break L0;
                } else {
                  if (((hq) this).field_v == null) {
                    break L0;
                  } else {
                    ((hq) this).field_r.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (-1048577 > ((hq) this).field_t) {
              if (null == ((hq) this).field_m) {
                if ((((hq) this).field_l ^ -1) >= -1) {
                  break L0;
                } else {
                  if (((hq) this).field_v != null) {
                    ((hq) this).field_r.a(param0);
                    break L0;
                  } else {
                    if ((((hq) this).field_l ^ -1) >= -1) {
                      break L0;
                    } else {
                      if (((hq) this).field_v == null) {
                        break L0;
                      } else {
                        ((hq) this).field_r.a(param0);
                        break L0;
                      }
                    }
                  }
                }
              } else {
                if ((((hq) this).field_l ^ -1) >= -1) {
                  break L0;
                } else {
                  if (((hq) this).field_v == null) {
                    break L0;
                  } else {
                    ((hq) this).field_r.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if ((((hq) this).field_l ^ -1) >= -1) {
                break L0;
              } else {
                if (((hq) this).field_v == null) {
                  break L0;
                } else {
                  ((hq) this).field_r.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (!((hq) this).field_p) {
            break L1;
          } else {
            L2: {
              if (((hq) this).field_w <= 0) {
                break L2;
              } else {
                if (((hq) this).field_s.c(28607)) {
                  break L2;
                } else {
                  ((hq) this).field_u = null;
                  ((hq) this).field_p = false;
                  ((hq) this).field_w = -((hq) this).field_w;
                  break L1;
                }
              }
            }
            if (0 <= ((hq) this).field_w) {
              break L1;
            } else {
              if (!((hq) this).field_o.c(28607)) {
                ((hq) this).field_m = null;
                ((hq) this).field_w = -((hq) this).field_w;
                ((hq) this).field_p = false;
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L3: {
          if (((hq) this).field_w == 0) {
            break L3;
          } else {
            ((hq) this).field_t = ((hq) this).field_t + param0 * ((hq) this).field_w;
            if (((hq) this).field_t <= -1048577) {
              ((hq) this).field_t = 1048576;
              if (!((hq) this).field_p) {
                ((hq) this).field_w = 0;
                if (!((hq) this).field_n) {
                  L4: {
                    if (((hq) this).field_m != null) {
                      ((hq) this).field_o.b(true);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  ((hq) this).field_m = null;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            } else {
              if (-1 >= ((hq) this).field_t) {
                ((hq) this).field_t = 0;
                if (!((hq) this).field_p) {
                  ((hq) this).field_w = 0;
                  if (((hq) this).field_n) {
                    break L3;
                  } else {
                    L5: {
                      if (null == ((hq) this).field_u) {
                        break L5;
                      } else {
                        ((hq) this).field_s.b(true);
                        break L5;
                      }
                    }
                    ((hq) this).field_u = null;
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
        }
    }

    final tda b() {
        return null;
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_35_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_63_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        var11 = BachelorFridge.field_y;
        if (-1 <= (((hq) this).field_q ^ -1)) {
          ((hq) this).a(param2);
          return;
        } else {
          L0: {
            if (((hq) this).field_p) {
              if ((((hq) this).field_w ^ -1) >= -1) {
                if (((hq) this).field_w >= 0) {
                  break L0;
                } else {
                  if (((hq) this).field_o.c(28607)) {
                    break L0;
                  } else {
                    ((hq) this).field_w = -((hq) this).field_w;
                    ((hq) this).field_m = null;
                    ((hq) this).field_p = false;
                    break L0;
                  }
                }
              } else {
                if (!((hq) this).field_s.c(28607)) {
                  ((hq) this).field_u = null;
                  ((hq) this).field_w = -((hq) this).field_w;
                  ((hq) this).field_p = false;
                  break L0;
                } else {
                  if (((hq) this).field_w >= 0) {
                    break L0;
                  } else {
                    if (((hq) this).field_o.c(28607)) {
                      break L0;
                    } else {
                      ((hq) this).field_w = -((hq) this).field_w;
                      ((hq) this).field_m = null;
                      ((hq) this).field_p = false;
                      break L0;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          L1: {
            var4 = ((hq) this).field_q * (((hq) this).field_t >> -1198266804) / 256;
            var5 = -var4 + ((hq) this).field_q;
            if (0 == ((hq) this).field_w) {
              break L1;
            } else {
              ((hq) this).field_t = ((hq) this).field_t + ((hq) this).field_w * param2;
              if (-1048577 >= (((hq) this).field_t ^ -1)) {
                ((hq) this).field_t = 1048576;
                if (!((hq) this).field_p) {
                  ((hq) this).field_w = 0;
                  if (!((hq) this).field_n) {
                    L2: {
                      if (((hq) this).field_m == null) {
                        break L2;
                      } else {
                        ((hq) this).field_o.b(true);
                        break L2;
                      }
                    }
                    ((hq) this).field_m = null;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              } else {
                if (((hq) this).field_t > 0) {
                  break L1;
                } else {
                  ((hq) this).field_t = 0;
                  if (((hq) this).field_p) {
                    break L1;
                  } else {
                    ((hq) this).field_w = 0;
                    if (!((hq) this).field_n) {
                      L3: {
                        if (((hq) this).field_u != null) {
                          ((hq) this).field_s.b(true);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((hq) this).field_u = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          L4: {
            if (!pb.field_q) {
              stackOut_34_0 = param2;
              stackIn_35_0 = stackOut_34_0;
              break L4;
            } else {
              stackOut_33_0 = param2 << 893102177;
              stackIn_35_0 = stackOut_33_0;
              break L4;
            }
          }
          L5: {
            var6 = stackIn_35_0;
            if (((hq) this).field_l >= 256) {
              break L5;
            } else {
              L6: {
                if (((hq) this).field_u != null) {
                  break L6;
                } else {
                  if (null != ((hq) this).field_m) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
              if (256 != var4) {
                if ((var5 ^ -1) == -257) {
                  ((hq) this).field_o.a(param0, param1, param2);
                  break L5;
                } else {
                  L7: {
                    L8: {
                      if (((hq) this).field_j == null) {
                        break L8;
                      } else {
                        if (((hq) this).field_j.length < var6) {
                          break L8;
                        } else {
                          bl.a(((hq) this).field_j, 0, var6);
                          bl.a(((hq) this).field_k, 0, var6);
                          break L7;
                        }
                      }
                    }
                    ((hq) this).field_k = new int[var6];
                    ((hq) this).field_j = new int[var6];
                    break L7;
                  }
                  L9: {
                    ((hq) this).field_s.a(((hq) this).field_j, 0, param2);
                    ((hq) this).field_o.a(((hq) this).field_k, 0, param2);
                    if (!pb.field_q) {
                      stackOut_48_0 = param1;
                      stackIn_49_0 = stackOut_48_0;
                      break L9;
                    } else {
                      param1 = param1 << 1;
                      stackOut_47_0 = param1 << 1;
                      stackIn_49_0 = stackOut_47_0;
                      break L9;
                    }
                  }
                  var7 = stackIn_49_0;
                  var8 = 0;
                  L10: while (true) {
                    if (var8 >= var6) {
                      break L5;
                    } else {
                      param0[var8 + var7] = param0[var8 + var7] + (var4 * ((hq) this).field_j[var8] + var5 * ((hq) this).field_k[var8] >> 202956008);
                      var8++;
                      continue L10;
                    }
                  }
                }
              } else {
                ((hq) this).field_s.a(param0, param1, param2);
                break L5;
              }
            }
          }
          L11: {
            if (((hq) this).field_v == null) {
              break L11;
            } else {
              if (((hq) this).field_l != 0) {
                L12: {
                  L13: {
                    if (((hq) this).field_j == null) {
                      break L13;
                    } else {
                      if (((hq) this).field_j.length < var6) {
                        break L13;
                      } else {
                        bl.a(((hq) this).field_j, 0, var6);
                        break L12;
                      }
                    }
                  }
                  ((hq) this).field_k = new int[var6];
                  ((hq) this).field_j = new int[var6];
                  break L12;
                }
                L14: {
                  ((hq) this).field_r.a(((hq) this).field_j, 0, param2);
                  if (pb.field_q) {
                    param1 = param1 << 1;
                    stackOut_62_0 = param1 << 1;
                    stackIn_63_0 = stackOut_62_0;
                    break L14;
                  } else {
                    stackOut_61_0 = param1;
                    stackIn_63_0 = stackOut_61_0;
                    break L14;
                  }
                }
                var7 = stackIn_63_0;
                var8 = ((hq) this).field_l * ((hq) this).field_q / 256;
                var9 = ((hq) this).field_q + -var8;
                var10 = 0;
                L15: while (true) {
                  if (var10 >= var6) {
                    break L11;
                  } else {
                    param0[var7 - -var10] = ((hq) this).field_j[var10] * var8 + var9 * param0[var7 + var10] >> -1222271384;
                    var10++;
                    continue L15;
                  }
                }
              } else {
                break L11;
              }
            }
          }
          return;
        }
    }

    final synchronized int d() {
        return 2;
    }

    final tda a() {
        return null;
    }

    final synchronized void a(int param0, boolean param1) {
        if (!param1) {
            Object var4 = null;
            ((hq) this).a((int[]) null, 70, 31);
        }
        ((hq) this).field_q = param0;
    }

    private final void a(int param0, int param1, jp param2, int param3) {
        if (param3 > 0) {
            int discarded$0 = ((hq) this).d();
        }
        param2.a(-1, param0, (byte) -107);
        param2.c(224, param1);
    }

    private hq() throws Throwable {
        throw new Error();
    }

    static {
    }
}
