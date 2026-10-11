/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bd implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static boolean field_f;
    static String field_a;
    static ja field_e;
    static int field_g;
    static an field_c;
    static int field_d;
    static String field_b;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "bd.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != on.field_Z) {
            gi.field_m = 0;
            hh.field_e = 0;
            vj.field_m = true;
            var2_int = param0.getModifiers();
            if ((16 & var2_int) != 0) {
              ak.field_b = ak.field_b & -2;
            }
            if ((8 & var2_int) != 0) {
              ak.field_b = ak.field_b & -3;
            }
            if ((var2_int & 4) != 0) {
              ak.field_b = ak.field_b & -5;
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("bd.mouseReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (null != on.field_Z) {
            gi.field_m = 0;
            pb.field_a = -1;
            da.field_e = -1;
            vj.field_m = true;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "bd.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != on.field_Z) {
            hh.field_e = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "bd.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte a(char param0, byte param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1 <= -34) {
          L4: {
            if ((param0 <= 0 ||
              param0 >= 128) &&
              (160 > param0 ||
              param0 > 255)) {
              if (param0 == 8364) {
                var2 = -128;
              } else {
                if (param0 == 8218) {
                  var2 = -126;
                } else {
                  if (402 == param0) {
                    var2 = -125;
                    return (byte) var2;
                  }
                  if (8222 == param0) {
                    var2 = -124;
                  } else {
                    if (param0 == 8230) {
                      var2 = -123;
                    } else {
                      if (8224 == param0) {
                        var2 = -122;
                      } else {
                        if (param0 == 8225) {
                          var2 = -121;
                          return (byte) var2;
                        }
                        if (param0 == 710) {
                          var2 = -120;
                        } else {
                          if (param0 == 8240) {
                            var2 = -119;
                            return (byte) var2;
                          }
                          if (param0 == 352) {
                            var2 = -118;
                          } else {
                            if (param0 == 8249) {
                              var2 = -117;
                            } else {
                              if (param0 == 338) {
                                var2 = -116;
                                return (byte) var2;
                              }
                              if (param0 == 381) {
                                var2 = -114;
                              } else {
                                if (8216 == param0) {
                                  var2 = -111;
                                } else {
                                  if (param0 == 8217) {
                                    var2 = -110;
                                  } else {
                                    if (param0 == 8220) {
                                      var2 = -109;
                                    } else {
                                      if (param0 == 8221) {
                                        var2 = -108;
                                        return (byte) var2;
                                      }
                                      if (param0 == 8226) {
                                        var2 = -107;
                                        return (byte) var2;
                                      }
                                      if (param0 == 8211) {
                                        var2 = -106;
                                        return (byte) var2;
                                      }
                                      if (8212 == param0) {
                                        var2 = -105;
                                      } else {
                                        if (param0 == 732) {
                                          var2 = -104;
                                        } else {
                                          if (param0 == 8482) {
                                            var2 = -103;
                                          } else {
                                            if (param0 == 353) {
                                              var2 = -102;
                                            } else {
                                              if (8250 == param0) {
                                                var2 = -101;
                                              } else {
                                                if (param0 == 339) {
                                                  var2 = -100;
                                                } else {
                                                  if (param0 == 382) {
                                                    var2 = -98;
                                                  } else {
                                                    if (param0 != 376) {
                                                      var2 = 63;
                                                    } else {
                                                      var2 = -97;
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
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              break L4;
            }
            var2 = (byte)param0;
          }
          return (byte) var2;
        }
        field_f = true;
        if (param0 <= 0) {
          if (160 > param0) {
            if (param0 != 8364) {
              if (param0 != 8218) {
                if (402 == param0) {
                  var2Lifetime1 = -125;
                } else {
                  if (8222 != param0) {
                    if (param0 != 8230) {
                      if (8224 != param0) {
                        if (param0 == 8225) {
                          var2Lifetime1 = -121;
                        } else {
                          if (param0 != 710) {
                            if (param0 == 8240) {
                              var2Lifetime1 = -119;
                            } else {
                              if (param0 != 352) {
                                if (param0 != 8249) {
                                  if (param0 == 338) {
                                    var2Lifetime1 = -116;
                                  } else {
                                    if (param0 != 381) {
                                      if (8216 != param0) {
                                        if (param0 != 8217) {
                                          if (param0 != 8220) {
                                            if (param0 == 8221) {
                                              var2Lifetime1 = -108;
                                            } else {
                                              if (param0 == 8226) {
                                                var2Lifetime1 = -107;
                                              } else {
                                                if (param0 == 8211) {
                                                  var2Lifetime1 = -106;
                                                } else {
                                                  if (8212 != param0) {
                                                    if (param0 != 732) {
                                                      if (param0 == 8482) {
                                                        var2Lifetime1 = -103;
                                                      } else {
                                                        if (param0 == 353) {
                                                          var2Lifetime1 = -102;
                                                        } else {
                                                          if (8250 != param0) {
                                                            if (param0 != 339) {
                                                              if (param0 != 382) {
                                                                var2Lifetime1 = (param0 != 376) ? 63 : -97;
                                                              } else {
                                                                var2Lifetime1 = -98;
                                                              }
                                                            } else {
                                                              var2Lifetime1 = -100;
                                                            }
                                                          } else {
                                                            var2Lifetime1 = -101;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2Lifetime1 = -104;
                                                    }
                                                  } else {
                                                    var2Lifetime1 = -105;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var2Lifetime1 = -109;
                                          }
                                        } else {
                                          var2Lifetime1 = -110;
                                        }
                                      } else {
                                        var2Lifetime1 = -111;
                                      }
                                    } else {
                                      var2Lifetime1 = -114;
                                    }
                                  }
                                } else {
                                  var2Lifetime1 = -117;
                                }
                              } else {
                                var2Lifetime1 = -118;
                              }
                            }
                          } else {
                            var2Lifetime1 = -120;
                          }
                        }
                      } else {
                        var2Lifetime1 = -122;
                      }
                    } else {
                      var2Lifetime1 = -123;
                    }
                  } else {
                    var2Lifetime1 = -124;
                  }
                }
              } else {
                var2Lifetime1 = -126;
              }
            } else {
              var2Lifetime1 = -128;
            }
          } else {
            if (param0 <= 255) {
              var2Lifetime1 = (byte)param0;
            } else {
              if (param0 != 8364) {
                if (param0 != 8218) {
                  if (402 == param0) {
                    var2Lifetime1 = -125;
                  } else {
                    if (8222 != param0) {
                      if (param0 != 8230) {
                        if (8224 != param0) {
                          if (param0 == 8225) {
                            var2Lifetime1 = -121;
                          } else {
                            if (param0 != 710) {
                              if (param0 == 8240) {
                                var2Lifetime1 = -119;
                              } else {
                                if (param0 != 352) {
                                  if (param0 != 8249) {
                                    if (param0 == 338) {
                                      var2Lifetime1 = -116;
                                    } else {
                                      if (param0 != 381) {
                                        if (8216 != param0) {
                                          if (param0 != 8217) {
                                            if (param0 != 8220) {
                                              if (param0 == 8221) {
                                                var2Lifetime1 = -108;
                                              } else {
                                                if (param0 == 8226) {
                                                  var2Lifetime1 = -107;
                                                } else {
                                                  if (param0 == 8211) {
                                                    var2Lifetime1 = -106;
                                                  } else {
                                                    if (8212 != param0) {
                                                      if (param0 != 732) {
                                                        if (param0 == 8482) {
                                                          var2Lifetime1 = -103;
                                                        } else {
                                                          if (param0 == 353) {
                                                            var2Lifetime1 = -102;
                                                          } else {
                                                            if (8250 != param0) {
                                                              if (param0 != 339) {
                                                                if (param0 != 382) {
                                                                  var2Lifetime1 = (param0 != 376) ? 63 : -97;
                                                                } else {
                                                                  var2Lifetime1 = -98;
                                                                }
                                                              } else {
                                                                var2Lifetime1 = -100;
                                                              }
                                                            } else {
                                                              var2Lifetime1 = -101;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2Lifetime1 = -104;
                                                      }
                                                    } else {
                                                      var2Lifetime1 = -105;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var2Lifetime1 = -109;
                                            }
                                          } else {
                                            var2Lifetime1 = -110;
                                          }
                                        } else {
                                          var2Lifetime1 = -111;
                                        }
                                      } else {
                                        var2Lifetime1 = -114;
                                      }
                                    }
                                  } else {
                                    var2Lifetime1 = -117;
                                  }
                                } else {
                                  var2Lifetime1 = -118;
                                }
                              }
                            } else {
                              var2Lifetime1 = -120;
                            }
                          }
                        } else {
                          var2Lifetime1 = -122;
                        }
                      } else {
                        var2Lifetime1 = -123;
                      }
                    } else {
                      var2Lifetime1 = -124;
                    }
                  }
                } else {
                  var2Lifetime1 = -126;
                }
              } else {
                var2Lifetime1 = -128;
              }
            }
          }
          return (byte) var2Lifetime1;
        }
        if (param0 < 128) {
          var2Lifetime2 = (byte)param0;
          return (byte) var2Lifetime2;
        }
        if (160 > param0) {
          if (param0 != 8364) {
            if (param0 != 8218) {
              if (402 == param0) {
                var2Lifetime3 = -125;
              } else {
                if (8222 != param0) {
                  if (param0 != 8230) {
                    if (8224 != param0) {
                      if (param0 == 8225) {
                        var2Lifetime3 = -121;
                      } else {
                        if (param0 != 710) {
                          if (param0 == 8240) {
                            var2Lifetime3 = -119;
                          } else {
                            if (param0 != 352) {
                              if (param0 != 8249) {
                                if (param0 == 338) {
                                  var2Lifetime3 = -116;
                                } else {
                                  if (param0 != 381) {
                                    if (8216 == param0) {
                                      var2Lifetime3 = -111;
                                    } else {
                                      if (param0 == 8217) {
                                        var2Lifetime3 = -110;
                                      } else {
                                        if (param0 == 8220) {
                                          var2Lifetime3 = -109;
                                        } else {
                                          if (param0 == 8221) {
                                            var2Lifetime3 = -108;
                                          } else {
                                            if (param0 == 8226) {
                                              var2Lifetime3 = -107;
                                            } else {
                                              if (param0 == 8211) {
                                                var2Lifetime3 = -106;
                                              } else {
                                                if (8212 == param0) {
                                                  var2Lifetime3 = -105;
                                                } else {
                                                  if (param0 == 732) {
                                                    var2Lifetime3 = -104;
                                                  } else {
                                                    if (param0 == 8482) {
                                                      var2Lifetime3 = -103;
                                                    } else {
                                                      if (param0 == 353) {
                                                        var2Lifetime3 = -102;
                                                      } else {
                                                        if (8250 == param0) {
                                                          var2Lifetime3 = -101;
                                                        } else {
                                                          if (param0 == 339) {
                                                            var2Lifetime3 = -100;
                                                          } else {
                                                            if (param0 == 382) {
                                                              var2Lifetime3 = -98;
                                                            } else {
                                                              if (param0 != 376) {
                                                                var2Lifetime3 = 63;
                                                              } else {
                                                                var2Lifetime3 = -97;
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
                                      }
                                    }
                                  } else {
                                    var2Lifetime3 = -114;
                                  }
                                }
                              } else {
                                var2Lifetime3 = -117;
                              }
                            } else {
                              var2Lifetime3 = -118;
                            }
                          }
                        } else {
                          var2Lifetime3 = -120;
                        }
                      }
                    } else {
                      var2Lifetime3 = -122;
                    }
                  } else {
                    var2Lifetime3 = -123;
                  }
                } else {
                  var2Lifetime3 = -124;
                }
              }
            } else {
              var2Lifetime3 = -126;
            }
          } else {
            var2Lifetime3 = -128;
          }
          return (byte) var2Lifetime3;
        }
        if (param0 > 255) {
          if (param0 != 8364) {
            if (param0 != 8218) {
              if (402 == param0) {
                var2Lifetime4 = -125;
              } else {
                if (8222 != param0) {
                  if (param0 != 8230) {
                    if (8224 != param0) {
                      if (param0 == 8225) {
                        var2Lifetime4 = -121;
                        return (byte) var2Lifetime4;
                      }
                      if (param0 != 710) {
                        if (param0 == 8240) {
                          var2Lifetime4 = -119;
                          return (byte) var2Lifetime4;
                        }
                        if (param0 != 352) {
                          if (param0 != 8249) {
                            if (param0 == 338) {
                              var2Lifetime4 = -116;
                              return (byte) var2Lifetime4;
                            }
                            if (param0 != 381) {
                              if (8216 == param0) {
                                var2Lifetime4 = -111;
                              } else {
                                if (param0 == 8217) {
                                  var2Lifetime4 = -110;
                                } else {
                                  if (param0 == 8220) {
                                    var2Lifetime4 = -109;
                                  } else {
                                    if (param0 == 8221) {
                                      var2Lifetime4 = -108;
                                    } else {
                                      if (param0 == 8226) {
                                        var2Lifetime4 = -107;
                                      } else {
                                        if (param0 == 8211) {
                                          var2Lifetime4 = -106;
                                        } else {
                                          if (8212 == param0) {
                                            var2Lifetime4 = -105;
                                          } else {
                                            if (param0 == 732) {
                                              var2Lifetime4 = -104;
                                            } else {
                                              if (param0 == 8482) {
                                                var2Lifetime4 = -103;
                                              } else {
                                                if (param0 == 353) {
                                                  var2Lifetime4 = -102;
                                                } else {
                                                  if (8250 == param0) {
                                                    var2Lifetime4 = -101;
                                                  } else {
                                                    if (param0 == 339) {
                                                      var2Lifetime4 = -100;
                                                    } else {
                                                      if (param0 == 382) {
                                                        var2Lifetime4 = -98;
                                                      } else {
                                                        if (param0 != 376) {
                                                          var2Lifetime4 = 63;
                                                        } else {
                                                          var2Lifetime4 = -97;
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
                                }
                              }
                              return (byte) var2Lifetime4;
                            }
                            var2Lifetime4 = -114;
                          } else {
                            var2Lifetime4 = -117;
                          }
                        } else {
                          var2Lifetime4 = -118;
                        }
                      } else {
                        var2Lifetime4 = -120;
                      }
                    } else {
                      var2Lifetime4 = -122;
                    }
                  } else {
                    var2Lifetime4 = -123;
                  }
                } else {
                  var2Lifetime4 = -124;
                }
              }
            } else {
              var2Lifetime4 = -126;
            }
          } else {
            var2Lifetime4 = -128;
          }
        } else {
          var2Lifetime4 = (byte)param0;
        }
        return (byte) var2Lifetime4;
    }

    public static void a(int param0) {
        if (param0 == -1) {
          field_c = null;
          field_e = null;
          field_a = null;
          field_b = null;
          return;
        }
        Throwable var2 = (Throwable) null;
        bd.a((String) null, (Throwable) null, false);
        field_c = null;
        field_e = null;
        field_a = null;
        field_b = null;
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != on.field_Z) {
            gi.field_m = 0;
            pb.field_a = param0.getX();
            da.field_e = param0.getY();
            vj.field_m = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("bd.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (on.field_Z != null) {
            gi.field_m = 0;
            de.field_g = param0.getX();
            s.field_b = param0.getY();
            bl.a((byte) 41);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              s.field_f = 1;
              hh.field_e = 1;
            } else {
              s.field_f = 2;
              hh.field_e = 2;
            }
            var2_int = param0.getModifiers();
            if ((16 & var2_int) != 0) {
              ak.field_b = ak.field_b | 1;
            }
            if ((var2_int & 8) != 0) {
              ak.field_b = ak.field_b | 2;
            }
            if ((var2_int & 4) != 0) {
              ak.field_b = ak.field_b | 4;
            }
            vj.field_m = true;
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("bd.mousePressed(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != on.field_Z) {
            gi.field_m = 0;
            pb.field_a = param0.getX();
            da.field_e = param0.getY();
            vj.field_m = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("bd.mouseMoved(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(String param0, Throwable param1, boolean param2) {
        try {
          go stackIn_14_0;
          int stackIn_14_1;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          java.net.URL stackIn_14_4;
          StringBuilder stackIn_14_5;
          java.net.URL stackIn_15_2;
          java.net.URL stackIn_15_3;
          String stackIn_15_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          di var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            var3 = "";
            if (param2) {
              field_c = (an) null;
            }
            if (param1 != null) {
              var3 = hg.a(-114, param1);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            kb.a(2, var3);
            var7 = we.a((byte) -65, ":", var3, "%3a");
            var8 = we.a((byte) -114, "@", var7, "%40");
            var9 = we.a((byte) -74, "&", var8, "%26");
            var10 = we.a((byte) 85, "#", var9, "%23");
            if (null == aq.field_w) {
              return;
            }
            stackIn_14_0 = kk.field_y;
            stackIn_14_1 = -12;
            stackIn_14_2 = null;
            stackIn_14_3 = null;
            stackIn_14_4 = aq.field_w.getCodeBase();
            stackIn_14_5 = new StringBuilder().append("clienterror.ws?c=").append(pn.field_b).append("&u=");
            if (il.field_j == null) {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = "" + cm.field_d;
            } else {
              stackIn_15_2 = null;
              stackIn_15_3 = null;
              stackIn_15_6 = il.field_j;
            }
            var4 = ((go) (Object) stackIn_14_0).a((byte) stackIn_14_1, new java.net.URL(stackIn_14_4, ((StringBuilder) (Object) stackIn_14_5).append(stackIn_15_6).append("&v1=").append(go.field_r).append("&v2=").append(go.field_q).append("&e=").append(var10).toString()));
            while (var4.field_f == 0) {
              vd.a(false, 1L);
            }
            if (var4.field_f == 1) {
              var5 = (DataInputStream) (var4.field_d);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (on.field_Z != null) {
            gi.field_m = 0;
            pb.field_a = param0.getX();
            da.field_e = param0.getY();
            vj.field_m = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("bd.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_d = 50;
        field_a = "This game has been updated! Please reload this page.";
        field_b = "Confirm Password: ";
        field_g = 0;
    }
}
