/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj extends hl {
    static hg field_v;
    private ai field_s;
    static int field_t;
    private ai[] field_y;
    static sb field_w;
    static of field_u;
    static String field_z;
    static ci field_x;

    final void a(km param0, int param1) {
        ai[] var3 = null;
        int var4 = 0;
        ai var5 = null;
        int var6 = 0;
        ai[] var7 = null;
        var6 = Chess.field_G;
        var7 = ((nj) this).field_y;
        var3 = var7;
        if (param1 != -4755) {
          return;
        } else {
          var4 = 0;
          L0: while (true) {
            if (var7.length <= var4) {
              return;
            } else {
              var5 = var7[var4];
              if (var5 != null) {
                var5.field_k = param0;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    public final void a(byte param0, int param1, int param2, boolean param3, mf param4) {
        ai var7 = null;
        fb var10 = null;
        ai var11 = null;
        ai var13 = null;
        ai var15 = null;
        ai var16 = null;
        ai var17 = null;
        ai var18 = null;
        ai var19 = null;
        ai var20 = null;
        ai var21 = null;
        ai var22 = null;
        ai var23 = null;
        ai var24 = null;
        ai var25 = null;
        ai var26 = null;
        ai var27 = null;
        ai var28 = null;
        ai var29 = null;
        ai var30 = null;
        ai var31 = null;
        ai var32 = null;
        ai var33 = null;
        ai var34 = null;
        ai var35 = null;
        ai var42 = null;
        ai var49 = null;
        ai var50 = null;
        ai var51 = null;
        ai var52 = null;
        ai var57 = null;
        ai var62 = null;
        ai var63 = null;
        ai var64 = null;
        ai var65 = null;
        ai var68 = null;
        ai var71 = null;
        ai var72 = null;
        ai var73 = null;
        ai var74 = null;
        ai var75 = null;
        ai var76 = null;
        mf stackIn_3_0 = null;
        mf stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param4 instanceof fb) {
            stackOut_2_0 = (mf) param4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (mf) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (fb) (Object) stackIn_3_0;
          cf.b(param4.field_C + (param4.field_r + param2), param4.field_y + (param1 + param4.field_u), param4.field_r + param2, 80, param4.field_u + param1);
          if (var10 == null) {
            break L1;
          } else {
            param3 = param3 & var10.field_H;
            break L1;
          }
        }
        var7 = ((nj) this).field_y[0];
        ((nj) this).field_s.a((byte) 102);
        var7.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
        if (var10 != null) {
          if (var10.field_I) {
            var11 = ((nj) this).field_y[1];
            if (var11 == null) {
              if (var10.field_w) {
                L2: {
                  var51 = ((nj) this).field_y[3];
                  if (var10.field_q == 0) {
                    break L2;
                  } else {
                    if (var51 == null) {
                      break L2;
                    } else {
                      var51.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                      if (param4.d((byte) -67)) {
                        var62 = ((nj) this).field_y[5];
                        var13 = var62;
                        if (var62 != null) {
                          var62.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                          if (param0 >= 58) {
                            if (param3) {
                              ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                              fd.a(28773);
                              return;
                            } else {
                              var63 = ((nj) this).field_y[4];
                              if (var63 != null) {
                                var63.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                                ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                                fd.a(28773);
                                return;
                              } else {
                                ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                                fd.a(28773);
                                return;
                              }
                            }
                          } else {
                            return;
                          }
                        } else {
                          if (param0 >= 58) {
                            if (param3) {
                              ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                              fd.a(28773);
                              return;
                            } else {
                              var57 = ((nj) this).field_y[4];
                              if (var57 != null) {
                                var57.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                                ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                                fd.a(28773);
                                return;
                              } else {
                                ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                                fd.a(28773);
                                return;
                              }
                            }
                          } else {
                            return;
                          }
                        }
                      } else {
                        if (param0 >= 58) {
                          if (param3) {
                            ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                            fd.a(28773);
                            return;
                          } else {
                            var52 = ((nj) this).field_y[4];
                            if (var52 != null) {
                              var52.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                              ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                              fd.a(28773);
                              return;
                            } else {
                              ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                              fd.a(28773);
                              return;
                            }
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                var64 = ((nj) this).field_y[2];
                if (var64 == null) {
                  if (param4.d((byte) -67)) {
                    var75 = ((nj) this).field_y[5];
                    if (var75 != null) {
                      var75.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                      if (param0 >= 58) {
                        if (param3) {
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        } else {
                          var76 = ((nj) this).field_y[4];
                          if (var76 == null) {
                            ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                            fd.a(28773);
                            return;
                          } else {
                            var76.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                            ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                            fd.a(28773);
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (param0 >= 58) {
                        if (param3) {
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        } else {
                          var74 = ((nj) this).field_y[4];
                          if (var74 == null) {
                            ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                            fd.a(28773);
                            return;
                          } else {
                            var74.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                            ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                            fd.a(28773);
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param0 >= 58) {
                      if (param3) {
                        ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                        fd.a(28773);
                        return;
                      } else {
                        var73 = ((nj) this).field_y[4];
                        if (var73 == null) {
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        } else {
                          var73.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  var64.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                  if (param4.d((byte) -67)) {
                    var71 = ((nj) this).field_y[5];
                    if (var71 != null) {
                      var71.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                      if (param0 >= 58) {
                        if (param3) {
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        } else {
                          var72 = ((nj) this).field_y[4];
                          if (var72 == null) {
                            ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                            fd.a(28773);
                            return;
                          } else {
                            var72.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                            ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                            fd.a(28773);
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (param0 >= 58) {
                        if (param3) {
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        } else {
                          var68 = ((nj) this).field_y[4];
                          if (var68 == null) {
                            ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                            fd.a(28773);
                            return;
                          } else {
                            var68.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                            ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                            fd.a(28773);
                            return;
                          }
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (param0 >= 58) {
                      if (param3) {
                        ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                        fd.a(28773);
                        return;
                      } else {
                        var65 = ((nj) this).field_y[4];
                        if (var65 == null) {
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        } else {
                          var65.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (param4.d((byte) -67)) {
                  var49 = ((nj) this).field_y[5];
                  var13 = var49;
                  if (var49 != null) {
                    var49.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                    if (param0 >= 58) {
                      if (param3) {
                        ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                        fd.a(28773);
                        return;
                      } else {
                        var50 = ((nj) this).field_y[4];
                        if (var50 != null) {
                          var50.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        } else {
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (param0 >= 58) {
                      if (param3) {
                        ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                        fd.a(28773);
                        return;
                      } else {
                        var42 = ((nj) this).field_y[4];
                        if (var42 != null) {
                          var42.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        } else {
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param0 >= 58) {
                    if (param3) {
                      ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                      fd.a(28773);
                      return;
                    } else {
                      var35 = ((nj) this).field_y[4];
                      if (var35 != null) {
                        var35.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                        ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                        fd.a(28773);
                        return;
                      } else {
                        ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                        fd.a(28773);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              L3: {
                var11.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                if (var10.field_w) {
                  L4: {
                    var31 = ((nj) this).field_y[3];
                    if (var10.field_q == 0) {
                      break L4;
                    } else {
                      if (var31 == null) {
                        break L4;
                      } else {
                        var31.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                        break L3;
                      }
                    }
                  }
                  var32 = ((nj) this).field_y[2];
                  if (var32 == null) {
                    break L3;
                  } else {
                    var32.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (param4.d((byte) -67)) {
                  var33 = ((nj) this).field_y[5];
                  var13 = var33;
                  if (var33 != null) {
                    var33.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              if (param0 >= 58) {
                if (param3) {
                  ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                  fd.a(28773);
                  return;
                } else {
                  var34 = ((nj) this).field_y[4];
                  if (var34 != null) {
                    var34.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                    ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                    fd.a(28773);
                    return;
                  } else {
                    ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                    fd.a(28773);
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            if (var10.field_w) {
              L6: {
                var21 = ((nj) this).field_y[3];
                if (var10.field_q == 0) {
                  break L6;
                } else {
                  if (var21 == null) {
                    break L6;
                  } else {
                    L7: {
                      var21.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                      if (param4.d((byte) -67)) {
                        var22 = ((nj) this).field_y[5];
                        if (var22 != null) {
                          var22.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    if (param0 >= 58) {
                      if (!param3) {
                        var23 = ((nj) this).field_y[4];
                        if (var23 != null) {
                          var23.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        } else {
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        }
                      } else {
                        ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                        fd.a(28773);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
              var24 = ((nj) this).field_y[2];
              if (var24 == null) {
                if (param4.d((byte) -67)) {
                  var29 = ((nj) this).field_y[5];
                  if (var29 != null) {
                    var29.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                    if (param0 >= 58) {
                      if (param3) {
                        ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                        fd.a(28773);
                        return;
                      } else {
                        var30 = ((nj) this).field_y[4];
                        if (var30 != null) {
                          var30.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        } else {
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (param0 >= 58) {
                      if (!param3) {
                        var28 = ((nj) this).field_y[4];
                        if (var28 != null) {
                          var28.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        } else {
                          ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                          fd.a(28773);
                          return;
                        }
                      } else {
                        ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                        fd.a(28773);
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  if (param0 >= 58) {
                    if (!param3) {
                      var27 = ((nj) this).field_y[4];
                      if (var27 != null) {
                        var27.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                        ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                        fd.a(28773);
                        return;
                      } else {
                        ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                        fd.a(28773);
                        return;
                      }
                    } else {
                      ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                      fd.a(28773);
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L8: {
                  var24.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                  if (param4.d((byte) -67)) {
                    var25 = ((nj) this).field_y[5];
                    if (var25 != null) {
                      var25.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
                if (param0 >= 58) {
                  if (!param3) {
                    var26 = ((nj) this).field_y[4];
                    if (var26 != null) {
                      var26.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                      ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                      fd.a(28773);
                      return;
                    } else {
                      ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                      fd.a(28773);
                      return;
                    }
                  } else {
                    ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                    fd.a(28773);
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              L9: {
                if (param4.d((byte) -67)) {
                  var19 = ((nj) this).field_y[5];
                  if (var19 != null) {
                    var19.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                    break L9;
                  } else {
                    break L9;
                  }
                } else {
                  break L9;
                }
              }
              if (param0 >= 58) {
                if (!param3) {
                  var20 = ((nj) this).field_y[4];
                  if (var20 != null) {
                    var20.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                    ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                    fd.a(28773);
                    return;
                  } else {
                    ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                    fd.a(28773);
                    return;
                  }
                } else {
                  ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                  fd.a(28773);
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          if (param4.d((byte) -67)) {
            var17 = ((nj) this).field_y[5];
            if (var17 != null) {
              var17.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
              if (param0 >= 58) {
                if (!param3) {
                  var18 = ((nj) this).field_y[4];
                  if (var18 != null) {
                    var18.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                    ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                    fd.a(28773);
                    return;
                  } else {
                    ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                    fd.a(28773);
                    return;
                  }
                } else {
                  ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                  fd.a(28773);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (param0 >= 58) {
                if (!param3) {
                  var16 = ((nj) this).field_y[4];
                  if (var16 != null) {
                    var16.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                    ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                    fd.a(28773);
                    return;
                  } else {
                    ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                    fd.a(28773);
                    return;
                  }
                } else {
                  ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                  fd.a(28773);
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (param0 >= 58) {
              if (!param3) {
                var15 = ((nj) this).field_y[4];
                if (var15 != null) {
                  var15.a(param4, ((nj) this).field_s, param2, -22160, (nj) this, param1);
                  ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                  fd.a(28773);
                  return;
                } else {
                  ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                  fd.a(28773);
                  return;
                }
              } else {
                ((nj) this).field_s.a(param1, (nj) this, -79, param4, param2);
                fd.a(28773);
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static int b(int param0) {
        if (param0 != 3) {
            Object var2 = null;
            nj.a((byte) 53, (String) null);
            return bd.field_d;
        }
        return bd.field_d;
    }

    final static void a(byte param0, p param1) {
        int var2 = 0;
        if (param0 != 20) {
          return;
        } else {
          jb.field_b = param1.f(param0 ^ 674914996) << -168156315;
          var2 = param1.i(-93);
          jb.field_b = jb.field_b + (var2 >> 9742787);
          l.field_o = (7 & var2) << -856625486;
          l.field_o = l.field_o + (param1.f(674914976) << 1351077090);
          var2 = param1.i(-96);
          gm.field_c = 2064384 & var2 << -760902705;
          l.field_o = l.field_o + (var2 >> 1837226566);
          gm.field_c = gm.field_c + (param1.i(-106) << -903421145);
          var2 = param1.i(-120);
          sl.field_e = var2 << 1234880528 & 65536;
          gm.field_c = gm.field_c + (var2 >> 531410081);
          sl.field_e = sl.field_e + param1.f(param0 ^ 674914996);
          return;
        }
    }

    public nj() {
        ((nj) this).field_y = new ai[6];
        ((nj) this).field_s = new ai();
        ((nj) this).field_y[0] = new ai();
        ai var1 = new ai();
        var1.a((byte) 102);
    }

    final static void a(int param0, String param1, float param2) {
        ka.field_o = param2;
        ih.field_T = param1;
        if (param0 != -20) {
            field_t = -89;
        }
    }

    public static void c(int param0) {
        field_z = null;
        field_v = null;
        field_w = null;
        field_u = null;
        field_x = null;
        if (param0 != -10406) {
            field_w = null;
        }
    }

    nj(nj param0, boolean param1) {
        this();
        param0.a(param1, (byte) 110, (nj) this);
    }

    final void a(byte param0, km[] param1) {
        ai[] var3 = null;
        int var4 = 0;
        ai var5 = null;
        int var6 = 0;
        ai[] var7 = null;
        var6 = Chess.field_G;
        var7 = ((nj) this).field_y;
        var3 = var7;
        var4 = 0;
        L0: while (true) {
          if (var7.length <= var4) {
            L1: {
              if (param0 == -6) {
                break L1;
              } else {
                field_z = null;
                break L1;
              }
            }
            return;
          } else {
            var5 = var7[var4];
            if (var5 == null) {
              var4++;
              var4++;
              continue L0;
            } else {
              var5.field_e = param1;
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(km[] param0, byte param1, int param2, int param3) {
        bl.field_d = new le(param0);
        tn.field_m = param3;
        tm.field_d = param2;
        bi.a(115);
        if (param1 != -17) {
            field_t = -112;
        }
    }

    final static void a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qi.field_o.field_db = param1;
        fm.field_V = true;
        var2 = ph.field_j.field_e;
        var3 = ph.field_j.field_i;
        if (param0 != -101) {
          nj.c(-5);
          var4 = qi.field_o.field_xb.b(param1, 272, qi.field_o.field_K);
          var5 = -(var4 / 2) + 7 + (var3 / 2 - 110);
          la.field_c.a((-320 + var2) / 2, 320, -2147483648, -(var5 * 2) + var3 - 120, var5);
          la.field_c.field_Ab = wh.a(-82, la.field_c.field_pb, 3, 11579568, 8421504, 2105376);
          qi.field_o.a(24, -24 + la.field_c.field_M + -24, -2147483648, -20 + la.field_c.field_pb - 24, 16);
          of.field_i.a(120, 80, -2147483648, 24, la.field_c.field_pb - 44);
          return;
        } else {
          var4 = qi.field_o.field_xb.b(param1, 272, qi.field_o.field_K);
          var5 = -(var4 / 2) + 7 + (var3 / 2 - 110);
          la.field_c.a((-320 + var2) / 2, 320, -2147483648, -(var5 * 2) + var3 - 120, var5);
          la.field_c.field_Ab = wh.a(-82, la.field_c.field_pb, 3, 11579568, 8421504, 2105376);
          qi.field_o.a(24, -24 + la.field_c.field_M + -24, -2147483648, -20 + la.field_c.field_pb - 24, 16);
          of.field_i.a(120, 80, -2147483648, 24, la.field_c.field_pb - 44);
          return;
        }
    }

    final static int a(boolean param0, String param1, int param2, boolean param3, String param4, int param5, String param6) {
        if (!param0) {
            field_x = null;
        }
        vg var7 = new vg(param1);
        vg var8 = new vg(param4);
        return da.a(param2, var7, param6, var8, param5, (byte) -70, param3);
    }

    final void a(byte param0, int param1, km[] param2) {
        int var4 = 0;
        var4 = param1;
        if (param0 == -32) {
          if (((nj) this).field_y[var4] == null) {
            ((nj) this).field_y[var4] = new ai();
            ((nj) this).field_y[param1].field_e = param2;
            return;
          } else {
            ((nj) this).field_y[param1].field_e = param2;
            return;
          }
        } else {
          return;
        }
    }

    private final void a(boolean param0, byte param1, nj param2) {
        int var4 = 0;
        ai var5 = null;
        ai var6 = null;
        ai var6_ref = null;
        int var7 = 0;
        ai stackIn_10_0 = null;
        ai stackIn_11_0 = null;
        ai stackIn_12_0 = null;
        ai stackIn_12_1 = null;
        ai stackOut_9_0 = null;
        ai stackOut_11_0 = null;
        ai stackOut_11_1 = null;
        ai stackOut_10_0 = null;
        ai stackOut_10_1 = null;
        var7 = Chess.field_G;
        super.a((hl) (Object) param2, -1053);
        if (param1 >= 19) {
          if (param0) {
            var4 = 0;
            L0: while (true) {
              if (-7 < (var4 ^ -1)) {
                var5 = ((nj) this).field_y[var4];
                var6 = var5;
                var6 = var5;
                if (var5 != null) {
                  L1: {
                    var6_ref = param2.field_y[var4];
                    stackOut_9_0 = (ai) var5;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var6_ref != null) {
                      stackOut_11_0 = (ai) (Object) stackIn_11_0;
                      stackOut_11_1 = (ai) var6_ref;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L1;
                    } else {
                      param2.field_y[var4] = new ai();
                      stackOut_10_0 = (ai) (Object) stackIn_10_0;
                      stackOut_10_1 = new ai();
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L1;
                    }
                  }
                  ((ai) (Object) stackIn_12_0).a((ai) (Object) stackIn_12_1, (byte) -103);
                  var4++;
                  continue L0;
                } else {
                  param2.field_y[var4] = null;
                  var4++;
                  continue L0;
                }
              } else {
                return;
              }
            }
          } else {
            ne.a((Object[]) (Object) ((nj) this).field_y, 0, (Object[]) (Object) param2.field_y, 0, 6);
            return;
          }
        } else {
          return;
        }
    }

    final ai a(int param0, int param1) {
        if (param0 <= 59) {
          field_u = null;
          ((nj) this).field_y[param1] = new ai();
          return new ai();
        } else {
          ((nj) this).field_y[param1] = new ai();
          return new ai();
        }
    }

    final static void a(boolean param0, int param1, String param2, boolean param3) {
        bo.a((byte) 123);
        jh.field_e.i(0);
        um.field_b = new wf(pi.field_a, (String) null, dk.field_g, param0, param3);
        if (param1 != 2) {
          return;
        } else {
          field_w = new sb(jh.field_e, (mf) (Object) um.field_b);
          jh.field_e.b((mf) (Object) field_w, (byte) -75);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new hg(13, 0, 1, 0);
        field_u = new of(1);
        field_z = "Unfortunately you are not eligible to create an account.";
    }
}
