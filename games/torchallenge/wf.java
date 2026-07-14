/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf {
    static sl field_g;
    static ka field_b;
    static String[] field_e;
    static String field_a;
    static int[] field_d;
    static int[][] field_h;
    static String field_f;
    static oa field_i;
    static int[][] field_c;

    public static void a(byte param0) {
        field_i = null;
        field_a = null;
        field_b = null;
        field_f = null;
        field_e = null;
        field_c = null;
        if (param0 != -116) {
          return;
        } else {
          field_g = null;
          field_d = null;
          field_h = null;
          return;
        }
    }

    final static qk a(byte param0, String param1) {
        String var2 = null;
        qk var3 = null;
        String var4 = null;
        int var5 = 0;
        Object var6 = null;
        CharSequence var11 = null;
        CharSequence var12 = null;
        CharSequence var13 = null;
        Object var16 = null;
        Object var17 = null;
        var16 = null;
        var17 = null;
        var5 = TorChallenge.field_F ? 1 : 0;
        if (null != mh.field_e) {
          L0: {
            var11 = (CharSequence) (Object) param1;
            var2 = il.a(var11, (byte) 21);
            if (var2 != null) {
              break L0;
            } else {
              var2 = (String) (Object) var11;
              break L0;
            }
          }
          var3 = (qk) (Object) mh.field_e.a(true, (long)var2.hashCode());
          if (param0 != -123) {
            var6 = null;
            qk discarded$1 = wf.a((byte) -81, (String) null);
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var13 = (CharSequence) (Object) var3.field_F;
                  var4 = il.a(var13, (byte) 21);
                  if (var4 != null) {
                    break L2;
                  } else {
                    var4 = var3.field_F;
                    break L2;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  return var3;
                } else {
                  var3 = (qk) (Object) mh.field_e.a((byte) 126);
                  continue L1;
                }
              } else {
                return null;
              }
            }
          } else {
            L3: while (true) {
              if (var3 != null) {
                L4: {
                  var12 = (CharSequence) (Object) var3.field_F;
                  var4 = il.a(var12, (byte) 21);
                  if (var4 != null) {
                    break L4;
                  } else {
                    var4 = var3.field_F;
                    break L4;
                  }
                }
                if (var4.equals((Object) (Object) var2)) {
                  return var3;
                } else {
                  var3 = (qk) (Object) mh.field_e.a((byte) 126);
                  continue L3;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static byte a(byte param0, char param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (param0 != -126) {
          field_i = null;
          if (param1 > 0) {
            if (param1 >= 128) {
              L0: {
                L1: {
                  if (param1 < 160) {
                    break L1;
                  } else {
                    if (param1 <= 255) {
                      var2 = (byte)param1;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                if (param1 == 8364) {
                  var2 = -128;
                  return (byte) var2;
                } else {
                  if (param1 != 8218) {
                    if (402 == param1) {
                      var2 = -125;
                      return (byte) var2;
                    } else {
                      if (param1 != 8222) {
                        if (param1 == 8230) {
                          var2 = -123;
                          return (byte) var2;
                        } else {
                          if (param1 != 8224) {
                            if (8225 != param1) {
                              if (param1 == 710) {
                                var2 = -120;
                                return (byte) var2;
                              } else {
                                if (param1 == 8240) {
                                  var2 = -119;
                                  return (byte) var2;
                                } else {
                                  if (param1 == 352) {
                                    var2 = -118;
                                    return (byte) var2;
                                  } else {
                                    if (param1 == 8249) {
                                      var2 = -117;
                                      return (byte) var2;
                                    } else {
                                      if (param1 != 338) {
                                        if (param1 == 381) {
                                          var2 = -114;
                                          return (byte) var2;
                                        } else {
                                          if (param1 != 8216) {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (param1 != 8221) {
                                                  if (8226 == param1) {
                                                    var2 = -107;
                                                    return (byte) var2;
                                                  } else {
                                                    if (param1 == 8211) {
                                                      var2 = -106;
                                                      return (byte) var2;
                                                    } else {
                                                      if (param1 == 8212) {
                                                        var2 = -105;
                                                        return (byte) var2;
                                                      } else {
                                                        if (param1 != 732) {
                                                          if (param1 == 8482) {
                                                            var2 = -103;
                                                            return (byte) var2;
                                                          } else {
                                                            if (353 != param1) {
                                                              if (8250 != param1) {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                  return (byte) var2;
                                                                } else {
                                                                  if (382 == param1) {
                                                                    var2 = -98;
                                                                    return (byte) var2;
                                                                  } else {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                      return (byte) var2;
                                                                    } else {
                                                                      var2 = 63;
                                                                      return (byte) var2;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -101;
                                                                return (byte) var2;
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              return (byte) var2;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L0;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L0;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L0;
                                            }
                                          } else {
                                            var2 = -111;
                                            break L0;
                                          }
                                        }
                                      } else {
                                        var2 = -116;
                                        break L0;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var2 = -121;
                              break L0;
                            }
                          } else {
                            var2 = -122;
                            break L0;
                          }
                        }
                      } else {
                        var2 = -124;
                        break L0;
                      }
                    }
                  } else {
                    var2 = -126;
                    break L0;
                  }
                }
              }
              return (byte) var2;
            } else {
              var2 = (byte)param1;
              return (byte) var2;
            }
          } else {
            if (param1 >= 160) {
              if (param1 > 255) {
                if (param1 == 8364) {
                  var2 = -128;
                  return (byte) var2;
                } else {
                  L2: {
                    if (param1 != 8218) {
                      if (402 == param1) {
                        var2 = -125;
                        return (byte) var2;
                      } else {
                        if (param1 != 8222) {
                          if (param1 == 8230) {
                            var2 = -123;
                            return (byte) var2;
                          } else {
                            if (param1 != 8224) {
                              if (8225 != param1) {
                                if (param1 == 710) {
                                  var2 = -120;
                                  return (byte) var2;
                                } else {
                                  if (param1 == 8240) {
                                    var2 = -119;
                                    return (byte) var2;
                                  } else {
                                    if (param1 == 352) {
                                      var2 = -118;
                                      return (byte) var2;
                                    } else {
                                      if (param1 == 8249) {
                                        var2 = -117;
                                        break L2;
                                      } else {
                                        if (param1 != 338) {
                                          if (param1 == 381) {
                                            var2 = -114;
                                            break L2;
                                          } else {
                                            if (param1 != 8216) {
                                              if (param1 != 8217) {
                                                if (param1 != 8220) {
                                                  if (param1 != 8221) {
                                                    if (8226 == param1) {
                                                      var2 = -107;
                                                      break L2;
                                                    } else {
                                                      if (param1 == 8211) {
                                                        var2 = -106;
                                                        break L2;
                                                      } else {
                                                        if (param1 == 8212) {
                                                          var2 = -105;
                                                          break L2;
                                                        } else {
                                                          if (param1 != 732) {
                                                            if (param1 == 8482) {
                                                              var2 = -103;
                                                              break L2;
                                                            } else {
                                                              if (353 != param1) {
                                                                if (8250 != param1) {
                                                                  if (param1 == 339) {
                                                                    var2 = -100;
                                                                    break L2;
                                                                  } else {
                                                                    if (382 == param1) {
                                                                      var2 = -98;
                                                                      break L2;
                                                                    } else {
                                                                      if (param1 == 376) {
                                                                        var2 = -97;
                                                                        break L2;
                                                                      } else {
                                                                        var2 = 63;
                                                                        break L2;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  var2 = -101;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                var2 = -102;
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -104;
                                                            break L2;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } else {
                                                    var2 = -108;
                                                    break L2;
                                                  }
                                                } else {
                                                  var2 = -109;
                                                  break L2;
                                                }
                                              } else {
                                                var2 = -110;
                                                break L2;
                                              }
                                            } else {
                                              var2 = -111;
                                              break L2;
                                            }
                                          }
                                        } else {
                                          var2 = -116;
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var2 = -121;
                                break L2;
                              }
                            } else {
                              var2 = -122;
                              break L2;
                            }
                          }
                        } else {
                          var2 = -124;
                          break L2;
                        }
                      }
                    } else {
                      var2 = -126;
                      break L2;
                    }
                  }
                  return (byte) var2;
                }
              } else {
                var2 = (byte)param1;
                return (byte) var2;
              }
            } else {
              if (param1 != 8364) {
                L3: {
                  if (param1 != 8218) {
                    if (402 != param1) {
                      if (param1 != 8222) {
                        if (param1 != 8230) {
                          if (param1 != 8224) {
                            if (8225 != param1) {
                              if (param1 != 710) {
                                if (param1 != 8240) {
                                  if (param1 == 352) {
                                    var2 = -118;
                                    return (byte) var2;
                                  } else {
                                    if (param1 == 8249) {
                                      var2 = -117;
                                      break L3;
                                    } else {
                                      if (param1 != 338) {
                                        if (param1 == 381) {
                                          var2 = -114;
                                          break L3;
                                        } else {
                                          if (param1 != 8216) {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (param1 != 8221) {
                                                  if (8226 == param1) {
                                                    var2 = -107;
                                                    break L3;
                                                  } else {
                                                    if (param1 == 8211) {
                                                      var2 = -106;
                                                      break L3;
                                                    } else {
                                                      if (param1 == 8212) {
                                                        var2 = -105;
                                                        break L3;
                                                      } else {
                                                        if (param1 != 732) {
                                                          if (param1 == 8482) {
                                                            var2 = -103;
                                                            break L3;
                                                          } else {
                                                            if (353 != param1) {
                                                              if (8250 != param1) {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                  break L3;
                                                                } else {
                                                                  if (382 == param1) {
                                                                    var2 = -98;
                                                                    break L3;
                                                                  } else {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                      break L3;
                                                                    } else {
                                                                      var2 = 63;
                                                                      break L3;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                var2 = -101;
                                                                break L3;
                                                              }
                                                            } else {
                                                              var2 = -102;
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -104;
                                                          break L3;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2 = -108;
                                                  break L3;
                                                }
                                              } else {
                                                var2 = -109;
                                                break L3;
                                              }
                                            } else {
                                              var2 = -110;
                                              break L3;
                                            }
                                          } else {
                                            var2 = -111;
                                            break L3;
                                          }
                                        }
                                      } else {
                                        var2 = -116;
                                        break L3;
                                      }
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                  return (byte) var2;
                                }
                              } else {
                                var2 = -120;
                                return (byte) var2;
                              }
                            } else {
                              var2 = -121;
                              break L3;
                            }
                          } else {
                            var2 = -122;
                            break L3;
                          }
                        } else {
                          var2 = -123;
                          return (byte) var2;
                        }
                      } else {
                        var2 = -124;
                        break L3;
                      }
                    } else {
                      var2 = -125;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -126;
                    break L3;
                  }
                }
                return (byte) var2;
              } else {
                var2 = -128;
                return (byte) var2;
              }
            }
          }
        } else {
          L4: {
            if (param1 <= 0) {
              break L4;
            } else {
              if (param1 >= 128) {
                break L4;
              } else {
                var2 = (byte)param1;
                return (byte) var2;
              }
            }
          }
          L5: {
            if (param1 < 160) {
              break L5;
            } else {
              if (param1 > 255) {
                break L5;
              } else {
                var2 = (byte)param1;
                return (byte) var2;
              }
            }
          }
          if (param1 != 8364) {
            L6: {
              if (param1 != 8218) {
                if (402 != param1) {
                  if (param1 != 8222) {
                    if (param1 != 8230) {
                      if (param1 != 8224) {
                        if (8225 != param1) {
                          if (param1 != 710) {
                            if (param1 != 8240) {
                              if (param1 == 352) {
                                var2 = -118;
                                return (byte) var2;
                              } else {
                                if (param1 == 8249) {
                                  var2 = -117;
                                  break L6;
                                } else {
                                  if (param1 != 338) {
                                    if (param1 == 381) {
                                      var2 = -114;
                                      break L6;
                                    } else {
                                      if (param1 != 8216) {
                                        if (param1 != 8217) {
                                          if (param1 != 8220) {
                                            if (param1 != 8221) {
                                              if (8226 == param1) {
                                                var2 = -107;
                                                break L6;
                                              } else {
                                                if (param1 == 8211) {
                                                  var2 = -106;
                                                  break L6;
                                                } else {
                                                  if (param1 == 8212) {
                                                    var2 = -105;
                                                    break L6;
                                                  } else {
                                                    if (param1 != 732) {
                                                      if (param1 == 8482) {
                                                        var2 = -103;
                                                        break L6;
                                                      } else {
                                                        if (353 != param1) {
                                                          if (8250 != param1) {
                                                            if (param1 == 339) {
                                                              var2 = -100;
                                                              break L6;
                                                            } else {
                                                              if (382 == param1) {
                                                                var2 = -98;
                                                                break L6;
                                                              } else {
                                                                if (param1 == 376) {
                                                                  var2 = -97;
                                                                  break L6;
                                                                } else {
                                                                  var2 = 63;
                                                                  break L6;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            var2 = -101;
                                                            break L6;
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L6;
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                      break L6;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var2 = -108;
                                              break L6;
                                            }
                                          } else {
                                            var2 = -109;
                                            break L6;
                                          }
                                        } else {
                                          var2 = -110;
                                          break L6;
                                        }
                                      } else {
                                        var2 = -111;
                                        break L6;
                                      }
                                    }
                                  } else {
                                    var2 = -116;
                                    break L6;
                                  }
                                }
                              }
                            } else {
                              var2 = -119;
                              return (byte) var2;
                            }
                          } else {
                            var2 = -120;
                            return (byte) var2;
                          }
                        } else {
                          var2 = -121;
                          break L6;
                        }
                      } else {
                        var2 = -122;
                        break L6;
                      }
                    } else {
                      var2 = -123;
                      return (byte) var2;
                    }
                  } else {
                    var2 = -124;
                    break L6;
                  }
                } else {
                  var2 = -125;
                  return (byte) var2;
                }
              } else {
                var2 = -126;
                break L6;
              }
            }
            return (byte) var2;
          } else {
            var2 = -128;
            return (byte) var2;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[16];
        field_d = new int[]{0, 350};
        field_a = "Waiting for fonts";
        field_g = new sl();
        field_h = new int[][]{new int[2], new int[2]};
        field_f = "New Game";
        field_c = new int[][]{new int[2], new int[2]};
    }
}
