/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class he extends k {
    static String field_q;
    static Calendar field_s;
    static String field_v;
    private ef[] field_w;
    static eh field_r;
    static int field_y;
    private ef field_t;
    static mf field_u;
    static int field_x;

    final ef a(int param0, byte param1) {
        if (param1 != -53) {
          ((he) this).field_t = null;
          ef dupTemp$4 = new ef();
          ((he) this).field_w[param0] = dupTemp$4;
          return dupTemp$4;
        } else {
          ef dupTemp$5 = new ef();
          ((he) this).field_w[param0] = dupTemp$5;
          return dupTemp$5;
        }
    }

    final static te a(mf param0, int param1, int param2, int param3) {
        if (param1 == -18109) {
          if (!uc.a(param0, 96, param3, param2)) {
            return null;
          } else {
            return da.b((byte) 8);
          }
        } else {
          field_v = null;
          if (!uc.a(param0, 96, param3, param2)) {
            return null;
          } else {
            return da.b((byte) 8);
          }
        }
    }

    final void a(ed[] param0, int param1) {
        ef[] var3 = null;
        int var4 = 0;
        ef var5 = null;
        int var6 = 0;
        ef[] var7 = null;
        var6 = EscapeVector.field_A;
        var7 = ((he) this).field_w;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            if (param1 != 6) {
              field_v = null;
              return;
            } else {
              return;
            }
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_i = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        ef var7 = null;
        hc var10 = null;
        ef var11 = null;
        ef var14 = null;
        ef var15 = null;
        ef var16 = null;
        ef var17 = null;
        ef var18 = null;
        ef var19 = null;
        ef var20 = null;
        ef var21 = null;
        ef var22 = null;
        ef var23 = null;
        ef var24 = null;
        ef var25 = null;
        ef var26 = null;
        ef var27 = null;
        ef var28 = null;
        ef var29 = null;
        ef var30 = null;
        ef var31 = null;
        ef var32 = null;
        ef var35 = null;
        ef var36 = null;
        ef var37 = null;
        ef var38 = null;
        ef var39 = null;
        ef var40 = null;
        hm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        hm stackOut_1_0 = null;
        L0: {
          if (!(param3 instanceof hc)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (hm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (hm) param3;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (hc) (Object) stackIn_3_0;
          rd.a(param3.field_g + param3.field_k + param0, param0 - -param3.field_k, param3.field_j + (param1 + param3.field_x), 19807, param1 - -param3.field_j);
          if (var10 != null) {
            param4 = param4 & var10.field_y;
            break L1;
          } else {
            break L1;
          }
        }
        var7 = ((he) this).field_w[0];
        ((he) this).field_t.a(true);
        var7.a(param0, ((he) this).field_t, param3, param1, 63, (he) this);
        if (var10 != null) {
          if (var10.field_z) {
            L2: {
              var11 = ((he) this).field_w[1];
              if (var11 != null) {
                var11.a(param0, ((he) this).field_t, param3, param1, -106, (he) this);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!var10.field_u) {
                break L3;
              } else {
                L4: {
                  var29 = ((he) this).field_w[3];
                  if (0 == var10.field_t) {
                    break L4;
                  } else {
                    if (var29 == null) {
                      break L4;
                    } else {
                      L5: {
                        var29.a(param0, ((he) this).field_t, param3, param1, -124, (he) this);
                        if (param3.h(0)) {
                          var30 = ((he) this).field_w[5];
                          if (var30 == null) {
                            break L5;
                          } else {
                            var30.a(param0, ((he) this).field_t, param3, param1, 51, (he) this);
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (!param4) {
                          var31 = ((he) this).field_w[4];
                          var14 = var31;
                          if (var31 != null) {
                            var31.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                            break L6;
                          } else {
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      if (param2 < -14) {
                        ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                        dl.a((byte) -8);
                        return;
                      } else {
                        he.a(true);
                        ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                        dl.a((byte) -8);
                        return;
                      }
                    }
                  }
                }
                var36 = ((he) this).field_w[2];
                if (var36 != null) {
                  var36.a(param0, ((he) this).field_t, param3, param1, -101, (he) this);
                  break L3;
                } else {
                  L7: {
                    if (param3.h(0)) {
                      var32 = ((he) this).field_w[5];
                      if (var32 == null) {
                        break L7;
                      } else {
                        var32.a(param0, ((he) this).field_t, param3, param1, 51, (he) this);
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  if (!param4) {
                    var35 = ((he) this).field_w[4];
                    var14 = var35;
                    if (var35 != null) {
                      var35.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                      if (param2 < -14) {
                        ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                        dl.a((byte) -8);
                        return;
                      } else {
                        he.a(true);
                        ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                        dl.a((byte) -8);
                        return;
                      }
                    } else {
                      if (param2 < -14) {
                        ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                        dl.a((byte) -8);
                        return;
                      } else {
                        he.a(true);
                        ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                        dl.a((byte) -8);
                        return;
                      }
                    }
                  } else {
                    if (param2 < -14) {
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    } else {
                      he.a(true);
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    }
                  }
                }
              }
            }
            if (param3.h(0)) {
              var38 = ((he) this).field_w[5];
              if (var38 == null) {
                if (!param4) {
                  var40 = ((he) this).field_w[4];
                  if (var40 != null) {
                    var40.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                    if (param2 < -14) {
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    } else {
                      he.a(true);
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    }
                  } else {
                    if (param2 < -14) {
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    } else {
                      he.a(true);
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    }
                  }
                } else {
                  if (param2 < -14) {
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  } else {
                    he.a(true);
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  }
                }
              } else {
                var38.a(param0, ((he) this).field_t, param3, param1, 51, (he) this);
                if (!param4) {
                  var39 = ((he) this).field_w[4];
                  if (var39 != null) {
                    var39.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                    if (param2 < -14) {
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    } else {
                      he.a(true);
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    }
                  } else {
                    if (param2 < -14) {
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    } else {
                      he.a(true);
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    }
                  }
                } else {
                  if (param2 < -14) {
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  } else {
                    he.a(true);
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  }
                }
              }
            } else {
              if (!param4) {
                var37 = ((he) this).field_w[4];
                var14 = var37;
                if (var37 != null) {
                  var37.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                  if (param2 < -14) {
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  } else {
                    he.a(true);
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  }
                } else {
                  if (param2 < -14) {
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  } else {
                    he.a(true);
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  }
                }
              } else {
                if (param2 < -14) {
                  ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                  dl.a((byte) -8);
                  return;
                } else {
                  he.a(true);
                  ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                  dl.a((byte) -8);
                  return;
                }
              }
            }
          } else {
            L8: {
              if (!var10.field_u) {
                break L8;
              } else {
                L9: {
                  var19 = ((he) this).field_w[3];
                  if (0 == var10.field_t) {
                    break L9;
                  } else {
                    if (var19 == null) {
                      break L9;
                    } else {
                      L10: {
                        var19.a(param0, ((he) this).field_t, param3, param1, -124, (he) this);
                        if (param3.h(0)) {
                          var20 = ((he) this).field_w[5];
                          if (var20 == null) {
                            break L10;
                          } else {
                            var20.a(param0, ((he) this).field_t, param3, param1, 51, (he) this);
                            break L10;
                          }
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (!param4) {
                          var21 = ((he) this).field_w[4];
                          if (var21 != null) {
                            var21.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                            break L11;
                          } else {
                            break L11;
                          }
                        } else {
                          break L11;
                        }
                      }
                      if (param2 < -14) {
                        ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                        dl.a((byte) -8);
                        return;
                      } else {
                        he.a(true);
                        ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                        dl.a((byte) -8);
                        return;
                      }
                    }
                  }
                }
                var24 = ((he) this).field_w[2];
                if (var24 != null) {
                  var24.a(param0, ((he) this).field_t, param3, param1, -101, (he) this);
                  break L8;
                } else {
                  L12: {
                    if (param3.h(0)) {
                      var22 = ((he) this).field_w[5];
                      if (var22 == null) {
                        break L12;
                      } else {
                        var22.a(param0, ((he) this).field_t, param3, param1, 51, (he) this);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (!param4) {
                      var23 = ((he) this).field_w[4];
                      if (var23 != null) {
                        var23.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                        break L13;
                      } else {
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  if (param2 < -14) {
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  } else {
                    he.a(true);
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  }
                }
              }
            }
            if (param3.h(0)) {
              var26 = ((he) this).field_w[5];
              if (var26 == null) {
                if (!param4) {
                  var28 = ((he) this).field_w[4];
                  if (var28 != null) {
                    var28.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                    if (param2 < -14) {
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    } else {
                      he.a(true);
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    }
                  } else {
                    if (param2 < -14) {
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    } else {
                      he.a(true);
                      ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                      dl.a((byte) -8);
                      return;
                    }
                  }
                } else {
                  if (param2 < -14) {
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  } else {
                    he.a(true);
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  }
                }
              } else {
                L14: {
                  var26.a(param0, ((he) this).field_t, param3, param1, 51, (he) this);
                  if (!param4) {
                    var27 = ((he) this).field_w[4];
                    if (var27 != null) {
                      var27.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                      break L14;
                    } else {
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
                if (param2 < -14) {
                  ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                  dl.a((byte) -8);
                  return;
                } else {
                  he.a(true);
                  ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                  dl.a((byte) -8);
                  return;
                }
              }
            } else {
              L15: {
                if (!param4) {
                  var25 = ((he) this).field_w[4];
                  if (var25 != null) {
                    var25.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                    break L15;
                  } else {
                    break L15;
                  }
                } else {
                  break L15;
                }
              }
              if (param2 < -14) {
                ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                dl.a((byte) -8);
                return;
              } else {
                he.a(true);
                ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                dl.a((byte) -8);
                return;
              }
            }
          }
        } else {
          if (param3.h(0)) {
            var16 = ((he) this).field_w[5];
            if (var16 == null) {
              if (!param4) {
                var18 = ((he) this).field_w[4];
                if (var18 != null) {
                  var18.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                  if (param2 < -14) {
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  } else {
                    he.a(true);
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  }
                } else {
                  if (param2 < -14) {
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  } else {
                    he.a(true);
                    ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                    dl.a((byte) -8);
                    return;
                  }
                }
              } else {
                if (param2 < -14) {
                  ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                  dl.a((byte) -8);
                  return;
                } else {
                  he.a(true);
                  ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                  dl.a((byte) -8);
                  return;
                }
              }
            } else {
              L16: {
                var16.a(param0, ((he) this).field_t, param3, param1, 51, (he) this);
                if (!param4) {
                  var17 = ((he) this).field_w[4];
                  if (var17 != null) {
                    var17.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                    break L16;
                  } else {
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
              if (param2 < -14) {
                ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                dl.a((byte) -8);
                return;
              } else {
                he.a(true);
                ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
                dl.a((byte) -8);
                return;
              }
            }
          } else {
            L17: {
              if (!param4) {
                var15 = ((he) this).field_w[4];
                if (var15 != null) {
                  var15.a(param0, ((he) this).field_t, param3, param1, -94, (he) this);
                  break L17;
                } else {
                  break L17;
                }
              } else {
                break L17;
              }
            }
            if (param2 < -14) {
              ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
              dl.a((byte) -8);
              return;
            } else {
              he.a(true);
              ((he) this).field_t.a((he) this, param3, param0, param1, (byte) 21);
              dl.a((byte) -8);
              return;
            }
          }
        }
    }

    final void a(ed param0, byte param1) {
        ef[] var3 = null;
        int var4 = 0;
        ef var5 = null;
        int var6 = 0;
        ef[] var7 = null;
        var6 = EscapeVector.field_A;
        var7 = ((he) this).field_w;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            if (param1 <= 65) {
              he.a(true);
              return;
            } else {
              return;
            }
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param0;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    he(he param0, boolean param1) {
        this();
        param0.a(param1, 123, (he) this);
    }

    final static kb a(String param0, int param1, byte param2) {
        jb var3 = new jb();
        int var4 = -90 / ((param2 - -5) / 40);
        ((kb) (Object) var3).field_b = param1;
        ((kb) (Object) var3).field_a = param0;
        return (kb) (Object) var3;
    }

    public static void a(boolean param0) {
        field_v = null;
        field_u = null;
        field_q = null;
        if (!param0) {
            return;
        }
        field_s = null;
    }

    public he() {
        ((he) this).field_w = new ef[6];
        ((he) this).field_t = new ef();
        ef dupTemp$0 = new ef();
        ((he) this).field_w[0] = dupTemp$0;
        ef var1 = dupTemp$0;
        var1.a(true);
    }

    private final void a(boolean param0, int param1, he param2) {
        int var4 = 0;
        ef var5 = null;
        ef var6 = null;
        int var7 = 0;
        ef stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        ef stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ef stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ef stackIn_8_2 = null;
        ef stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        ef stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ef stackOut_7_2 = null;
        ef stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ef stackOut_6_2 = null;
        var7 = EscapeVector.field_A;
        super.a((k) (Object) param2, 127);
        if (!param0) {
          qg.a((Object[]) (Object) ((he) this).field_w, 0, (Object[]) (Object) param2.field_w, 0, 6);
          if (param1 > 120) {
            return;
          } else {
            field_r = null;
            return;
          }
        } else {
          var4 = 0;
          L0: while (true) {
            if (-7 >= (var4 ^ -1)) {
              if (param1 <= 120) {
                field_r = null;
                return;
              } else {
                return;
              }
            } else {
              var5 = ((he) this).field_w[var4];
              if (var5 != null) {
                L1: {
                  var6 = param2.field_w[var4];
                  stackOut_5_0 = (ef) var5;
                  stackOut_5_1 = -2;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  if (var6 == null) {
                    ef dupTemp$1 = new ef();
                    param2.field_w[var4] = dupTemp$1;
                    stackOut_7_0 = (ef) (Object) stackIn_7_0;
                    stackOut_7_1 = stackIn_7_1;
                    stackOut_7_2 = (ef) dupTemp$1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    break L1;
                  } else {
                    stackOut_6_0 = (ef) (Object) stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = (ef) var6;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    break L1;
                  }
                }
                ((ef) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2);
                var4++;
                continue L0;
              } else {
                param2.field_w[var4] = null;
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final void a(ed[] param0, int param1, byte param2) {
        int var4 = 0;
        Object var5 = null;
        var4 = param1;
        if (param2 == -117) {
          if (((he) this).field_w[var4] == null) {
            ((he) this).field_w[var4] = new ef();
            ((he) this).field_w[param1].field_i = param0;
            return;
          } else {
            ((he) this).field_w[param1].field_i = param0;
            return;
          }
        } else {
          var5 = null;
          this.a(false, -105, (he) null);
          if (((he) this).field_w[var4] != null) {
            ((he) this).field_w[param1].field_i = param0;
            return;
          } else {
            ((he) this).field_w[var4] = new ef();
            ((he) this).field_w[param1].field_i = param0;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Tutorial";
        field_r = null;
        field_q = "Not yet achieved";
        field_s = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
