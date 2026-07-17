/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public final class qt {
    java.lang.ref.ReferenceQueue a;
    private jaclib.peer.PeerReference b;
    private jaclib.peer.PeerReference c;

    public final void a(byte param0) {
        int discarded$0 = -25120;
        this.a();
        if (param0 != 23) {
            Object var3 = null;
            this.a((jaclib.peer.PeerReference) null, 2);
        }
    }

    private final void a(jaclib.peer.PeerReference param0, int param1) {
        if (param1 == -26315) {
          if (param0 != ((jaclib.peer.qt) this).c) {
            if (param0 == ((jaclib.peer.qt) this).b) {
              L0: {
                ((jaclib.peer.qt) this).b = param0.a;
                if (null != param0.a) {
                  param0.a.b = param0.b;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if (null != param0.b) {
                  param0.b.a = param0.a;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                if (null != param0.a) {
                  param0.a.b = param0.b;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (null != param0.b) {
                  param0.b.a = param0.a;
                  break L3;
                } else {
                  break L3;
                }
              }
              return;
            }
          } else {
            ((jaclib.peer.qt) this).c = param0.b;
            if (param0 == ((jaclib.peer.qt) this).b) {
              L4: {
                ((jaclib.peer.qt) this).b = param0.a;
                if (null != param0.a) {
                  param0.a.b = param0.b;
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (null != param0.b) {
                  param0.b.a = param0.a;
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            } else {
              L6: {
                if (null != param0.a) {
                  param0.a.b = param0.b;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (null != param0.b) {
                  param0.b.a = param0.a;
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            }
          }
        } else {
          ((jaclib.peer.qt) this).a = null;
          if (param0 == ((jaclib.peer.qt) this).c) {
            ((jaclib.peer.qt) this).c = param0.b;
            if (param0 != ((jaclib.peer.qt) this).b) {
              L8: {
                if (null != param0.a) {
                  param0.a.b = param0.b;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (null != param0.b) {
                  param0.b.a = param0.a;
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            } else {
              L10: {
                ((jaclib.peer.qt) this).b = param0.a;
                if (null != param0.a) {
                  param0.a.b = param0.b;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (null != param0.b) {
                  param0.b.a = param0.a;
                  break L11;
                } else {
                  break L11;
                }
              }
              return;
            }
          } else {
            if (param0 == ((jaclib.peer.qt) this).b) {
              L12: {
                ((jaclib.peer.qt) this).b = param0.a;
                if (null != param0.a) {
                  param0.a.b = param0.b;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (null != param0.b) {
                  param0.b.a = param0.a;
                  break L13;
                } else {
                  break L13;
                }
              }
              return;
            } else {
              L14: {
                if (null != param0.a) {
                  param0.a.b = param0.b;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (null != param0.b) {
                  param0.b.a = param0.a;
                  break L15;
                } else {
                  break L15;
                }
              }
              return;
            }
          }
        }
    }

    public final void b(byte param0) {
        int discarded$6 = -25120;
        this.a();
        L0: while (true) {
          if (((jaclib.peer.qt) this).c == null) {
            if (param0 < 46) {
              ((jaclib.peer.qt) this).a = null;
              int discarded$7 = -25120;
              this.a();
              return;
            } else {
              int discarded$8 = -25120;
              this.a();
              return;
            }
          } else {
            this.a(((jaclib.peer.qt) this).c, -26315);
            continue L0;
          }
        }
    }

    private final void a() {
        java.lang.ref.Reference var2 = null;
        jaclib.peer.PeerReference var3 = null;
        L0: while (true) {
          var2 = ((jaclib.peer.qt) this).a.poll();
          if (var2 != null) {
            var3 = (jaclib.peer.PeerReference) (Object) var2;
            this.a(var3, -26315);
            continue L0;
          } else {
            return;
          }
        }
    }

    public qt() {
        ((jaclib.peer.qt) this).a = new java.lang.ref.ReferenceQueue();
    }

    final void b(jaclib.peer.PeerReference param0, int param1) {
        param0.a = null;
        param0.b = ((jaclib.peer.qt) this).c;
        if (param1 != -19676) {
          return;
        } else {
          L0: {
            if (null == ((jaclib.peer.qt) this).b) {
              ((jaclib.peer.qt) this).b = param0;
              break L0;
            } else {
              ((jaclib.peer.qt) this).c.a = param0;
              break L0;
            }
          }
          ((jaclib.peer.qt) this).c = param0;
          return;
        }
    }
}
